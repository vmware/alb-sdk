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
 * The HealthMonitorLdap is a POJO class extends AviRestResource that used for creating
 * HealthMonitorLdap.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HealthMonitorLdap  {
    @JsonProperty("attributes")
    private String attributes = null;

    @JsonProperty("base_dn")
    private String baseDn = null;

    @JsonProperty("filter")
    private String filter = null;

    @JsonProperty("scope")
    private String scope = null;

    @JsonProperty("ssl_attributes")
    private HealthMonitorSSLAttributes sslAttributes = null;



    /**
     * This is the getter method this will return the attribute value.
     * Attributes which will be retrieved.
     * Commas can be used to delimit more than one attributes (example- cn,address,email).
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return attributes
     */
    public String getAttributes() {
        return attributes;
    }

    /**
     * This is the setter method to the attribute.
     * Attributes which will be retrieved.
     * Commas can be used to delimit more than one attributes (example- cn,address,email).
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param attributes set the attributes.
     */
    public void setAttributes(String  attributes) {
        this.attributes = attributes;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dn(distinguished name) of a directory entry.
     * Which will be starting point of the search.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return baseDn
     */
    public String getBaseDn() {
        return baseDn;
    }

    /**
     * This is the setter method to the attribute.
     * Dn(distinguished name) of a directory entry.
     * Which will be starting point of the search.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param baseDn set the baseDn.
     */
    public void setBaseDn(String  baseDn) {
        this.baseDn = baseDn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Filter to search entries in specified scope.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    /**
     * This is the setter method to the attribute.
     * Filter to search entries in specified scope.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param filter set the filter.
     */
    public void setFilter(String  filter) {
        this.filter = filter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Search scope which can be base, one, sub.
     * Enum options - LDAP_BASE_MODE, LDAP_ONE_MODE, LDAP_SUB_MODE.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * This is the setter method to the attribute.
     * Search scope which can be base, one, sub.
     * Enum options - LDAP_BASE_MODE, LDAP_ONE_MODE, LDAP_SUB_MODE.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param scope set the scope.
     */
    public void setScope(String  scope) {
        this.scope = scope;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ssl attributes for ldaps monitor.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sslAttributes
     */
    public HealthMonitorSSLAttributes getSslAttributes() {
        return sslAttributes;
    }

    /**
     * This is the setter method to the attribute.
     * Ssl attributes for ldaps monitor.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sslAttributes set the sslAttributes.
     */
    public void setSslAttributes(HealthMonitorSSLAttributes sslAttributes) {
        this.sslAttributes = sslAttributes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HealthMonitorLdap objHealthMonitorLdap = (HealthMonitorLdap) o;
      return   Objects.equals(this.baseDn, objHealthMonitorLdap.baseDn)&&
  Objects.equals(this.attributes, objHealthMonitorLdap.attributes)&&
  Objects.equals(this.scope, objHealthMonitorLdap.scope)&&
  Objects.equals(this.filter, objHealthMonitorLdap.filter)&&
  Objects.equals(this.sslAttributes, objHealthMonitorLdap.sslAttributes);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HealthMonitorLdap {\n");
                  sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
                        sb.append("    baseDn: ").append(toIndentedString(baseDn)).append("\n");
                        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
                        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
                        sb.append("    sslAttributes: ").append(toIndentedString(sslAttributes)).append("\n");
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
