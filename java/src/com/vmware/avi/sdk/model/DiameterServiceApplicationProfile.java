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
 * The DiameterServiceApplicationProfile is a POJO class extends AviRestResource that used for creating
 * DiameterServiceApplicationProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiameterServiceApplicationProfile  {
    @JsonProperty("client_origin_host")
    private String clientOriginHost;

    @JsonProperty("client_origin_realm")
    private String clientOriginRealm;

    @JsonProperty("host_ip_addr_rewrite")
    private Boolean hostIpAddrRewrite = false;

    @JsonProperty("max_outstanding_req")
    private Integer maxOutstandingReq = 4096;

    @JsonProperty("req_timeout")
    private Integer reqTimeout = 60;

    @JsonProperty("server_origin_host")
    private String serverOriginHost;

    @JsonProperty("server_origin_realm")
    private String serverOriginRealm;



    /**
     * This is the getter method this will return the attribute value.
     * Origin-host avp towards client.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientOriginHost
     */
    public String getClientOriginHost() {
        return clientOriginHost;
    }

    /**
     * This is the setter method to the attribute.
     * Origin-host avp towards client.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientOriginHost set the clientOriginHost.
     */
    public void setClientOriginHost(String  clientOriginHost) {
        this.clientOriginHost = clientOriginHost;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Origin-realm avp towards client.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clientOriginRealm
     */
    public String getClientOriginRealm() {
        return clientOriginRealm;
    }

    /**
     * This is the setter method to the attribute.
     * Origin-realm avp towards client.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clientOriginRealm set the clientOriginRealm.
     */
    public void setClientOriginRealm(String  clientOriginRealm) {
        this.clientOriginRealm = clientOriginRealm;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rwrite host-ip-address avp.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return hostIpAddrRewrite
     */
    public Boolean getHostIpAddrRewrite() {
        return hostIpAddrRewrite;
    }

    /**
     * This is the setter method to the attribute.
     * Rwrite host-ip-address avp.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param hostIpAddrRewrite set the hostIpAddrRewrite.
     */
    public void setHostIpAddrRewrite(Boolean  hostIpAddrRewrite) {
        this.hostIpAddrRewrite = hostIpAddrRewrite;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max number of outstanding request waiting for response.
     * Allowed values are 1-1048576.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @return maxOutstandingReq
     */
    public Integer getMaxOutstandingReq() {
        return maxOutstandingReq;
    }

    /**
     * This is the setter method to the attribute.
     * Max number of outstanding request waiting for response.
     * Allowed values are 1-1048576.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4096.
     * @param maxOutstandingReq set the maxOutstandingReq.
     */
    public void setMaxOutstandingReq(Integer  maxOutstandingReq) {
        this.maxOutstandingReq = maxOutstandingReq;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Response waiting time for the request sent.
     * Allowed values are 1-1800.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return reqTimeout
     */
    public Integer getReqTimeout() {
        return reqTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Response waiting time for the request sent.
     * Allowed values are 1-1800.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param reqTimeout set the reqTimeout.
     */
    public void setReqTimeout(Integer  reqTimeout) {
        this.reqTimeout = reqTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Origin-host avp towards server.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverOriginHost
     */
    public String getServerOriginHost() {
        return serverOriginHost;
    }

    /**
     * This is the setter method to the attribute.
     * Origin-host avp towards server.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverOriginHost set the serverOriginHost.
     */
    public void setServerOriginHost(String  serverOriginHost) {
        this.serverOriginHost = serverOriginHost;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Origin-realm avp towards server.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverOriginRealm
     */
    public String getServerOriginRealm() {
        return serverOriginRealm;
    }

    /**
     * This is the setter method to the attribute.
     * Origin-realm avp towards server.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverOriginRealm set the serverOriginRealm.
     */
    public void setServerOriginRealm(String  serverOriginRealm) {
        this.serverOriginRealm = serverOriginRealm;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DiameterServiceApplicationProfile objDiameterServiceApplicationProfile = (DiameterServiceApplicationProfile) o;
      return   Objects.equals(this.hostIpAddrRewrite, objDiameterServiceApplicationProfile.hostIpAddrRewrite)&&
  Objects.equals(this.reqTimeout, objDiameterServiceApplicationProfile.reqTimeout)&&
  Objects.equals(this.maxOutstandingReq, objDiameterServiceApplicationProfile.maxOutstandingReq)&&
  Objects.equals(this.clientOriginHost, objDiameterServiceApplicationProfile.clientOriginHost)&&
  Objects.equals(this.clientOriginRealm, objDiameterServiceApplicationProfile.clientOriginRealm)&&
  Objects.equals(this.serverOriginHost, objDiameterServiceApplicationProfile.serverOriginHost)&&
  Objects.equals(this.serverOriginRealm, objDiameterServiceApplicationProfile.serverOriginRealm);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DiameterServiceApplicationProfile {\n");
                  sb.append("    clientOriginHost: ").append(toIndentedString(clientOriginHost)).append("\n");
                        sb.append("    clientOriginRealm: ").append(toIndentedString(clientOriginRealm)).append("\n");
                        sb.append("    hostIpAddrRewrite: ").append(toIndentedString(hostIpAddrRewrite)).append("\n");
                        sb.append("    maxOutstandingReq: ").append(toIndentedString(maxOutstandingReq)).append("\n");
                        sb.append("    reqTimeout: ").append(toIndentedString(reqTimeout)).append("\n");
                        sb.append("    serverOriginHost: ").append(toIndentedString(serverOriginHost)).append("\n");
                        sb.append("    serverOriginRealm: ").append(toIndentedString(serverOriginRealm)).append("\n");
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
