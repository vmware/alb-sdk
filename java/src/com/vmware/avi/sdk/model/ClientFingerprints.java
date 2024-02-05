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
 * The ClientFingerprints is a POJO class extends AviRestResource that used for creating
 * ClientFingerprints.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClientFingerprints  {
    @JsonProperty("filtered_tls_fingerprint")
    private String filteredTlsFingerprint;

    @JsonProperty("full_tls_fingerprint")
    private String fullTlsFingerprint;

    @JsonProperty("normalized_tls_fingerprint")
    private String normalizedTlsFingerprint;

    @JsonProperty("tls_client_info")
    private TlsClientInfo tlsClientInfo;



    /**
     * This is the getter method this will return the attribute value.
     * Message digest (md5) of filtered ja3 from clienthello.
     * This can deviate from 'tls_fingerprint' because not all extensions are considered.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return filteredTlsFingerprint
     */
    public String getFilteredTlsFingerprint() {
        return filteredTlsFingerprint;
    }

    /**
     * This is the setter method to the attribute.
     * Message digest (md5) of filtered ja3 from clienthello.
     * This can deviate from 'tls_fingerprint' because not all extensions are considered.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param filteredTlsFingerprint set the filteredTlsFingerprint.
     */
    public void setFilteredTlsFingerprint(String  filteredTlsFingerprint) {
        this.filteredTlsFingerprint = filteredTlsFingerprint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Message digest (md5) of ja3 from clienthello.
     * Only present if the full tls fingerprint is different from the filtered fingerprint.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fullTlsFingerprint
     */
    public String getFullTlsFingerprint() {
        return fullTlsFingerprint;
    }

    /**
     * This is the setter method to the attribute.
     * Message digest (md5) of ja3 from clienthello.
     * Only present if the full tls fingerprint is different from the filtered fingerprint.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fullTlsFingerprint set the fullTlsFingerprint.
     */
    public void setFullTlsFingerprint(String  fullTlsFingerprint) {
        this.fullTlsFingerprint = fullTlsFingerprint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Message digest (md5) of normalized ja3 from clienthello.
     * This can deviate from 'full_tls_fingerprint' because extensions 21 and 35 are removed and the remaining values are sorted numerically before the
     * md5 is calculated.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return normalizedTlsFingerprint
     */
    public String getNormalizedTlsFingerprint() {
        return normalizedTlsFingerprint;
    }

    /**
     * This is the setter method to the attribute.
     * Message digest (md5) of normalized ja3 from clienthello.
     * This can deviate from 'full_tls_fingerprint' because extensions 21 and 35 are removed and the remaining values are sorted numerically before the
     * md5 is calculated.
     * Field introduced in 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param normalizedTlsFingerprint set the normalizedTlsFingerprint.
     */
    public void setNormalizedTlsFingerprint(String  normalizedTlsFingerprint) {
        this.normalizedTlsFingerprint = normalizedTlsFingerprint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Values of selected fields from the clienthello.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tlsClientInfo set the tlsClientInfo.
     */
    public void setTlsClientInfo(TlsClientInfo tlsClientInfo) {
        this.tlsClientInfo = tlsClientInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClientFingerprints objClientFingerprints = (ClientFingerprints) o;
      return   Objects.equals(this.tlsClientInfo, objClientFingerprints.tlsClientInfo)&&
  Objects.equals(this.fullTlsFingerprint, objClientFingerprints.fullTlsFingerprint)&&
  Objects.equals(this.filteredTlsFingerprint, objClientFingerprints.filteredTlsFingerprint)&&
  Objects.equals(this.normalizedTlsFingerprint, objClientFingerprints.normalizedTlsFingerprint);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClientFingerprints {\n");
                  sb.append("    filteredTlsFingerprint: ").append(toIndentedString(filteredTlsFingerprint)).append("\n");
                        sb.append("    fullTlsFingerprint: ").append(toIndentedString(fullTlsFingerprint)).append("\n");
                        sb.append("    normalizedTlsFingerprint: ").append(toIndentedString(normalizedTlsFingerprint)).append("\n");
                        sb.append("    tlsClientInfo: ").append(toIndentedString(tlsClientInfo)).append("\n");
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
