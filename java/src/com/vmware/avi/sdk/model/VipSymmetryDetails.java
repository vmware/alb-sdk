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
 * The VipSymmetryDetails is a POJO class extends AviRestResource that used for creating
 * VipSymmetryDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VipSymmetryDetails  {
    @JsonProperty("max_num_se_assigned")
    private Integer maxNumSeAssigned = null;

    @JsonProperty("max_num_se_requested")
    private Integer maxNumSeRequested = null;

    @JsonProperty("min_num_se_assigned")
    private Integer minNumSeAssigned = null;

    @JsonProperty("min_num_se_requested")
    private Integer minNumSeRequested = null;

    @JsonProperty("num_vs")
    private Integer numVs = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("vip_id")
    private String vipId = null;

    @JsonProperty("vsvip_name")
    private String vsvipName = null;

    @JsonProperty("vsvip_uuid")
    private String vsvipUuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of ses assigned across all virtual services sharing this vip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxNumSeAssigned
     */
    public Integer getMaxNumSeAssigned() {
        return maxNumSeAssigned;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of ses assigned across all virtual services sharing this vip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxNumSeAssigned set the maxNumSeAssigned.
     */
    public void setMaxNumSeAssigned(Integer  maxNumSeAssigned) {
        this.maxNumSeAssigned = maxNumSeAssigned;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of ses requested across all virtual services sharing this vip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return maxNumSeRequested
     */
    public Integer getMaxNumSeRequested() {
        return maxNumSeRequested;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of ses requested across all virtual services sharing this vip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param maxNumSeRequested set the maxNumSeRequested.
     */
    public void setMaxNumSeRequested(Integer  maxNumSeRequested) {
        this.maxNumSeRequested = maxNumSeRequested;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of ses assigned across all virtual services sharing this vip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minNumSeAssigned
     */
    public Integer getMinNumSeAssigned() {
        return minNumSeAssigned;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of ses assigned across all virtual services sharing this vip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minNumSeAssigned set the minNumSeAssigned.
     */
    public void setMinNumSeAssigned(Integer  minNumSeAssigned) {
        this.minNumSeAssigned = minNumSeAssigned;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum number of ses requested across all virtual services sharing this vip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return minNumSeRequested
     */
    public Integer getMinNumSeRequested() {
        return minNumSeRequested;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum number of ses requested across all virtual services sharing this vip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param minNumSeRequested set the minNumSeRequested.
     */
    public void setMinNumSeRequested(Integer  minNumSeRequested) {
        this.minNumSeRequested = minNumSeRequested;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of virtual services sharing vsvip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVs
     */
    public Integer getNumVs() {
        return numVs;
    }

    /**
     * This is the setter method to the attribute.
     * Number of virtual services sharing vsvip.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVs set the numVs.
     */
    public void setNumVs(Integer  numVs) {
        this.numVs = numVs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason for symmetric/asymmetric shared vip event.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason for symmetric/asymmetric shared vip event.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vip id.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipId
     */
    public String getVipId() {
        return vipId;
    }

    /**
     * This is the setter method to the attribute.
     * Vip id.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipId set the vipId.
     */
    public void setVipId(String  vipId) {
        this.vipId = vipId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vsvip name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsvipName
     */
    public String getVsvipName() {
        return vsvipName;
    }

    /**
     * This is the setter method to the attribute.
     * Vsvip name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsvipName set the vsvipName.
     */
    public void setVsvipName(String  vsvipName) {
        this.vsvipName = vsvipName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vsvip uuid.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsvipUuid
     */
    public String getVsvipUuid() {
        return vsvipUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Vsvip uuid.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsvipUuid set the vsvipUuid.
     */
    public void setVsvipUuid(String  vsvipUuid) {
        this.vsvipUuid = vsvipUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VipSymmetryDetails objVipSymmetryDetails = (VipSymmetryDetails) o;
      return   Objects.equals(this.vsvipUuid, objVipSymmetryDetails.vsvipUuid)&&
  Objects.equals(this.vsvipName, objVipSymmetryDetails.vsvipName)&&
  Objects.equals(this.vipId, objVipSymmetryDetails.vipId)&&
  Objects.equals(this.numVs, objVipSymmetryDetails.numVs)&&
  Objects.equals(this.maxNumSeRequested, objVipSymmetryDetails.maxNumSeRequested)&&
  Objects.equals(this.minNumSeRequested, objVipSymmetryDetails.minNumSeRequested)&&
  Objects.equals(this.maxNumSeAssigned, objVipSymmetryDetails.maxNumSeAssigned)&&
  Objects.equals(this.minNumSeAssigned, objVipSymmetryDetails.minNumSeAssigned)&&
  Objects.equals(this.reason, objVipSymmetryDetails.reason);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VipSymmetryDetails {\n");
                  sb.append("    maxNumSeAssigned: ").append(toIndentedString(maxNumSeAssigned)).append("\n");
                        sb.append("    maxNumSeRequested: ").append(toIndentedString(maxNumSeRequested)).append("\n");
                        sb.append("    minNumSeAssigned: ").append(toIndentedString(minNumSeAssigned)).append("\n");
                        sb.append("    minNumSeRequested: ").append(toIndentedString(minNumSeRequested)).append("\n");
                        sb.append("    numVs: ").append(toIndentedString(numVs)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
                        sb.append("    vsvipName: ").append(toIndentedString(vsvipName)).append("\n");
                        sb.append("    vsvipUuid: ").append(toIndentedString(vsvipUuid)).append("\n");
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
