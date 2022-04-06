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
 * The BotConfigIPReputation is a POJO class extends AviRestResource that used for creating
 * BotConfigIPReputation.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotConfigIPReputation  {
    @JsonProperty("enabled")
    private Boolean enabled = true;

    @JsonProperty("ip_reputation_db_ref")
    private String ipReputationDbRef = null;

    @JsonProperty("system_ip_reputation_mapping_ref")
    private String systemIpReputationMappingRef = null;



    /**
     * This is the getter method this will return the attribute value.
     * Whether ip reputation-based bot detection is enabled.
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
     * Whether ip reputation-based bot detection is enabled.
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
     * The uuid of the ip reputation db to use.
     * It is a reference to an object of type ipreputationdb.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipReputationDbRef
     */
    public String getIpReputationDbRef() {
        return ipReputationDbRef;
    }

    /**
     * This is the setter method to the attribute.
     * The uuid of the ip reputation db to use.
     * It is a reference to an object of type ipreputationdb.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipReputationDbRef set the ipReputationDbRef.
     */
    public void setIpReputationDbRef(String  ipReputationDbRef) {
        this.ipReputationDbRef = ipReputationDbRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The system-provided mapping from ip reputation types to bot types.
     * It is a reference to an object of type botipreputationtypemapping.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return systemIpReputationMappingRef
     */
    public String getSystemIpReputationMappingRef() {
        return systemIpReputationMappingRef;
    }

    /**
     * This is the setter method to the attribute.
     * The system-provided mapping from ip reputation types to bot types.
     * It is a reference to an object of type botipreputationtypemapping.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param systemIpReputationMappingRef set the systemIpReputationMappingRef.
     */
    public void setSystemIpReputationMappingRef(String  systemIpReputationMappingRef) {
        this.systemIpReputationMappingRef = systemIpReputationMappingRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotConfigIPReputation objBotConfigIPReputation = (BotConfigIPReputation) o;
      return   Objects.equals(this.enabled, objBotConfigIPReputation.enabled)&&
  Objects.equals(this.ipReputationDbRef, objBotConfigIPReputation.ipReputationDbRef)&&
  Objects.equals(this.systemIpReputationMappingRef, objBotConfigIPReputation.systemIpReputationMappingRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotConfigIPReputation {\n");
                  sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    ipReputationDbRef: ").append(toIndentedString(ipReputationDbRef)).append("\n");
                        sb.append("    systemIpReputationMappingRef: ").append(toIndentedString(systemIpReputationMappingRef)).append("\n");
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
