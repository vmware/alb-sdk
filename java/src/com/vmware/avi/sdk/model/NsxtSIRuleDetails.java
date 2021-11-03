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
 * The NsxtSIRuleDetails is a POJO class extends AviRestResource that used for creating
 * NsxtSIRuleDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NsxtSIRuleDetails  {
    @JsonProperty("action")
    private String action = null;

    @JsonProperty("destexclude")
    private Boolean destexclude = null;

    @JsonProperty("dests")
    private List<String> dests = null;

    @JsonProperty("direction")
    private String direction = null;

    @JsonProperty("error_string")
    private String errorString = null;

    @JsonProperty("pool")
    private String pool = null;

    @JsonProperty("segroup")
    private String segroup = null;

    @JsonProperty("services")
    private List<String> services = null;

    @JsonProperty("sources")
    private List<String> sources = null;



    /**
     * This is the getter method this will return the attribute value.
     * Rule action.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * Rule action.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param action set the action.
     */
    public void setAction(String  action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Destinatios excluded or not.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return destexclude
     */
    public Boolean getDestexclude() {
        return destexclude;
    }

    /**
     * This is the setter method to the attribute.
     * Destinatios excluded or not.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param destexclude set the destexclude.
     */
    public void setDestexclude(Boolean  destexclude) {
        this.destexclude = destexclude;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Destination of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dests
     */
    public List<String> getDests() {
        return dests;
    }

    /**
     * This is the setter method. this will set the dests
     * Destination of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dests
     */
    public void setDests(List<String>  dests) {
        this.dests = dests;
    }

    /**
     * This is the setter method this will set the dests
     * Destination of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dests
     */
    public NsxtSIRuleDetails addDestsItem(String destsItem) {
      if (this.dests == null) {
        this.dests = new ArrayList<String>();
      }
      this.dests.add(destsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rule direction.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * This is the setter method to the attribute.
     * Rule direction.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param direction set the direction.
     */
    public void setDirection(String  direction) {
        this.direction = direction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Error message.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Error message.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pool name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pool
     */
    public String getPool() {
        return pool;
    }

    /**
     * This is the setter method to the attribute.
     * Pool name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pool set the pool.
     */
    public void setPool(String  pool) {
        this.pool = pool;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Serviceenginegroup name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return segroup
     */
    public String getSegroup() {
        return segroup;
    }

    /**
     * This is the setter method to the attribute.
     * Serviceenginegroup name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param segroup set the segroup.
     */
    public void setSegroup(String  segroup) {
        this.segroup = segroup;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Services of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return services
     */
    public List<String> getServices() {
        return services;
    }

    /**
     * This is the setter method. this will set the services
     * Services of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return services
     */
    public void setServices(List<String>  services) {
        this.services = services;
    }

    /**
     * This is the setter method this will set the services
     * Services of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return services
     */
    public NsxtSIRuleDetails addServicesItem(String servicesItem) {
      if (this.services == null) {
        this.services = new ArrayList<String>();
      }
      this.services.add(servicesItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Sources of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sources
     */
    public List<String> getSources() {
        return sources;
    }

    /**
     * This is the setter method. this will set the sources
     * Sources of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sources
     */
    public void setSources(List<String>  sources) {
        this.sources = sources;
    }

    /**
     * This is the setter method this will set the sources
     * Sources of redirection rule.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sources
     */
    public NsxtSIRuleDetails addSourcesItem(String sourcesItem) {
      if (this.sources == null) {
        this.sources = new ArrayList<String>();
      }
      this.sources.add(sourcesItem);
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
      NsxtSIRuleDetails objNsxtSIRuleDetails = (NsxtSIRuleDetails) o;
      return   Objects.equals(this.segroup, objNsxtSIRuleDetails.segroup)&&
  Objects.equals(this.errorString, objNsxtSIRuleDetails.errorString)&&
  Objects.equals(this.pool, objNsxtSIRuleDetails.pool)&&
  Objects.equals(this.action, objNsxtSIRuleDetails.action)&&
  Objects.equals(this.direction, objNsxtSIRuleDetails.direction)&&
  Objects.equals(this.sources, objNsxtSIRuleDetails.sources)&&
  Objects.equals(this.services, objNsxtSIRuleDetails.services)&&
  Objects.equals(this.dests, objNsxtSIRuleDetails.dests)&&
  Objects.equals(this.destexclude, objNsxtSIRuleDetails.destexclude);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NsxtSIRuleDetails {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    destexclude: ").append(toIndentedString(destexclude)).append("\n");
                        sb.append("    dests: ").append(toIndentedString(dests)).append("\n");
                        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
                        sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
                        sb.append("    segroup: ").append(toIndentedString(segroup)).append("\n");
                        sb.append("    services: ").append(toIndentedString(services)).append("\n");
                        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
