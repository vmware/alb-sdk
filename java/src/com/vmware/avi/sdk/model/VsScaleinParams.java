/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The VsScaleinParams is a POJO class extends AviRestResource that used for creating
 * VsScaleinParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VsScaleinParams extends AviRestResource  {
    @JsonIgnore
    private Boolean adminDown = false;

    @JsonProperty("from_se_ref")
    private String fromSeRef;

    @JsonProperty("scalein_primary")
    private Boolean scaleinPrimary;

    @JsonIgnore
    private String source;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("vip_id")
    private String vipId;



    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return adminDown
     */
    public Boolean getAdminDown() {
        return adminDown;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param adminDown set the adminDown.
     */
    public void setAdminDown(Boolean  adminDown) {
        this.adminDown = adminDown;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type serviceengine.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fromSeRef
     */
    public String getFromSeRef() {
        return fromSeRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type serviceengine.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fromSeRef set the fromSeRef.
     */
    public void setFromSeRef(String  fromSeRef) {
        this.fromSeRef = fromSeRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return scaleinPrimary
     */
    public Boolean getScaleinPrimary() {
        return scaleinPrimary;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param scaleinPrimary set the scaleinPrimary.
     */
    public void setScaleinPrimary(Boolean  scaleinPrimary) {
        this.scaleinPrimary = scaleinPrimary;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Actuator which initiated this scalein.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * This is the setter method to the attribute.
     * Actuator which initiated this scalein.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param source set the source.
     */
    public void setSource(String  source) {
        this.source = source;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 17.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vipId
     */
    public String getVipId() {
        return vipId;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 17.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vipId set the vipId.
     */
    public void setVipId(String  vipId) {
        this.vipId = vipId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VsScaleinParams objVsScaleinParams = (VsScaleinParams) o;
      return   Objects.equals(this.uuid, objVsScaleinParams.uuid)&&
  Objects.equals(this.fromSeRef, objVsScaleinParams.fromSeRef)&&
  Objects.equals(this.scaleinPrimary, objVsScaleinParams.scaleinPrimary)&&
  Objects.equals(this.adminDown, objVsScaleinParams.adminDown)&&
  Objects.equals(this.vipId, objVsScaleinParams.vipId)&&
  Objects.equals(this.source, objVsScaleinParams.source);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VsScaleinParams {\n");
                  sb.append("    adminDown: ").append(toIndentedString(adminDown)).append("\n");
                        sb.append("    fromSeRef: ").append(toIndentedString(fromSeRef)).append("\n");
                        sb.append("    scaleinPrimary: ").append(toIndentedString(scaleinPrimary)).append("\n");
                        sb.append("    source: ").append(toIndentedString(source)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vipId: ").append(toIndentedString(vipId)).append("\n");
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
