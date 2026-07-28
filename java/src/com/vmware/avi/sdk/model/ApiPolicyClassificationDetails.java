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
 * The ApiPolicyClassificationDetails is a POJO class extends AviRestResource that used for creating
 * ApiPolicyClassificationDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPolicyClassificationDetails  {
    @JsonProperty("api_endpoint_classification_details")
    private List<ApiEndpointClassificationDetails> apiEndpointClassificationDetails;

    @JsonProperty("event_description")
    private String eventDescription;


    /**
     * This is the getter method this will return the attribute value.
     * Api policy classification details.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiEndpointClassificationDetails
     */
    public List<ApiEndpointClassificationDetails> getApiEndpointClassificationDetails() {
        return apiEndpointClassificationDetails;
    }

    /**
     * This is the setter method. this will set the apiEndpointClassificationDetails
     * Api policy classification details.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiEndpointClassificationDetails
     */
    public void setApiEndpointClassificationDetails(List<ApiEndpointClassificationDetails>  apiEndpointClassificationDetails) {
        this.apiEndpointClassificationDetails = apiEndpointClassificationDetails;
    }

    /**
     * This is the setter method this will set the apiEndpointClassificationDetails
     * Api policy classification details.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiEndpointClassificationDetails
     */
    public ApiPolicyClassificationDetails addApiEndpointClassificationDetailsItem(ApiEndpointClassificationDetails apiEndpointClassificationDetailsItem) {
      if (this.apiEndpointClassificationDetails == null) {
        this.apiEndpointClassificationDetails = new ArrayList<ApiEndpointClassificationDetails>();
      }
      this.apiEndpointClassificationDetails.add(apiEndpointClassificationDetailsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Event description for the api policy classification change.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventDescription
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * This is the setter method to the attribute.
     * Event description for the api policy classification change.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventDescription set the eventDescription.
     */
    public void setEventDescription(String  eventDescription) {
        this.eventDescription = eventDescription;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiPolicyClassificationDetails objApiPolicyClassificationDetails = (ApiPolicyClassificationDetails) o;
      return   Objects.equals(this.apiEndpointClassificationDetails, objApiPolicyClassificationDetails.apiEndpointClassificationDetails)&&
  Objects.equals(this.eventDescription, objApiPolicyClassificationDetails.eventDescription);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiPolicyClassificationDetails {\n");
                  sb.append("    apiEndpointClassificationDetails: ").append(toIndentedString(apiEndpointClassificationDetails)).append("\n");
                        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
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
