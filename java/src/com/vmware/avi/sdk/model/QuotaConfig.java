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
 * The QuotaConfig is a POJO class extends AviRestResource that used for creating
 * QuotaConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuotaConfig  {
    @JsonProperty("limit")
    private Integer limit = -1;

    @JsonProperty("reservation")
    private Integer reservation = 0;



    /**
     * This is the getter method this will return the attribute value.
     * Maximum license service units allowed for consumption.
     * -1 as default is maximum value.
     * Allowed values are -1-+65535.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum license service units allowed for consumption.
     * -1 as default is maximum value.
     * Allowed values are -1-+65535.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as -1.
     * @param limit set the limit.
     */
    public void setLimit(Integer  limit) {
        this.limit = limit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Minimum license service units reserved for consumption.
     * Allowed values are 0-65535.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return reservation
     */
    public Integer getReservation() {
        return reservation;
    }

    /**
     * This is the setter method to the attribute.
     * Minimum license service units reserved for consumption.
     * Allowed values are 0-65535.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param reservation set the reservation.
     */
    public void setReservation(Integer  reservation) {
        this.reservation = reservation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      QuotaConfig objQuotaConfig = (QuotaConfig) o;
      return   Objects.equals(this.reservation, objQuotaConfig.reservation)&&
  Objects.equals(this.limit, objQuotaConfig.limit);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class QuotaConfig {\n");
                  sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
                        sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
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
