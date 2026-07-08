/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */
package com.vmware.avi.sdk;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.hc.client5.http.ConnectTimeoutException;
import org.apache.hc.client5.http.HttpHostConnectException;
import org.apache.hc.client5.http.HttpRequestRetryStrategy;
import org.apache.hc.client5.http.auth.AuthScope;
import org.apache.hc.client5.http.auth.UsernamePasswordCredentials;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.config.ConnectionConfig;
import org.apache.hc.client5.http.config.RequestConfig;
import org.apache.hc.client5.http.impl.auth.BasicCredentialsProvider;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.ssl.DefaultClientTlsStrategy;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.client5.http.ssl.TlsSocketStrategy;
import org.apache.hc.client5.http.ssl.TrustSelfSignedStrategy;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpRequest;
import org.apache.hc.core5.http.HttpResponse;
import org.apache.hc.core5.http.Method;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.protocol.HttpContext;
import org.apache.hc.core5.ssl.SSLContexts;
import org.apache.hc.core5.util.TimeValue;
import org.apache.hc.core5.util.Timeout;
import org.json.JSONObject;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestClient;
import org.springframework.web.util.DefaultUriBuilderFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpCookie;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class AviRestUtils {

	static final Logger LOGGER = Logger.getLogger(AviRestUtils.class.getName());
	static final int SOCKET_TIMEOUT = 300000; // 5 Min
	private static HashMap<String, RestClient> sessionPool = new HashMap<String, RestClient>();
	private static final String API_PREFIX = "/api/";

	public static void clearSession(AviCredentials creds){
		if (creds != null) {
			if (sessionPool.containsKey(getSessionKey(creds))) {
				sessionPool.remove(getSessionKey(creds));
			}
		}
	}

	public static RestClient getRestClient(AviCredentials creds) {
        LOGGER.info("__INIT__ Rest client initialization..");
        RestClient restClient = null;
        if (creds != null) {
            if (sessionPool.containsKey(getSessionKey(creds))) {
                return sessionPool.get(getSessionKey(creds));
            }
            try {
                restClient = getInitializedRestClient(creds);
                AviRestUtils.sessionPool.put(getSessionKey(creds), restClient);
                LOGGER.info("__DONE__ Rest client initialize.");
                return restClient;
            } catch (Exception e) {
                LOGGER.severe("Exception during rest client initialization");

            }
        }
        return restClient;
    }

	private static List<HttpMessageConverter<?>> getMessageConverters() {
		// Get existing message converters
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setSerializationInclusion(Include.NON_NULL);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MappingJackson2HttpMessageConverter mycov = new MappingJackson2HttpMessageConverter(objectMapper);
        mycov.setPrettyPrint(true);
        messageConverters.add(new StringHttpMessageConverter());
        messageConverters.add(mycov);
        return messageConverters;
	}

	private static RestClient getInitializedRestClient(AviCredentials creds) {
		try {
			CloseableHttpClient client = buildHttpClient(creds);
            HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory(client);
            BufferingClientHttpRequestFactory bufferingFactory = new BufferingClientHttpRequestFactory(clientHttpRequestFactory);
            DefaultUriBuilderFactory uriBuilderFactory = new DefaultUriBuilderFactory(getControllerURL(creds) + API_PREFIX);

            return RestClient.builder()
                    .requestFactory(bufferingFactory)
                    .uriBuilderFactory(uriBuilderFactory)
                    .requestInterceptors(interceptors -> interceptors.add(new AviAuthorizationInterceptor(creds)))
                    .messageConverters(converters -> {
                        converters.clear();
                        converters.addAll(getMessageConverters());
                    }).build();

		} catch (Exception e) {
			LOGGER.severe("Exception in creating rest template for AVI connection");
		}
		return null;
	}

	/**
     * This method sets a custom HttpRequestRetryStrategy in order to enable a custom
     * exception recovery mechanism.
     *
     * @return A HttpRequestRetryStrategy representing handling of the retryHandler.
     */
    private static HttpRequestRetryStrategy retryStrategy(AviCredentials creds) {
        return new HttpRequestRetryStrategy() {
            @Override
            public boolean retryRequest(HttpRequest request, IOException exception, int executionCount, HttpContext context) {
                LOGGER.info("__INIT__ Inside retry_handler.. Current execution count: " + executionCount + " of max: " + creds.getNumApiRetries());
                if (executionCount >= creds.getNumApiRetries()) {
                    return false;
                }
                if (exception instanceof ConnectTimeoutException) {
                    // It is a connection timeout, allow it to retry!!
                    return true;
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

                boolean idempotent = Method.isIdempotent(request.getMethod());
                if (idempotent) {
                    // Retry if the request is considered idempotent
                    return true;
                }
                LOGGER.info("__DONE__ Retry handler.");
                return false;
            }

            @Override
            public boolean retryRequest(HttpResponse response, int executionCount, HttpContext context) {
                LOGGER.info("__INIT__ Inside response status retry_handler.. Current execution count: " + executionCount + " of max: "+creds.getNumApiRetries());
                if (executionCount >= creds.getNumApiRetries()) {
                    // Do not retry if over max retry count
                    return false;
                }
                return response.getCode() == 503;
            }

            @Override
            public TimeValue getRetryInterval(HttpResponse response, int executionCount, HttpContext context) {
                return TimeValue.ofSeconds(creds.getRetryWaitTime());
            }
        };
    }

	public static CloseableHttpClient buildHttpClient(AviCredentials creds) {
		LOGGER.info("__INIT__ Inside buildHttpClient..");
		HttpClientBuilder clientBuilder;
		RequestConfig requestConfig = RequestConfig.custom()
                .setConnectionRequestTimeout(Timeout.ofSeconds(creds.getTimeout()))
                .setResponseTimeout(Timeout.ofMilliseconds(SOCKET_TIMEOUT))
                .build();

        if (!creds.getVerify()) {
            SSLContext sslcontext = null;
            if (creds.getSslContext() != null) {
                sslcontext = creds.getSslContext();
            } else {
                try {
                    sslcontext = SSLContexts.custom()
                            .loadTrustMaterial(null, new TrustSelfSignedStrategy()).build();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            TlsSocketStrategy tlsStrategy = new DefaultClientTlsStrategy(
                    sslcontext,
                    NoopHostnameVerifier.INSTANCE
            );
            ConnectionConfig connectionConfig = ConnectionConfig.custom()
                    .setConnectTimeout(Timeout.ofSeconds(creds.getConnectionTimeout()))
                    .setSocketTimeout(Timeout.ofMilliseconds(SOCKET_TIMEOUT))
                    .build();

            PoolingHttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
                    .setTlsSocketStrategy(tlsStrategy)
                    .setDefaultConnectionConfig(connectionConfig)
                    .build();

            BasicCredentialsProvider credentialsProvider = new BasicCredentialsProvider();
            char[] passwordChars = (creds.getPassword() != null) ? creds.getPassword().toCharArray() : new char[0];
            credentialsProvider.setCredentials
                    (new AuthScope(null, -1),
                            new UsernamePasswordCredentials(creds.getUsername(), passwordChars));

            clientBuilder = HttpClients.custom()
                    .setConnectionManager(connectionManager)
                    .setDefaultCredentialsProvider(credentialsProvider)
                    .disableCookieManagement()
                    .setDefaultRequestConfig(requestConfig);
        } else {
            ConnectionConfig connectionConfig = ConnectionConfig.custom()
                    .setConnectTimeout(Timeout.ofSeconds(creds.getConnectionTimeout()))
                    .setSocketTimeout(Timeout.ofMilliseconds(SOCKET_TIMEOUT))
                    .build();

            PoolingHttpClientConnectionManager connectionManager = PoolingHttpClientConnectionManagerBuilder.create()
                    .setDefaultConnectionConfig(connectionConfig)
                    .build();

            clientBuilder = HttpClients.custom()
                    .setConnectionManager(connectionManager)
                    .disableCookieManagement()
                    .setDefaultRequestConfig(requestConfig);
        }

        clientBuilder.setRetryStrategy(retryStrategy(creds));
		LOGGER.info("__DONE__ BuildHttpClient completed");
		return clientBuilder.build();
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
			StringEntity input = new StringEntity(body.toString(),ContentType.APPLICATION_JSON);
			postRequest.addHeader("X-Avi-Version", aviCredentials.getVersion());
			postRequest.addHeader("X-Avi-Tenant", aviCredentials.getTenant());
			postRequest.setEntity(input);
			CloseableHttpResponse response = httpClient.execute(postRequest);
			try {
				int statusCode = response.getCode();
				if (statusCode > 299) {
					LOGGER.severe("Login faild with status code " + statusCode);
					throw new IOException("Failed : HTTP error code : " + response.getCode());
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
			} finally {
				response.close();
			}
		} catch (ConnectTimeoutException e){
			throw e;
		} catch (ParseException e) {
            throw new IOException("Failed to parse response: " + e.getMessage(), e);
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
	 * @param request A ClassicHttpRequest containing all require headers.
	 * @throws Exception
	 */
	public static void buildHeaders(ClassicHttpRequest request, HashMap<String, String> userHeaders,
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
