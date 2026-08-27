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
 * The AkoAmkoCluster is a POJO class extends AviRestResource that used for creating
 * AkoAmkoCluster.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AkoAmkoCluster extends AviRestResource  {
    @JsonProperty("cloud_config_cksum")
    private String cloudConfigCksum;

    @JsonProperty("cloud_ref")
    private String cloudRef;

    @JsonProperty("cluster_type")
    private String clusterType;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("deployment_info")
    private AkoAmkoClusterDeploymentInfo deploymentInfo;

    @JsonProperty("metadata")
    private AkoAmkoClusterMetadata metadata;

    @JsonProperty("name")
    private String name;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("version_info")
    private AkoAmkoClusterVersionInfo versionInfo;



    /**
     * This is the getter method this will return the attribute value.
     * Checksum of the cloud configuration for akoamkocluster object.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudConfigCksum
     */
    public String getCloudConfigCksum() {
        return cloudConfigCksum;
    }

    /**
     * This is the setter method to the attribute.
     * Checksum of the cloud configuration for akoamkocluster object.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudConfigCksum set the cloudConfigCksum.
     */
    public void setCloudConfigCksum(String  cloudConfigCksum) {
        this.cloudConfigCksum = cloudConfigCksum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cloud reference uuid in avi controller.
     * It is a reference to an object of type cloud.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cloudRef
     */
    public String getCloudRef() {
        return cloudRef;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud reference uuid in avi controller.
     * It is a reference to an object of type cloud.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cloudRef set the cloudRef.
     */
    public void setCloudRef(String  cloudRef) {
        this.cloudRef = cloudRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of operator - ako or amko.
     * Enum options - CLUSTER_TYPE_AKO, CLUSTER_TYPE_AMKO.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterType
     */
    public String getClusterType() {
        return clusterType;
    }

    /**
     * This is the setter method to the attribute.
     * Type of operator - ako or amko.
     * Enum options - CLUSTER_TYPE_AKO, CLUSTER_TYPE_AMKO.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterType set the clusterType.
     */
    public void setClusterType(String  clusterType) {
        this.clusterType = clusterType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ako/amko user identifier.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This is the setter method to the attribute.
     * Ako/amko user identifier.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdBy set the createdBy.
     */
    public void setCreatedBy(String  createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deployment configuration information.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deploymentInfo
     */
    public AkoAmkoClusterDeploymentInfo getDeploymentInfo() {
        return deploymentInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Deployment configuration information.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deploymentInfo set the deploymentInfo.
     */
    public void setDeploymentInfo(AkoAmkoClusterDeploymentInfo deploymentInfo) {
        this.deploymentInfo = deploymentInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Additional cluster metadata.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public AkoAmkoClusterMetadata getMetadata() {
        return metadata;
    }

    /**
     * This is the setter method to the attribute.
     * Additional cluster metadata.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metadata set the metadata.
     */
    public void setMetadata(AkoAmkoClusterMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the ako/amko cluster.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the ako/amko cluster.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant that ako/amko cluster belongs to.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant that ako/amko cluster belongs to.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.1.4.
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
     * Uuid of the ako/amko cluster.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the ako/amko cluster.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Version information including kubernetes and ako/amko versions.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return versionInfo
     */
    public AkoAmkoClusterVersionInfo getVersionInfo() {
        return versionInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Version information including kubernetes and ako/amko versions.
     * Field introduced in 32.1.4.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param versionInfo set the versionInfo.
     */
    public void setVersionInfo(AkoAmkoClusterVersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AkoAmkoCluster objAkoAmkoCluster = (AkoAmkoCluster) o;
      return   Objects.equals(this.uuid, objAkoAmkoCluster.uuid)&&
  Objects.equals(this.name, objAkoAmkoCluster.name)&&
  Objects.equals(this.createdBy, objAkoAmkoCluster.createdBy)&&
  Objects.equals(this.clusterType, objAkoAmkoCluster.clusterType)&&
  Objects.equals(this.cloudRef, objAkoAmkoCluster.cloudRef)&&
  Objects.equals(this.versionInfo, objAkoAmkoCluster.versionInfo)&&
  Objects.equals(this.deploymentInfo, objAkoAmkoCluster.deploymentInfo)&&
  Objects.equals(this.metadata, objAkoAmkoCluster.metadata)&&
  Objects.equals(this.tenantRef, objAkoAmkoCluster.tenantRef)&&
  Objects.equals(this.cloudConfigCksum, objAkoAmkoCluster.cloudConfigCksum);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AkoAmkoCluster {\n");
                  sb.append("    cloudConfigCksum: ").append(toIndentedString(cloudConfigCksum)).append("\n");
                        sb.append("    cloudRef: ").append(toIndentedString(cloudRef)).append("\n");
                        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
                        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
                        sb.append("    deploymentInfo: ").append(toIndentedString(deploymentInfo)).append("\n");
                        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    versionInfo: ").append(toIndentedString(versionInfo)).append("\n");
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
