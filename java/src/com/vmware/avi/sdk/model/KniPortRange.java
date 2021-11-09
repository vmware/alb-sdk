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
 * The KniPortRange is a POJO class extends AviRestResource that used for creating
 * KniPortRange.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class KniPortRange  {
    @JsonProperty("protocol")
    private String protocol = null;

    @JsonProperty("range")
    private PortRange range = null;



    /**
     * This is the getter method this will return the attribute value.
     * Protocol associated with port range.
     * Enum options - KNI_PROTO_TCP, KNI_PROTO_UDP.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * This is the setter method to the attribute.
     * Protocol associated with port range.
     * Enum options - KNI_PROTO_TCP, KNI_PROTO_UDP.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param protocol set the protocol.
     */
    public void setProtocol(String  protocol) {
        this.protocol = protocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Port range to be allowed to kni.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return range
     */
    public PortRange getRange() {
        return range;
    }

    /**
     * This is the setter method to the attribute.
     * Port range to be allowed to kni.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param range set the range.
     */
    public void setRange(PortRange range) {
        this.range = range;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      KniPortRange objKniPortRange = (KniPortRange) o;
      return   Objects.equals(this.range, objKniPortRange.range)&&
  Objects.equals(this.protocol, objKniPortRange.protocol);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class KniPortRange {\n");
                  sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
                        sb.append("    range: ").append(toIndentedString(range)).append("\n");
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
