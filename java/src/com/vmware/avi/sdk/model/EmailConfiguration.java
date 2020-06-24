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
 * EmailConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class EmailConfiguration {
  @JsonProperty("auth_password")
  private String authPassword = null;

  @JsonProperty("auth_username")
  private String authUsername = null;

  @JsonProperty("disable_tls")
  private Boolean disableTls = null;

  @JsonProperty("from_email")
  private String fromEmail = "admin@avicontroller.net";

  @JsonProperty("mail_server_name")
  private String mailServerName = "localhost";

  @JsonProperty("mail_server_port")
  private Integer mailServerPort = 25;

  @JsonProperty("smtp_type")
  private String smtpType = "SMTP_LOCAL_HOST";

  public EmailConfiguration authPassword(String authPassword) {
    this.authPassword = authPassword;
    return this;
  }

   /**
   * Password for mail server.
   * @return authPassword
  **/
  @Schema(description = "Password for mail server.")
  public String getAuthPassword() {
    return authPassword;
  }

  public void setAuthPassword(String authPassword) {
    this.authPassword = authPassword;
  }

  public EmailConfiguration authUsername(String authUsername) {
    this.authUsername = authUsername;
    return this;
  }

   /**
   * Username for mail server.
   * @return authUsername
  **/
  @Schema(description = "Username for mail server.")
  public String getAuthUsername() {
    return authUsername;
  }

  public void setAuthUsername(String authUsername) {
    this.authUsername = authUsername;
  }

  public EmailConfiguration disableTls(Boolean disableTls) {
    this.disableTls = disableTls;
    return this;
  }

   /**
   * When set, disables TLS on the connection to the mail server. Field introduced in 17.2.12, 18.1.3, 18.2.1.
   * @return disableTls
  **/
  @Schema(description = "When set, disables TLS on the connection to the mail server. Field introduced in 17.2.12, 18.1.3, 18.2.1.")
  public Boolean isDisableTls() {
    return disableTls;
  }

  public void setDisableTls(Boolean disableTls) {
    this.disableTls = disableTls;
  }

  public EmailConfiguration fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * Email address in From field.
   * @return fromEmail
  **/
  @Schema(description = "Email address in From field.")
  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  public EmailConfiguration mailServerName(String mailServerName) {
    this.mailServerName = mailServerName;
    return this;
  }

   /**
   * Mail server host.
   * @return mailServerName
  **/
  @Schema(description = "Mail server host.")
  public String getMailServerName() {
    return mailServerName;
  }

  public void setMailServerName(String mailServerName) {
    this.mailServerName = mailServerName;
  }

  public EmailConfiguration mailServerPort(Integer mailServerPort) {
    this.mailServerPort = mailServerPort;
    return this;
  }

   /**
   * Mail server port.
   * @return mailServerPort
  **/
  @Schema(description = "Mail server port.")
  public Integer getMailServerPort() {
    return mailServerPort;
  }

  public void setMailServerPort(Integer mailServerPort) {
    this.mailServerPort = mailServerPort;
  }

  public EmailConfiguration smtpType(String smtpType) {
    this.smtpType = smtpType;
    return this;
  }

   /**
   * Type of SMTP Mail Service. Enum options - SMTP_NONE, SMTP_LOCAL_HOST, SMTP_SERVER, SMTP_ANONYMOUS_SERVER.
   * @return smtpType
  **/
  @Schema(required = true, description = "Type of SMTP Mail Service. Enum options - SMTP_NONE, SMTP_LOCAL_HOST, SMTP_SERVER, SMTP_ANONYMOUS_SERVER.")
  public String getSmtpType() {
    return smtpType;
  }

  public void setSmtpType(String smtpType) {
    this.smtpType = smtpType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailConfiguration emailConfiguration = (EmailConfiguration) o;
    return Objects.equals(this.authPassword, emailConfiguration.authPassword) &&
        Objects.equals(this.authUsername, emailConfiguration.authUsername) &&
        Objects.equals(this.disableTls, emailConfiguration.disableTls) &&
        Objects.equals(this.fromEmail, emailConfiguration.fromEmail) &&
        Objects.equals(this.mailServerName, emailConfiguration.mailServerName) &&
        Objects.equals(this.mailServerPort, emailConfiguration.mailServerPort) &&
        Objects.equals(this.smtpType, emailConfiguration.smtpType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authPassword, authUsername, disableTls, fromEmail, mailServerName, mailServerPort, smtpType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailConfiguration {\n");
    
    sb.append("    authPassword: ").append(toIndentedString(authPassword)).append("\n");
    sb.append("    authUsername: ").append(toIndentedString(authUsername)).append("\n");
    sb.append("    disableTls: ").append(toIndentedString(disableTls)).append("\n");
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    mailServerName: ").append(toIndentedString(mailServerName)).append("\n");
    sb.append("    mailServerPort: ").append(toIndentedString(mailServerPort)).append("\n");
    sb.append("    smtpType: ").append(toIndentedString(smtpType)).append("\n");
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
