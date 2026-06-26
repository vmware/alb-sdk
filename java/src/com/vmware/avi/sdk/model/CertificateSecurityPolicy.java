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
 * The CertificateSecurityPolicy is a POJO class extends AviRestResource that used for creating
 * CertificateSecurityPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CertificateSecurityPolicy  {
    @JsonProperty("blocked_certificate_signature_algorithms")
    private List<String> blockedCertificateSignatureAlgorithms;

    @JsonProperty("blocked_ocsp_request_hash_algorithms")
    private List<String> blockedOcspRequestHashAlgorithms;


    /**
     * This is the getter method this will return the attribute value.
     * Signature algorithm families whose certificates are blocked on new imports.
     * Enum options - SIGNATURE_ALGORITHM_MD5, SIGNATURE_ALGORITHM_SHA1, SIGNATURE_ALGORITHM_SHA256, SIGNATURE_ALGORITHM_SHA384,
     * SIGNATURE_ALGORITHM_SHA512, SIGNATURE_ALGORITHM_ED25519.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return blockedCertificateSignatureAlgorithms
     */
    public List<String> getBlockedCertificateSignatureAlgorithms() {
        return blockedCertificateSignatureAlgorithms;
    }

    /**
     * This is the setter method. this will set the blockedCertificateSignatureAlgorithms
     * Signature algorithm families whose certificates are blocked on new imports.
     * Enum options - SIGNATURE_ALGORITHM_MD5, SIGNATURE_ALGORITHM_SHA1, SIGNATURE_ALGORITHM_SHA256, SIGNATURE_ALGORITHM_SHA384,
     * SIGNATURE_ALGORITHM_SHA512, SIGNATURE_ALGORITHM_ED25519.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return blockedCertificateSignatureAlgorithms
     */
    public void setBlockedCertificateSignatureAlgorithms(List<String>  blockedCertificateSignatureAlgorithms) {
        this.blockedCertificateSignatureAlgorithms = blockedCertificateSignatureAlgorithms;
    }

    /**
     * This is the setter method this will set the blockedCertificateSignatureAlgorithms
     * Signature algorithm families whose certificates are blocked on new imports.
     * Enum options - SIGNATURE_ALGORITHM_MD5, SIGNATURE_ALGORITHM_SHA1, SIGNATURE_ALGORITHM_SHA256, SIGNATURE_ALGORITHM_SHA384,
     * SIGNATURE_ALGORITHM_SHA512, SIGNATURE_ALGORITHM_ED25519.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return blockedCertificateSignatureAlgorithms
     */
    public CertificateSecurityPolicy addBlockedCertificateSignatureAlgorithmsItem(String blockedCertificateSignatureAlgorithmsItem) {
      if (this.blockedCertificateSignatureAlgorithms == null) {
        this.blockedCertificateSignatureAlgorithms = new ArrayList<String>();
      }
      this.blockedCertificateSignatureAlgorithms.add(blockedCertificateSignatureAlgorithmsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Hash algorithms not allowed for ocsp requests.
     * Enum options - OCSP_HASH_SHA1, OCSP_HASH_SHA256, OCSP_HASH_SHA384, OCSP_HASH_SHA512.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return blockedOcspRequestHashAlgorithms
     */
    public List<String> getBlockedOcspRequestHashAlgorithms() {
        return blockedOcspRequestHashAlgorithms;
    }

    /**
     * This is the setter method. this will set the blockedOcspRequestHashAlgorithms
     * Hash algorithms not allowed for ocsp requests.
     * Enum options - OCSP_HASH_SHA1, OCSP_HASH_SHA256, OCSP_HASH_SHA384, OCSP_HASH_SHA512.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return blockedOcspRequestHashAlgorithms
     */
    public void setBlockedOcspRequestHashAlgorithms(List<String>  blockedOcspRequestHashAlgorithms) {
        this.blockedOcspRequestHashAlgorithms = blockedOcspRequestHashAlgorithms;
    }

    /**
     * This is the setter method this will set the blockedOcspRequestHashAlgorithms
     * Hash algorithms not allowed for ocsp requests.
     * Enum options - OCSP_HASH_SHA1, OCSP_HASH_SHA256, OCSP_HASH_SHA384, OCSP_HASH_SHA512.
     * Field introduced in 32.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return blockedOcspRequestHashAlgorithms
     */
    public CertificateSecurityPolicy addBlockedOcspRequestHashAlgorithmsItem(String blockedOcspRequestHashAlgorithmsItem) {
      if (this.blockedOcspRequestHashAlgorithms == null) {
        this.blockedOcspRequestHashAlgorithms = new ArrayList<String>();
      }
      this.blockedOcspRequestHashAlgorithms.add(blockedOcspRequestHashAlgorithmsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CertificateSecurityPolicy objCertificateSecurityPolicy = (CertificateSecurityPolicy) o;
      return   Objects.equals(this.blockedCertificateSignatureAlgorithms, objCertificateSecurityPolicy.blockedCertificateSignatureAlgorithms)&&
  Objects.equals(this.blockedOcspRequestHashAlgorithms, objCertificateSecurityPolicy.blockedOcspRequestHashAlgorithms);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CertificateSecurityPolicy {\n");
                  sb.append("    blockedCertificateSignatureAlgorithms: ").append(toIndentedString(blockedCertificateSignatureAlgorithms)).append("\n");
                        sb.append("    blockedOcspRequestHashAlgorithms: ").append(toIndentedString(blockedOcspRequestHashAlgorithms)).append("\n");
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
