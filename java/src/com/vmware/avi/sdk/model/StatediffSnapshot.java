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
 * The StatediffSnapshot is a POJO class extends AviRestResource that used for creating
 * StatediffSnapshot.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatediffSnapshot extends AviRestResource  {
    @JsonProperty("gslb_name")
    private String gslbName = null;

    @JsonProperty("gslb_uuid")
    private String gslbUuid = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("pool_name")
    private String poolName = null;

    @JsonProperty("pool_uuid")
    private String poolUuid = null;

    @JsonProperty("post_snapshot")
    private postsnapshot postSnapshot = null;

    @JsonProperty("pre_snapshot")
    private presnapshot preSnapshot = null;

    @JsonProperty("se_group_name")
    private String seGroupName = null;

    @JsonProperty("se_group_uuid")
    private String seGroupUuid = null;

    @JsonProperty("se_name")
    private String seName = null;

    @JsonProperty("se_uuid")
    private String seUuid = null;

    @JsonProperty("snapshot_type")
    private String snapshotType = null;

    @JsonProperty("statediff_operation_ref")
    private String statediffOperationRef = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;

    @JsonProperty("vs_name")
    private String vsName = null;

    @JsonProperty("vs_uuid")
    private String vsUuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Name of gslb object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gslbName
     */
    public String getGslbName() {
        return gslbName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of gslb object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gslbName set the gslbName.
     */
    public void setGslbName(String  gslbName) {
        this.gslbName = gslbName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reference to base gslb object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return gslbUuid
     */
    public String getGslbUuid() {
        return gslbUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Reference to base gslb object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param gslbUuid set the gslbUuid.
     */
    public void setGslbUuid(String  gslbUuid) {
        this.gslbUuid = gslbUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of statediff operation.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of statediff operation.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of pool object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of pool object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolName set the poolName.
     */
    public void setPoolName(String  poolName) {
        this.poolName = poolName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reference to base pool object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return poolUuid
     */
    public String getPoolUuid() {
        return poolUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Reference to base pool object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param poolUuid set the poolUuid.
     */
    public void setPoolUuid(String  poolUuid) {
        this.poolUuid = poolUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Post-upgrade snapshot for vs.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return postSnapshot
     */
    public postsnapshot getPostSnapshot() {
        return postSnapshot;
    }

    /**
     * This is the setter method to the attribute.
     * Post-upgrade snapshot for vs.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param postSnapshot set the postSnapshot.
     */
    public void setPostSnapshot(postsnapshot postSnapshot) {
        this.postSnapshot = postSnapshot;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pre-upgrade snapshot for vs.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preSnapshot
     */
    public presnapshot getPreSnapshot() {
        return preSnapshot;
    }

    /**
     * This is the setter method to the attribute.
     * Pre-upgrade snapshot for vs.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param preSnapshot set the preSnapshot.
     */
    public void setPreSnapshot(presnapshot preSnapshot) {
        this.preSnapshot = preSnapshot;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of seg object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupName
     */
    public String getSeGroupName() {
        return seGroupName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of seg object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupName set the seGroupName.
     */
    public void setSeGroupName(String  seGroupName) {
        this.seGroupName = seGroupName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reference to base seg object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seGroupUuid
     */
    public String getSeGroupUuid() {
        return seGroupUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Reference to base seg object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seGroupUuid set the seGroupUuid.
     */
    public void setSeGroupUuid(String  seGroupUuid) {
        this.seGroupUuid = seGroupUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of seg object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seName
     */
    public String getSeName() {
        return seName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of seg object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seName set the seName.
     */
    public void setSeName(String  seName) {
        this.seName = seName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reference to base se object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return seUuid
     */
    public String getSeUuid() {
        return seUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Reference to base se object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param seUuid set the seUuid.
     */
    public void setSeUuid(String  seUuid) {
        this.seUuid = seUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of snapshot eg.
     * Vs_snapshot, se_snapshot etc.
     * Enum options - FB_VS_SNAPSHOT, FB_SE_SNAPSHOT, FB_GSLB_SNAPSHOT, FB_POOL_SNAPSHOT.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return snapshotType
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    /**
     * This is the setter method to the attribute.
     * Type of snapshot eg.
     * Vs_snapshot, se_snapshot etc.
     * Enum options - FB_VS_SNAPSHOT, FB_SE_SNAPSHOT, FB_GSLB_SNAPSHOT, FB_POOL_SNAPSHOT.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param snapshotType set the snapshotType.
     */
    public void setSnapshotType(String  snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Statediff operation uuid for identifying the operation.
     * It is a reference to an object of type statediffoperation.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return statediffOperationRef
     */
    public String getStatediffOperationRef() {
        return statediffOperationRef;
    }

    /**
     * This is the setter method to the attribute.
     * Statediff operation uuid for identifying the operation.
     * It is a reference to an object of type statediffoperation.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param statediffOperationRef set the statediffOperationRef.
     */
    public void setStatediffOperationRef(String  statediffOperationRef) {
        this.statediffOperationRef = statediffOperationRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant that this object belongs to.
     * It is a reference to an object of type tenant.
     * Field introduced in 21.1.3.
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
     * Field introduced in 21.1.3.
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
     * Unique identifier for statediff entry.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Unique identifier for statediff entry.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of vs object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsName
     */
    public String getVsName() {
        return vsName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of vs object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsName set the vsName.
     */
    public void setVsName(String  vsName) {
        this.vsName = vsName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reference to base vs object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return vsUuid
     */
    public String getVsUuid() {
        return vsUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Reference to base vs object.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param vsUuid set the vsUuid.
     */
    public void setVsUuid(String  vsUuid) {
        this.vsUuid = vsUuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      StatediffSnapshot objStatediffSnapshot = (StatediffSnapshot) o;
      return   Objects.equals(this.uuid, objStatediffSnapshot.uuid)&&
  Objects.equals(this.name, objStatediffSnapshot.name)&&
  Objects.equals(this.statediffOperationRef, objStatediffSnapshot.statediffOperationRef)&&
  Objects.equals(this.preSnapshot, objStatediffSnapshot.preSnapshot)&&
  Objects.equals(this.postSnapshot, objStatediffSnapshot.postSnapshot)&&
  Objects.equals(this.vsUuid, objStatediffSnapshot.vsUuid)&&
  Objects.equals(this.seUuid, objStatediffSnapshot.seUuid)&&
  Objects.equals(this.gslbUuid, objStatediffSnapshot.gslbUuid)&&
  Objects.equals(this.poolUuid, objStatediffSnapshot.poolUuid)&&
  Objects.equals(this.seGroupUuid, objStatediffSnapshot.seGroupUuid)&&
  Objects.equals(this.vsName, objStatediffSnapshot.vsName)&&
  Objects.equals(this.seName, objStatediffSnapshot.seName)&&
  Objects.equals(this.poolName, objStatediffSnapshot.poolName)&&
  Objects.equals(this.gslbName, objStatediffSnapshot.gslbName)&&
  Objects.equals(this.seGroupName, objStatediffSnapshot.seGroupName)&&
  Objects.equals(this.snapshotType, objStatediffSnapshot.snapshotType)&&
  Objects.equals(this.tenantRef, objStatediffSnapshot.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class StatediffSnapshot {\n");
                  sb.append("    gslbName: ").append(toIndentedString(gslbName)).append("\n");
                        sb.append("    gslbUuid: ").append(toIndentedString(gslbUuid)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
                        sb.append("    poolUuid: ").append(toIndentedString(poolUuid)).append("\n");
                        sb.append("    postSnapshot: ").append(toIndentedString(postSnapshot)).append("\n");
                        sb.append("    preSnapshot: ").append(toIndentedString(preSnapshot)).append("\n");
                        sb.append("    seGroupName: ").append(toIndentedString(seGroupName)).append("\n");
                        sb.append("    seGroupUuid: ").append(toIndentedString(seGroupUuid)).append("\n");
                        sb.append("    seName: ").append(toIndentedString(seName)).append("\n");
                        sb.append("    seUuid: ").append(toIndentedString(seUuid)).append("\n");
                        sb.append("    snapshotType: ").append(toIndentedString(snapshotType)).append("\n");
                        sb.append("    statediffOperationRef: ").append(toIndentedString(statediffOperationRef)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    vsName: ").append(toIndentedString(vsName)).append("\n");
                        sb.append("    vsUuid: ").append(toIndentedString(vsUuid)).append("\n");
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
