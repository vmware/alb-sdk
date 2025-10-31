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
 * The CertJwtStore is a POJO class extends AviRestResource that used for creating
 * CertJwtStore.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CertJwtStore extends AviRestResource  {
    @JsonProperty("jwt")
    private String jwt;

    @JsonProperty("kid")
    private String kid;

    @JsonProperty("last_rotated_at")
    private TimeStamp lastRotatedAt;

    @JsonProperty("public_key_algorithm")
    private String publicKeyAlgorithm;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Jwt containing current portal certificate along with the full certificate bundle chain, signed by the private key of previous portal certificate.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return jwt
     */
    public String getJwt() {
        return jwt;
    }

    /**
     * This is the setter method to the attribute.
     * Jwt containing current portal certificate along with the full certificate bundle chain, signed by the private key of previous portal certificate.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param jwt set the jwt.
     */
    public void setJwt(String  jwt) {
        this.jwt = jwt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sha256 thumbprint of the previous old portal certificate.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return kid
     */
    public String getKid() {
        return kid;
    }

    /**
     * This is the setter method to the attribute.
     * Sha256 thumbprint of the previous old portal certificate.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param kid set the kid.
     */
    public void setKid(String  kid) {
        this.kid = kid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp of certificate rotation.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastRotatedAt
     */
    public TimeStamp getLastRotatedAt() {
        return lastRotatedAt;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp of certificate rotation.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastRotatedAt set the lastRotatedAt.
     */
    public void setLastRotatedAt(TimeStamp lastRotatedAt) {
        this.lastRotatedAt = lastRotatedAt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Public key algorithm.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return publicKeyAlgorithm
     */
    public String getPublicKeyAlgorithm() {
        return publicKeyAlgorithm;
    }

    /**
     * This is the setter method to the attribute.
     * Public key algorithm.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param publicKeyAlgorithm set the publicKeyAlgorithm.
     */
    public void setPublicKeyAlgorithm(String  publicKeyAlgorithm) {
        this.publicKeyAlgorithm = publicKeyAlgorithm;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of jwt.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of jwt.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
      CertJwtStore objCertJwtStore = (CertJwtStore) o;
      return   Objects.equals(this.uuid, objCertJwtStore.uuid)&&
  Objects.equals(this.kid, objCertJwtStore.kid)&&
  Objects.equals(this.jwt, objCertJwtStore.jwt)&&
  Objects.equals(this.publicKeyAlgorithm, objCertJwtStore.publicKeyAlgorithm)&&
  Objects.equals(this.lastRotatedAt, objCertJwtStore.lastRotatedAt);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CertJwtStore {\n");
                  sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
                        sb.append("    kid: ").append(toIndentedString(kid)).append("\n");
                        sb.append("    lastRotatedAt: ").append(toIndentedString(lastRotatedAt)).append("\n");
                        sb.append("    publicKeyAlgorithm: ").append(toIndentedString(publicKeyAlgorithm)).append("\n");
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
