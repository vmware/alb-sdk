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
 * The CLSStatus is a POJO class extends AviRestResource that used for creating
 * CLSStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CLSStatus  {
    @JsonProperty("cls_id")
    private String clsId;

    @JsonProperty("cls_ref")
    private String clsRef;

    @JsonProperty("connected")
    private Boolean connected;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("refreshed_at")
    private String refreshedAt;

    @JsonProperty("usage_uploaded_at")
    private String usageUploadedAt;



    /**
     * This is the getter method this will return the attribute value.
     * Cls id.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clsId
     */
    public String getClsId() {
        return clsId;
    }

    /**
     * This is the setter method to the attribute.
     * Cls id.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clsId set the clsId.
     */
    public void setClsId(String  clsId) {
        this.clsId = clsId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the ssp instance for cls licensing.
     * It is a reference to an object of type sspinstance.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clsRef
     */
    public String getClsRef() {
        return clsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the ssp instance for cls licensing.
     * It is a reference to an object of type sspinstance.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clsRef set the clsRef.
     */
    public void setClsRef(String  clsRef) {
        this.clsRef = clsRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cls connectivity status.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connected
     */
    public Boolean getConnected() {
        return connected;
    }

    /**
     * This is the setter method to the attribute.
     * Cls connectivity status.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connected set the connected.
     */
    public void setConnected(Boolean  connected) {
        this.connected = connected;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether cls is enabled.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Whether cls is enabled.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp of last attempted license refresh from cls.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return refreshedAt
     */
    public String getRefreshedAt() {
        return refreshedAt;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp of last attempted license refresh from cls.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param refreshedAt set the refreshedAt.
     */
    public void setRefreshedAt(String  refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp of last successful license usage upload to cls.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return usageUploadedAt
     */
    public String getUsageUploadedAt() {
        return usageUploadedAt;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp of last successful license usage upload to cls.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param usageUploadedAt set the usageUploadedAt.
     */
    public void setUsageUploadedAt(String  usageUploadedAt) {
        this.usageUploadedAt = usageUploadedAt;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CLSStatus objCLSStatus = (CLSStatus) o;
      return   Objects.equals(this.clsRef, objCLSStatus.clsRef)&&
  Objects.equals(this.connected, objCLSStatus.connected)&&
  Objects.equals(this.clsId, objCLSStatus.clsId)&&
  Objects.equals(this.refreshedAt, objCLSStatus.refreshedAt)&&
  Objects.equals(this.usageUploadedAt, objCLSStatus.usageUploadedAt)&&
  Objects.equals(this.enabled, objCLSStatus.enabled);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CLSStatus {\n");
                  sb.append("    clsId: ").append(toIndentedString(clsId)).append("\n");
                        sb.append("    clsRef: ").append(toIndentedString(clsRef)).append("\n");
                        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
                        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    refreshedAt: ").append(toIndentedString(refreshedAt)).append("\n");
                        sb.append("    usageUploadedAt: ").append(toIndentedString(usageUploadedAt)).append("\n");
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
