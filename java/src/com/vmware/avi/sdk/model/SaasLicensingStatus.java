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
 * The SaasLicensingStatus is a POJO class extends AviRestResource that used for creating
 * SaasLicensingStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaasLicensingStatus  {
    @JsonProperty("connected")
    private Boolean connected = null;

    @JsonProperty("enabled")
    private Boolean enabled = null;

    @JsonProperty("message")
    private String message = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("reserve_service_units")
    private Float reserveServiceUnits = null;



    /**
     * This is the getter method this will return the attribute value.
     * Portal connectivity status.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connected
     */
    public Boolean getConnected() {
        return connected;
    }

    /**
     * This is the setter method to the attribute.
     * Portal connectivity status.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connected set the connected.
     */
    public void setConnected(Boolean  connected) {
        this.connected = connected;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status of saas licensing subscription.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Status of saas licensing subscription.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Message.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * This is the setter method to the attribute.
     * Message.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param message set the message.
     */
    public void setMessage(String  message) {
        this.message = message;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service units reserved on controller.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reserveServiceUnits
     */
    public Float getReserveServiceUnits() {
        return reserveServiceUnits;
    }

    /**
     * This is the setter method to the attribute.
     * Service units reserved on controller.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reserveServiceUnits set the reserveServiceUnits.
     */
    public void setReserveServiceUnits(Float  reserveServiceUnits) {
        this.reserveServiceUnits = reserveServiceUnits;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SaasLicensingStatus objSaasLicensingStatus = (SaasLicensingStatus) o;
      return   Objects.equals(this.name, objSaasLicensingStatus.name)&&
  Objects.equals(this.enabled, objSaasLicensingStatus.enabled)&&
  Objects.equals(this.reserveServiceUnits, objSaasLicensingStatus.reserveServiceUnits)&&
  Objects.equals(this.connected, objSaasLicensingStatus.connected)&&
  Objects.equals(this.message, objSaasLicensingStatus.message);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SaasLicensingStatus {\n");
                  sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
                        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    message: ").append(toIndentedString(message)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    reserveServiceUnits: ").append(toIndentedString(reserveServiceUnits)).append("\n");
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
