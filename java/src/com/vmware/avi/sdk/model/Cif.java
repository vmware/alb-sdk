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
 * The Cif is a POJO class extends AviRestResource that used for creating
 * Cif.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cif  {
    @JsonProperty("adapter")
    private String adapter;

    @JsonProperty("cif")
    private String cif;

    @JsonProperty("mac_address")
    private String macAddress;

    @JsonProperty("resources")
    private List<String> resources;

    @JsonProperty("se_uuid")
    private String seUuid;



    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return adapter
     */
    public String getAdapter() {
        return adapter;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param adapter set the adapter.
     */
    public void setAdapter(String  adapter) {
        this.adapter = adapter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return cif
     */
    public String getCif() {
        return cif;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param cif set the cif.
     */
    public void setCif(String  cif) {
        this.cif = cif;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param macAddress set the macAddress.
     */
    public void setMacAddress(String  macAddress) {
        this.macAddress = macAddress;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return resources
     */
    public List<String> getResources() {
        return resources;
    }

    /**
     * This is the setter method. this will set the resources
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return resources
     */
    public void setResources(List<String>  resources) {
        this.resources = resources;
    }

    /**
     * This is the setter method this will set the resources
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return resources
     */
    public Cif addResourcesItem(String resourcesItem) {
      if (this.resources == null) {
        this.resources = new ArrayList<String>();
      }
      this.resources.add(resourcesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return seUuid
     */
    public String getSeUuid() {
        return seUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param seUuid set the seUuid.
     */
    public void setSeUuid(String  seUuid) {
        this.seUuid = seUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      Cif objCif = (Cif) o;
      return   Objects.equals(this.cif, objCif.cif)&&
  Objects.equals(this.seUuid, objCif.seUuid)&&
  Objects.equals(this.macAddress, objCif.macAddress)&&
  Objects.equals(this.adapter, objCif.adapter)&&
  Objects.equals(this.resources, objCif.resources);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Cif {\n");
                  sb.append("    adapter: ").append(toIndentedString(adapter)).append("\n");
                        sb.append("    cif: ").append(toIndentedString(cif)).append("\n");
                        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
                        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
                        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
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
