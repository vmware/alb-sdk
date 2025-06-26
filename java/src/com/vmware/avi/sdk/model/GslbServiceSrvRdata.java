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
 * The GslbServiceSrvRdata is a POJO class extends AviRestResource that used for creating
 * GslbServiceSrvRdata.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbServiceSrvRdata  {
    @JsonProperty("port")
    private Integer port;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("weight")
    private Integer weight;



    /**
     * This is the getter method this will return the attribute value.
     * Service port.
     * Allowed values are 0-65535.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    /**
     * This is the setter method to the attribute.
     * Service port.
     * Allowed values are 0-65535.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param port set the port.
     */
    public void setPort(Integer  port) {
        this.port = port;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Priority of the target hosting the service, low value implies higher priority for this service record.
     * Allowed values are 0-65535.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This is the setter method to the attribute.
     * Priority of the target hosting the service, low value implies higher priority for this service record.
     * Allowed values are 0-65535.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param priority set the priority.
     */
    public void setPriority(Integer  priority) {
        this.priority = priority;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Relative weight for service records with same priority, high value implies higher preference for this service record.
     * Allowed values are 0-65535.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This is the setter method to the attribute.
     * Relative weight for service records with same priority, high value implies higher preference for this service record.
     * Allowed values are 0-65535.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param weight set the weight.
     */
    public void setWeight(Integer  weight) {
        this.weight = weight;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GslbServiceSrvRdata objGslbServiceSrvRdata = (GslbServiceSrvRdata) o;
      return   Objects.equals(this.priority, objGslbServiceSrvRdata.priority)&&
  Objects.equals(this.weight, objGslbServiceSrvRdata.weight)&&
  Objects.equals(this.port, objGslbServiceSrvRdata.port);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbServiceSrvRdata {\n");
                  sb.append("    port: ").append(toIndentedString(port)).append("\n");
                        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
                        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
