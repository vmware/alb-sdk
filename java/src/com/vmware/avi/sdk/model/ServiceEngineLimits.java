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
 * The ServiceEngineLimits is a POJO class extends AviRestResource that used for creating
 * ServiceEngineLimits.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEngineLimits  {
    @JsonProperty("num_logical_intf_per_se")
    private Integer numLogicalIntfPerSe;

    @JsonProperty("num_phy_intf_per_se")
    private Integer numPhyIntfPerSe;

    @JsonProperty("num_virtualservices_rt_metrics")
    private Integer numVirtualservicesRtMetrics;

    @JsonProperty("num_vlan_intf_per_phy_intf")
    private Integer numVlanIntfPerPhyIntf;

    @JsonProperty("num_vlan_intf_per_se")
    private Integer numVlanIntfPerSe;

    @JsonProperty("serviceengine_cloud_limits")
    private List<ServiceEngineCloudLimits> serviceengineCloudLimits;

    @JsonProperty("serviceengine_waap_limits")
    private List<ServiceEngineSizingWaapLimits> serviceengineWaapLimits;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of logical interfaces (vlan, bond) per serviceengine.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numLogicalIntfPerSe
     */
    public Integer getNumLogicalIntfPerSe() {
        return numLogicalIntfPerSe;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of logical interfaces (vlan, bond) per serviceengine.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numLogicalIntfPerSe set the numLogicalIntfPerSe.
     */
    public void setNumLogicalIntfPerSe(Integer  numLogicalIntfPerSe) {
        this.numLogicalIntfPerSe = numLogicalIntfPerSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of physical interfaces per serviceengine.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numPhyIntfPerSe
     */
    public Integer getNumPhyIntfPerSe() {
        return numPhyIntfPerSe;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of physical interfaces per serviceengine.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numPhyIntfPerSe set the numPhyIntfPerSe.
     */
    public void setNumPhyIntfPerSe(Integer  numPhyIntfPerSe) {
        this.numPhyIntfPerSe = numPhyIntfPerSe;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of virtualservices with realtime metrics enabled.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVirtualservicesRtMetrics
     */
    public Integer getNumVirtualservicesRtMetrics() {
        return numVirtualservicesRtMetrics;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of virtualservices with realtime metrics enabled.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVirtualservicesRtMetrics set the numVirtualservicesRtMetrics.
     */
    public void setNumVirtualservicesRtMetrics(Integer  numVirtualservicesRtMetrics) {
        this.numVirtualservicesRtMetrics = numVirtualservicesRtMetrics;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of vlan interfaces per physical interface.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVlanIntfPerPhyIntf
     */
    public Integer getNumVlanIntfPerPhyIntf() {
        return numVlanIntfPerPhyIntf;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of vlan interfaces per physical interface.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVlanIntfPerPhyIntf set the numVlanIntfPerPhyIntf.
     */
    public void setNumVlanIntfPerPhyIntf(Integer  numVlanIntfPerPhyIntf) {
        this.numVlanIntfPerPhyIntf = numVlanIntfPerPhyIntf;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of vlan interfaces per serviceengine.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return numVlanIntfPerSe
     */
    public Integer getNumVlanIntfPerSe() {
        return numVlanIntfPerSe;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of vlan interfaces per serviceengine.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param numVlanIntfPerSe set the numVlanIntfPerSe.
     */
    public void setNumVlanIntfPerSe(Integer  numVlanIntfPerSe) {
        this.numVlanIntfPerSe = numVlanIntfPerSe;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Serviceengine system limits specific to cloud type.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceengineCloudLimits
     */
    public List<ServiceEngineCloudLimits> getServiceengineCloudLimits() {
        return serviceengineCloudLimits;
    }

    /**
     * This is the setter method. this will set the serviceengineCloudLimits
     * Serviceengine system limits specific to cloud type.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceengineCloudLimits
     */
    public void setServiceengineCloudLimits(List<ServiceEngineCloudLimits>  serviceengineCloudLimits) {
        this.serviceengineCloudLimits = serviceengineCloudLimits;
    }

    /**
     * This is the setter method this will set the serviceengineCloudLimits
     * Serviceengine system limits specific to cloud type.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceengineCloudLimits
     */
    public ServiceEngineLimits addServiceengineCloudLimitsItem(ServiceEngineCloudLimits serviceengineCloudLimitsItem) {
      if (this.serviceengineCloudLimits == null) {
        this.serviceengineCloudLimits = new ArrayList<ServiceEngineCloudLimits>();
      }
      this.serviceengineCloudLimits.add(serviceengineCloudLimitsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Per-tier waap se sizing limits (small, medium, large).
     * Defines the min_vcpus, min_memory, and max_vs_per_se for each tier.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceengineWaapLimits
     */
    public List<ServiceEngineSizingWaapLimits> getServiceengineWaapLimits() {
        return serviceengineWaapLimits;
    }

    /**
     * This is the setter method. this will set the serviceengineWaapLimits
     * Per-tier waap se sizing limits (small, medium, large).
     * Defines the min_vcpus, min_memory, and max_vs_per_se for each tier.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceengineWaapLimits
     */
    public void setServiceengineWaapLimits(List<ServiceEngineSizingWaapLimits>  serviceengineWaapLimits) {
        this.serviceengineWaapLimits = serviceengineWaapLimits;
    }

    /**
     * This is the setter method this will set the serviceengineWaapLimits
     * Per-tier waap se sizing limits (small, medium, large).
     * Defines the min_vcpus, min_memory, and max_vs_per_se for each tier.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceengineWaapLimits
     */
    public ServiceEngineLimits addServiceengineWaapLimitsItem(ServiceEngineSizingWaapLimits serviceengineWaapLimitsItem) {
      if (this.serviceengineWaapLimits == null) {
        this.serviceengineWaapLimits = new ArrayList<ServiceEngineSizingWaapLimits>();
      }
      this.serviceengineWaapLimits.add(serviceengineWaapLimitsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ServiceEngineLimits objServiceEngineLimits = (ServiceEngineLimits) o;
      return   Objects.equals(this.numVirtualservicesRtMetrics, objServiceEngineLimits.numVirtualservicesRtMetrics)&&
  Objects.equals(this.numVlanIntfPerPhyIntf, objServiceEngineLimits.numVlanIntfPerPhyIntf)&&
  Objects.equals(this.numVlanIntfPerSe, objServiceEngineLimits.numVlanIntfPerSe)&&
  Objects.equals(this.numPhyIntfPerSe, objServiceEngineLimits.numPhyIntfPerSe)&&
  Objects.equals(this.numLogicalIntfPerSe, objServiceEngineLimits.numLogicalIntfPerSe)&&
  Objects.equals(this.serviceengineWaapLimits, objServiceEngineLimits.serviceengineWaapLimits)&&
  Objects.equals(this.serviceengineCloudLimits, objServiceEngineLimits.serviceengineCloudLimits);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServiceEngineLimits {\n");
                  sb.append("    numLogicalIntfPerSe: ").append(toIndentedString(numLogicalIntfPerSe)).append("\n");
                        sb.append("    numPhyIntfPerSe: ").append(toIndentedString(numPhyIntfPerSe)).append("\n");
                        sb.append("    numVirtualservicesRtMetrics: ").append(toIndentedString(numVirtualservicesRtMetrics)).append("\n");
                        sb.append("    numVlanIntfPerPhyIntf: ").append(toIndentedString(numVlanIntfPerPhyIntf)).append("\n");
                        sb.append("    numVlanIntfPerSe: ").append(toIndentedString(numVlanIntfPerSe)).append("\n");
                        sb.append("    serviceengineCloudLimits: ").append(toIndentedString(serviceengineCloudLimits)).append("\n");
                        sb.append("    serviceengineWaapLimits: ").append(toIndentedString(serviceengineWaapLimits)).append("\n");
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
