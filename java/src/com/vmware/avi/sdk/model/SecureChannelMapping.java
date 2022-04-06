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
 * The SecureChannelMapping is a POJO class extends AviRestResource that used for creating
 * SecureChannelMapping.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SecureChannelMapping extends AviRestResource  {
    @JsonProperty("auth_token")
    private String authToken = null;

    @JsonProperty("ip")
    private String ip = null;

    @JsonProperty("is_controller")
    private Boolean isController = false;

    @JsonProperty("local_ip")
    private String localIp = null;

    @JsonProperty("marked_for_delete")
    private Boolean markedForDelete = false;

    @JsonProperty("metadata")
    private List<SecureChannelMetadata> metadata = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("pub_key")
    private String pubKey = null;

    @JsonProperty("pub_key_pem")
    private String pubKeyPem = null;

    @JsonProperty("status")
    private String status = "SECURE_CHANNEL_NONE";

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Auth_token used for se authorization.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return authToken
     */
    public String getAuthToken() {
        return authToken;
    }

    /**
     * This is the setter method to the attribute.
     * Auth_token used for se authorization.
     * Field introduced in 21.1.1.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param authToken set the authToken.
     */
    public void setAuthToken(String  authToken) {
        this.authToken = authToken;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ip of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * This is the setter method to the attribute.
     * Ip of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ip set the ip.
     */
    public void setIp(String  ip) {
        this.ip = ip;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether this entry used for controller.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return isController
     */
    public Boolean getIsController() {
        return isController;
    }

    /**
     * This is the setter method to the attribute.
     * Whether this entry used for controller.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param isController set the isController.
     */
    public void setIsController(Boolean  isController) {
        this.isController = isController;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Local ip on controller side reserved for se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return localIp
     */
    public String getLocalIp() {
        return localIp;
    }

    /**
     * This is the setter method to the attribute.
     * Local ip on controller side reserved for se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param localIp set the localIp.
     */
    public void setLocalIp(String  localIp) {
        this.localIp = localIp;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether this entry is marked for delete (first step of deletion).
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return markedForDelete
     */
    public Boolean getMarkedForDelete() {
        return markedForDelete;
    }

    /**
     * This is the setter method to the attribute.
     * Whether this entry is marked for delete (first step of deletion).
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param markedForDelete set the markedForDelete.
     */
    public void setMarkedForDelete(Boolean  markedForDelete) {
        this.markedForDelete = markedForDelete;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Metadata associated with auth_token.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public List<SecureChannelMetadata> getMetadata() {
        return metadata;
    }

    /**
     * This is the setter method. this will set the metadata
     * Metadata associated with auth_token.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public void setMetadata(List<SecureChannelMetadata>  metadata) {
        this.metadata = metadata;
    }

    /**
     * This is the setter method this will set the metadata
     * Metadata associated with auth_token.
     * Field introduced in 20.1.3.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public SecureChannelMapping addMetadataItem(SecureChannelMetadata metadataItem) {
      if (this.metadata == null) {
        this.metadata = new ArrayList<SecureChannelMetadata>();
      }
      this.metadata.add(metadataItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Public key of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pubKey
     */
    public String getPubKey() {
        return pubKey;
    }

    /**
     * This is the setter method to the attribute.
     * Public key of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pubKey set the pubKey.
     */
    public void setPubKey(String  pubKey) {
        this.pubKey = pubKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Public key pem of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pubKeyPem
     */
    public String getPubKeyPem() {
        return pubKeyPem;
    }

    /**
     * This is the setter method to the attribute.
     * Public key pem of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pubKeyPem set the pubKeyPem.
     */
    public void setPubKeyPem(String  pubKeyPem) {
        this.pubKeyPem = pubKeyPem;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Authorization status of current secure channel.
     * Enum options - SECURE_CHANNEL_NONE, SECURE_CHANNEL_CONNECTED, SECURE_CHANNEL_AUTH_SSH_SUCCESS, SECURE_CHANNEL_AUTH_SSH_FAILED,
     * SECURE_CHANNEL_AUTH_TOKEN_SUCCESS, SECURE_CHANNEL_AUTH_TOKEN_FAILED, SECURE_CHANNEL_AUTH_ERRORS, SECURE_CHANNEL_AUTH_IGNORED.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SECURE_CHANNEL_NONE".
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Authorization status of current secure channel.
     * Enum options - SECURE_CHANNEL_NONE, SECURE_CHANNEL_CONNECTED, SECURE_CHANNEL_AUTH_SSH_SUCCESS, SECURE_CHANNEL_AUTH_SSH_FAILED,
     * SECURE_CHANNEL_AUTH_TOKEN_SUCCESS, SECURE_CHANNEL_AUTH_TOKEN_FAILED, SECURE_CHANNEL_AUTH_ERRORS, SECURE_CHANNEL_AUTH_IGNORED.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SECURE_CHANNEL_NONE".
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
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
     * Uuid of se.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of se.
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
      SecureChannelMapping objSecureChannelMapping = (SecureChannelMapping) o;
      return   Objects.equals(this.uuid, objSecureChannelMapping.uuid)&&
  Objects.equals(this.name, objSecureChannelMapping.name)&&
  Objects.equals(this.localIp, objSecureChannelMapping.localIp)&&
  Objects.equals(this.ip, objSecureChannelMapping.ip)&&
  Objects.equals(this.status, objSecureChannelMapping.status)&&
  Objects.equals(this.markedForDelete, objSecureChannelMapping.markedForDelete)&&
  Objects.equals(this.isController, objSecureChannelMapping.isController)&&
  Objects.equals(this.pubKey, objSecureChannelMapping.pubKey)&&
  Objects.equals(this.pubKeyPem, objSecureChannelMapping.pubKeyPem)&&
  Objects.equals(this.metadata, objSecureChannelMapping.metadata)&&
  Objects.equals(this.authToken, objSecureChannelMapping.authToken);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SecureChannelMapping {\n");
                  sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
                        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
                        sb.append("    isController: ").append(toIndentedString(isController)).append("\n");
                        sb.append("    localIp: ").append(toIndentedString(localIp)).append("\n");
                        sb.append("    markedForDelete: ").append(toIndentedString(markedForDelete)).append("\n");
                        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pubKey: ").append(toIndentedString(pubKey)).append("\n");
                        sb.append("    pubKeyPem: ").append(toIndentedString(pubKeyPem)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
