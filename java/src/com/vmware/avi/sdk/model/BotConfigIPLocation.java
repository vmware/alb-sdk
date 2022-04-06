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
 * The BotConfigIPLocation is a POJO class extends AviRestResource that used for creating
 * BotConfigIPLocation.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotConfigIPLocation  {
    @JsonProperty("enabled")
    private Boolean enabled = true;

    @JsonProperty("ip_location_db_ref")
    private String ipLocationDbRef = null;

    @JsonProperty("system_cloud_providers_ref")
    private String systemCloudProvidersRef = null;

    @JsonProperty("system_search_engines_ref")
    private String systemSearchEnginesRef = null;



    /**
     * This is the getter method this will return the attribute value.
     * If this is enabled, ip location information is used to determine if a client is a known search engine bot, comes from the cloud, etc.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * If this is enabled, ip location information is used to determine if a client is a known search engine bot, comes from the cloud, etc.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The uuid of the geo-ip database to use.
     * It is a reference to an object of type geodb.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipLocationDbRef
     */
    public String getIpLocationDbRef() {
        return ipLocationDbRef;
    }

    /**
     * This is the setter method to the attribute.
     * The uuid of the geo-ip database to use.
     * It is a reference to an object of type geodb.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipLocationDbRef set the ipLocationDbRef.
     */
    public void setIpLocationDbRef(String  ipLocationDbRef) {
        this.ipLocationDbRef = ipLocationDbRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The system-defined cloud providers.
     * It is a reference to an object of type stringgroup.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return systemCloudProvidersRef
     */
    public String getSystemCloudProvidersRef() {
        return systemCloudProvidersRef;
    }

    /**
     * This is the setter method to the attribute.
     * The system-defined cloud providers.
     * It is a reference to an object of type stringgroup.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param systemCloudProvidersRef set the systemCloudProvidersRef.
     */
    public void setSystemCloudProvidersRef(String  systemCloudProvidersRef) {
        this.systemCloudProvidersRef = systemCloudProvidersRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The system-defined search engines.
     * It is a reference to an object of type stringgroup.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return systemSearchEnginesRef
     */
    public String getSystemSearchEnginesRef() {
        return systemSearchEnginesRef;
    }

    /**
     * This is the setter method to the attribute.
     * The system-defined search engines.
     * It is a reference to an object of type stringgroup.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param systemSearchEnginesRef set the systemSearchEnginesRef.
     */
    public void setSystemSearchEnginesRef(String  systemSearchEnginesRef) {
        this.systemSearchEnginesRef = systemSearchEnginesRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotConfigIPLocation objBotConfigIPLocation = (BotConfigIPLocation) o;
      return   Objects.equals(this.enabled, objBotConfigIPLocation.enabled)&&
  Objects.equals(this.ipLocationDbRef, objBotConfigIPLocation.ipLocationDbRef)&&
  Objects.equals(this.systemCloudProvidersRef, objBotConfigIPLocation.systemCloudProvidersRef)&&
  Objects.equals(this.systemSearchEnginesRef, objBotConfigIPLocation.systemSearchEnginesRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotConfigIPLocation {\n");
                  sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    ipLocationDbRef: ").append(toIndentedString(ipLocationDbRef)).append("\n");
                        sb.append("    systemCloudProvidersRef: ").append(toIndentedString(systemCloudProvidersRef)).append("\n");
                        sb.append("    systemSearchEnginesRef: ").append(toIndentedString(systemSearchEnginesRef)).append("\n");
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
