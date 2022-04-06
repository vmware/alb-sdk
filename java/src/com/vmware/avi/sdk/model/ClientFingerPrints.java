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
 * The ClientFingerPrints is a POJO class extends AviRestResource that used for creating
 * ClientFingerPrints.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientFingerPrints  {
    @JsonProperty("tls_client_info")
    private TlsClientInfo tlsClientInfo = null;

    @JsonProperty("tls_fingerprint")
    private String tlsFingerprint = null;



    /**
     * This is the getter method this will return the attribute value.
     * Values of selected fields from the clienthello.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tlsClientInfo
     */
    public TlsClientInfo getTlsClientInfo() {
        return tlsClientInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Values of selected fields from the clienthello.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tlsClientInfo set the tlsClientInfo.
     */
    public void setTlsClientInfo(TlsClientInfo tlsClientInfo) {
        this.tlsClientInfo = tlsClientInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Message digest (md5) of ja3 from client hello.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tlsFingerprint
     */
    public String getTlsFingerprint() {
        return tlsFingerprint;
    }

    /**
     * This is the setter method to the attribute.
     * Message digest (md5) of ja3 from client hello.
     * Field introduced in 22.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tlsFingerprint set the tlsFingerprint.
     */
    public void setTlsFingerprint(String  tlsFingerprint) {
        this.tlsFingerprint = tlsFingerprint;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClientFingerPrints objClientFingerPrints = (ClientFingerPrints) o;
      return   Objects.equals(this.tlsClientInfo, objClientFingerPrints.tlsClientInfo)&&
  Objects.equals(this.tlsFingerprint, objClientFingerPrints.tlsFingerprint);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClientFingerPrints {\n");
                  sb.append("    tlsClientInfo: ").append(toIndentedString(tlsClientInfo)).append("\n");
                        sb.append("    tlsFingerprint: ").append(toIndentedString(tlsFingerprint)).append("\n");
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
