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
 * The VcenterNonDrsClusterDetails is a POJO class extends AviRestResource that used for creating
 * VcenterNonDrsClusterDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VcenterNonDrsClusterDetails  {
    @JsonProperty("cc_id")
    private String ccId;

    @JsonProperty("non_drs_cluster_ids")
    private List<String> nonDrsClusterIds;

    @JsonProperty("se_vm_uuid")
    private String seVmUuid;



    /**
     * This is the getter method this will return the attribute value.
     * Cloud id.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccId
     */
    public String getCcId() {
        return ccId;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud id.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccId set the ccId.
     */
    public void setCcId(String  ccId) {
        this.ccId = ccId;
    }
    /**
     * This is the getter method this will return the attribute value.
     * A list of cluster ids having drs disabled.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nonDrsClusterIds
     */
    public List<String> getNonDrsClusterIds() {
        return nonDrsClusterIds;
    }

    /**
     * This is the setter method. this will set the nonDrsClusterIds
     * A list of cluster ids having drs disabled.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nonDrsClusterIds
     */
    public void setNonDrsClusterIds(List<String>  nonDrsClusterIds) {
        this.nonDrsClusterIds = nonDrsClusterIds;
    }

    /**
     * This is the setter method this will set the nonDrsClusterIds
     * A list of cluster ids having drs disabled.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nonDrsClusterIds
     */
    public VcenterNonDrsClusterDetails addNonDrsClusterIdsItem(String nonDrsClusterIdsItem) {
      if (this.nonDrsClusterIds == null) {
        this.nonDrsClusterIds = new ArrayList<String>();
      }
      this.nonDrsClusterIds.add(nonDrsClusterIdsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The uuid of the service engine whose placement triggered this event.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seVmUuid
     */
    public String getSeVmUuid() {
        return seVmUuid;
    }

    /**
     * This is the setter method to the attribute.
     * The uuid of the service engine whose placement triggered this event.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seVmUuid set the seVmUuid.
     */
    public void setSeVmUuid(String  seVmUuid) {
        this.seVmUuid = seVmUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VcenterNonDrsClusterDetails objVcenterNonDrsClusterDetails = (VcenterNonDrsClusterDetails) o;
      return   Objects.equals(this.ccId, objVcenterNonDrsClusterDetails.ccId)&&
  Objects.equals(this.seVmUuid, objVcenterNonDrsClusterDetails.seVmUuid)&&
  Objects.equals(this.nonDrsClusterIds, objVcenterNonDrsClusterDetails.nonDrsClusterIds);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VcenterNonDrsClusterDetails {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    nonDrsClusterIds: ").append(toIndentedString(nonDrsClusterIds)).append("\n");
                        sb.append("    seVmUuid: ").append(toIndentedString(seVmUuid)).append("\n");
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
