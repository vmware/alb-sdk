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
 * The Label is a POJO class extends AviRestResource that used for creating
 * Label.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Label  {
    @JsonProperty("description")
    private String description;

    @JsonProperty("match_action_scopes")
    private List<String> matchActionScopes;

    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type = "LABEL_USER_DEFINED";



    /**
     * This is the getter method this will return the attribute value.
     * Description of this label.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description of this label.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Defines the policy scope where this label can be used.
     * When specified, the label is restricted to configuration within that policy type only.
     * For example, if set to 'wafpolicy', this label can only be configured and referenced within waf policies.
     * Enum options - MATCH_ACTION_SCOPE_GENERIC, MATCH_ACTION_SCOPE_APIPOLICY, MATCH_ACTION_SCOPE_WAFPOLICY, MATCH_ACTION_SCOPE_HTTPSECURITYPOLICY,
     * MATCH_ACTION_SCOPE_HTTPREQUESTPOLICY, MATCH_ACTION_SCOPE_HTTPRESPONSEPOLICY, MATCH_ACTION_SCOPE_CSRFPOLICY, MATCH_ACTION_SCOPE_AUTHPROFILE,
     * MATCH_ACTION_SCOPE_VSDATASCRIPTSET, MATCH_ACTION_SCOPE_BOTDETECTIONPOLICY.
     * Field introduced in 32.1.4.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchActionScopes
     */
    public List<String> getMatchActionScopes() {
        return matchActionScopes;
    }

    /**
     * This is the setter method. this will set the matchActionScopes
     * Defines the policy scope where this label can be used.
     * When specified, the label is restricted to configuration within that policy type only.
     * For example, if set to 'wafpolicy', this label can only be configured and referenced within waf policies.
     * Enum options - MATCH_ACTION_SCOPE_GENERIC, MATCH_ACTION_SCOPE_APIPOLICY, MATCH_ACTION_SCOPE_WAFPOLICY, MATCH_ACTION_SCOPE_HTTPSECURITYPOLICY,
     * MATCH_ACTION_SCOPE_HTTPREQUESTPOLICY, MATCH_ACTION_SCOPE_HTTPRESPONSEPOLICY, MATCH_ACTION_SCOPE_CSRFPOLICY, MATCH_ACTION_SCOPE_AUTHPROFILE,
     * MATCH_ACTION_SCOPE_VSDATASCRIPTSET, MATCH_ACTION_SCOPE_BOTDETECTIONPOLICY.
     * Field introduced in 32.1.4.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchActionScopes
     */
    public void setMatchActionScopes(List<String>  matchActionScopes) {
        this.matchActionScopes = matchActionScopes;
    }

    /**
     * This is the setter method this will set the matchActionScopes
     * Defines the policy scope where this label can be used.
     * When specified, the label is restricted to configuration within that policy type only.
     * For example, if set to 'wafpolicy', this label can only be configured and referenced within waf policies.
     * Enum options - MATCH_ACTION_SCOPE_GENERIC, MATCH_ACTION_SCOPE_APIPOLICY, MATCH_ACTION_SCOPE_WAFPOLICY, MATCH_ACTION_SCOPE_HTTPSECURITYPOLICY,
     * MATCH_ACTION_SCOPE_HTTPREQUESTPOLICY, MATCH_ACTION_SCOPE_HTTPRESPONSEPOLICY, MATCH_ACTION_SCOPE_CSRFPOLICY, MATCH_ACTION_SCOPE_AUTHPROFILE,
     * MATCH_ACTION_SCOPE_VSDATASCRIPTSET, MATCH_ACTION_SCOPE_BOTDETECTIONPOLICY.
     * Field introduced in 32.1.4.
     * Minimum of 1 items required.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return matchActionScopes
     */
    public Label addMatchActionScopesItem(String matchActionScopesItem) {
      if (this.matchActionScopes == null) {
        this.matchActionScopes = new ArrayList<String>();
      }
      this.matchActionScopes.add(matchActionScopesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Label name used as a match condition in policies.
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
     * Label name used as a match condition in policies.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The type of this label (system-defined or user-defined).
     * Enum options - LABEL_SYSTEM_DEFINED, LABEL_USER_DEFINED.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "LABEL_USER_DEFINED".
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * The type of this label (system-defined or user-defined).
     * Enum options - LABEL_SYSTEM_DEFINED, LABEL_USER_DEFINED.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "LABEL_USER_DEFINED".
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Label objLabel = (Label) o;
      return   Objects.equals(this.name, objLabel.name)&&
  Objects.equals(this.description, objLabel.description)&&
  Objects.equals(this.type, objLabel.type)&&
  Objects.equals(this.matchActionScopes, objLabel.matchActionScopes);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Label {\n");
                  sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    matchActionScopes: ").append(toIndentedString(matchActionScopes)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
