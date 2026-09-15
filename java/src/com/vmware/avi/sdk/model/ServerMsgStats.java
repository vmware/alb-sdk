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
 * The ServerMsgStats is a POJO class extends AviRestResource that used for creating
 * ServerMsgStats.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServerMsgStats  {
    @JsonProperty("avg_latency_us")
    private Integer avgLatencyUs;

    @JsonProperty("bytes_rx")
    private Integer bytesRx;

    @JsonProperty("bytes_tx")
    private Integer bytesTx;

    @JsonProperty("msg_count_rx")
    private Integer msgCountRx;

    @JsonProperty("msg_count_tx")
    private Integer msgCountTx;

    @JsonProperty("orphan_count")
    private Integer orphanCount;

    @JsonProperty("server_ip_port")
    private String serverIpPort;

    @JsonProperty("timeout_count")
    private Integer timeoutCount;



    /**
     * This is the getter method this will return the attribute value.
     * Average request-to-response latency in microseconds (total_latency_us / msg_count_rx; 0 if no responses).
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return avgLatencyUs
     */
    public Integer getAvgLatencyUs() {
        return avgLatencyUs;
    }

    /**
     * This is the setter method to the attribute.
     * Average request-to-response latency in microseconds (total_latency_us / msg_count_rx; 0 if no responses).
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param avgLatencyUs set the avgLatencyUs.
     */
    public void setAvgLatencyUs(Integer  avgLatencyUs) {
        this.avgLatencyUs = avgLatencyUs;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total response bytes received from this server.
     * Field introduced in 32.1.5.
     * Unit is bytes.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bytesRx
     */
    public Integer getBytesRx() {
        return bytesRx;
    }

    /**
     * This is the setter method to the attribute.
     * Total response bytes received from this server.
     * Field introduced in 32.1.5.
     * Unit is bytes.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param bytesRx set the bytesRx.
     */
    public void setBytesRx(Integer  bytesRx) {
        this.bytesRx = bytesRx;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total request bytes forwarded to this server.
     * Field introduced in 32.1.5.
     * Unit is bytes.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return bytesTx
     */
    public Integer getBytesTx() {
        return bytesTx;
    }

    /**
     * This is the setter method to the attribute.
     * Total request bytes forwarded to this server.
     * Field introduced in 32.1.5.
     * Unit is bytes.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param bytesTx set the bytesTx.
     */
    public void setBytesTx(Integer  bytesTx) {
        this.bytesTx = bytesTx;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of responses received from this server.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return msgCountRx
     */
    public Integer getMsgCountRx() {
        return msgCountRx;
    }

    /**
     * This is the setter method to the attribute.
     * Number of responses received from this server.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param msgCountRx set the msgCountRx.
     */
    public void setMsgCountRx(Integer  msgCountRx) {
        this.msgCountRx = msgCountRx;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of requests forwarded to this server.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return msgCountTx
     */
    public Integer getMsgCountTx() {
        return msgCountTx;
    }

    /**
     * This is the setter method to the attribute.
     * Number of requests forwarded to this server.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param msgCountTx set the msgCountTx.
     */
    public void setMsgCountTx(Integer  msgCountTx) {
        this.msgCountTx = msgCountTx;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of in-flight requests outstanding when the client connection was force-closed.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return orphanCount
     */
    public Integer getOrphanCount() {
        return orphanCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of in-flight requests outstanding when the client connection was force-closed.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param orphanCount set the orphanCount.
     */
    public void setOrphanCount(Integer  orphanCount) {
        this.orphanCount = orphanCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Backend server address in 'a.b.c.d port' format.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverIpPort
     */
    public String getServerIpPort() {
        return serverIpPort;
    }

    /**
     * This is the setter method to the attribute.
     * Backend server address in 'a.b.c.d port' format.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverIpPort set the serverIpPort.
     */
    public void setServerIpPort(String  serverIpPort) {
        this.serverIpPort = serverIpPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of requests to this server that expired waiting for a response.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timeoutCount
     */
    public Integer getTimeoutCount() {
        return timeoutCount;
    }

    /**
     * This is the setter method to the attribute.
     * Number of requests to this server that expired waiting for a response.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param timeoutCount set the timeoutCount.
     */
    public void setTimeoutCount(Integer  timeoutCount) {
        this.timeoutCount = timeoutCount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ServerMsgStats objServerMsgStats = (ServerMsgStats) o;
      return   Objects.equals(this.serverIpPort, objServerMsgStats.serverIpPort)&&
  Objects.equals(this.msgCountTx, objServerMsgStats.msgCountTx)&&
  Objects.equals(this.msgCountRx, objServerMsgStats.msgCountRx)&&
  Objects.equals(this.bytesTx, objServerMsgStats.bytesTx)&&
  Objects.equals(this.bytesRx, objServerMsgStats.bytesRx)&&
  Objects.equals(this.avgLatencyUs, objServerMsgStats.avgLatencyUs)&&
  Objects.equals(this.timeoutCount, objServerMsgStats.timeoutCount)&&
  Objects.equals(this.orphanCount, objServerMsgStats.orphanCount);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServerMsgStats {\n");
                  sb.append("    avgLatencyUs: ").append(toIndentedString(avgLatencyUs)).append("\n");
                        sb.append("    bytesRx: ").append(toIndentedString(bytesRx)).append("\n");
                        sb.append("    bytesTx: ").append(toIndentedString(bytesTx)).append("\n");
                        sb.append("    msgCountRx: ").append(toIndentedString(msgCountRx)).append("\n");
                        sb.append("    msgCountTx: ").append(toIndentedString(msgCountTx)).append("\n");
                        sb.append("    orphanCount: ").append(toIndentedString(orphanCount)).append("\n");
                        sb.append("    serverIpPort: ").append(toIndentedString(serverIpPort)).append("\n");
                        sb.append("    timeoutCount: ").append(toIndentedString(timeoutCount)).append("\n");
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
