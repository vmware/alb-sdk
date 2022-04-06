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
 * The HorizonProfile is a POJO class extends AviRestResource that used for creating
 * HorizonProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HorizonProfile  {
    @JsonProperty("blast_port")
    private Integer blastPort = 8443;

    @JsonProperty("pcoip_port")
    private Integer pcoipPort = 4172;



    /**
     * This is the getter method this will return the attribute value.
     * Horizon blast port of the uag server.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8443.
     * @return blastPort
     */
    public Integer getBlastPort() {
        return blastPort;
    }

    /**
     * This is the setter method to the attribute.
     * Horizon blast port of the uag server.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8443.
     * @param blastPort set the blastPort.
     */
    public void setBlastPort(Integer  blastPort) {
        this.blastPort = blastPort;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Horizon pcoip port of the uag server.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4172.
     * @return pcoipPort
     */
    public Integer getPcoipPort() {
        return pcoipPort;
    }

    /**
     * This is the setter method to the attribute.
     * Horizon pcoip port of the uag server.
     * Field introduced in 21.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4172.
     * @param pcoipPort set the pcoipPort.
     */
    public void setPcoipPort(Integer  pcoipPort) {
        this.pcoipPort = pcoipPort;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      HorizonProfile objHorizonProfile = (HorizonProfile) o;
      return   Objects.equals(this.blastPort, objHorizonProfile.blastPort)&&
  Objects.equals(this.pcoipPort, objHorizonProfile.pcoipPort);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class HorizonProfile {\n");
                  sb.append("    blastPort: ").append(toIndentedString(blastPort)).append("\n");
                        sb.append("    pcoipPort: ").append(toIndentedString(pcoipPort)).append("\n");
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
