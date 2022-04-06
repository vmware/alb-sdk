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
 * The SecureChannelToken is a POJO class extends AviRestResource that used for creating
 * SecureChannelToken.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecureChannelToken extends AviRestResource  {
    @JsonProperty("expiry_time")
    private Float expiryTime = null;

    @JsonProperty("in_use")
    private Boolean inUse = false;

    @JsonProperty("metadata")
    private List<SecureChannelMetadata> metadata = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("node_uuid")
    private String nodeUuid;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Expiry time for auth_token.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return expiryTime
     */
    public Float getExpiryTime() {
        return expiryTime;
    }

    /**
     * This is the setter method to the attribute.
     * Expiry time for auth_token.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param expiryTime set the expiryTime.
     */
    public void setExpiryTime(Float  expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether this auth_token is used by some node(se/controller).
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return inUse
     */
    public Boolean getInUse() {
        return inUse;
    }

    /**
     * This is the setter method to the attribute.
     * Whether this auth_token is used by some node(se/controller).
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param inUse set the inUse.
     */
    public void setInUse(Boolean  inUse) {
        this.inUse = inUse;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Metadata associated with auth_token.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public List<SecureChannelMetadata> getMetadata() {
        return metadata;
    }

    /**
     * This is the setter method. this will set the metadata
     * Metadata associated with auth_token.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public void setMetadata(List<SecureChannelMetadata>  metadata) {
        this.metadata = metadata;
    }

    /**
     * This is the setter method this will set the metadata
     * Metadata associated with auth_token.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public SecureChannelToken addMetadataItem(SecureChannelMetadata metadataItem) {
      if (this.metadata == null) {
        this.metadata = new ArrayList<SecureChannelMetadata>();
      }
      this.metadata.add(metadataItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Auth_token used for se/controller authorization.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Auth_token used for se/controller authorization.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Deprecated  uuid of se or controller who is using this auth_token.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @return nodeUuid
     */
    public String getNodeUuid() {
        return nodeUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Deprecated  uuid of se or controller who is using this auth_token.
     * Field deprecated in 21.1.1.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * @param nodeUuid set the nodeUuid.
     */
    public void setNodeUuid(String  nodeUuid) {
        this.nodeUuid = nodeUuid;
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
     * Auth_token used for se/controller authorization.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Auth_token used for se/controller authorization.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
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
      SecureChannelToken objSecureChannelToken = (SecureChannelToken) o;
      return   Objects.equals(this.uuid, objSecureChannelToken.uuid)&&
  Objects.equals(this.name, objSecureChannelToken.name)&&
  Objects.equals(this.expiryTime, objSecureChannelToken.expiryTime)&&
  Objects.equals(this.nodeUuid, objSecureChannelToken.nodeUuid)&&
  Objects.equals(this.metadata, objSecureChannelToken.metadata)&&
  Objects.equals(this.inUse, objSecureChannelToken.inUse);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SecureChannelToken {\n");
                  sb.append("    expiryTime: ").append(toIndentedString(expiryTime)).append("\n");
                        sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
                        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
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
