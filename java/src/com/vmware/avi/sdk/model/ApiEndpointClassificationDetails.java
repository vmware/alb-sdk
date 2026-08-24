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
 * The ApiEndpointClassificationDetails is a POJO class extends AviRestResource that used for creating
 * ApiEndpointClassificationDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiEndpointClassificationDetails  {
    @JsonProperty("api_classification_transition_type")
    private String apiClassificationTransitionType;

    @JsonProperty("api_endpoint")
    private String apiEndpoint;



    /**
     * This is the getter method this will return the attribute value.
     * Api classification transition type for the api endpoint.
     * Enum options - API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ORPHAN, API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ZOMBIE,
     * API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ZOMBIE,
     * API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ORPHAN.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiClassificationTransitionType
     */
    public String getApiClassificationTransitionType() {
        return apiClassificationTransitionType;
    }

    /**
     * This is the setter method to the attribute.
     * Api classification transition type for the api endpoint.
     * Enum options - API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ORPHAN, API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ZOMBIE,
     * API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ZOMBIE,
     * API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ORPHAN.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param apiClassificationTransitionType set the apiClassificationTransitionType.
     */
    public void setApiClassificationTransitionType(String  apiClassificationTransitionType) {
        this.apiClassificationTransitionType = apiClassificationTransitionType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Api endpoint classification details.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return apiEndpoint
     */
    public String getApiEndpoint() {
        return apiEndpoint;
    }

    /**
     * This is the setter method to the attribute.
     * Api endpoint classification details.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param apiEndpoint set the apiEndpoint.
     */
    public void setApiEndpoint(String  apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiEndpointClassificationDetails objApiEndpointClassificationDetails = (ApiEndpointClassificationDetails) o;
      return   Objects.equals(this.apiEndpoint, objApiEndpointClassificationDetails.apiEndpoint)&&
  Objects.equals(this.apiClassificationTransitionType, objApiEndpointClassificationDetails.apiClassificationTransitionType);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiEndpointClassificationDetails {\n");
                  sb.append("    apiClassificationTransitionType: ").append(toIndentedString(apiClassificationTransitionType)).append("\n");
                        sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
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
