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
 * The ApiEndpoint is a POJO class extends AviRestResource that used for creating
 * ApiEndpoint.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiEndpoint  {
    @JsonProperty("active_api_labels")
    private ApiLabels activeApiLabels;

    @JsonProperty("deactivated")
    private Boolean deactivated = false;

    @JsonProperty("description")
    private String description;

    @JsonProperty("failed_validation_header_parameter_action")
    private String failedValidationHeaderParameterAction = "API_ACTION_INHERIT_FROM_API_POLICY";

    @JsonProperty("failed_validation_path_parameter_action")
    private String failedValidationPathParameterAction = "API_ACTION_INHERIT_FROM_API_POLICY";

    @JsonProperty("failed_validation_query_parameter_action")
    private String failedValidationQueryParameterAction = "API_ACTION_INHERIT_FROM_API_POLICY";

    @JsonProperty("header_parameters")
    private List<ParameterDescription> headerParameters;

    @JsonProperty("http_method")
    private String httpMethod;

    @JsonProperty("override_global_active_api_labels")
    private Boolean overrideGlobalActiveApiLabels;

    @JsonProperty("path_parameters")
    private List<ParameterDescription> pathParameters;

    @JsonProperty("query_parameters")
    private List<ParameterDescription> queryParameters;

    @JsonProperty("request_body")
    private ApiRequestBodyDescription requestBody;

    @JsonProperty("responses")
    private List<ApiResponse> responses;

    @JsonProperty("type")
    private String type = "API_TYPE_ACTIVE";

    @JsonProperty("unknown_status_code_action")
    private String unknownStatusCodeAction = "API_ACTION_INHERIT_FROM_API_POLICY";



    /**
     * This is the getter method this will return the attribute value.
     * Additional labels for this endpoint, applicable when the endpoint is an active api.
     * By default, this is applied in conjunction with the global active_api_labels defined in apipolicy.
     * Set override_global_active_api_labels to true to use only the endpoint-level labels.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return activeApiLabels
     */
    public ApiLabels getActiveApiLabels() {
        return activeApiLabels;
    }

    /**
     * This is the setter method to the attribute.
     * Additional labels for this endpoint, applicable when the endpoint is an active api.
     * By default, this is applied in conjunction with the global active_api_labels defined in apipolicy.
     * Set override_global_active_api_labels to true to use only the endpoint-level labels.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param activeApiLabels set the activeApiLabels.
     */
    public void setActiveApiLabels(ApiLabels activeApiLabels) {
        this.activeApiLabels = activeApiLabels;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Endpoint definition is deactivated.
     * When true, this endpoint will not be validated, learned, or labeled.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return deactivated
     */
    public Boolean getDeactivated() {
        return deactivated;
    }

    /**
     * This is the setter method to the attribute.
     * Endpoint definition is deactivated.
     * When true, this endpoint will not be validated, learned, or labeled.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param deactivated set the deactivated.
     */
    public void setDeactivated(Boolean  deactivated) {
        this.deactivated = deactivated;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Describes the functionality of the api endpoint.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Describes the functionality of the api endpoint.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action on header parameter schema validation failures.
     * Overrides the policy-level failed_validation_header_parameter_action when not inherit.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @return failedValidationHeaderParameterAction
     */
    public String getFailedValidationHeaderParameterAction() {
        return failedValidationHeaderParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action on header parameter schema validation failures.
     * Overrides the policy-level failed_validation_header_parameter_action when not inherit.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @param failedValidationHeaderParameterAction set the failedValidationHeaderParameterAction.
     */
    public void setFailedValidationHeaderParameterAction(String  failedValidationHeaderParameterAction) {
        this.failedValidationHeaderParameterAction = failedValidationHeaderParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action on path parameter value validation failures (e.g., type mismatch).
     * Path parameters are value-only (key is defined by the path template), so this covers schema violations, not unknown keys.
     * Overrides the policy-level failed_validation_path_parameter_action when not inherit.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @return failedValidationPathParameterAction
     */
    public String getFailedValidationPathParameterAction() {
        return failedValidationPathParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action on path parameter value validation failures (e.g., type mismatch).
     * Path parameters are value-only (key is defined by the path template), so this covers schema violations, not unknown keys.
     * Overrides the policy-level failed_validation_path_parameter_action when not inherit.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @param failedValidationPathParameterAction set the failedValidationPathParameterAction.
     */
    public void setFailedValidationPathParameterAction(String  failedValidationPathParameterAction) {
        this.failedValidationPathParameterAction = failedValidationPathParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action on query parameter schema validation failures.
     * Overrides the policy-level failed_validation_query_argument_action when not inherit.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @return failedValidationQueryParameterAction
     */
    public String getFailedValidationQueryParameterAction() {
        return failedValidationQueryParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action on query parameter schema validation failures.
     * Overrides the policy-level failed_validation_query_argument_action when not inherit.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @param failedValidationQueryParameterAction set the failedValidationQueryParameterAction.
     */
    public void setFailedValidationQueryParameterAction(String  failedValidationQueryParameterAction) {
        this.failedValidationQueryParameterAction = failedValidationQueryParameterAction;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Request header parameter definitions for this endpoint, used to validate incoming request headers.
     * Field introduced in 32.2.1.
     * Maximum of 64 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headerParameters
     */
    public List<ParameterDescription> getHeaderParameters() {
        return headerParameters;
    }

    /**
     * This is the setter method. this will set the headerParameters
     * Request header parameter definitions for this endpoint, used to validate incoming request headers.
     * Field introduced in 32.2.1.
     * Maximum of 64 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headerParameters
     */
    public void setHeaderParameters(List<ParameterDescription>  headerParameters) {
        this.headerParameters = headerParameters;
    }

    /**
     * This is the setter method this will set the headerParameters
     * Request header parameter definitions for this endpoint, used to validate incoming request headers.
     * Field introduced in 32.2.1.
     * Maximum of 64 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return headerParameters
     */
    public ApiEndpoint addHeaderParametersItem(ParameterDescription headerParametersItem) {
      if (this.headerParameters == null) {
        this.headerParameters = new ArrayList<ParameterDescription>();
      }
      this.headerParameters.add(headerParametersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http method for this api endpoint.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpMethod
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * This is the setter method to the attribute.
     * Http method for this api endpoint.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param httpMethod set the httpMethod.
     */
    public void setHttpMethod(String  httpMethod) {
        this.httpMethod = httpMethod;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When true, only the endpoint-level active_api_labels are applied to this endpoint, ignoring the global active_api_labels defined in apipolicy.
     * When false (default), endpoint-level and global active_api_labels are applied in conjunction.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return overrideGlobalActiveApiLabels
     */
    public Boolean getOverrideGlobalActiveApiLabels() {
        return overrideGlobalActiveApiLabels;
    }

    /**
     * This is the setter method to the attribute.
     * When true, only the endpoint-level active_api_labels are applied to this endpoint, ignoring the global active_api_labels defined in apipolicy.
     * When false (default), endpoint-level and global active_api_labels are applied in conjunction.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param overrideGlobalActiveApiLabels set the overrideGlobalActiveApiLabels.
     */
    public void setOverrideGlobalActiveApiLabels(Boolean  overrideGlobalActiveApiLabels) {
        this.overrideGlobalActiveApiLabels = overrideGlobalActiveApiLabels;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Path parameter definitions for this endpoint, used for schema validation.
     * Names must match the placeholders in the path template.
     * Example  for path /pets/{petid}, a path parameter named 'petid' would be listed here.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pathParameters
     */
    public List<ParameterDescription> getPathParameters() {
        return pathParameters;
    }

    /**
     * This is the setter method. this will set the pathParameters
     * Path parameter definitions for this endpoint, used for schema validation.
     * Names must match the placeholders in the path template.
     * Example  for path /pets/{petid}, a path parameter named 'petid' would be listed here.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pathParameters
     */
    public void setPathParameters(List<ParameterDescription>  pathParameters) {
        this.pathParameters = pathParameters;
    }

    /**
     * This is the setter method this will set the pathParameters
     * Path parameter definitions for this endpoint, used for schema validation.
     * Names must match the placeholders in the path template.
     * Example  for path /pets/{petid}, a path parameter named 'petid' would be listed here.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pathParameters
     */
    public ApiEndpoint addPathParametersItem(ParameterDescription pathParametersItem) {
      if (this.pathParameters == null) {
        this.pathParameters = new ArrayList<ParameterDescription>();
      }
      this.pathParameters.add(pathParametersItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Query string parameter definitions for this endpoint, used to validate query arguments.
     * Example  for get /pets?limit=10, a query parameter named 'limit' would be listed here.
     * Field introduced in 32.2.1.
     * Maximum of 128 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return queryParameters
     */
    public List<ParameterDescription> getQueryParameters() {
        return queryParameters;
    }

    /**
     * This is the setter method. this will set the queryParameters
     * Query string parameter definitions for this endpoint, used to validate query arguments.
     * Example  for get /pets?limit=10, a query parameter named 'limit' would be listed here.
     * Field introduced in 32.2.1.
     * Maximum of 128 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return queryParameters
     */
    public void setQueryParameters(List<ParameterDescription>  queryParameters) {
        this.queryParameters = queryParameters;
    }

    /**
     * This is the setter method this will set the queryParameters
     * Query string parameter definitions for this endpoint, used to validate query arguments.
     * Example  for get /pets?limit=10, a query parameter named 'limit' would be listed here.
     * Field introduced in 32.2.1.
     * Maximum of 128 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return queryParameters
     */
    public ApiEndpoint addQueryParametersItem(ParameterDescription queryParametersItem) {
      if (this.queryParameters == null) {
        this.queryParameters = new ArrayList<ParameterDescription>();
      }
      this.queryParameters.add(queryParametersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Expected format and schema of the request body, including content-type to schema mappings.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return requestBody
     */
    public ApiRequestBodyDescription getRequestBody() {
        return requestBody;
    }

    /**
     * This is the setter method to the attribute.
     * Expected format and schema of the request body, including content-type to schema mappings.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param requestBody set the requestBody.
     */
    public void setRequestBody(ApiRequestBodyDescription requestBody) {
        this.requestBody = requestBody;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Expected response definitions for this endpoint, each associated with an http status code or status code range.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responses
     */
    public List<ApiResponse> getResponses() {
        return responses;
    }

    /**
     * This is the setter method. this will set the responses
     * Expected response definitions for this endpoint, each associated with an http status code or status code range.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responses
     */
    public void setResponses(List<ApiResponse>  responses) {
        this.responses = responses;
    }

    /**
     * This is the setter method this will set the responses
     * Expected response definitions for this endpoint, each associated with an http status code or status code range.
     * Field introduced in 32.2.1.
     * Maximum of 32 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return responses
     */
    public ApiEndpoint addResponsesItem(ApiResponse responsesItem) {
      if (this.responses == null) {
        this.responses = new ArrayList<ApiResponse>();
      }
      this.responses.add(responsesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configured lifecycle type of this endpoint.
     * Active endpoints are expected to receive traffic; orphan endpoints have not been seen for a predefined duration; zombie endpoints receive only
     * drip-traffic from legacy clients.
     * Defaults to active.
     * Enum options - API_TYPE_ACTIVE, API_TYPE_ORPHAN, API_TYPE_ZOMBIE.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_TYPE_ACTIVE".
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Configured lifecycle type of this endpoint.
     * Active endpoints are expected to receive traffic; orphan endpoints have not been seen for a predefined duration; zombie endpoints receive only
     * drip-traffic from legacy clients.
     * Defaults to active.
     * Enum options - API_TYPE_ACTIVE, API_TYPE_ORPHAN, API_TYPE_ZOMBIE.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_TYPE_ACTIVE".
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take on an unknown status code.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @return unknownStatusCodeAction
     */
    public String getUnknownStatusCodeAction() {
        return unknownStatusCodeAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take on an unknown status code.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_INHERIT_FROM_API_POLICY".
     * @param unknownStatusCodeAction set the unknownStatusCodeAction.
     */
    public void setUnknownStatusCodeAction(String  unknownStatusCodeAction) {
        this.unknownStatusCodeAction = unknownStatusCodeAction;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiEndpoint objApiEndpoint = (ApiEndpoint) o;
      return   Objects.equals(this.httpMethod, objApiEndpoint.httpMethod)&&
  Objects.equals(this.description, objApiEndpoint.description)&&
  Objects.equals(this.deactivated, objApiEndpoint.deactivated)&&
  Objects.equals(this.activeApiLabels, objApiEndpoint.activeApiLabels)&&
  Objects.equals(this.type, objApiEndpoint.type)&&
  Objects.equals(this.overrideGlobalActiveApiLabels, objApiEndpoint.overrideGlobalActiveApiLabels)&&
  Objects.equals(this.pathParameters, objApiEndpoint.pathParameters)&&
  Objects.equals(this.queryParameters, objApiEndpoint.queryParameters)&&
  Objects.equals(this.failedValidationQueryParameterAction, objApiEndpoint.failedValidationQueryParameterAction)&&
  Objects.equals(this.headerParameters, objApiEndpoint.headerParameters)&&
  Objects.equals(this.requestBody, objApiEndpoint.requestBody)&&
  Objects.equals(this.responses, objApiEndpoint.responses)&&
  Objects.equals(this.unknownStatusCodeAction, objApiEndpoint.unknownStatusCodeAction)&&
  Objects.equals(this.failedValidationPathParameterAction, objApiEndpoint.failedValidationPathParameterAction)&&
  Objects.equals(this.failedValidationHeaderParameterAction, objApiEndpoint.failedValidationHeaderParameterAction);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiEndpoint {\n");
                  sb.append("    activeApiLabels: ").append(toIndentedString(activeApiLabels)).append("\n");
                        sb.append("    deactivated: ").append(toIndentedString(deactivated)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    failedValidationHeaderParameterAction: ").append(toIndentedString(failedValidationHeaderParameterAction)).append("\n");
                        sb.append("    failedValidationPathParameterAction: ").append(toIndentedString(failedValidationPathParameterAction)).append("\n");
                        sb.append("    failedValidationQueryParameterAction: ").append(toIndentedString(failedValidationQueryParameterAction)).append("\n");
                        sb.append("    headerParameters: ").append(toIndentedString(headerParameters)).append("\n");
                        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
                        sb.append("    overrideGlobalActiveApiLabels: ").append(toIndentedString(overrideGlobalActiveApiLabels)).append("\n");
                        sb.append("    pathParameters: ").append(toIndentedString(pathParameters)).append("\n");
                        sb.append("    queryParameters: ").append(toIndentedString(queryParameters)).append("\n");
                        sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
                        sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                        sb.append("    unknownStatusCodeAction: ").append(toIndentedString(unknownStatusCodeAction)).append("\n");
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
