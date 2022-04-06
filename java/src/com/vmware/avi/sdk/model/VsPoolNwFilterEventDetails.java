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
 * The VsPoolNwFilterEventDetails is a POJO class extends AviRestResource that used for creating
 * VsPoolNwFilterEventDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VsPoolNwFilterEventDetails  {
    @JsonProperty("filter")
    private String filter = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("network")
    private String network = null;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param filter set the filter.
     */
    public void setFilter(String  filter) {
        this.filter = filter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return network
     */
    public String getNetwork() {
        return network;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param network set the network.
     */
    public void setNetwork(String  network) {
        this.network = network;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VsPoolNwFilterEventDetails objVsPoolNwFilterEventDetails = (VsPoolNwFilterEventDetails) o;
      return   Objects.equals(this.name, objVsPoolNwFilterEventDetails.name)&&
  Objects.equals(this.filter, objVsPoolNwFilterEventDetails.filter)&&
  Objects.equals(this.network, objVsPoolNwFilterEventDetails.network);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VsPoolNwFilterEventDetails {\n");
                  sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    network: ").append(toIndentedString(network)).append("\n");
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
