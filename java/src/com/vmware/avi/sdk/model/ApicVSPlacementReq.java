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
 * The ApicVSPlacementReq is a POJO class extends AviRestResource that used for creating
 * ApicVSPlacementReq.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApicVSPlacementReq  {
    @JsonProperty("graph")
    private String graph;

    @JsonProperty("lifs")
    private List<Lif> lifs;

    @JsonProperty("network_rel")
    private List<APICNetworkRel> networkRel;

    @JsonProperty("tenant_name")
    private String tenantName;

    @JsonProperty("vdev")
    private String vdev;

    @JsonProperty("vgrp")
    private String vgrp;



    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return graph
     */
    public String getGraph() {
        return graph;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param graph set the graph.
     */
    public void setGraph(String  graph) {
        this.graph = graph;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return lifs
     */
    public List<Lif> getLifs() {
        return lifs;
    }

    /**
     * This is the setter method. this will set the lifs
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return lifs
     */
    public void setLifs(List<Lif>  lifs) {
        this.lifs = lifs;
    }

    /**
     * This is the setter method this will set the lifs
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return lifs
     */
    public ApicVSPlacementReq addLifsItem(Lif lifsItem) {
      if (this.lifs == null) {
        this.lifs = new ArrayList<Lif>();
      }
      this.lifs.add(lifsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return networkRel
     */
    public List<APICNetworkRel> getNetworkRel() {
        return networkRel;
    }

    /**
     * This is the setter method. this will set the networkRel
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return networkRel
     */
    public void setNetworkRel(List<APICNetworkRel>  networkRel) {
        this.networkRel = networkRel;
    }

    /**
     * This is the setter method this will set the networkRel
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return networkRel
     */
    public ApicVSPlacementReq addNetworkRelItem(APICNetworkRel networkRelItem) {
      if (this.networkRel == null) {
        this.networkRel = new ArrayList<APICNetworkRel>();
      }
      this.networkRel.add(networkRelItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param tenantName set the tenantName.
     */
    public void setTenantName(String  tenantName) {
        this.tenantName = tenantName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return vdev
     */
    public String getVdev() {
        return vdev;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param vdev set the vdev.
     */
    public void setVdev(String  vdev) {
        this.vdev = vdev;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return vgrp
     */
    public String getVgrp() {
        return vgrp;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param vgrp set the vgrp.
     */
    public void setVgrp(String  vgrp) {
        this.vgrp = vgrp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApicVSPlacementReq objApicVSPlacementReq = (ApicVSPlacementReq) o;
      return   Objects.equals(this.vdev, objApicVSPlacementReq.vdev)&&
  Objects.equals(this.graph, objApicVSPlacementReq.graph)&&
  Objects.equals(this.tenantName, objApicVSPlacementReq.tenantName)&&
  Objects.equals(this.lifs, objApicVSPlacementReq.lifs)&&
  Objects.equals(this.vgrp, objApicVSPlacementReq.vgrp)&&
  Objects.equals(this.networkRel, objApicVSPlacementReq.networkRel);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApicVSPlacementReq {\n");
                  sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
                        sb.append("    lifs: ").append(toIndentedString(lifs)).append("\n");
                        sb.append("    networkRel: ").append(toIndentedString(networkRel)).append("\n");
                        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
                        sb.append("    vdev: ").append(toIndentedString(vdev)).append("\n");
                        sb.append("    vgrp: ").append(toIndentedString(vgrp)).append("\n");
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
