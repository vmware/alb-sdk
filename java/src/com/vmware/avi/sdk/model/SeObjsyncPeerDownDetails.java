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
 * The SeObjsyncPeerDownDetails is a POJO class extends AviRestResource that used for creating
 * SeObjsyncPeerDownDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeObjsyncPeerDownDetails  {
    @JsonProperty("peer_se_uuids")
    private String peerSeUuids;



    /**
     * This is the getter method this will return the attribute value.
     * Objsync peer se uuids.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return peerSeUuids
     */
    public String getPeerSeUuids() {
        return peerSeUuids;
    }

    /**
     * This is the setter method to the attribute.
     * Objsync peer se uuids.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param peerSeUuids set the peerSeUuids.
     */
    public void setPeerSeUuids(String  peerSeUuids) {
        this.peerSeUuids = peerSeUuids;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SeObjsyncPeerDownDetails objSeObjsyncPeerDownDetails = (SeObjsyncPeerDownDetails) o;
      return   Objects.equals(this.peerSeUuids, objSeObjsyncPeerDownDetails.peerSeUuids);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SeObjsyncPeerDownDetails {\n");
                  sb.append("    peerSeUuids: ").append(toIndentedString(peerSeUuids)).append("\n");
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
