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
 * The SeGroupInfo is a POJO class extends AviRestResource that used for creating
 * SeGroupInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeGroupInfo extends AviRestResource  {
    @JsonProperty("consumed")
    private Float consumed;

    @JsonProperty("escrow")
    private Float escrow;

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * License cores consumed by se group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return consumed
     */
    public Float getConsumed() {
        return consumed;
    }

    /**
     * This is the setter method to the attribute.
     * License cores consumed by se group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param consumed set the consumed.
     */
    public void setConsumed(Float  consumed) {
        this.consumed = consumed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License cores reserved by se group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return escrow
     */
    public Float getEscrow() {
        return escrow;
    }

    /**
     * This is the setter method to the attribute.
     * License cores reserved by se group.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param escrow set the escrow.
     */
    public void setEscrow(Float  escrow) {
        this.escrow = escrow;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se group uuid for reference.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Se group uuid for reference.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeGroupInfo objSeGroupInfo = (SeGroupInfo) o;
      return   Objects.equals(this.uuid, objSeGroupInfo.uuid)&&
  Objects.equals(this.consumed, objSeGroupInfo.consumed)&&
  Objects.equals(this.escrow, objSeGroupInfo.escrow);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeGroupInfo {\n");
                  sb.append("    consumed: ").append(toIndentedString(consumed)).append("\n");
                        sb.append("    escrow: ").append(toIndentedString(escrow)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
