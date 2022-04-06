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
 * The InventoryFaultConfig is a POJO class extends AviRestResource that used for creating
 * InventoryFaultConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryFaultConfig extends AviRestResource  {
    @JsonProperty("controller_faults")
    private ControllerFaults controllerFaults = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("serviceengine_faults")
    private ServiceengineFaults serviceengineFaults = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;

    @JsonProperty("virtualservice_faults")
    private VirtualserviceFaults virtualserviceFaults = null;



    /**
     * This is the getter method this will return the attribute value.
     * Configure controller faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerFaults
     */
    public ControllerFaults getControllerFaults() {
        return controllerFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Configure controller faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerFaults set the controllerFaults.
     */
    public void setControllerFaults(ControllerFaults controllerFaults) {
        this.controllerFaults = controllerFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure serviceengine faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceengineFaults
     */
    public ServiceengineFaults getServiceengineFaults() {
        return serviceengineFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Configure serviceengine faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceengineFaults set the serviceengineFaults.
     */
    public void setServiceengineFaults(ServiceengineFaults serviceengineFaults) {
        this.serviceengineFaults = serviceengineFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant.
     * It is a reference to an object of type tenant.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant.
     * It is a reference to an object of type tenant.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
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
     * Uuid auto generated.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid auto generated.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configure virtualservice faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return virtualserviceFaults
     */
    public VirtualserviceFaults getVirtualserviceFaults() {
        return virtualserviceFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Configure virtualservice faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param virtualserviceFaults set the virtualserviceFaults.
     */
    public void setVirtualserviceFaults(VirtualserviceFaults virtualserviceFaults) {
        this.virtualserviceFaults = virtualserviceFaults;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      InventoryFaultConfig objInventoryFaultConfig = (InventoryFaultConfig) o;
      return   Objects.equals(this.uuid, objInventoryFaultConfig.uuid)&&
  Objects.equals(this.name, objInventoryFaultConfig.name)&&
  Objects.equals(this.tenantRef, objInventoryFaultConfig.tenantRef)&&
  Objects.equals(this.virtualserviceFaults, objInventoryFaultConfig.virtualserviceFaults)&&
  Objects.equals(this.controllerFaults, objInventoryFaultConfig.controllerFaults)&&
  Objects.equals(this.serviceengineFaults, objInventoryFaultConfig.serviceengineFaults);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class InventoryFaultConfig {\n");
                  sb.append("    controllerFaults: ").append(toIndentedString(controllerFaults)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    serviceengineFaults: ").append(toIndentedString(serviceengineFaults)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    virtualserviceFaults: ").append(toIndentedString(virtualserviceFaults)).append("\n");
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
