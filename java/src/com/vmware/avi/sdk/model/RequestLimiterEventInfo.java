/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The RequestLimiterEventInfo is a POJO class extends AviRestResource that used for creating
 * RequestLimiterEventInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RequestLimiterEventInfo  {
    @JsonProperty("client_ip")
    private String clientIp;

    @JsonProperty("error_status_code")
    private Integer errorStatusCode;

    @JsonProperty("message")
    private String message;

    @JsonProperty("method")
    private String method;

    @JsonProperty("processed")
    private Boolean processed = false;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("user_agent")
    private String userAgent;



    /**
     * This is the getter method this will return the attribute value.
     * Ip of the client from which request has been received.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    /**
     * This is the setter method to the attribute.
     * Ip of the client from which request has been received.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientIp set the clientIp.
     */
    public void setClientIp(String  clientIp) {
        this.clientIp = clientIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http error response code for the throttled request.
     * Allowed values are 200-504.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorStatusCode
     */
    public Integer getErrorStatusCode() {
        return errorStatusCode;
    }

    /**
     * This is the setter method to the attribute.
     * Http error response code for the throttled request.
     * Allowed values are 200-504.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorStatusCode set the errorStatusCode.
     */
    public void setErrorStatusCode(Integer  errorStatusCode) {
        this.errorStatusCode = errorStatusCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error/warning/alert message describing the event.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * This is the setter method to the attribute.
     * Error/warning/alert message describing the event.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param message set the message.
     */
    public void setMessage(String  message) {
        this.message = message;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http request method.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * This is the setter method to the attribute.
     * Http request method.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param method set the method.
     */
    public void setMethod(String  method) {
        this.method = method;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether the request has been processed(true) or not(false).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return processed
     */
    public Boolean getProcessed() {
        return processed;
    }

    /**
     * This is the setter method to the attribute.
     * Whether the request has been processed(true) or not(false).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param processed set the processed.
     */
    public void setProcessed(Boolean  processed) {
        this.processed = processed;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Http request url.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Http request url.
    * Field introduced in 31.1.1.
    * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
    * Default value when not specified in API or module is interpreted by Avi Controller as null.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * User agent of the client from which request has been received.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This is the setter method to the attribute.
     * User agent of the client from which request has been received.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param userAgent set the userAgent.
     */
    public void setUserAgent(String  userAgent) {
        this.userAgent = userAgent;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RequestLimiterEventInfo objRequestLimiterEventInfo = (RequestLimiterEventInfo) o;
      return   Objects.equals(this.method, objRequestLimiterEventInfo.method)&&
  Objects.equals(this.processed, objRequestLimiterEventInfo.processed)&&
  Objects.equals(this.message, objRequestLimiterEventInfo.message)&&
  Objects.equals(this.errorStatusCode, objRequestLimiterEventInfo.errorStatusCode)&&
  Objects.equals(this.clientIp, objRequestLimiterEventInfo.clientIp)&&
  Objects.equals(this.userAgent, objRequestLimiterEventInfo.userAgent);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RequestLimiterEventInfo {\n");
                  sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
                        sb.append("    errorStatusCode: ").append(toIndentedString(errorStatusCode)).append("\n");
                        sb.append("    message: ").append(toIndentedString(message)).append("\n");
                        sb.append("    method: ").append(toIndentedString(method)).append("\n");
                        sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
                                    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
