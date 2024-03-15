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
 * The PKIProfile is a POJO class extends AviRestResource that used for creating
 * PKIProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PKIProfile extends AviRestResource  {
    @JsonProperty("allow_pki_errors")
    private List<String> allowPkiErrors;

    @JsonProperty("ca_certs")
    private List<SSLCertificate> caCerts;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("crl_check")
    private Boolean crlCheck = true;

    @JsonProperty("crl_file_refs")
    private List<String> crlFileRefs;

    @JsonProperty("crls")
    private List<CRL> crls;

    @JsonProperty("ignore_peer_chain")
    private Boolean ignorePeerChain;

    @JsonProperty("is_federated")
    private Boolean isFederated = false;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("validate_only_leaf_crl")
    private Boolean validateOnlyLeafCrl = true;


    /**
     * This is the getter method this will return the attribute value.
     * Exempt errors during certificate verification.
     * Enum options - ALLOW_EXPIRED_CRL, ALLOW_ALL_ERRORS.
     * Field introduced in 30.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowPkiErrors
     */
    public List<String> getAllowPkiErrors() {
        return allowPkiErrors;
    }

    /**
     * This is the setter method. this will set the allowPkiErrors
     * Exempt errors during certificate verification.
     * Enum options - ALLOW_EXPIRED_CRL, ALLOW_ALL_ERRORS.
     * Field introduced in 30.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowPkiErrors
     */
    public void setAllowPkiErrors(List<String>  allowPkiErrors) {
        this.allowPkiErrors = allowPkiErrors;
    }

    /**
     * This is the setter method this will set the allowPkiErrors
     * Exempt errors during certificate verification.
     * Enum options - ALLOW_EXPIRED_CRL, ALLOW_ALL_ERRORS.
     * Field introduced in 30.1.1.
     * Maximum of 1 items allowed.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return allowPkiErrors
     */
    public PKIProfile addAllowPkiErrorsItem(String allowPkiErrorsItem) {
      if (this.allowPkiErrors == null) {
        this.allowPkiErrors = new ArrayList<String>();
      }
      this.allowPkiErrors.add(allowPkiErrorsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of certificate authorities (root and intermediate) trusted that is used for certificate validation.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caCerts
     */
    public List<SSLCertificate> getCaCerts() {
        return caCerts;
    }

    /**
     * This is the setter method. this will set the caCerts
     * List of certificate authorities (root and intermediate) trusted that is used for certificate validation.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caCerts
     */
    public void setCaCerts(List<SSLCertificate>  caCerts) {
        this.caCerts = caCerts;
    }

    /**
     * This is the setter method this will set the caCerts
     * List of certificate authorities (root and intermediate) trusted that is used for certificate validation.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caCerts
     */
    public PKIProfile addCaCertsItem(SSLCertificate caCertsItem) {
      if (this.caCerts == null) {
        this.caCerts = new ArrayList<SSLCertificate>();
      }
      this.caCerts.add(caCertsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Creator name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This is the setter method to the attribute.
     * Creator name.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdBy set the createdBy.
     */
    public void setCreatedBy(String  createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When enabled, avi will verify via crl checks that certificates in the trust chain have not been revoked.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return crlCheck
     */
    public Boolean getCrlCheck() {
        return crlCheck;
    }

    /**
     * This is the setter method to the attribute.
     * When enabled, avi will verify via crl checks that certificates in the trust chain have not been revoked.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param crlCheck set the crlCheck.
     */
    public void setCrlCheck(Boolean  crlCheck) {
        this.crlCheck = crlCheck;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Refers to fileobject containing crl body.
     * It is a reference to an object of type fileobject.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crlFileRefs
     */
    public List<String> getCrlFileRefs() {
        return crlFileRefs;
    }

    /**
     * This is the setter method. this will set the crlFileRefs
     * Refers to fileobject containing crl body.
     * It is a reference to an object of type fileobject.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crlFileRefs
     */
    public void setCrlFileRefs(List<String>  crlFileRefs) {
        this.crlFileRefs = crlFileRefs;
    }

    /**
     * This is the setter method this will set the crlFileRefs
     * Refers to fileobject containing crl body.
     * It is a reference to an object of type fileobject.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return crlFileRefs
     */
    public PKIProfile addCrlFileRefsItem(String crlFileRefsItem) {
      if (this.crlFileRefs == null) {
        this.crlFileRefs = new ArrayList<String>();
      }
      this.crlFileRefs.add(crlFileRefsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of certificate revocation lists.this field is now represented by a file via the fileobject semantics.
     * Field deprecated in 30.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * @return crls
     */
    public List<CRL> getCrls() {
        return crls;
    }

    /**
     * This is the setter method. this will set the crls
     * List of certificate revocation lists.this field is now represented by a file via the fileobject semantics.
     * Field deprecated in 30.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * @return crls
     */
    public void setCrls(List<CRL>  crls) {
        this.crls = crls;
    }

    /**
     * This is the setter method this will set the crls
     * List of certificate revocation lists.this field is now represented by a file via the fileobject semantics.
     * Field deprecated in 30.2.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * @return crls
     */
    public PKIProfile addCrlsItem(CRL crlsItem) {
      if (this.crls == null) {
        this.crls = new ArrayList<CRL>();
      }
      this.crls.add(crlsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When enabled, avi will not trust intermediate and root certs presented by a client.
     * Instead, only the chain certs configured in the certificate authority section will be used to verify trust of the client's cert.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Special default for essentials edition is true, basic edition is true, enterprise is false.
     * @return ignorePeerChain
     */
    public Boolean getIgnorePeerChain() {
        return ignorePeerChain;
    }

    /**
     * This is the setter method to the attribute.
     * When enabled, avi will not trust intermediate and root certs presented by a client.
     * Instead, only the chain certs configured in the certificate authority section will be used to verify trust of the client's cert.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Special default for essentials edition is true, basic edition is true, enterprise is false.
     * @param ignorePeerChain set the ignorePeerChain.
     */
    public void setIgnorePeerChain(Boolean  ignorePeerChain) {
        this.ignorePeerChain = ignorePeerChain;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field describes the object's replication scope.
     * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
     * If the field is set to true, then the object is replicated across the federation.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return isFederated
     */
    public Boolean getIsFederated() {
        return isFederated;
    }

    /**
     * This is the setter method to the attribute.
     * This field describes the object's replication scope.
     * If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.
     * If the field is set to true, then the object is replicated across the federation.
     * Field introduced in 17.1.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param isFederated set the isFederated.
     */
    public void setIsFederated(Boolean  isFederated) {
        this.isFederated = isFederated;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public List<RoleFilterMatchLabel> getMarkers() {
        return markers;
    }

    /**
     * This is the setter method. this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public void setMarkers(List<RoleFilterMatchLabel>  markers) {
        this.markers = markers;
    }

    /**
     * This is the setter method this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.5.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public PKIProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the pki profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the pki profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * When enabled, avi will only validate the revocation status of the leaf certificate using crl.
     * To enable validation for the entire chain, disable this option and provide all the relevant crls.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return validateOnlyLeafCrl
     */
    public Boolean getValidateOnlyLeafCrl() {
        return validateOnlyLeafCrl;
    }

    /**
     * This is the setter method to the attribute.
     * When enabled, avi will only validate the revocation status of the leaf certificate using crl.
     * To enable validation for the entire chain, disable this option and provide all the relevant crls.
     * Allowed in enterprise edition with any value, essentials edition(allowed values- true), basic edition(allowed values- true), enterprise with
     * cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param validateOnlyLeafCrl set the validateOnlyLeafCrl.
     */
    public void setValidateOnlyLeafCrl(Boolean  validateOnlyLeafCrl) {
        this.validateOnlyLeafCrl = validateOnlyLeafCrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PKIProfile objPKIProfile = (PKIProfile) o;
      return   Objects.equals(this.uuid, objPKIProfile.uuid)&&
  Objects.equals(this.name, objPKIProfile.name)&&
  Objects.equals(this.caCerts, objPKIProfile.caCerts)&&
  Objects.equals(this.crls, objPKIProfile.crls)&&
  Objects.equals(this.ignorePeerChain, objPKIProfile.ignorePeerChain)&&
  Objects.equals(this.crlCheck, objPKIProfile.crlCheck)&&
  Objects.equals(this.validateOnlyLeafCrl, objPKIProfile.validateOnlyLeafCrl)&&
  Objects.equals(this.createdBy, objPKIProfile.createdBy)&&
  Objects.equals(this.markers, objPKIProfile.markers)&&
  Objects.equals(this.crlFileRefs, objPKIProfile.crlFileRefs)&&
  Objects.equals(this.isFederated, objPKIProfile.isFederated)&&
  Objects.equals(this.tenantRef, objPKIProfile.tenantRef)&&
  Objects.equals(this.allowPkiErrors, objPKIProfile.allowPkiErrors);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PKIProfile {\n");
                  sb.append("    allowPkiErrors: ").append(toIndentedString(allowPkiErrors)).append("\n");
                        sb.append("    caCerts: ").append(toIndentedString(caCerts)).append("\n");
                        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
                        sb.append("    crlCheck: ").append(toIndentedString(crlCheck)).append("\n");
                        sb.append("    crlFileRefs: ").append(toIndentedString(crlFileRefs)).append("\n");
                        sb.append("    crls: ").append(toIndentedString(crls)).append("\n");
                        sb.append("    ignorePeerChain: ").append(toIndentedString(ignorePeerChain)).append("\n");
                        sb.append("    isFederated: ").append(toIndentedString(isFederated)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    validateOnlyLeafCrl: ").append(toIndentedString(validateOnlyLeafCrl)).append("\n");
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
