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
 * The ClusterHAConfig is a POJO class extends AviRestResource that used for creating
 * ClusterHAConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClusterHAConfig  {
    @JsonProperty("cluster_id")
    private String clusterId = null;

    @JsonProperty("override_vsphere_ha")
    private Boolean overrideVsphereHa = false;

    @JsonProperty("vmg_name")
    private String vmgName = null;



    /**
     * This is the getter method this will return the attribute value.
     * Transport node cluster.
     * Avi derives vsphere ha property from vcenter cluster.if vsphere ha enabled on vcenter cluster, vsphere will handle ha of serviceengine vms in
     * case of underlying esx failure.ex mob  domain-c23.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * This is the setter method to the attribute.
     * Transport node cluster.
     * Avi derives vsphere ha property from vcenter cluster.if vsphere ha enabled on vcenter cluster, vsphere will handle ha of serviceengine vms in
     * case of underlying esx failure.ex mob  domain-c23.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterId set the clusterId.
     */
    public void setClusterId(String  clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * If this flag set to true, avi handles serviceengine failure irrespective of vsphere ha enabled on vcenter cluster or not.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return overrideVsphereHa
     */
    public Boolean getOverrideVsphereHa() {
        return overrideVsphereHa;
    }

    /**
     * This is the setter method to the attribute.
     * If this flag set to true, avi handles serviceengine failure irrespective of vsphere ha enabled on vcenter cluster or not.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param overrideVsphereHa set the overrideVsphereHa.
     */
    public void setOverrideVsphereHa(Boolean  overrideVsphereHa) {
        this.overrideVsphereHa = overrideVsphereHa;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cluster vm group name.vm group name is unique inside cluster.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vmgName
     */
    public String getVmgName() {
        return vmgName;
    }

    /**
     * This is the setter method to the attribute.
     * Cluster vm group name.vm group name is unique inside cluster.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, basic with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vmgName set the vmgName.
     */
    public void setVmgName(String  vmgName) {
        this.vmgName = vmgName;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClusterHAConfig objClusterHAConfig = (ClusterHAConfig) o;
      return   Objects.equals(this.clusterId, objClusterHAConfig.clusterId)&&
  Objects.equals(this.vmgName, objClusterHAConfig.vmgName)&&
  Objects.equals(this.overrideVsphereHa, objClusterHAConfig.overrideVsphereHa);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClusterHAConfig {\n");
                  sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
                        sb.append("    overrideVsphereHa: ").append(toIndentedString(overrideVsphereHa)).append("\n");
                        sb.append("    vmgName: ").append(toIndentedString(vmgName)).append("\n");
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
