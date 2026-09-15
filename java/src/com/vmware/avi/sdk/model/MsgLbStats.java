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
 * The MsgLbStats is a POJO class extends AviRestResource that used for creating
 * MsgLbStats.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MsgLbStats  {
    @JsonProperty("connpool_hits")
    private Integer connpoolHits;

    @JsonProperty("connpool_misses")
    private Integer connpoolMisses;

    @JsonProperty("connpool_mux")
    private Integer connpoolMux;

    @JsonProperty("servers")
    private List<ServerMsgStats> servers;

    @JsonProperty("total_bytes_rx")
    private Integer totalBytesRx;

    @JsonProperty("total_bytes_tx")
    private Integer totalBytesTx;

    @JsonProperty("total_messages_rx")
    private Integer totalMessagesRx;

    @JsonProperty("total_messages_tx")
    private Integer totalMessagesTx;

    @JsonProperty("transaction_hits")
    private Integer transactionHits;

    @JsonProperty("transaction_misses")
    private Integer transactionMisses;



    /**
     * This is the getter method this will return the attribute value.
     * Messages that reused an idle pooled server connection.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connpoolHits
     */
    public Integer getConnpoolHits() {
        return connpoolHits;
    }

    /**
     * This is the setter method to the attribute.
     * Messages that reused an idle pooled server connection.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connpoolHits set the connpoolHits.
     */
    public void setConnpoolHits(Integer  connpoolHits) {
        this.connpoolHits = connpoolHits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Messages that required a new tcp connection to the backend.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connpoolMisses
     */
    public Integer getConnpoolMisses() {
        return connpoolMisses;
    }

    /**
     * This is the setter method to the attribute.
     * Messages that required a new tcp connection to the backend.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connpoolMisses set the connpoolMisses.
     */
    public void setConnpoolMisses(Integer  connpoolMisses) {
        this.connpoolMisses = connpoolMisses;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Messages multiplexed onto a busy connection via round-robin.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connpoolMux
     */
    public Integer getConnpoolMux() {
        return connpoolMux;
    }

    /**
     * This is the setter method to the attribute.
     * Messages multiplexed onto a busy connection via round-robin.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connpoolMux set the connpoolMux.
     */
    public void setConnpoolMux(Integer  connpoolMux) {
        this.connpoolMux = connpoolMux;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Per-backend breakdown of message and byte counters.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public List<ServerMsgStats> getServers() {
        return servers;
    }

    /**
     * This is the setter method. this will set the servers
     * Per-backend breakdown of message and byte counters.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public void setServers(List<ServerMsgStats>  servers) {
        this.servers = servers;
    }

    /**
     * This is the setter method this will set the servers
     * Per-backend breakdown of message and byte counters.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return servers
     */
    public MsgLbStats addServersItem(ServerMsgStats serversItem) {
      if (this.servers == null) {
        this.servers = new ArrayList<ServerMsgStats>();
      }
      this.servers.add(serversItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total response bytes received from all backend servers.
     * Field introduced in 32.1.5.
     * Unit is bytes.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalBytesRx
     */
    public Integer getTotalBytesRx() {
        return totalBytesRx;
    }

    /**
     * This is the setter method to the attribute.
     * Total response bytes received from all backend servers.
     * Field introduced in 32.1.5.
     * Unit is bytes.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalBytesRx set the totalBytesRx.
     */
    public void setTotalBytesRx(Integer  totalBytesRx) {
        this.totalBytesRx = totalBytesRx;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total request bytes forwarded to all backend servers.
     * Field introduced in 32.1.5.
     * Unit is bytes.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalBytesTx
     */
    public Integer getTotalBytesTx() {
        return totalBytesTx;
    }

    /**
     * This is the setter method to the attribute.
     * Total request bytes forwarded to all backend servers.
     * Field introduced in 32.1.5.
     * Unit is bytes.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalBytesTx set the totalBytesTx.
     */
    public void setTotalBytesTx(Integer  totalBytesTx) {
        this.totalBytesTx = totalBytesTx;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total iso 8583 responses received from backend servers over this connection.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalMessagesRx
     */
    public Integer getTotalMessagesRx() {
        return totalMessagesRx;
    }

    /**
     * This is the setter method to the attribute.
     * Total iso 8583 responses received from backend servers over this connection.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalMessagesRx set the totalMessagesRx.
     */
    public void setTotalMessagesRx(Integer  totalMessagesRx) {
        this.totalMessagesRx = totalMessagesRx;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total iso 8583 messages committed to backend servers over this connection.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalMessagesTx
     */
    public Integer getTotalMessagesTx() {
        return totalMessagesTx;
    }

    /**
     * This is the setter method to the attribute.
     * Total iso 8583 messages committed to backend servers over this connection.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalMessagesTx set the totalMessagesTx.
     */
    public void setTotalMessagesTx(Integer  totalMessagesTx) {
        this.totalMessagesTx = totalMessagesTx;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Messages with a transaction or session key for which the transaction hash returned an existing server affinity entry.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return transactionHits
     */
    public Integer getTransactionHits() {
        return transactionHits;
    }

    /**
     * This is the setter method to the attribute.
     * Messages with a transaction or session key for which the transaction hash returned an existing server affinity entry.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param transactionHits set the transactionHits.
     */
    public void setTransactionHits(Integer  transactionHits) {
        this.transactionHits = transactionHits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Messages with a transaction or session key where no transaction entry was found (lb fallthrough).
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return transactionMisses
     */
    public Integer getTransactionMisses() {
        return transactionMisses;
    }

    /**
     * This is the setter method to the attribute.
     * Messages with a transaction or session key where no transaction entry was found (lb fallthrough).
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param transactionMisses set the transactionMisses.
     */
    public void setTransactionMisses(Integer  transactionMisses) {
        this.transactionMisses = transactionMisses;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      MsgLbStats objMsgLbStats = (MsgLbStats) o;
      return   Objects.equals(this.totalMessagesTx, objMsgLbStats.totalMessagesTx)&&
  Objects.equals(this.totalMessagesRx, objMsgLbStats.totalMessagesRx)&&
  Objects.equals(this.totalBytesTx, objMsgLbStats.totalBytesTx)&&
  Objects.equals(this.totalBytesRx, objMsgLbStats.totalBytesRx)&&
  Objects.equals(this.servers, objMsgLbStats.servers)&&
  Objects.equals(this.connpoolHits, objMsgLbStats.connpoolHits)&&
  Objects.equals(this.connpoolMisses, objMsgLbStats.connpoolMisses)&&
  Objects.equals(this.connpoolMux, objMsgLbStats.connpoolMux)&&
  Objects.equals(this.transactionHits, objMsgLbStats.transactionHits)&&
  Objects.equals(this.transactionMisses, objMsgLbStats.transactionMisses);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class MsgLbStats {\n");
                  sb.append("    connpoolHits: ").append(toIndentedString(connpoolHits)).append("\n");
                        sb.append("    connpoolMisses: ").append(toIndentedString(connpoolMisses)).append("\n");
                        sb.append("    connpoolMux: ").append(toIndentedString(connpoolMux)).append("\n");
                        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
                        sb.append("    totalBytesRx: ").append(toIndentedString(totalBytesRx)).append("\n");
                        sb.append("    totalBytesTx: ").append(toIndentedString(totalBytesTx)).append("\n");
                        sb.append("    totalMessagesRx: ").append(toIndentedString(totalMessagesRx)).append("\n");
                        sb.append("    totalMessagesTx: ").append(toIndentedString(totalMessagesTx)).append("\n");
                        sb.append("    transactionHits: ").append(toIndentedString(transactionHits)).append("\n");
                        sb.append("    transactionMisses: ").append(toIndentedString(transactionMisses)).append("\n");
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
