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
 * The SiteLink is a POJO class extends AviRestResource that used for creating
 * SiteLink.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SiteLink  {
    @JsonProperty("destination")
    private SiteInfo destination;

    @JsonProperty("source")
    private SiteInfo source;



    /**
     * This is the getter method this will return the attribute value.
     * Destination site information (cluster_uuid, name).
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return destination
     */
    public SiteInfo getDestination() {
        return destination;
    }

    /**
     * This is the setter method to the attribute.
     * Destination site information (cluster_uuid, name).
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param destination set the destination.
     */
    public void setDestination(SiteInfo destination) {
        this.destination = destination;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Source site information (cluster_uuid, name).
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return source
     */
    public SiteInfo getSource() {
        return source;
    }

    /**
     * This is the setter method to the attribute.
     * Source site information (cluster_uuid, name).
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param source set the source.
     */
    public void setSource(SiteInfo source) {
        this.source = source;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SiteLink objSiteLink = (SiteLink) o;
      return   Objects.equals(this.source, objSiteLink.source)&&
  Objects.equals(this.destination, objSiteLink.destination);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SiteLink {\n");
                  sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
                        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
