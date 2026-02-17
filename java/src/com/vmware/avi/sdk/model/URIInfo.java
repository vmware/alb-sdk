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
 * The URIInfo is a POJO class extends AviRestResource that used for creating
 * URIInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class URIInfo  {
    @JsonProperty("method")
    private String method;

    @JsonProperty("param_info")
    private List<ParamInfo> paramInfo;

    @JsonProperty("parser")
    private String parser;

    @JsonProperty("uri_hits")
    private Integer uriHits;

    @JsonProperty("uri_key")
    private String uriKey;



    /**
     * This is the getter method this will return the attribute value.
     * The http method.
     * Together with name and parser it describes the http endpoint.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return method
     */
    public String getMethod() {
        return method;
    }

    /**
     * This is the setter method to the attribute.
     * The http method.
     * Together with name and parser it describes the http endpoint.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param method set the method.
     */
    public void setMethod(String  method) {
        this.method = method;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Information about various params under a uri.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paramInfo
     */
    public List<ParamInfo> getParamInfo() {
        return paramInfo;
    }

    /**
     * This is the setter method. this will set the paramInfo
     * Information about various params under a uri.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paramInfo
     */
    public void setParamInfo(List<ParamInfo>  paramInfo) {
        this.paramInfo = paramInfo;
    }

    /**
     * This is the setter method this will set the paramInfo
     * Information about various params under a uri.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return paramInfo
     */
    public URIInfo addParamInfoItem(ParamInfo paramInfoItem) {
      if (this.paramInfo == null) {
        this.paramInfo = new ArrayList<ParamInfo>();
      }
      this.paramInfo.add(paramInfoItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The parser used to parse the request body.
     * Together with name and method it describes the http endpoint.
     * If there was no parser, for example on a get request, this is set to waf_request_parser_do_not_parse.
     * Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML,
     * WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE, WAF_REQUEST_PARSER_AUTO_DETECT.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return parser
     */
    public String getParser() {
        return parser;
    }

    /**
     * This is the setter method to the attribute.
     * The parser used to parse the request body.
     * Together with name and method it describes the http endpoint.
     * If there was no parser, for example on a get request, this is set to waf_request_parser_do_not_parse.
     * Enum options - WAF_REQUEST_PARSER_URLENCODED, WAF_REQUEST_PARSER_MULTIPART, WAF_REQUEST_PARSER_JSON, WAF_REQUEST_PARSER_XML,
     * WAF_REQUEST_PARSER_HANDLE_AS_STRING, WAF_REQUEST_PARSER_DO_NOT_PARSE, WAF_REQUEST_PARSER_AUTO_DETECT.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param parser set the parser.
     */
    public void setParser(String  parser) {
        this.parser = parser;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total number of uri hits.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriHits
     */
    public Integer getUriHits() {
        return uriHits;
    }

    /**
     * This is the setter method to the attribute.
     * Total number of uri hits.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uriHits set the uriHits.
     */
    public void setUriHits(Integer  uriHits) {
        this.uriHits = uriHits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uri name.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uriKey
     */
    public String getUriKey() {
        return uriKey;
    }

    /**
     * This is the setter method to the attribute.
     * Uri name.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uriKey set the uriKey.
     */
    public void setUriKey(String  uriKey) {
        this.uriKey = uriKey;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      URIInfo objURIInfo = (URIInfo) o;
      return   Objects.equals(this.uriHits, objURIInfo.uriHits)&&
  Objects.equals(this.uriKey, objURIInfo.uriKey)&&
  Objects.equals(this.paramInfo, objURIInfo.paramInfo)&&
  Objects.equals(this.method, objURIInfo.method)&&
  Objects.equals(this.parser, objURIInfo.parser);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class URIInfo {\n");
                  sb.append("    method: ").append(toIndentedString(method)).append("\n");
                        sb.append("    paramInfo: ").append(toIndentedString(paramInfo)).append("\n");
                        sb.append("    parser: ").append(toIndentedString(parser)).append("\n");
                        sb.append("    uriHits: ").append(toIndentedString(uriHits)).append("\n");
                        sb.append("    uriKey: ").append(toIndentedString(uriKey)).append("\n");
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
