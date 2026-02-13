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
 * The SCFaultOptions is a POJO class extends AviRestResource that used for creating
 * SCFaultOptions.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SCFaultOptions  {
    @JsonProperty("delay_create")
    private Integer delayCreate;

    @JsonProperty("delay_delete")
    private Integer delayDelete;

    @JsonProperty("delay_update")
    private Integer delayUpdate;

    @JsonProperty("fault_type")
    private String faultType;

    @JsonProperty("obj")
    private String obj;

    @JsonProperty("object_type")
    private String objectType;

    @JsonProperty("se")
    private String se;



    /**
     * This is the getter method this will return the attribute value.
     * Delay create in config path (seconds).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return delayCreate
     */
    public Integer getDelayCreate() {
        return delayCreate;
    }

    /**
     * This is the setter method to the attribute.
     * Delay create in config path (seconds).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param delayCreate set the delayCreate.
     */
    public void setDelayCreate(Integer  delayCreate) {
        this.delayCreate = delayCreate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Delay deletes in config, se paths (seconds).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return delayDelete
     */
    public Integer getDelayDelete() {
        return delayDelete;
    }

    /**
     * This is the setter method to the attribute.
     * Delay deletes in config, se paths (seconds).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param delayDelete set the delayDelete.
     */
    public void setDelayDelete(Integer  delayDelete) {
        this.delayDelete = delayDelete;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Delay updates in resmgr, config, se paths (seconds).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return delayUpdate
     */
    public Integer getDelayUpdate() {
        return delayUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * Delay updates in resmgr, config, se paths (seconds).
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param delayUpdate set the delayUpdate.
     */
    public void setDelayUpdate(Integer  delayUpdate) {
        this.delayUpdate = delayUpdate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of fault to injection.
     * Enum options - DELAY_NOTIF, DELAY_SE, DELAY_RM.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return faultType
     */
    public String getFaultType() {
        return faultType;
    }

    /**
     * This is the setter method to the attribute.
     * Type of fault to injection.
     * Enum options - DELAY_NOTIF, DELAY_SE, DELAY_RM.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param faultType set the faultType.
     */
    public void setFaultType(String  faultType) {
        this.faultType = faultType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Introduce faults for specific object uuid.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return obj
     */
    public String getObj() {
        return obj;
    }

    /**
     * This is the setter method to the attribute.
     * Introduce faults for specific object uuid.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param obj set the obj.
     */
    public void setObj(String  obj) {
        this.obj = obj;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Introduce faults for objects of specified type.
     * Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP,
     * STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT,
     * PKIPROFILE, AUTHPROFILE, CLOUD...
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objectType
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * This is the setter method to the attribute.
     * Introduce faults for objects of specified type.
     * Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP,
     * STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT,
     * PKIPROFILE, AUTHPROFILE, CLOUD...
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objectType set the objectType.
     */
    public void setObjectType(String  objectType) {
        this.objectType = objectType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Introduce faults in se path of specific se uuid.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return se
     */
    public String getSe() {
        return se;
    }

    /**
     * This is the setter method to the attribute.
     * Introduce faults in se path of specific se uuid.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param se set the se.
     */
    public void setSe(String  se) {
        this.se = se;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SCFaultOptions objSCFaultOptions = (SCFaultOptions) o;
      return   Objects.equals(this.faultType, objSCFaultOptions.faultType)&&
  Objects.equals(this.objectType, objSCFaultOptions.objectType)&&
  Objects.equals(this.obj, objSCFaultOptions.obj)&&
  Objects.equals(this.se, objSCFaultOptions.se)&&
  Objects.equals(this.delayCreate, objSCFaultOptions.delayCreate)&&
  Objects.equals(this.delayUpdate, objSCFaultOptions.delayUpdate)&&
  Objects.equals(this.delayDelete, objSCFaultOptions.delayDelete);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SCFaultOptions {\n");
                  sb.append("    delayCreate: ").append(toIndentedString(delayCreate)).append("\n");
                        sb.append("    delayDelete: ").append(toIndentedString(delayDelete)).append("\n");
                        sb.append("    delayUpdate: ").append(toIndentedString(delayUpdate)).append("\n");
                        sb.append("    faultType: ").append(toIndentedString(faultType)).append("\n");
                        sb.append("    obj: ").append(toIndentedString(obj)).append("\n");
                        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
                        sb.append("    se: ").append(toIndentedString(se)).append("\n");
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
