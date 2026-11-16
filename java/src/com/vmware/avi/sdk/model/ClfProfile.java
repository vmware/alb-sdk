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
 * The ClfProfile is a POJO class extends AviRestResource that used for creating
 * ClfProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ClfProfile extends AviRestResource  {
    @JsonProperty("clf_pools")
    private List<ClfPool> clfPools;

    @JsonProperty("description")
    private String description;

    @JsonProperty("enabled")
    private Boolean enabled = true;

    @JsonProperty("markers")
    private List<RoleFilterMatchLabel> markers;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("use_management")
    private Boolean useManagement = false;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vrf_context_ref")
    private String vrfContextRef;


    /**
     * This is the getter method this will return the attribute value.
     * List of pools associated with this profile (1 to 8).
     * Each pool must have a unique priority value.
     * The controller rejects profiles where two pools share the same priority (http 400).
     * Field introduced in 32.1.5.
     * Minimum of 1 items required.
     * Maximum of 8 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clfPools
     */
    public List<ClfPool> getClfPools() {
        return clfPools;
    }

    /**
     * This is the setter method. this will set the clfPools
     * List of pools associated with this profile (1 to 8).
     * Each pool must have a unique priority value.
     * The controller rejects profiles where two pools share the same priority (http 400).
     * Field introduced in 32.1.5.
     * Minimum of 1 items required.
     * Maximum of 8 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clfPools
     */
    public void setClfPools(List<ClfPool>  clfPools) {
        this.clfPools = clfPools;
    }

    /**
     * This is the setter method this will set the clfPools
     * List of pools associated with this profile (1 to 8).
     * Each pool must have a unique priority value.
     * The controller rejects profiles where two pools share the same priority (http 400).
     * Field introduced in 32.1.5.
     * Minimum of 1 items required.
     * Maximum of 8 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clfPools
     */
    public ClfProfile addClfPoolsItem(ClfPool clfPoolsItem) {
      if (this.clfPools == null) {
        this.clfPools = new ArrayList<ClfPool>();
      }
      this.clfPools.add(clfPoolsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Human-readable description for this clf profile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Human-readable description for this clf profile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable or disable log delivery for this profile without disturbing pool state, health monitors, or virtualservice/datascriptset bindings.
     * When false, datascript log forwarding is a silent no-op for every vs attached via this profile; delivery resumes immediately when set back to
     * true.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enable or disable log delivery for this profile without disturbing pool state, health monitors, or virtualservice/datascriptset bindings.
     * When false, datascript log forwarding is a silent no-op for every vs attached via this profile; delivery resumes immediately when set back to
     * true.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of labels to be used for granular rbac.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public List<RoleFilterMatchLabel> getMarkers() {
        return markers;
    }

    /**
     * This is the setter method. this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public void setMarkers(List<RoleFilterMatchLabel>  markers) {
        this.markers = markers;
    }

    /**
     * This is the setter method this will set the markers
     * List of labels to be used for granular rbac.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return markers
     */
    public ClfProfile addMarkersItem(RoleFilterMatchLabel markersItem) {
      if (this.markers == null) {
        this.markers = new ArrayList<RoleFilterMatchLabel>();
      }
      this.markers.add(markersItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the clf profile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the clf profile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reference to the tenant that owns this clf profile.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Reference to the tenant that owns this clf profile.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.1.5.
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
     * When true, log forwarding traffic for this profile is sent through the service engine management interface in the management vrf instead of the
     * data interfaces in the profile's vrf context.
     * Health monitors cannot be configured on any pool of a profile with this knob enabled, and the knob cannot be enabled while any pool has health
     * monitors; remove them first.
     * Cannot be changed after the profile is created.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return useManagement
     */
    public Boolean getUseManagement() {
        return useManagement;
    }

    /**
     * This is the setter method to the attribute.
     * When true, log forwarding traffic for this profile is sent through the service engine management interface in the management vrf instead of the
     * data interfaces in the profile's vrf context.
     * Health monitors cannot be configured on any pool of a profile with this knob enabled, and the knob cannot be enabled while any pool has health
     * monitors; remove them first.
     * Cannot be changed after the profile is created.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param useManagement set the useManagement.
     */
    public void setUseManagement(Boolean  useManagement) {
        this.useManagement = useManagement;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the clf profile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the clf profile.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Virtual routing context for this profile's collector pools.
     * Only virtual services in the same virtual routing context can use this profile.
     * Cannot be changed once set.
     * It is a reference to an object of type vrfcontext.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vrfContextRef
     */
    public String getVrfContextRef() {
        return vrfContextRef;
    }

    /**
     * This is the setter method to the attribute.
     * Virtual routing context for this profile's collector pools.
     * Only virtual services in the same virtual routing context can use this profile.
     * Cannot be changed once set.
     * It is a reference to an object of type vrfcontext.
     * Field introduced in 32.1.5.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vrfContextRef set the vrfContextRef.
     */
    public void setVrfContextRef(String  vrfContextRef) {
        this.vrfContextRef = vrfContextRef;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ClfProfile objClfProfile = (ClfProfile) o;
      return   Objects.equals(this.uuid, objClfProfile.uuid)&&
  Objects.equals(this.name, objClfProfile.name)&&
  Objects.equals(this.description, objClfProfile.description)&&
  Objects.equals(this.clfPools, objClfProfile.clfPools)&&
  Objects.equals(this.vrfContextRef, objClfProfile.vrfContextRef)&&
  Objects.equals(this.enabled, objClfProfile.enabled)&&
  Objects.equals(this.useManagement, objClfProfile.useManagement)&&
  Objects.equals(this.markers, objClfProfile.markers)&&
  Objects.equals(this.tenantRef, objClfProfile.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ClfProfile {\n");
                  sb.append("    clfPools: ").append(toIndentedString(clfPools)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    markers: ").append(toIndentedString(markers)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    useManagement: ").append(toIndentedString(useManagement)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vrfContextRef: ").append(toIndentedString(vrfContextRef)).append("\n");
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
