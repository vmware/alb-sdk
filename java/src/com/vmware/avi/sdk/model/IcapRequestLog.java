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
 * The IcapRequestLog is a POJO class extends AviRestResource that used for creating
 * IcapRequestLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IcapRequestLog  {
    @JsonProperty("action")
    private String action;

    @JsonProperty("complete_body_sent")
    private Boolean completeBodySent;

    @JsonProperty("http_method")
    private String httpMethod;

    @JsonProperty("http_response_code")
    private Integer httpResponseCode;

    @JsonProperty("icap_absolute_uri")
    private String icapAbsoluteUri;

    @JsonProperty("icap_headers_received_from_server")
    private String icapHeadersReceivedFromServer;

    @JsonProperty("icap_headers_sent_to_server")
    private String icapHeadersSentToServer;

    @JsonProperty("icap_method")
    private String icapMethod;

    @JsonProperty("icap_response_code")
    private Integer icapResponseCode;

    @JsonProperty("icap_server_ip")
    private Integer icapServerIp;

    @JsonProperty("icap_server_port")
    private Integer icapServerPort;

    @JsonProperty("latency")
    private Integer latency;

    @JsonProperty("modified_content_length")
    private Integer modifiedContentLength;

    @JsonProperty("nsx_defender_log")
    private IcapNSXDefenderLog nsxDefenderLog;

    @JsonProperty("opswat_log")
    private IcapOPSWATLog opswatLog;

    @JsonProperty("pool_name")
    private String poolName;

    @JsonProperty("pool_uuid")
    private String poolUuid;

    @JsonProperty("source_port")
    private Integer sourcePort;

    @JsonProperty("vendor")
    private String vendor;



    /**
     * This is the getter method this will return the attribute value.
     * Denotes whether the content was processed by icap server and an action was taken.
     * Enum options - ICAP_DISABLED, ICAP_PASSED, ICAP_MODIFIED, ICAP_BLOCKED, ICAP_FAILED.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return action
     */
    public String getAction() {
        return action;
    }

    /**
     * This is the setter method to the attribute.
     * Denotes whether the content was processed by icap server and an action was taken.
     * Enum options - ICAP_DISABLED, ICAP_PASSED, ICAP_MODIFIED, ICAP_BLOCKED, ICAP_FAILED.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param action set the action.
     */
    public void setAction(String  action) {
        this.action = action;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Complete request body from client was sent to the icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return completeBodySent
     */
    public Boolean getCompleteBodySent() {
        return completeBodySent;
    }

    /**
     * This is the setter method to the attribute.
     * Complete request body from client was sent to the icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param completeBodySent set the completeBodySent.
     */
    public void setCompleteBodySent(Boolean  completeBodySent) {
        this.completeBodySent = completeBodySent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The http method of the request.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpMethod
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * This is the setter method to the attribute.
     * The http method of the request.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpMethod set the httpMethod.
     */
    public void setHttpMethod(String  httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The http response code received from the icap server.
     * Http response code is only available if content is blocked.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpResponseCode
     */
    public Integer getHttpResponseCode() {
        return httpResponseCode;
    }

    /**
     * This is the setter method to the attribute.
     * The http response code received from the icap server.
     * Http response code is only available if content is blocked.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpResponseCode set the httpResponseCode.
     */
    public void setHttpResponseCode(Integer  httpResponseCode) {
        this.httpResponseCode = httpResponseCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The absolute icap uri of the request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return icapAbsoluteUri
     */
    public String getIcapAbsoluteUri() {
        return icapAbsoluteUri;
    }

    /**
     * This is the setter method to the attribute.
     * The absolute icap uri of the request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param icapAbsoluteUri set the icapAbsoluteUri.
     */
    public void setIcapAbsoluteUri(String  icapAbsoluteUri) {
        this.icapAbsoluteUri = icapAbsoluteUri;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Icap response headers received from icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return icapHeadersReceivedFromServer
     */
    public String getIcapHeadersReceivedFromServer() {
        return icapHeadersReceivedFromServer;
    }

    /**
     * This is the setter method to the attribute.
     * Icap response headers received from icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param icapHeadersReceivedFromServer set the icapHeadersReceivedFromServer.
     */
    public void setIcapHeadersReceivedFromServer(String  icapHeadersReceivedFromServer) {
        this.icapHeadersReceivedFromServer = icapHeadersReceivedFromServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Icap request headers sent to icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return icapHeadersSentToServer
     */
    public String getIcapHeadersSentToServer() {
        return icapHeadersSentToServer;
    }

    /**
     * This is the setter method to the attribute.
     * Icap request headers sent to icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param icapHeadersSentToServer set the icapHeadersSentToServer.
     */
    public void setIcapHeadersSentToServer(String  icapHeadersSentToServer) {
        this.icapHeadersSentToServer = icapHeadersSentToServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The icap method of the request.
     * Enum options - ICAP_METHOD_REQMOD, ICAP_METHOD_RESPMOD.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return icapMethod
     */
    public String getIcapMethod() {
        return icapMethod;
    }

    /**
     * This is the setter method to the attribute.
     * The icap method of the request.
     * Enum options - ICAP_METHOD_REQMOD, ICAP_METHOD_RESPMOD.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param icapMethod set the icapMethod.
     */
    public void setIcapMethod(String  icapMethod) {
        this.icapMethod = icapMethod;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The response code received from the icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return icapResponseCode
     */
    public Integer getIcapResponseCode() {
        return icapResponseCode;
    }

    /**
     * This is the setter method to the attribute.
     * The response code received from the icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param icapResponseCode set the icapResponseCode.
     */
    public void setIcapResponseCode(Integer  icapResponseCode) {
        this.icapResponseCode = icapResponseCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Icap server ip for this connection.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return icapServerIp
     */
    public Integer getIcapServerIp() {
        return icapServerIp;
    }

    /**
     * This is the setter method to the attribute.
     * Icap server ip for this connection.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param icapServerIp set the icapServerIp.
     */
    public void setIcapServerIp(Integer  icapServerIp) {
        this.icapServerIp = icapServerIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Icap server port for this connection.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return icapServerPort
     */
    public Integer getIcapServerPort() {
        return icapServerPort;
    }

    /**
     * This is the setter method to the attribute.
     * Icap server port for this connection.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param icapServerPort set the icapServerPort.
     */
    public void setIcapServerPort(Integer  icapServerPort) {
        this.icapServerPort = icapServerPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Latency added due to icap processing.
     * This is the time taken from 1st byte of icap request sent to last byte of icap response received.
     * Field introduced in 20.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return latency
     */
    public Integer getLatency() {
        return latency;
    }

    /**
     * This is the setter method to the attribute.
     * Latency added due to icap processing.
     * This is the time taken from 1st byte of icap request sent to last byte of icap response received.
     * Field introduced in 20.1.1.
     * Unit is milliseconds.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param latency set the latency.
     */
    public void setLatency(Integer  latency) {
        this.latency = latency;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Content-length of the modified content from icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return modifiedContentLength
     */
    public Integer getModifiedContentLength() {
        return modifiedContentLength;
    }

    /**
     * This is the setter method to the attribute.
     * Content-length of the modified content from icap server.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param modifiedContentLength set the modifiedContentLength.
     */
    public void setModifiedContentLength(Integer  modifiedContentLength) {
        this.modifiedContentLength = modifiedContentLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Icap log specific to nsx defender.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxDefenderLog
     */
    public IcapNSXDefenderLog getNsxDefenderLog() {
        return nsxDefenderLog;
    }

    /**
     * This is the setter method to the attribute.
     * Icap log specific to nsx defender.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxDefenderLog set the nsxDefenderLog.
     */
    public void setNsxDefenderLog(IcapNSXDefenderLog nsxDefenderLog) {
        this.nsxDefenderLog = nsxDefenderLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Icap log specific to opswat.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return opswatLog
     */
    public IcapOPSWATLog getOpswatLog() {
        return opswatLog;
    }

    /**
     * This is the setter method to the attribute.
     * Icap log specific to opswat.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param opswatLog set the opswatLog.
     */
    public void setOpswatLog(IcapOPSWATLog opswatLog) {
        this.opswatLog = opswatLog;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the pool that was used for the request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the pool that was used for the request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolName set the poolName.
     */
    public void setPoolName(String  poolName) {
        this.poolName = poolName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The uuid of the pool that was used for the request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolUuid
     */
    public String getPoolUuid() {
        return poolUuid;
    }

    /**
     * This is the setter method to the attribute.
     * The uuid of the pool that was used for the request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolUuid set the poolUuid.
     */
    public void setPoolUuid(String  poolUuid) {
        this.poolUuid = poolUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Source port for this connection.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sourcePort
     */
    public Integer getSourcePort() {
        return sourcePort;
    }

    /**
     * This is the setter method to the attribute.
     * Source port for this connection.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sourcePort set the sourcePort.
     */
    public void setSourcePort(Integer  sourcePort) {
        this.sourcePort = sourcePort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Selected icap vendor for the request.
     * Enum options - ICAP_VENDOR_GENERIC, ICAP_VENDOR_OPSWAT, ICAP_VENDOR_LASTLINE.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * This is the setter method to the attribute.
     * Selected icap vendor for the request.
     * Enum options - ICAP_VENDOR_GENERIC, ICAP_VENDOR_OPSWAT, ICAP_VENDOR_LASTLINE.
     * Field introduced in 21.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vendor set the vendor.
     */
    public void setVendor(String  vendor) {
        this.vendor = vendor;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      IcapRequestLog objIcapRequestLog = (IcapRequestLog) o;
      return   Objects.equals(this.icapResponseCode, objIcapRequestLog.icapResponseCode)&&
  Objects.equals(this.icapMethod, objIcapRequestLog.icapMethod)&&
  Objects.equals(this.httpResponseCode, objIcapRequestLog.httpResponseCode)&&
  Objects.equals(this.httpMethod, objIcapRequestLog.httpMethod)&&
  Objects.equals(this.icapAbsoluteUri, objIcapRequestLog.icapAbsoluteUri)&&
  Objects.equals(this.completeBodySent, objIcapRequestLog.completeBodySent)&&
  Objects.equals(this.modifiedContentLength, objIcapRequestLog.modifiedContentLength)&&
  Objects.equals(this.poolName, objIcapRequestLog.poolName)&&
  Objects.equals(this.poolUuid, objIcapRequestLog.poolUuid)&&
  Objects.equals(this.sourcePort, objIcapRequestLog.sourcePort)&&
  Objects.equals(this.latency, objIcapRequestLog.latency)&&
  Objects.equals(this.icapHeadersSentToServer, objIcapRequestLog.icapHeadersSentToServer)&&
  Objects.equals(this.icapHeadersReceivedFromServer, objIcapRequestLog.icapHeadersReceivedFromServer)&&
  Objects.equals(this.action, objIcapRequestLog.action)&&
  Objects.equals(this.icapServerPort, objIcapRequestLog.icapServerPort)&&
  Objects.equals(this.icapServerIp, objIcapRequestLog.icapServerIp)&&
  Objects.equals(this.vendor, objIcapRequestLog.vendor)&&
  Objects.equals(this.opswatLog, objIcapRequestLog.opswatLog)&&
  Objects.equals(this.nsxDefenderLog, objIcapRequestLog.nsxDefenderLog);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class IcapRequestLog {\n");
                  sb.append("    action: ").append(toIndentedString(action)).append("\n");
                        sb.append("    completeBodySent: ").append(toIndentedString(completeBodySent)).append("\n");
                        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
                        sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
                        sb.append("    icapAbsoluteUri: ").append(toIndentedString(icapAbsoluteUri)).append("\n");
                        sb.append("    icapHeadersReceivedFromServer: ").append(toIndentedString(icapHeadersReceivedFromServer)).append("\n");
                        sb.append("    icapHeadersSentToServer: ").append(toIndentedString(icapHeadersSentToServer)).append("\n");
                        sb.append("    icapMethod: ").append(toIndentedString(icapMethod)).append("\n");
                        sb.append("    icapResponseCode: ").append(toIndentedString(icapResponseCode)).append("\n");
                        sb.append("    icapServerIp: ").append(toIndentedString(icapServerIp)).append("\n");
                        sb.append("    icapServerPort: ").append(toIndentedString(icapServerPort)).append("\n");
                        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
                        sb.append("    modifiedContentLength: ").append(toIndentedString(modifiedContentLength)).append("\n");
                        sb.append("    nsxDefenderLog: ").append(toIndentedString(nsxDefenderLog)).append("\n");
                        sb.append("    opswatLog: ").append(toIndentedString(opswatLog)).append("\n");
                        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
                        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
                        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
                        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
