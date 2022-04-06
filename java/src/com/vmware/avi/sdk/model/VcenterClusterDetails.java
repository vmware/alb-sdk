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
 * The VcenterClusterDetails is a POJO class extends AviRestResource that used for creating
 * VcenterClusterDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VcenterClusterDetails  {
    @JsonProperty("cc_id")
    private String ccId = null;

    @JsonProperty("cluster")
    private String cluster = null;

    @JsonProperty("error_string")
    private String errorString = null;

    @JsonProperty("hosts")
    private List<String> hosts = null;

    @JsonProperty("vc_url")
    private String vcUrl = null;



    /**
     * This is the getter method this will return the attribute value.
     * Cloud id.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ccId
     */
    public String getCcId() {
        return ccId;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud id.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ccId set the ccId.
     */
    public void setCcId(String  ccId) {
        this.ccId = ccId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cluster name in vcenter.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cluster
     */
    public String getCluster() {
        return cluster;
    }

    /**
     * This is the setter method to the attribute.
     * Cluster name in vcenter.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cluster set the cluster.
     */
    public void setCluster(String  cluster) {
        this.cluster = cluster;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Error message.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Hosts in vcenter cluster.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public List<String> getHosts() {
        return hosts;
    }

    /**
     * This is the setter method. this will set the hosts
     * Hosts in vcenter cluster.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public void setHosts(List<String>  hosts) {
        this.hosts = hosts;
    }

    /**
     * This is the setter method this will set the hosts
     * Hosts in vcenter cluster.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return hosts
     */
    public VcenterClusterDetails addHostsItem(String hostsItem) {
      if (this.hosts == null) {
        this.hosts = new ArrayList<String>();
      }
      this.hosts.add(hostsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Vc url.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vcUrl
     */
    public String getVcUrl() {
        return vcUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Vc url.
     * Field introduced in 20.1.7, 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vcUrl set the vcUrl.
     */
    public void setVcUrl(String  vcUrl) {
        this.vcUrl = vcUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VcenterClusterDetails objVcenterClusterDetails = (VcenterClusterDetails) o;
      return   Objects.equals(this.vcUrl, objVcenterClusterDetails.vcUrl)&&
  Objects.equals(this.cluster, objVcenterClusterDetails.cluster)&&
  Objects.equals(this.ccId, objVcenterClusterDetails.ccId)&&
  Objects.equals(this.hosts, objVcenterClusterDetails.hosts)&&
  Objects.equals(this.errorString, objVcenterClusterDetails.errorString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VcenterClusterDetails {\n");
                  sb.append("    ccId: ").append(toIndentedString(ccId)).append("\n");
                        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    hosts: ").append(toIndentedString(hosts)).append("\n");
                        sb.append("    vcUrl: ").append(toIndentedString(vcUrl)).append("\n");
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
