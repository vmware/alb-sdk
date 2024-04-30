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
 * The AsyncPatchState is a POJO class extends AviRestResource that used for creating
 * AsyncPatchState.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AsyncPatchState  {
    @JsonProperty("error_message")
    private String errorMessage;

    @JsonProperty("error_status_code")
    private Integer errorStatusCode;

    @JsonProperty("merged_patch_id")
    private Integer mergedPatchId;

    @JsonProperty("patch_ids")
    private String patchIds;

    @JsonProperty("path")
    private String path;

    @JsonProperty("request_data")
    private String requestData;

    @JsonProperty("resource_data")
    private String resourceData;

    @JsonProperty("resource_name")
    private String resourceName;

    @JsonProperty("resource_type")
    private String resourceType;

    @JsonProperty("status")
    private String status;

    @JsonProperty("user")
    private String user;



    /**
     * This is the getter method this will return the attribute value.
     * Error message if request failed.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * This is the setter method to the attribute.
     * Error message if request failed.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorMessage set the errorMessage.
     */
    public void setErrorMessage(String  errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error status code if request failed.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorStatusCode
     */
    public Integer getErrorStatusCode() {
        return errorStatusCode;
    }

    /**
     * This is the setter method to the attribute.
     * Error status code if request failed.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorStatusCode set the errorStatusCode.
     */
    public void setErrorStatusCode(Integer  errorStatusCode) {
        this.errorStatusCode = errorStatusCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Merged patch id.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mergedPatchId
     */
    public Integer getMergedPatchId() {
        return mergedPatchId;
    }

    /**
     * This is the setter method to the attribute.
     * Merged patch id.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mergedPatchId set the mergedPatchId.
     */
    public void setMergedPatchId(Integer  mergedPatchId) {
        this.mergedPatchId = mergedPatchId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of patch ids.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return patchIds
     */
    public String getPatchIds() {
        return patchIds;
    }

    /**
     * This is the setter method to the attribute.
     * List of patch ids.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param patchIds set the patchIds.
     */
    public void setPatchIds(String  patchIds) {
        this.patchIds = patchIds;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Api path.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * This is the setter method to the attribute.
     * Api path.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param path set the path.
     */
    public void setPath(String  path) {
        this.path = path;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Request data.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestData
     */
    public String getRequestData() {
        return requestData;
    }

    /**
     * This is the setter method to the attribute.
     * Request data.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestData set the requestData.
     */
    public void setRequestData(String  requestData) {
        this.requestData = requestData;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Async patch queue data for which status is updated.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceData
     */
    public String getResourceData() {
        return resourceData;
    }

    /**
     * This is the setter method to the attribute.
     * Async patch queue data for which status is updated.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceData set the resourceData.
     */
    public void setResourceData(String  resourceData) {
        this.resourceData = resourceData;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the resource.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the resource.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceName set the resourceName.
     */
    public void setResourceName(String  resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Config type of the resource.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * This is the setter method to the attribute.
     * Config type of the resource.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resourceType set the resourceType.
     */
    public void setResourceType(String  resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status of async patch.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Status of async patch.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Request user.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * This is the setter method to the attribute.
     * Request user.
     * Field introduced in 22.1.6,30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param user set the user.
     */
    public void setUser(String  user) {
        this.user = user;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AsyncPatchState objAsyncPatchState = (AsyncPatchState) o;
      return   Objects.equals(this.path, objAsyncPatchState.path)&&
  Objects.equals(this.user, objAsyncPatchState.user)&&
  Objects.equals(this.status, objAsyncPatchState.status)&&
  Objects.equals(this.resourceType, objAsyncPatchState.resourceType)&&
  Objects.equals(this.resourceName, objAsyncPatchState.resourceName)&&
  Objects.equals(this.resourceData, objAsyncPatchState.resourceData)&&
  Objects.equals(this.requestData, objAsyncPatchState.requestData)&&
  Objects.equals(this.errorStatusCode, objAsyncPatchState.errorStatusCode)&&
  Objects.equals(this.errorMessage, objAsyncPatchState.errorMessage)&&
  Objects.equals(this.patchIds, objAsyncPatchState.patchIds)&&
  Objects.equals(this.mergedPatchId, objAsyncPatchState.mergedPatchId);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AsyncPatchState {\n");
                  sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
                        sb.append("    errorStatusCode: ").append(toIndentedString(errorStatusCode)).append("\n");
                        sb.append("    mergedPatchId: ").append(toIndentedString(mergedPatchId)).append("\n");
                        sb.append("    patchIds: ").append(toIndentedString(patchIds)).append("\n");
                        sb.append("    path: ").append(toIndentedString(path)).append("\n");
                        sb.append("    requestData: ").append(toIndentedString(requestData)).append("\n");
                        sb.append("    resourceData: ").append(toIndentedString(resourceData)).append("\n");
                        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
                        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
                        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
