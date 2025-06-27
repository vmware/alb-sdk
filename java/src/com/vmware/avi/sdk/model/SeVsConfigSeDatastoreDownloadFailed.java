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
 * The SeVsConfigSeDatastoreDownloadFailed is a POJO class extends AviRestResource that used for creating
 * SeVsConfigSeDatastoreDownloadFailed.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeVsConfigSeDatastoreDownloadFailed  {
    @JsonProperty("fail_obj_name")
    private String failObjName;

    @JsonProperty("fail_obj_uuid")
    private String failObjUuid;

    @JsonProperty("fail_reason")
    private String failReason;

    @JsonProperty("parent_obj_uuid")
    private String parentObjUuid;

    @JsonProperty("se_ref")
    private String seRef;

    @JsonProperty("vs_ref")
    private String vsRef;



    /**
     * This is the getter method this will return the attribute value.
     * Name of the failed config object where downlaod fails.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failObjName
     */
    public String getFailObjName() {
        return failObjName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the failed config object where downlaod fails.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param failObjName set the failObjName.
     */
    public void setFailObjName(String  failObjName) {
        this.failObjName = failObjName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the failed config object.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failObjUuid
     */
    public String getFailObjUuid() {
        return failObjUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the failed config object.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param failObjUuid set the failObjUuid.
     */
    public void setFailObjUuid(String  failObjUuid) {
        this.failObjUuid = failObjUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason for config download failure.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason for config download failure.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param failReason set the failReason.
     */
    public void setFailReason(String  failReason) {
        this.failReason = failReason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the top level object where config downlaod failed.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return parentObjUuid
     */
    public String getParentObjUuid() {
        return parentObjUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the top level object where config downlaod failed.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param parentObjUuid set the parentObjUuid.
     */
    public void setParentObjUuid(String  parentObjUuid) {
        this.parentObjUuid = parentObjUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the se responsible for this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seRef
     */
    public String getSeRef() {
        return seRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the se responsible for this event.
     * It is a reference to an object of type serviceengine.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seRef set the seRef.
     */
    public void setSeRef(String  seRef) {
        this.seRef = seRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the vs where config downlaod failed.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsRef
     */
    public String getVsRef() {
        return vsRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the vs where config downlaod failed.
     * It is a reference to an object of type virtualservice.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsRef set the vsRef.
     */
    public void setVsRef(String  vsRef) {
        this.vsRef = vsRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeVsConfigSeDatastoreDownloadFailed objSeVsConfigSeDatastoreDownloadFailed = (SeVsConfigSeDatastoreDownloadFailed) o;
      return   Objects.equals(this.seRef, objSeVsConfigSeDatastoreDownloadFailed.seRef)&&
  Objects.equals(this.vsRef, objSeVsConfigSeDatastoreDownloadFailed.vsRef)&&
  Objects.equals(this.parentObjUuid, objSeVsConfigSeDatastoreDownloadFailed.parentObjUuid)&&
  Objects.equals(this.failObjUuid, objSeVsConfigSeDatastoreDownloadFailed.failObjUuid)&&
  Objects.equals(this.failObjName, objSeVsConfigSeDatastoreDownloadFailed.failObjName)&&
  Objects.equals(this.failReason, objSeVsConfigSeDatastoreDownloadFailed.failReason);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeVsConfigSeDatastoreDownloadFailed {\n");
                  sb.append("    failObjName: ").append(toIndentedString(failObjName)).append("\n");
                        sb.append("    failObjUuid: ").append(toIndentedString(failObjUuid)).append("\n");
                        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
                        sb.append("    parentObjUuid: ").append(toIndentedString(parentObjUuid)).append("\n");
                        sb.append("    seRef: ").append(toIndentedString(seRef)).append("\n");
                        sb.append("    vsRef: ").append(toIndentedString(vsRef)).append("\n");
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
