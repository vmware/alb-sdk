/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * HealthMonitorSSLAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class HealthMonitorSSLAttributes {
  @JsonProperty("pki_profile_ref")
  private String pkiProfileRef = null;

  @JsonProperty("server_name")
  private String serverName = null;

  @JsonProperty("ssl_key_and_certificate_ref")
  private String sslKeyAndCertificateRef = null;

  @JsonProperty("ssl_profile_ref")
  private String sslProfileRef = null;

  public HealthMonitorSSLAttributes pkiProfileRef(String pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
    return this;
  }

   /**
   * PKI profile used to validate the SSL certificate presented by a server. It is a reference to an object of type PKIProfile. Field introduced in 17.1.1.
   * @return pkiProfileRef
  **/
  @Schema(description = "PKI profile used to validate the SSL certificate presented by a server. It is a reference to an object of type PKIProfile. Field introduced in 17.1.1.")
  public String getPkiProfileRef() {
    return pkiProfileRef;
  }

  public void setPkiProfileRef(String pkiProfileRef) {
    this.pkiProfileRef = pkiProfileRef;
  }

  public HealthMonitorSSLAttributes serverName(String serverName) {
    this.serverName = serverName;
    return this;
  }

   /**
   * Fully qualified DNS hostname which will be used in the TLS SNI extension in server connections indicating SNI is enabled. Field introduced in 18.2.3.
   * @return serverName
  **/
  @Schema(description = "Fully qualified DNS hostname which will be used in the TLS SNI extension in server connections indicating SNI is enabled. Field introduced in 18.2.3.")
  public String getServerName() {
    return serverName;
  }

  public void setServerName(String serverName) {
    this.serverName = serverName;
  }

  public HealthMonitorSSLAttributes sslKeyAndCertificateRef(String sslKeyAndCertificateRef) {
    this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
    return this;
  }

   /**
   * Service engines will present this SSL certificate to the server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 17.1.1.
   * @return sslKeyAndCertificateRef
  **/
  @Schema(description = "Service engines will present this SSL certificate to the server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 17.1.1.")
  public String getSslKeyAndCertificateRef() {
    return sslKeyAndCertificateRef;
  }

  public void setSslKeyAndCertificateRef(String sslKeyAndCertificateRef) {
    this.sslKeyAndCertificateRef = sslKeyAndCertificateRef;
  }

  public HealthMonitorSSLAttributes sslProfileRef(String sslProfileRef) {
    this.sslProfileRef = sslProfileRef;
    return this;
  }

   /**
   * SSL profile defines ciphers and SSL versions to be used for healthmonitor traffic to the back-end servers. It is a reference to an object of type SSLProfile. Field introduced in 17.1.1.
   * @return sslProfileRef
  **/
  @Schema(required = true, description = "SSL profile defines ciphers and SSL versions to be used for healthmonitor traffic to the back-end servers. It is a reference to an object of type SSLProfile. Field introduced in 17.1.1.")
  public String getSslProfileRef() {
    return sslProfileRef;
  }

  public void setSslProfileRef(String sslProfileRef) {
    this.sslProfileRef = sslProfileRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthMonitorSSLAttributes healthMonitorSSLAttributes = (HealthMonitorSSLAttributes) o;
    return Objects.equals(this.pkiProfileRef, healthMonitorSSLAttributes.pkiProfileRef) &&
        Objects.equals(this.serverName, healthMonitorSSLAttributes.serverName) &&
        Objects.equals(this.sslKeyAndCertificateRef, healthMonitorSSLAttributes.sslKeyAndCertificateRef) &&
        Objects.equals(this.sslProfileRef, healthMonitorSSLAttributes.sslProfileRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pkiProfileRef, serverName, sslKeyAndCertificateRef, sslProfileRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthMonitorSSLAttributes {\n");
    
    sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    sslKeyAndCertificateRef: ").append(toIndentedString(sslKeyAndCertificateRef)).append("\n");
    sb.append("    sslProfileRef: ").append(toIndentedString(sslProfileRef)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
