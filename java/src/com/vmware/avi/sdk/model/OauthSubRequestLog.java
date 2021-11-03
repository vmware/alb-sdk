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
 * The OauthSubRequestLog is a POJO class extends AviRestResource that used for creating
 * OauthSubRequestLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OauthSubRequestLog  {
    @JsonProperty("error_code")
    private String errorCode = null;

    @JsonProperty("error_description")
    private String errorDescription = null;

    @JsonProperty("sub_request_log")
    private SubRequestLog subRequestLog = null;



    /**
     * This is the getter method this will return the attribute value.
     * Error code.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * This is the setter method to the attribute.
     * Error code.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorCode set the errorCode.
     */
    public void setErrorCode(String  errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error description.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorDescription
     */
    public String getErrorDescription() {
        return errorDescription;
    }

    /**
     * This is the setter method to the attribute.
     * Error description.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorDescription set the errorDescription.
     */
    public void setErrorDescription(String  errorDescription) {
        this.errorDescription = errorDescription;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Subrequest info related to the oauth flow.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subRequestLog
     */
    public SubRequestLog getSubRequestLog() {
        return subRequestLog;
    }

    /**
     * This is the setter method to the attribute.
     * Subrequest info related to the oauth flow.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subRequestLog set the subRequestLog.
     */
    public void setSubRequestLog(SubRequestLog subRequestLog) {
        this.subRequestLog = subRequestLog;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      OauthSubRequestLog objOauthSubRequestLog = (OauthSubRequestLog) o;
      return   Objects.equals(this.subRequestLog, objOauthSubRequestLog.subRequestLog)&&
  Objects.equals(this.errorCode, objOauthSubRequestLog.errorCode)&&
  Objects.equals(this.errorDescription, objOauthSubRequestLog.errorDescription);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class OauthSubRequestLog {\n");
                  sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
                        sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
                        sb.append("    subRequestLog: ").append(toIndentedString(subRequestLog)).append("\n");
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
