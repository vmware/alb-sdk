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
 * The CaptureTCPFlags is a POJO class extends AviRestResource that used for creating
 * CaptureTCPFlags.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaptureTCPFlags  {
    @JsonProperty("match_operation")
    private String matchOperation = "IS_IN";

    @JsonProperty("tcp_ack")
    private Boolean tcpAck = null;

    @JsonProperty("tcp_fin")
    private Boolean tcpFin = null;

    @JsonProperty("tcp_push")
    private Boolean tcpPush = null;

    @JsonProperty("tcp_syn")
    private Boolean tcpSyn = null;



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

    /**
     * This is the getter method this will return the attribute value.
     * Tcp ack flag filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tcpAck
     */
    public Boolean getTcpAck() {
        return tcpAck;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp ack flag filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tcpAck set the tcpAck.
     */
    public void setTcpAck(Boolean  tcpAck) {
        this.tcpAck = tcpAck;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp fin flag filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tcpFin
     */
    public Boolean getTcpFin() {
        return tcpFin;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp fin flag filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tcpFin set the tcpFin.
     */
    public void setTcpFin(Boolean  tcpFin) {
        this.tcpFin = tcpFin;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp push flag filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tcpPush
     */
    public Boolean getTcpPush() {
        return tcpPush;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp push flag filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tcpPush set the tcpPush.
     */
    public void setTcpPush(Boolean  tcpPush) {
        this.tcpPush = tcpPush;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tcp syn flag filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tcpSyn
     */
    public Boolean getTcpSyn() {
        return tcpSyn;
    }

    /**
     * This is the setter method to the attribute.
     * Tcp syn flag filter.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tcpSyn set the tcpSyn.
     */
    public void setTcpSyn(Boolean  tcpSyn) {
        this.tcpSyn = tcpSyn;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CaptureTCPFlags objCaptureTCPFlags = (CaptureTCPFlags) o;
      return   Objects.equals(this.tcpSyn, objCaptureTCPFlags.tcpSyn)&&
  Objects.equals(this.tcpAck, objCaptureTCPFlags.tcpAck)&&
  Objects.equals(this.tcpFin, objCaptureTCPFlags.tcpFin)&&
  Objects.equals(this.tcpPush, objCaptureTCPFlags.tcpPush)&&
  Objects.equals(this.matchOperation, objCaptureTCPFlags.matchOperation);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CaptureTCPFlags {\n");
                  sb.append("    matchOperation: ").append(toIndentedString(matchOperation)).append("\n");
                        sb.append("    tcpAck: ").append(toIndentedString(tcpAck)).append("\n");
                        sb.append("    tcpFin: ").append(toIndentedString(tcpFin)).append("\n");
                        sb.append("    tcpPush: ").append(toIndentedString(tcpPush)).append("\n");
                        sb.append("    tcpSyn: ").append(toIndentedString(tcpSyn)).append("\n");
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
