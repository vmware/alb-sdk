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
 * The AlternateAuthConfiguration is a POJO class extends AviRestResource that used for creating
 * AlternateAuthConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlternateAuthConfiguration  {
    @JsonProperty("auth_profile_ref")
    private String authProfileRef = null;

    @JsonProperty("index")
    private Integer index = null;

    @JsonProperty("mapping_rules")
    private List<AuthMappingRule> mappingRules = null;



    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the authprofile.
     * It is a reference to an object of type authprofile.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authProfileRef
     */
    public String getAuthProfileRef() {
        return authProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the authprofile.
     * It is a reference to an object of type authprofile.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authProfileRef set the authProfileRef.
     */
    public void setAuthProfileRef(String  authProfileRef) {
        this.authProfileRef = authProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Index used for maintaining order of alternateauthconfiguration.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    /**
     * This is the setter method to the attribute.
     * Index used for maintaining order of alternateauthconfiguration.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param index set the index.
     */
    public void setIndex(Integer  index) {
        this.index = index;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Rules list for tenant or role mapping.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public List<AuthMappingRule> getMappingRules() {
        return mappingRules;
    }

    /**
     * This is the setter method. this will set the mappingRules
     * Rules list for tenant or role mapping.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public void setMappingRules(List<AuthMappingRule>  mappingRules) {
        this.mappingRules = mappingRules;
    }

    /**
     * This is the setter method this will set the mappingRules
     * Rules list for tenant or role mapping.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mappingRules
     */
    public AlternateAuthConfiguration addMappingRulesItem(AuthMappingRule mappingRulesItem) {
      if (this.mappingRules == null) {
        this.mappingRules = new ArrayList<AuthMappingRule>();
      }
      this.mappingRules.add(mappingRulesItem);
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
      AlternateAuthConfiguration objAlternateAuthConfiguration = (AlternateAuthConfiguration) o;
      return   Objects.equals(this.index, objAlternateAuthConfiguration.index)&&
  Objects.equals(this.authProfileRef, objAlternateAuthConfiguration.authProfileRef)&&
  Objects.equals(this.mappingRules, objAlternateAuthConfiguration.mappingRules);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AlternateAuthConfiguration {\n");
                  sb.append("    authProfileRef: ").append(toIndentedString(authProfileRef)).append("\n");
                        sb.append("    index: ").append(toIndentedString(index)).append("\n");
                        sb.append("    mappingRules: ").append(toIndentedString(mappingRules)).append("\n");
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
