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
 * The DestinationPortAddr is a POJO class extends AviRestResource that used for creating
 * DestinationPortAddr.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DestinationPortAddr  {
    @JsonProperty("dst_port_end")
    private Integer dstPortEnd;

    @JsonProperty("dst_port_start")
    private Integer dstPortStart;

    @JsonProperty("match_operation")
    private String matchOperation = "IS_IN";



    /**
     * This is the getter method this will return the attribute value.
     * Tcp/udp port range end (inclusive).
     * Allowed values are 1-65535.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dstPortEnd
     */
    public Integer getDstPortEnd() {
        return dstPortEnd;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp/udp port range end (inclusive).
     * Allowed values are 1-65535.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dstPortEnd set the dstPortEnd.
     */
    public void setDstPortEnd(Integer  dstPortEnd) {
        this.dstPortEnd = dstPortEnd;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp/udp port range start (inclusive).
     * Allowed values are 1-65535.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dstPortStart
     */
    public Integer getDstPortStart() {
        return dstPortStart;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp/udp port range start (inclusive).
     * Allowed values are 1-65535.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dstPortStart set the dstPortStart.
     */
    public void setDstPortStart(Integer  dstPortStart) {
        this.dstPortStart = dstPortStart;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Match criteria.
     * Enum options - IS_IN, IS_NOT_IN.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
     * @return matchOperation
     */
    public String getMatchOperation() {
        return matchOperation;
    }

    /**
     * This is the setter method to the attribute.
     * Match criteria.
     * Enum options - IS_IN, IS_NOT_IN.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "IS_IN".
     * @param matchOperation set the matchOperation.
     */
    public void setMatchOperation(String  matchOperation) {
        this.matchOperation = matchOperation;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DestinationPortAddr objDestinationPortAddr = (DestinationPortAddr) o;
      return   Objects.equals(this.dstPortStart, objDestinationPortAddr.dstPortStart)&&
  Objects.equals(this.dstPortEnd, objDestinationPortAddr.dstPortEnd)&&
  Objects.equals(this.matchOperation, objDestinationPortAddr.matchOperation);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DestinationPortAddr {\n");
                  sb.append("    dstPortEnd: ").append(toIndentedString(dstPortEnd)).append("\n");
                        sb.append("    dstPortStart: ").append(toIndentedString(dstPortStart)).append("\n");
                        sb.append("    matchOperation: ").append(toIndentedString(matchOperation)).append("\n");
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
