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
 * The ApiValidationSettings is a POJO class extends AviRestResource that used for creating
 * ApiValidationSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiValidationSettings  {
    @JsonProperty("failed_validation_header_parameter_action")
    private String failedValidationHeaderParameterAction = "API_ACTION_FLAG";

    @JsonProperty("failed_validation_path_parameter_action")
    private String failedValidationPathParameterAction = "API_ACTION_FLAG";

    @JsonProperty("failed_validation_query_argument_action")
    private String failedValidationQueryArgumentAction = "API_ACTION_FLAG";

    @JsonProperty("failed_validation_request_body_parameter_action")
    private String failedValidationRequestBodyParameterAction = "API_ACTION_FLAG";

    @JsonProperty("missing_mandatory_header_parameter_action")
    private String missingMandatoryHeaderParameterAction = "API_ACTION_FLAG";

    @JsonProperty("missing_mandatory_query_argument_action")
    private String missingMandatoryQueryArgumentAction = "API_ACTION_FLAG";

    @JsonProperty("missing_mandatory_request_body_parameter_action")
    private String missingMandatoryRequestBodyParameterAction = "API_ACTION_FLAG";

    @JsonProperty("request_outside_path_prefix_action")
    private String requestOutsidePathPrefixAction = "API_ACTION_PASS";

    @JsonProperty("unexpected_header_parameter_action")
    private String unexpectedHeaderParameterAction = "API_ACTION_PASS";

    @JsonProperty("unexpected_query_argument_action")
    private String unexpectedQueryArgumentAction = "API_ACTION_LEARN";

    @JsonProperty("unexpected_request_body_parameter_action")
    private String unexpectedRequestBodyParameterAction = "API_ACTION_LEARN";

    @JsonProperty("unknown_content_type_action")
    private String unknownContentTypeAction = "API_ACTION_PASS";

    @JsonProperty("unknown_http_method_action")
    private String unknownHttpMethodAction = "API_ACTION_FLAG";

    @JsonProperty("unknown_path_action")
    private String unknownPathAction = "API_ACTION_FLAG";

    @JsonProperty("unknown_response_content_type_action")
    private String unknownResponseContentTypeAction = "API_ACTION_FLAG";

    @JsonProperty("unknown_response_status_code_action")
    private String unknownResponseStatusCodeAction = "API_ACTION_FLAG";



    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a header parameter fails schema validation.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return failedValidationHeaderParameterAction
     */
    public String getFailedValidationHeaderParameterAction() {
        return failedValidationHeaderParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a header parameter fails schema validation.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param failedValidationHeaderParameterAction set the failedValidationHeaderParameterAction.
     */
    public void setFailedValidationHeaderParameterAction(String  failedValidationHeaderParameterAction) {
        this.failedValidationHeaderParameterAction = failedValidationHeaderParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a path parameter fails schema validation.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return failedValidationPathParameterAction
     */
    public String getFailedValidationPathParameterAction() {
        return failedValidationPathParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a path parameter fails schema validation.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param failedValidationPathParameterAction set the failedValidationPathParameterAction.
     */
    public void setFailedValidationPathParameterAction(String  failedValidationPathParameterAction) {
        this.failedValidationPathParameterAction = failedValidationPathParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a query argument fails schema validation.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return failedValidationQueryArgumentAction
     */
    public String getFailedValidationQueryArgumentAction() {
        return failedValidationQueryArgumentAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a query argument fails schema validation.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param failedValidationQueryArgumentAction set the failedValidationQueryArgumentAction.
     */
    public void setFailedValidationQueryArgumentAction(String  failedValidationQueryArgumentAction) {
        this.failedValidationQueryArgumentAction = failedValidationQueryArgumentAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when the request body fails schema validation.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return failedValidationRequestBodyParameterAction
     */
    public String getFailedValidationRequestBodyParameterAction() {
        return failedValidationRequestBodyParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when the request body fails schema validation.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param failedValidationRequestBodyParameterAction set the failedValidationRequestBodyParameterAction.
     */
    public void setFailedValidationRequestBodyParameterAction(String  failedValidationRequestBodyParameterAction) {
        this.failedValidationRequestBodyParameterAction = failedValidationRequestBodyParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a mandatory header parameter is missing.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return missingMandatoryHeaderParameterAction
     */
    public String getMissingMandatoryHeaderParameterAction() {
        return missingMandatoryHeaderParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a mandatory header parameter is missing.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param missingMandatoryHeaderParameterAction set the missingMandatoryHeaderParameterAction.
     */
    public void setMissingMandatoryHeaderParameterAction(String  missingMandatoryHeaderParameterAction) {
        this.missingMandatoryHeaderParameterAction = missingMandatoryHeaderParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a mandatory query argument is missing.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return missingMandatoryQueryArgumentAction
     */
    public String getMissingMandatoryQueryArgumentAction() {
        return missingMandatoryQueryArgumentAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a mandatory query argument is missing.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param missingMandatoryQueryArgumentAction set the missingMandatoryQueryArgumentAction.
     */
    public void setMissingMandatoryQueryArgumentAction(String  missingMandatoryQueryArgumentAction) {
        this.missingMandatoryQueryArgumentAction = missingMandatoryQueryArgumentAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a mandatory request body parameter is missing.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return missingMandatoryRequestBodyParameterAction
     */
    public String getMissingMandatoryRequestBodyParameterAction() {
        return missingMandatoryRequestBodyParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a mandatory request body parameter is missing.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param missingMandatoryRequestBodyParameterAction set the missingMandatoryRequestBodyParameterAction.
     */
    public void setMissingMandatoryRequestBodyParameterAction(String  missingMandatoryRequestBodyParameterAction) {
        this.missingMandatoryRequestBodyParameterAction = missingMandatoryRequestBodyParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a request does not match any server url defined in this policy.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_PASS".
     * @return requestOutsidePathPrefixAction
     */
    public String getRequestOutsidePathPrefixAction() {
        return requestOutsidePathPrefixAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a request does not match any server url defined in this policy.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_PASS".
     * @param requestOutsidePathPrefixAction set the requestOutsidePathPrefixAction.
     */
    public void setRequestOutsidePathPrefixAction(String  requestOutsidePathPrefixAction) {
        this.requestOutsidePathPrefixAction = requestOutsidePathPrefixAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a header parameter is present but not defined in the schema.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_PASS".
     * @return unexpectedHeaderParameterAction
     */
    public String getUnexpectedHeaderParameterAction() {
        return unexpectedHeaderParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a header parameter is present but not defined in the schema.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_PASS".
     * @param unexpectedHeaderParameterAction set the unexpectedHeaderParameterAction.
     */
    public void setUnexpectedHeaderParameterAction(String  unexpectedHeaderParameterAction) {
        this.unexpectedHeaderParameterAction = unexpectedHeaderParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a query argument is present but not defined in the schema.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_LEARN".
     * @return unexpectedQueryArgumentAction
     */
    public String getUnexpectedQueryArgumentAction() {
        return unexpectedQueryArgumentAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a query argument is present but not defined in the schema.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_LEARN".
     * @param unexpectedQueryArgumentAction set the unexpectedQueryArgumentAction.
     */
    public void setUnexpectedQueryArgumentAction(String  unexpectedQueryArgumentAction) {
        this.unexpectedQueryArgumentAction = unexpectedQueryArgumentAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a request body parameter is present but not defined in the schema.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_LEARN".
     * @return unexpectedRequestBodyParameterAction
     */
    public String getUnexpectedRequestBodyParameterAction() {
        return unexpectedRequestBodyParameterAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a request body parameter is present but not defined in the schema.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_LEARN".
     * @param unexpectedRequestBodyParameterAction set the unexpectedRequestBodyParameterAction.
     */
    public void setUnexpectedRequestBodyParameterAction(String  unexpectedRequestBodyParameterAction) {
        this.unexpectedRequestBodyParameterAction = unexpectedRequestBodyParameterAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take on an unknown request content type, can be overridden per path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_PASS".
     * @return unknownContentTypeAction
     */
    public String getUnknownContentTypeAction() {
        return unknownContentTypeAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take on an unknown request content type, can be overridden per path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_PASS".
     * @param unknownContentTypeAction set the unknownContentTypeAction.
     */
    public void setUnknownContentTypeAction(String  unknownContentTypeAction) {
        this.unknownContentTypeAction = unknownContentTypeAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a request matches a defined path but uses an http method not defined for that path.
     * Can be overridden per path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return unknownHttpMethodAction
     */
    public String getUnknownHttpMethodAction() {
        return unknownHttpMethodAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a request matches a defined path but uses an http method not defined for that path.
     * Can be overridden per path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param unknownHttpMethodAction set the unknownHttpMethodAction.
     */
    public void setUnknownHttpMethodAction(String  unknownHttpMethodAction) {
        this.unknownHttpMethodAction = unknownHttpMethodAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take when a request matches a server url but does not match any defined api path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return unknownPathAction
     */
    public String getUnknownPathAction() {
        return unknownPathAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take when a request matches a server url but does not match any defined api path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param unknownPathAction set the unknownPathAction.
     */
    public void setUnknownPathAction(String  unknownPathAction) {
        this.unknownPathAction = unknownPathAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take on unknown response content type, can be overridden per path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return unknownResponseContentTypeAction
     */
    public String getUnknownResponseContentTypeAction() {
        return unknownResponseContentTypeAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take on unknown response content type, can be overridden per path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param unknownResponseContentTypeAction set the unknownResponseContentTypeAction.
     */
    public void setUnknownResponseContentTypeAction(String  unknownResponseContentTypeAction) {
        this.unknownResponseContentTypeAction = unknownResponseContentTypeAction;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Action to take on unknown response status code, can be overridden per path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @return unknownResponseStatusCodeAction
     */
    public String getUnknownResponseStatusCodeAction() {
        return unknownResponseStatusCodeAction;
    }

    /**
     * This is the setter method to the attribute.
     * Action to take on unknown response status code, can be overridden per path.
     * Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_LEARN, API_ACTION_FLAG, API_ACTION_REJECT.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "API_ACTION_FLAG".
     * @param unknownResponseStatusCodeAction set the unknownResponseStatusCodeAction.
     */
    public void setUnknownResponseStatusCodeAction(String  unknownResponseStatusCodeAction) {
        this.unknownResponseStatusCodeAction = unknownResponseStatusCodeAction;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiValidationSettings objApiValidationSettings = (ApiValidationSettings) o;
      return   Objects.equals(this.requestOutsidePathPrefixAction, objApiValidationSettings.requestOutsidePathPrefixAction)&&
  Objects.equals(this.unknownPathAction, objApiValidationSettings.unknownPathAction)&&
  Objects.equals(this.unknownHttpMethodAction, objApiValidationSettings.unknownHttpMethodAction)&&
  Objects.equals(this.unknownContentTypeAction, objApiValidationSettings.unknownContentTypeAction)&&
  Objects.equals(this.failedValidationQueryArgumentAction, objApiValidationSettings.failedValidationQueryArgumentAction)&&
  Objects.equals(this.unknownResponseStatusCodeAction, objApiValidationSettings.unknownResponseStatusCodeAction)&&
  Objects.equals(this.unknownResponseContentTypeAction, objApiValidationSettings.unknownResponseContentTypeAction)&&
  Objects.equals(this.failedValidationPathParameterAction, objApiValidationSettings.failedValidationPathParameterAction)&&
  Objects.equals(this.failedValidationHeaderParameterAction, objApiValidationSettings.failedValidationHeaderParameterAction)&&
  Objects.equals(this.failedValidationRequestBodyParameterAction, objApiValidationSettings.failedValidationRequestBodyParameterAction)&&
  Objects.equals(this.missingMandatoryQueryArgumentAction, objApiValidationSettings.missingMandatoryQueryArgumentAction)&&
  Objects.equals(this.missingMandatoryHeaderParameterAction, objApiValidationSettings.missingMandatoryHeaderParameterAction)&&
  Objects.equals(this.missingMandatoryRequestBodyParameterAction, objApiValidationSettings.missingMandatoryRequestBodyParameterAction)&&
  Objects.equals(this.unexpectedQueryArgumentAction, objApiValidationSettings.unexpectedQueryArgumentAction)&&
  Objects.equals(this.unexpectedHeaderParameterAction, objApiValidationSettings.unexpectedHeaderParameterAction)&&
  Objects.equals(this.unexpectedRequestBodyParameterAction, objApiValidationSettings.unexpectedRequestBodyParameterAction);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiValidationSettings {\n");
                  sb.append("    failedValidationHeaderParameterAction: ").append(toIndentedString(failedValidationHeaderParameterAction)).append("\n");
                        sb.append("    failedValidationPathParameterAction: ").append(toIndentedString(failedValidationPathParameterAction)).append("\n");
                        sb.append("    failedValidationQueryArgumentAction: ").append(toIndentedString(failedValidationQueryArgumentAction)).append("\n");
                        sb.append("    failedValidationRequestBodyParameterAction: ").append(toIndentedString(failedValidationRequestBodyParameterAction)).append("\n");
                        sb.append("    missingMandatoryHeaderParameterAction: ").append(toIndentedString(missingMandatoryHeaderParameterAction)).append("\n");
                        sb.append("    missingMandatoryQueryArgumentAction: ").append(toIndentedString(missingMandatoryQueryArgumentAction)).append("\n");
                        sb.append("    missingMandatoryRequestBodyParameterAction: ").append(toIndentedString(missingMandatoryRequestBodyParameterAction)).append("\n");
                        sb.append("    requestOutsidePathPrefixAction: ").append(toIndentedString(requestOutsidePathPrefixAction)).append("\n");
                        sb.append("    unexpectedHeaderParameterAction: ").append(toIndentedString(unexpectedHeaderParameterAction)).append("\n");
                        sb.append("    unexpectedQueryArgumentAction: ").append(toIndentedString(unexpectedQueryArgumentAction)).append("\n");
                        sb.append("    unexpectedRequestBodyParameterAction: ").append(toIndentedString(unexpectedRequestBodyParameterAction)).append("\n");
                        sb.append("    unknownContentTypeAction: ").append(toIndentedString(unknownContentTypeAction)).append("\n");
                        sb.append("    unknownHttpMethodAction: ").append(toIndentedString(unknownHttpMethodAction)).append("\n");
                        sb.append("    unknownPathAction: ").append(toIndentedString(unknownPathAction)).append("\n");
                        sb.append("    unknownResponseContentTypeAction: ").append(toIndentedString(unknownResponseContentTypeAction)).append("\n");
                        sb.append("    unknownResponseStatusCodeAction: ").append(toIndentedString(unknownResponseStatusCodeAction)).append("\n");
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
