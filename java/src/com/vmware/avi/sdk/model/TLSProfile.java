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
 * The TLSProfile is a POJO class extends AviRestResource that used for creating
 * TLSProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TLSProfile extends AviRestResource  {
    @JsonProperty("certificate_ref")
    private String certificateRef;

    @JsonProperty("description")
    private String description;

    @JsonProperty("name")
    private String name;

    @JsonProperty("pki_profile_ref")
    private String pkiProfileRef;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Client certificate (and private key) presented to the remote server during the tls handshake.
     * Needed when a consumer requests mtls tls_mode against this tls profile.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return certificateRef
     */
    public String getCertificateRef() {
        return certificateRef;
    }

    /**
     * This is the setter method to the attribute.
     * Client certificate (and private key) presented to the remote server during the tls handshake.
     * Needed when a consumer requests mtls tls_mode against this tls profile.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param certificateRef set the certificateRef.
     */
    public void setCertificateRef(String  certificateRef) {
        this.certificateRef = certificateRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Human-readable description for this tls profile.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Human-readable description for this tls profile.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the tls profile.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the tls profile.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pki profile containing the ca certificates used to validate the tls certificate presented by the remote server.
     * Needed when a consumer (e.g.
     * Authprofile) requests tls, mtls, or verify_only tls_mode against this tls profile.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pkiProfileRef
     */
    public String getPkiProfileRef() {
        return pkiProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Pki profile containing the ca certificates used to validate the tls certificate presented by the remote server.
     * Needed when a consumer (e.g.
     * Authprofile) requests tls, mtls, or verify_only tls_mode against this tls profile.
     * It is a reference to an object of type pkiprofile.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pkiProfileRef set the pkiProfileRef.
     */
    public void setPkiProfileRef(String  pkiProfileRef) {
        this.pkiProfileRef = pkiProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant that this object belongs to.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant that this object belongs to.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
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
     * Uuid of the tls profile.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the tls profile.
     * Field introduced in 32.2.1.
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
      TLSProfile objTLSProfile = (TLSProfile) o;
      return   Objects.equals(this.uuid, objTLSProfile.uuid)&&
  Objects.equals(this.name, objTLSProfile.name)&&
  Objects.equals(this.pkiProfileRef, objTLSProfile.pkiProfileRef)&&
  Objects.equals(this.certificateRef, objTLSProfile.certificateRef)&&
  Objects.equals(this.description, objTLSProfile.description)&&
  Objects.equals(this.tenantRef, objTLSProfile.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TLSProfile {\n");
                  sb.append("    certificateRef: ").append(toIndentedString(certificateRef)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pkiProfileRef: ").append(toIndentedString(pkiProfileRef)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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
