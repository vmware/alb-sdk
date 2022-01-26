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
 * The SubRequestLog is a POJO class extends AviRestResource that used for creating
 * SubRequestLog.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SubRequestLog  {
    @JsonProperty("headers_received_from_server")
    private String headersReceivedFromServer = null;

    @JsonProperty("headers_sent_to_server")
    private String headersSentToServer = null;

    @JsonProperty("http_response_code")
    private Integer httpResponseCode = null;

    @JsonProperty("http_version")
    private String httpVersion = null;

    @JsonProperty("method")
    private String method = null;

    @JsonProperty("pool_name")
    private String poolName = null;

    @JsonProperty("pool_uuid")
    private String poolUuid = null;

    @JsonProperty("request_length")
    private Integer requestLength = null;

    @JsonProperty("response_length")
    private Integer responseLength = null;

    @JsonProperty("server_ip")
    private Integer serverIp = null;

    @JsonProperty("server_name")
    private String serverName = null;

    @JsonProperty("server_port")
    private Integer serverPort = null;

    @JsonProperty("source_port")
    private Integer sourcePort = null;

    @JsonProperty("total_time")
    private Integer totalTime = null;

    @JsonProperty("uri_path")
    private String uriPath = null;

    @JsonProperty("uri_query")
    private String uriQuery = null;



    /**
     * This is the getter method this will return the attribute value.
     * Response headers received from the server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headersReceivedFromServer
     */
    public String getHeadersReceivedFromServer() {
        return headersReceivedFromServer;
    }

    /**
     * This is the setter method to the attribute.
     * Response headers received from the server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param headersReceivedFromServer set the headersReceivedFromServer.
     */
    public void setHeadersReceivedFromServer(String  headersReceivedFromServer) {
        this.headersReceivedFromServer = headersReceivedFromServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Request headers sent to the server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headersSentToServer
     */
    public String getHeadersSentToServer() {
        return headersSentToServer;
    }

    /**
     * This is the setter method to the attribute.
     * Request headers sent to the server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param headersSentToServer set the headersSentToServer.
     */
    public void setHeadersSentToServer(String  headersSentToServer) {
        this.headersSentToServer = headersSentToServer;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The http response code received from the server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpResponseCode
     */
    public Integer getHttpResponseCode() {
        return httpResponseCode;
    }

    /**
     * This is the setter method to the attribute.
     * The http response code received from the server.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpResponseCode set the httpResponseCode.
     */
    public void setHttpResponseCode(Integer  httpResponseCode) {
        this.httpResponseCode = httpResponseCode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The http version of the sub-request.
     * Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpVersion
     */
    public String getHttpVersion() {
        return httpVersion;
    }

    /**
     * This is the setter method to the attribute.
     * The http version of the sub-request.
     * Enum options - ZERO_NINE, ONE_ZERO, ONE_ONE, TWO_ZERO.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpVersion set the httpVersion.
     */
    public void setHttpVersion(String  httpVersion) {
        this.httpVersion = httpVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The http method of the sub-request.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * This is the setter method to the attribute.
     * The http method of the sub-request.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param method set the method.
     */
    public void setMethod(String  method) {
        this.method = method;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the pool that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the pool that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolName set the poolName.
     */
    public void setPoolName(String  poolName) {
        this.poolName = poolName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The uuid of the pool that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolUuid
     */
    public String getPoolUuid() {
        return poolUuid;
    }

    /**
     * This is the setter method to the attribute.
     * The uuid of the pool that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolUuid set the poolUuid.
     */
    public void setPoolUuid(String  poolUuid) {
        this.poolUuid = poolUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Length of the request sent in bytes.
     * Field introduced in 21.1.3.
     * Unit is bytes.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestLength
     */
    public Integer getRequestLength() {
        return requestLength;
    }

    /**
     * This is the setter method to the attribute.
     * Length of the request sent in bytes.
     * Field introduced in 21.1.3.
     * Unit is bytes.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestLength set the requestLength.
     */
    public void setRequestLength(Integer  requestLength) {
        this.requestLength = requestLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Length of the response received in bytes.
     * Field introduced in 21.1.3.
     * Unit is bytes.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responseLength
     */
    public Integer getResponseLength() {
        return responseLength;
    }

    /**
     * This is the setter method to the attribute.
     * Length of the response received in bytes.
     * Field introduced in 21.1.3.
     * Unit is bytes.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param responseLength set the responseLength.
     */
    public void setResponseLength(Integer  responseLength) {
        this.responseLength = responseLength;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The ip of the server that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverIp
     */
    public Integer getServerIp() {
        return serverIp;
    }

    /**
     * This is the setter method to the attribute.
     * The ip of the server that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverIp set the serverIp.
     */
    public void setServerIp(Integer  serverIp) {
        this.serverIp = serverIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the server that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the server that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverName set the serverName.
     */
    public void setServerName(String  serverName) {
        this.serverName = serverName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The port of the server that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverPort
     */
    public Integer getServerPort() {
        return serverPort;
    }

    /**
     * This is the setter method to the attribute.
     * The port of the server that was used for the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverPort set the serverPort.
     */
    public void setServerPort(Integer  serverPort) {
        this.serverPort = serverPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The source port for this request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sourcePort
     */
    public Integer getSourcePort() {
        return sourcePort;
    }

    /**
     * This is the setter method to the attribute.
     * The source port for this request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sourcePort set the sourcePort.
     */
    public void setSourcePort(Integer  sourcePort) {
        this.sourcePort = sourcePort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total time taken to process the oauth subrequest.
     * This is the time taken from the 1st byte of the request sent to the last byte of the response received.
     * Field introduced in 21.1.3.
     * Unit is milliseconds.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalTime
     */
    public Integer getTotalTime() {
        return totalTime;
    }

    /**
     * This is the setter method to the attribute.
     * Total time taken to process the oauth subrequest.
     * This is the time taken from the 1st byte of the request sent to the last byte of the response received.
     * Field introduced in 21.1.3.
     * Unit is milliseconds.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalTime set the totalTime.
     */
    public void setTotalTime(Integer  totalTime) {
        this.totalTime = totalTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The uri path of the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriPath
     */
    public String getUriPath() {
        return uriPath;
    }

    /**
     * This is the setter method to the attribute.
     * The uri path of the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uriPath set the uriPath.
     */
    public void setUriPath(String  uriPath) {
        this.uriPath = uriPath;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The uri query of the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriQuery
     */
    public String getUriQuery() {
        return uriQuery;
    }

    /**
     * This is the setter method to the attribute.
     * The uri query of the sub-request.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uriQuery set the uriQuery.
     */
    public void setUriQuery(String  uriQuery) {
        this.uriQuery = uriQuery;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SubRequestLog objSubRequestLog = (SubRequestLog) o;
      return   Objects.equals(this.method, objSubRequestLog.method)&&
  Objects.equals(this.httpVersion, objSubRequestLog.httpVersion)&&
  Objects.equals(this.uriPath, objSubRequestLog.uriPath)&&
  Objects.equals(this.uriQuery, objSubRequestLog.uriQuery)&&
  Objects.equals(this.httpResponseCode, objSubRequestLog.httpResponseCode)&&
  Objects.equals(this.poolName, objSubRequestLog.poolName)&&
  Objects.equals(this.poolUuid, objSubRequestLog.poolUuid)&&
  Objects.equals(this.serverName, objSubRequestLog.serverName)&&
  Objects.equals(this.serverIp, objSubRequestLog.serverIp)&&
  Objects.equals(this.serverPort, objSubRequestLog.serverPort)&&
  Objects.equals(this.sourcePort, objSubRequestLog.sourcePort)&&
  Objects.equals(this.headersSentToServer, objSubRequestLog.headersSentToServer)&&
  Objects.equals(this.headersReceivedFromServer, objSubRequestLog.headersReceivedFromServer)&&
  Objects.equals(this.requestLength, objSubRequestLog.requestLength)&&
  Objects.equals(this.responseLength, objSubRequestLog.responseLength)&&
  Objects.equals(this.totalTime, objSubRequestLog.totalTime);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SubRequestLog {\n");
                  sb.append("    headersReceivedFromServer: ").append(toIndentedString(headersReceivedFromServer)).append("\n");
                        sb.append("    headersSentToServer: ").append(toIndentedString(headersSentToServer)).append("\n");
                        sb.append("    httpResponseCode: ").append(toIndentedString(httpResponseCode)).append("\n");
                        sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
                        sb.append("    method: ").append(toIndentedString(method)).append("\n");
                        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
                        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
                        sb.append("    requestLength: ").append(toIndentedString(requestLength)).append("\n");
                        sb.append("    responseLength: ").append(toIndentedString(responseLength)).append("\n");
                        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
                        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
                        sb.append("    serverPort: ").append(toIndentedString(serverPort)).append("\n");
                        sb.append("    sourcePort: ").append(toIndentedString(sourcePort)).append("\n");
                        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
                        sb.append("    uriPath: ").append(toIndentedString(uriPath)).append("\n");
                        sb.append("    uriQuery: ").append(toIndentedString(uriQuery)).append("\n");
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
