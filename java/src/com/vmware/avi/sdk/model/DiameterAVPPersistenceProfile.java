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
 * The DiameterAVPPersistenceProfile is a POJO class extends AviRestResource that used for creating
 * DiameterAVPPersistenceProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiameterAVPPersistenceProfile  {
    @JsonProperty("avp_key_type")
    private String avpKeyType = "SESSION_ID";

    @JsonProperty("timeout")
    private Integer timeout;



    /**
     * This is the getter method this will return the attribute value.
     * Avpkey type.
     * Enum options - SESSION_ID, ORIGIN_HOST, ORIGIN_REALM, DESTINATION_HOST, DESTINATION_REALM, APPLICATION_ID.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SESSION_ID".
     * @return avpKeyType
     */
    public String getAvpKeyType() {
        return avpKeyType;
    }

    /**
     * This is the setter method to the attribute.
     * Avpkey type.
     * Enum options - SESSION_ID, ORIGIN_HOST, ORIGIN_REALM, DESTINATION_HOST, DESTINATION_REALM, APPLICATION_ID.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SESSION_ID".
     * @param avpKeyType set the avpKeyType.
     */
    public void setAvpKeyType(String  avpKeyType) {
        this.avpKeyType = avpKeyType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The maximum lifetime of diameter cookie.
     * No value or 'zero' indicates no timeout.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * This is the setter method to the attribute.
     * The maximum lifetime of diameter cookie.
     * No value or 'zero' indicates no timeout.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param timeout set the timeout.
     */
    public void setTimeout(Integer  timeout) {
        this.timeout = timeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DiameterAVPPersistenceProfile objDiameterAVPPersistenceProfile = (DiameterAVPPersistenceProfile) o;
      return   Objects.equals(this.timeout, objDiameterAVPPersistenceProfile.timeout)&&
  Objects.equals(this.avpKeyType, objDiameterAVPPersistenceProfile.avpKeyType);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DiameterAVPPersistenceProfile {\n");
                  sb.append("    avpKeyType: ").append(toIndentedString(avpKeyType)).append("\n");
                        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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
