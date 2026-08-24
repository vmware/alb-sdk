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
 * The ApiRoutingRule is a POJO class extends AviRestResource that used for creating
 * ApiRoutingRule.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiRoutingRule  {
    @JsonProperty("matches")
    private MatchTarget matches;

    @JsonProperty("name")
    private String name;



    /**
     * This is the getter method this will return the attribute value.
     * Match criteria containing only header matches for routing.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matches
     */
    public MatchTarget getMatches() {
        return matches;
    }

    /**
     * This is the setter method to the attribute.
     * Match criteria containing only header matches for routing.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param matches set the matches.
     */
    public void setMatches(MatchTarget matches) {
        this.matches = matches;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name for the routing rule.
     * Must be unique within api_routing_info.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name for the routing rule.
     * Must be unique within api_routing_info.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiRoutingRule objApiRoutingRule = (ApiRoutingRule) o;
      return   Objects.equals(this.name, objApiRoutingRule.name)&&
  Objects.equals(this.matches, objApiRoutingRule.matches);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiRoutingRule {\n");
                  sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
