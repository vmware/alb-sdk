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
 * The SAMLSPConfig is a POJO class extends AviRestResource that used for creating
 * SAMLSPConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SAMLSPConfig  {
    @JsonProperty("acs_index")
    private Integer acsIndex = 0;

    @JsonProperty("authn_req_acs_type")
    private String authnReqAcsType = "SAML_AUTHN_REQ_ACS_TYPE_NONE";

    @JsonProperty("cookie_name")
    private String cookieName = null;

    @JsonProperty("cookie_timeout")
    private Integer cookieTimeout = 60;

    @JsonProperty("entity_id")
    private String entityId = null;

    @JsonProperty("key")
    private List<HttpCookiePersistenceKey> key = null;

    @JsonProperty("signing_ssl_key_and_certificate_ref")
    private String signingSslKeyAndCertificateRef = null;

    @JsonProperty("single_signon_url")
    private String singleSignonUrl = null;

    @JsonProperty("sp_metadata")
    private String spMetadata;

    @JsonProperty("use_idp_session_timeout")
    private Boolean useIdpSessionTimeout = null;



    /**
     * This is the getter method this will return the attribute value.
     * Index to be used in the assertionconsumerserviceindex attribute of the authentication request, if the authn_req_acs_type is set to use
     * assertionconsumerserviceindex.
     * Allowed values are 0-64.
     * Field introduced in 21.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return acsIndex
     */
    public Integer getAcsIndex() {
        return acsIndex;
    }

    /**
     * This is the setter method to the attribute.
     * Index to be used in the assertionconsumerserviceindex attribute of the authentication request, if the authn_req_acs_type is set to use
     * assertionconsumerserviceindex.
     * Allowed values are 0-64.
     * Field introduced in 21.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param acsIndex set the acsIndex.
     */
    public void setAcsIndex(Integer  acsIndex) {
        this.acsIndex = acsIndex;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Option to set the acs attributes in the authnrequest.
     * Enum options - SAML_AUTHN_REQ_ACS_TYPE_URL, SAML_AUTHN_REQ_ACS_TYPE_INDEX, SAML_AUTHN_REQ_ACS_TYPE_NONE.
     * Field introduced in 21.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SAML_AUTHN_REQ_ACS_TYPE_NONE".
     * @return authnReqAcsType
     */
    public String getAuthnReqAcsType() {
        return authnReqAcsType;
    }

    /**
     * This is the setter method to the attribute.
     * Option to set the acs attributes in the authnrequest.
     * Enum options - SAML_AUTHN_REQ_ACS_TYPE_URL, SAML_AUTHN_REQ_ACS_TYPE_INDEX, SAML_AUTHN_REQ_ACS_TYPE_NONE.
     * Field introduced in 21.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SAML_AUTHN_REQ_ACS_TYPE_NONE".
     * @param authnReqAcsType set the authnReqAcsType.
     */
    public void setAuthnReqAcsType(String  authnReqAcsType) {
        this.authnReqAcsType = authnReqAcsType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http cookie name for authenticated session.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cookieName
     */
    public String getCookieName() {
        return cookieName;
    }

    /**
     * This is the setter method to the attribute.
     * Http cookie name for authenticated session.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cookieName set the cookieName.
     */
    public void setCookieName(String  cookieName) {
        this.cookieName = cookieName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cookie timeout in minutes.
     * Allowed values are 1-1440.
     * Field introduced in 18.2.3.
     * Unit is min.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return cookieTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Cookie timeout in minutes.
     * Allowed values are 1-1440.
     * Field introduced in 18.2.3.
     * Unit is min.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param cookieTimeout set the cookieTimeout.
     */
    public void setCookieTimeout(Integer  cookieTimeout) {
        this.cookieTimeout = cookieTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Globally unique saml entityid for this node.
     * The saml application entity id on the idp should match this.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    /**
     * This is the setter method to the attribute.
     * Globally unique saml entityid for this node.
     * The saml application entity id on the idp should match this.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param entityId set the entityId.
     */
    public void setEntityId(String  entityId) {
        this.entityId = entityId;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Key to generate the cookie.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return key
     */
    public List<HttpCookiePersistenceKey> getKey() {
        return key;
    }

    /**
     * This is the setter method. this will set the key
     * Key to generate the cookie.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return key
     */
    public void setKey(List<HttpCookiePersistenceKey>  key) {
        this.key = key;
    }

    /**
     * This is the setter method this will set the key
     * Key to generate the cookie.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return key
     */
    public SAMLSPConfig addKeyItem(HttpCookiePersistenceKey keyItem) {
      if (this.key == null) {
        this.key = new ArrayList<HttpCookiePersistenceKey>();
      }
      this.key.add(keyItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sp will use this ssl certificate to sign requests going to the idp and decrypt the assertions coming from idp.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return signingSslKeyAndCertificateRef
     */
    public String getSigningSslKeyAndCertificateRef() {
        return signingSslKeyAndCertificateRef;
    }

    /**
     * This is the setter method to the attribute.
     * Sp will use this ssl certificate to sign requests going to the idp and decrypt the assertions coming from idp.
     * It is a reference to an object of type sslkeyandcertificate.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param signingSslKeyAndCertificateRef set the signingSslKeyAndCertificateRef.
     */
    public void setSigningSslKeyAndCertificateRef(String  signingSslKeyAndCertificateRef) {
        this.signingSslKeyAndCertificateRef = signingSslKeyAndCertificateRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml single signon endpoint to receive the authentication response.
     * This also specifies the destination endpoint to be configured for this application on the idp.
     * If the authn_req_acs_type is set to 'use assertionconsumerserviceurl', this endpoint will be sent in the assertionconsumerserviceurl attribute of
     * the authentication request.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return singleSignonUrl
     */
    public String getSingleSignonUrl() {
        return singleSignonUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Saml single signon endpoint to receive the authentication response.
     * This also specifies the destination endpoint to be configured for this application on the idp.
     * If the authn_req_acs_type is set to 'use assertionconsumerserviceurl', this endpoint will be sent in the assertionconsumerserviceurl attribute of
     * the authentication request.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param singleSignonUrl set the singleSignonUrl.
     */
    public void setSingleSignonUrl(String  singleSignonUrl) {
        this.singleSignonUrl = singleSignonUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml sp metadata for this application.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return spMetadata
     */
    public String getSpMetadata() {
        return spMetadata;
    }

    /**
     * This is the setter method to the attribute.
     * Saml sp metadata for this application.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @param spMetadata set the spMetadata.
     */
    public void setSpMetadata(String  spMetadata) {
        this.spMetadata = spMetadata;
    }

    /**
     * This is the getter method this will return the attribute value.
     * By enabling this field idp can control how long the sp session can exist through the sessionnotonorafter field in the authnstatement of saml
     * response.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return useIdpSessionTimeout
     */
    public Boolean getUseIdpSessionTimeout() {
        return useIdpSessionTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * By enabling this field idp can control how long the sp session can exist through the sessionnotonorafter field in the authnstatement of saml
     * response.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param useIdpSessionTimeout set the useIdpSessionTimeout.
     */
    public void setUseIdpSessionTimeout(Boolean  useIdpSessionTimeout) {
        this.useIdpSessionTimeout = useIdpSessionTimeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SAMLSPConfig objSAMLSPConfig = (SAMLSPConfig) o;
      return   Objects.equals(this.entityId, objSAMLSPConfig.entityId)&&
  Objects.equals(this.singleSignonUrl, objSAMLSPConfig.singleSignonUrl)&&
  Objects.equals(this.spMetadata, objSAMLSPConfig.spMetadata)&&
  Objects.equals(this.key, objSAMLSPConfig.key)&&
  Objects.equals(this.cookieTimeout, objSAMLSPConfig.cookieTimeout)&&
  Objects.equals(this.cookieName, objSAMLSPConfig.cookieName)&&
  Objects.equals(this.signingSslKeyAndCertificateRef, objSAMLSPConfig.signingSslKeyAndCertificateRef)&&
  Objects.equals(this.useIdpSessionTimeout, objSAMLSPConfig.useIdpSessionTimeout)&&
  Objects.equals(this.authnReqAcsType, objSAMLSPConfig.authnReqAcsType)&&
  Objects.equals(this.acsIndex, objSAMLSPConfig.acsIndex);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SAMLSPConfig {\n");
                  sb.append("    acsIndex: ").append(toIndentedString(acsIndex)).append("\n");
                        sb.append("    authnReqAcsType: ").append(toIndentedString(authnReqAcsType)).append("\n");
                        sb.append("    cookieName: ").append(toIndentedString(cookieName)).append("\n");
                        sb.append("    cookieTimeout: ").append(toIndentedString(cookieTimeout)).append("\n");
                        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
                        sb.append("    key: ").append(toIndentedString(key)).append("\n");
                        sb.append("    signingSslKeyAndCertificateRef: ").append(toIndentedString(signingSslKeyAndCertificateRef)).append("\n");
                        sb.append("    singleSignonUrl: ").append(toIndentedString(singleSignonUrl)).append("\n");
                        sb.append("    spMetadata: ").append(toIndentedString(spMetadata)).append("\n");
                        sb.append("    useIdpSessionTimeout: ").append(toIndentedString(useIdpSessionTimeout)).append("\n");
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
