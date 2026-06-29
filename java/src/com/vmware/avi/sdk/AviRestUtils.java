/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */
package com.vmware.avi.sdk;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.Header;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultServiceUnavailableRetryStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.DefaultUriBuilderFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpCookie;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import java.util.UUID;

public class AviRestUtils {

	static final Logger LOGGER = Logger.getLogger(AviRestUtils.class.getName());
	static final int SOCKET_TIMEOUT = 300000; // 5 Min
	private static HashMap<String, RestTemplate> sessionPool = new HashMap<String, RestTemplate>();
	private static final String API_PREFIX = "/api/";

	public static void clearSession(AviCredentials creds){
		if (creds != null) {
			if (sessionPool.containsKey(getSessionKey(creds))) {
				sessionPool.remove(getSessionKey(creds));
			}
		}
	}

	public static RestTemplate getRestTemplate(AviCredentials creds) {
		LOGGER.info("__INIT__ Rest template initialization..");
		RestTemplate restTemplate = null;
		if (creds != null) {
			if (sessionPool.containsKey(getSessionKey(creds))) {
				return sessionPool.get(getSessionKey(creds));
			}
			try {
				restTemplate = getInitializedRestTemplate(creds);
				DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(getControllerURL(creds) + API_PREFIX);
				restTemplate.setUriTemplateHandler(uriBuilderFactory);
				List<ClientHttpRequestInterceptor> interceptors = Collections
						.<ClientHttpRequestInterceptor>singletonList(new AviAuthorizationInterceptor(creds));
				restTemplate.setInterceptors(interceptors);
				restTemplate.setMessageConverters(getMessageConverters(restTemplate));
				AviRestUtils.sessionPool.put(getSessionKey(creds), restTemplate);
				LOGGER.info("__DONE__ Rest template initialize.");
				return restTemplate;
			} catch (Exception e) {
				LOGGER.severe("Exception during rest template initialization");

			}
		}
		return restTemplate;
	}

	private static List<HttpMessageConverter<?>> getMessageConverters(RestTemplate restTemplate) {
		// Get existing message converters
		List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
		messageConverters.clear();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		MappingJackson2HttpMessageConverter mycov = new MappingJackson2HttpMessageConverter(objectMapper);
		mycov.setPrettyPrint(true);
		messageConverters.add(new StringHttpMessageConverter());
		messageConverters.add(mycov);
		return messageConverters;
	}

	private static RestTemplate getInitializedRestTemplate(AviCredentials creds) {
		try {
			CloseableHttpClient client = buildHttpClient(creds);
			HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
			clientHttpRequestFactory.setHttpClient(client);
			return new RestTemplate(clientHttpRequestFactory);

		} catch (Exception e) {
			LOGGER.severe("Exception in creating rest template for AVI connection");
		}
		return null;
	}

	/**
	 * This method sets a custom HttpRequestRetryHandler in order to enable a custom
	 * exception recovery mechanism.
	 * 
	 * @return A HttpRequestRetryHandler representing handling of the retryHandler.
	 */
	private static HttpRequestRetryHandler retryHandler(AviCredentials creds) {
		return (exception, executionCount, context) -> {
			LOGGER.info("__INIT__ Inside retry_handler..");
			if (executionCount >= creds.getNumApiRetries()) {
				// Do not retry if over max retry count
				return false;
			}
			if (exception instanceof InterruptedIOException) {
				// Timeout
				return false;
			}
			if (exception instanceof UnknownHostException) {
				// Unknown host
				return false;
			}
			if (exception instanceof SSLException) {
				// SSL handshake exception
				return false;
			}
			if (exception instanceof HttpHostConnectException) {
				return true;
			}
			HttpClientContext clientContext = HttpClientContext.adapt(context);
			HttpRequest request = clientContext.getRequest();
			boolean idempotent = !(request instanceof HttpEntityEnclosingRequest);
			if (idempotent) {
				// Retry if the request is considered idempotent
				return true;
			}
			LOGGER.info("__DONE__ Retry handler.");
			return false;
		};
	}

    /**
     * Configures and builds a custom, secure HTTP client for communicating with the Avi Controller.
     * This method sets up connection timeouts, basic user credentials, auto-retry logic, and 
     * configures SSL/TLS settings—including server certificate verification and client-side 
     * certificates based on the provided credentials.
     * 
     * @param creds The configuration object containing URLs, user credentials, timeouts, and SSL certificates.
     * @return A configured CloseableHttpClient ready to make secure API requests.
     * @throws IOException If the secure SSL context or connection manager fails to initialize.
     */
	public static CloseableHttpClient buildHttpClient(AviCredentials creds) throws IOException {
		LOGGER.info("__INIT__ Inside buildHttpClient..");
		HttpClientBuilder clientBuilder = HttpClients.custom();
		RequestConfig requestConfig = RequestConfig.custom()
									.setConnectionRequestTimeout(creds.getTimeout() * 1000)
									.setSocketTimeout(SOCKET_TIMEOUT)
									.setConnectTimeout(creds.getConnectionTimeout() * 1000)
									.build();
		SSLContext sslcontext = null;
		HostnameVerifier hostnameVerifier = null;
		if (creds.getSslContext() != null) {
			// If found fully configured SSLContext - use it directly.
			sslcontext = creds.getSslContext();
		} else {
			try {
				SSLContextBuilder sslBuilder = SSLContexts.custom();
				// Handle Server Trust (Accepting Untrusted/Self-Signed Targets)
				if (creds.getVerify()) {
					hostnameVerifier = new HostnameVerifier() {
						private final DefaultHostnameVerifier defaultVerifier = new DefaultHostnameVerifier();
						@Override
						public boolean verify(String hostname, SSLSession session) {
							return creds.getController().equals(hostname) || defaultVerifier.verify(hostname, session);
						}
					};

					if (creds.getSslCertificate() != null) {
						// If it contains the Controller's CA, validation will succeed.
						KeyStore trustStore = loadTrustStoreFromCert(creds.getSslCertificate());
						sslBuilder.loadTrustMaterial(trustStore, null);
						LOGGER.info("Using sslCertificate file as TrustStore for server validation.");

						// Client identity / mTLS
						if (creds.getSslPrivateKey() != null) {
							char[] keyPassword = UUID.randomUUID().toString().toCharArray();
							KeyStore clientKeyStore = loadClientKeyStore(
									creds.getSslCertificate(),
									creds.getSslPrivateKey(),
									keyPassword);
							sslBuilder.loadKeyMaterial(clientKeyStore, keyPassword);
							LOGGER.info("Client certificate loaded successfully.");
						}
					}
				} else {
					LOGGER.warning(
							"\n********************************************************************************\n" +
									" WARNING: SSL certificate verification is DISABLED (verify=false).\n" +
									" Any TLS certificate will be accepted. Vulnerable to MITM attacks.\n" +
							"********************************************************************************\n");
					sslBuilder.loadTrustMaterial(null, (chain, authType) -> true);
					hostnameVerifier = new HostnameVerifier() {
					private final DefaultHostnameVerifier defaultVerifier = new DefaultHostnameVerifier();
					@Override
					public boolean verify(String hostname, SSLSession session) {
						if (!defaultVerifier.verify(hostname, session)) {
							LOGGER.warning(String.format(
								"\n********************************************************************************\n" +
								" As verify=false | Hostname or IP '%s' failed strict DefaultHostnameVerifier validation.\n" +
								"********************************************************************************\n",
								hostname)
							);
						}
						return true;
						}
					};
				}
				sslcontext = sslBuilder.build();
			} catch (Exception e) {
				LOGGER.severe("Failed to build SSL context: " + e.getMessage());
				throw new IOException("Failed to initialize SSL context", e);
			}
		}

		SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslcontext,hostnameVerifier);
		Registry<ConnectionSocketFactory> registry = RegistryBuilder.<ConnectionSocketFactory>create()
				.register("https", sslConnectionSocketFactory)
				.register("http", PlainConnectionSocketFactory.getSocketFactory())
				.build();

		PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(registry);

		CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
		credentialsProvider.setCredentials(AuthScope.ANY,
				new UsernamePasswordCredentials(creds.getUsername(), creds.getPassword()));

		clientBuilder.setConnectionManager(connectionManager)
				.setDefaultCredentialsProvider(credentialsProvider)
				.disableCookieManagement()
				.setDefaultRequestConfig(requestConfig)
				.setServiceUnavailableRetryStrategy(
						new DefaultServiceUnavailableRetryStrategy(
								creds.getNumApiRetries(), creds.getRetryWaitTime()))
				.setRetryHandler(retryHandler(creds));
		LOGGER.info("__DONE__ BuildHttpClient completed");
		return clientBuilder.build();
	}

    /**
     * Creates an in-memory KeyStore containing a client's security certificate and private key.
     * This method reads the certificate chain and private key files from your computer,
     * pairs them together, and protects the final package with a password so it can be 
     * used for secure network communication (like SSL/TLS client authentication).
     * 
     * @param certPath    The file path to your security certificate.
     * @param keyPath     The file path to your private security key.
     * @param keyPassword The password to protect the key inside the KeyStore.
     * @return A ready-to-use KeyStore containing the key and certificate.
     * @throws Exception If a file cannot be read or the keys are invalid.
     */
	public static KeyStore loadClientKeyStore(String certPath, String keyPath, char[] keyPassword) throws Exception {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");

        // Read ALL certificates in the file (handles full chains)
        Collection<? extends Certificate> certs;
        try (FileInputStream fis = new FileInputStream(certPath)) {
            certs = cf.generateCertificates(fis);
        }
        Certificate[] chain = certs.toArray(new Certificate[0]);

        // Read and clean the Private Key
        String keyPem = new String(Files.readAllBytes(Paths.get(keyPath)))
                .replaceAll("-----.*?-----", "")
                .replaceAll("\\s+", "");
        byte[] keyBytes = Base64.getDecoder().decode(keyPem);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);

        PrivateKey privateKey;
        try {
            privateKey = KeyFactory.getInstance("RSA").generatePrivate(keySpec);
        } catch (Exception e) {
            privateKey = KeyFactory.getInstance("EC").generatePrivate(keySpec);
        }

        KeyStore ks = KeyStore.getInstance("PKCS12");
        ks.load(null, null);
        // password: Uses a random password string to encrypt this specific key entry for secure storage.
        ks.setKeyEntry("client", privateKey, keyPassword, chain);
        return ks;
    }

    /**
     * Creates an in-memory TrustStore containing a list of trusted certificates.
     * This method reads a certificate file from your computer (including files with 
     * multiple certificates) and adds each one to a secure list so your application 
     * knows it can safely trust and connect to those remote servers.
     * 
     * @param certPath The file path to the trusted certificate(s).
     * @return A ready-to-use TrustStore populated with the certificates.
     * @throws Exception If the file cannot be read or the certificates are invalid.
     */
    public static KeyStore loadTrustStoreFromCert(String certPath) throws Exception {
        CertificateFactory cf = CertificateFactory.getInstance("X.509");
        Collection<? extends Certificate> certs;
        try (FileInputStream fis = new FileInputStream(certPath)) {
            certs = cf.generateCertificates(fis);
        }
        KeyStore ks = KeyStore.getInstance(KeyStore.getDefaultType());
        ks.load(null, null);

        int index = 1;
        for (Certificate cert : certs) {
            ks.setCertificateEntry("avi-trusted-cert-" + index, cert);
            index++;
        }
        return ks;
    }
	
	/**
	 * This method authenticates user based on the credentials and update the
	 * csrftoken and session id for this session.
	 */
	public static void authenticateSession(AviCredentials aviCredentials) throws IOException {
		LOGGER.info("__INIT__ Inside authentication session for.. " + aviCredentials.getUsername());
		JSONObject body = new JSONObject();
		body.put("username", aviCredentials.getUsername());
		if (aviCredentials.getPassword() != null && !aviCredentials.getPassword().isEmpty()) {
			body.put("password", aviCredentials.getPassword());
		} else if (aviCredentials.getToken() != null && !aviCredentials.getToken().isEmpty()) {
			body.put("token", aviCredentials.getToken());
		}
		CloseableHttpClient httpClient = buildHttpClient(aviCredentials);
		try {
			String postUrl = getControllerURL(aviCredentials) + "/login";
			HttpPost postRequest = new HttpPost(postUrl);
			StringEntity input = new StringEntity(body.toString());
			input.setContentType("application/json");
			postRequest.addHeader("X-Avi-Version", aviCredentials.getVersion());
			postRequest.addHeader("X-Avi-Tenant", aviCredentials.getTenant());
			postRequest.setEntity(input);
			HttpResponse response = httpClient.execute(postRequest);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode > 299) {
				LOGGER.severe("Login faild with status code " + statusCode);
				throw new IOException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}
			String output = EntityUtils.toString(response.getEntity());
			JSONObject result = new JSONObject(output);
			String sessionCookieName = result.get("session_cookie_name").toString();
			String csrftoken = null;
			String sessionCookie = null;
			for (Header header : response.getHeaders("Set-Cookie")) {
				List<HttpCookie> httpCookies = HttpCookie.parse(header.getValue());
				for (HttpCookie cookie : httpCookies) {
					if (cookie.getName().equals("csrftoken")) {
						csrftoken = cookie.getValue();
					} else if (cookie.getName().equals(sessionCookieName)) {
						sessionCookie = cookie.getValue();
					}
				}
			}
			aviCredentials.setCsrftoken(csrftoken);
			aviCredentials.setSessionID(sessionCookie);
			LOGGER.info("__DONE__ Authentication session success for:: " + aviCredentials.getUsername());
		} catch (ConnectTimeoutException e){
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
            throw e;
		} finally {
			if (null != httpClient) {
				try {
					httpClient.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String getSessionKey(AviCredentials aviCredentials) {
		StringBuilder sb = new StringBuilder();
		sb.append(aviCredentials.getController()).append(":");
		sb.append(aviCredentials.getUsername()).append(":");
		sb.append(aviCredentials.getPort()).append(":");
		sb.append(aviCredentials.getTenant()).append(":");
		sb.append(aviCredentials.getVerify());
		if (aviCredentials.getPassword() != null) {
			sb.append(":").append(aviCredentials.getPassword().hashCode());
		}
		if (aviCredentials.getToken() != null) {
			sb.append(":").append(aviCredentials.getToken().hashCode());
		}
		return sb.toString();
	}

	/**
	 * This method returns the controller URL based on controller IP and controller
	 * port.
	 * 
	 * @return A String representing the controller URL.
	 */
	public static String getControllerURL(AviCredentials aviCredentials) {
		StringBuffer sb = new StringBuffer();
		if (aviCredentials.getController().startsWith("http")) {
			if (Arrays.asList(80, 443).contains(aviCredentials.getPort())) {
				sb.append(aviCredentials.getController());
			} else {
				sb.append(aviCredentials.getController());
				sb.append(":");
				sb.append(aviCredentials.getPort());
			}
		} else {
			if (aviCredentials.getPort() == 443) {
				sb.append("https://");
				sb.append(aviCredentials.getController());
			} else if (aviCredentials.getPort() == 80) {
				sb.append("http://");
				sb.append(aviCredentials.getController());
			} else {
				sb.append("https://");
				sb.append(aviCredentials.getController());
				sb.append(":");
				sb.append(aviCredentials.getPort());
			}
		}
		return sb.toString();
	}

	/**
	 * This method sets all HTTP request headers.
	 * 
	 * @param request A HttpRequestBase containing all require headers.
	 * @throws Exception
	 */
	public static void buildHeaders(HttpRequestBase request, HashMap<String, String> userHeaders,
			AviCredentials aviCredentials) throws Exception {
		LOGGER.info("__INIT__ Inside buildHeaders..");
		if (null == aviCredentials.getSessionID() || aviCredentials.getSessionID().isEmpty()) {
			authenticateSession(aviCredentials);
		}
		request.addHeader("Content-Type", "application/json");
		request.addHeader("X-Avi-Version", aviCredentials.getVersion());
		request.addHeader("X-Avi-Tenant", aviCredentials.getTenant());
		request.addHeader("X-CSRFToken", aviCredentials.getCsrftoken());
		request.addHeader("Referer", getControllerURL(aviCredentials));

		request.addHeader("Cookie",
				"csrftoken=" + aviCredentials.getCsrftoken() + "; " + "avi-sessionid=" + aviCredentials.getSessionID());

		if ((null != userHeaders) && (!userHeaders.isEmpty())) {
			for (String key : userHeaders.keySet()) {
				request.addHeader(key, userHeaders.get(key));
			}
		}
		LOGGER.info("__DONE__ Inside buildHeaders..");
	}
}
