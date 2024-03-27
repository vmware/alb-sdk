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
 * The AuthProfile is a POJO class extends AviRestResource that used for creating
 * AuthProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthProfile extends AviRestResource  {
    @JsonProperty("description")
    private String description;

    @JsonProperty("http")
    private AuthProfileHTTPClientParams http;

    @JsonProperty("jwt_profile_ref")
    private String jwtProfileRef;

    @JsonProperty("ldap")
    private LdapAuthSettings ldap;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("oauth_profile")
    private OAuthProfile oauthProfile;

    @JsonProperty("saml")
    private SamlSettings saml;

    @JsonProperty("tacacs_plus")
    private TacacsPlusAuthSettings tacacsPlus;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("type")
    private String type;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Http user authentication params.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return http
     */
    public AuthProfileHTTPClientParams getHttp() {
        return http;
    }

    /**
     * This is the setter method to the attribute.
     * Http user authentication params.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param http set the http.
     */
    public void setHttp(AuthProfileHTTPClientParams http) {
        this.http = http;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Jwtserverprofile to be used for authentication.
     * It is a reference to an object of type jwtserverprofile.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return jwtProfileRef
     */
    public String getJwtProfileRef() {
        return jwtProfileRef;
    }

    /**
     * This is the setter method to the attribute.
     * Jwtserverprofile to be used for authentication.
     * It is a reference to an object of type jwtserverprofile.
     * Field introduced in 20.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param jwtProfileRef set the jwtProfileRef.
     */
    public void setJwtProfileRef(String  jwtProfileRef) {
        this.jwtProfileRef = jwtProfileRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ldap server and directory settings.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ldap
     */
    public LdapAuthSettings getLdap() {
        return ldap;
    }

    /**
     * This is the setter method to the attribute.
     * Ldap server and directory settings.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ldap set the ldap.
     */
    public void setLdap(LdapAuthSettings ldap) {
        this.ldap = ldap;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 20.1.6.
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
     * Field introduced in 20.1.6.
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
     * Field introduced in 20.1.6.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public AuthProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the auth profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the auth profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Oauth profile - common endpoint information.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return oauthProfile
     */
    public OAuthProfile getOauthProfile() {
        return oauthProfile;
    }

    /**
     * This is the setter method to the attribute.
     * Oauth profile - common endpoint information.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param oauthProfile set the oauthProfile.
     */
    public void setOauthProfile(OAuthProfile oauthProfile) {
        this.oauthProfile = oauthProfile;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml settings.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return saml
     */
    public SamlSettings getSaml() {
        return saml;
    }

    /**
     * This is the setter method to the attribute.
     * Saml settings.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param saml set the saml.
     */
    public void setSaml(SamlSettings saml) {
        this.saml = saml;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tacacs+ settings.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tacacsPlus
     */
    public TacacsPlusAuthSettings getTacacsPlus() {
        return tacacsPlus;
    }

    /**
     * This is the setter method to the attribute.
     * Tacacs+ settings.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tacacsPlus set the tacacsPlus.
     */
    public void setTacacsPlus(TacacsPlusAuthSettings tacacsPlus) {
        this.tacacsPlus = tacacsPlus;
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
     * Type of the auth profile.
     * Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS, AUTH_PROFILE_JWT, AUTH_PROFILE_OAUTH.
     * Allowed in enterprise edition with any value, essentials edition(allowed values-
     * auth_profile_ldap,auth_profile_tacacs_plus,auth_profile_saml,auth_profile_jwt,auth_profile_oauth), basic edition(allowed values-
     * auth_profile_ldap,auth_profile_tacacs_plus,auth_profile_saml,auth_profile_jwt,auth_profile_oauth), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Type of the auth profile.
     * Enum options - AUTH_PROFILE_LDAP, AUTH_PROFILE_TACACS_PLUS, AUTH_PROFILE_SAML, AUTH_PROFILE_PINGACCESS, AUTH_PROFILE_JWT, AUTH_PROFILE_OAUTH.
     * Allowed in enterprise edition with any value, essentials edition(allowed values-
     * auth_profile_ldap,auth_profile_tacacs_plus,auth_profile_saml,auth_profile_jwt,auth_profile_oauth), basic edition(allowed values-
     * auth_profile_ldap,auth_profile_tacacs_plus,auth_profile_saml,auth_profile_jwt,auth_profile_oauth), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
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
     * Uuid of the auth profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the auth profile.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
      AuthProfile objAuthProfile = (AuthProfile) o;
      return   Objects.equals(this.uuid, objAuthProfile.uuid)&&
  Objects.equals(this.name, objAuthProfile.name)&&
  Objects.equals(this.type, objAuthProfile.type)&&
  Objects.equals(this.ldap, objAuthProfile.ldap)&&
  Objects.equals(this.http, objAuthProfile.http)&&
  Objects.equals(this.tacacsPlus, objAuthProfile.tacacsPlus)&&
  Objects.equals(this.saml, objAuthProfile.saml)&&
  Objects.equals(this.jwtProfileRef, objAuthProfile.jwtProfileRef)&&
  Objects.equals(this.oauthProfile, objAuthProfile.oauthProfile)&&
  Objects.equals(this.markers, objAuthProfile.markers)&&
  Objects.equals(this.description, objAuthProfile.description)&&
  Objects.equals(this.tenantRef, objAuthProfile.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AuthProfile {\n");
                  sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    http: ").append(toIndentedString(http)).append("\n");
                        sb.append("    jwtProfileRef: ").append(toIndentedString(jwtProfileRef)).append("\n");
                        sb.append("    ldap: ").append(toIndentedString(ldap)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    oauthProfile: ").append(toIndentedString(oauthProfile)).append("\n");
                        sb.append("    saml: ").append(toIndentedString(saml)).append("\n");
                        sb.append("    tacacsPlus: ").append(toIndentedString(tacacsPlus)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
