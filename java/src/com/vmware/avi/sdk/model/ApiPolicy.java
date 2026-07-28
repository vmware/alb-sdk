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
 * The ApiPolicy is a POJO class extends AviRestResource that used for creating
 * ApiPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiPolicy extends AviRestResource  {
    @JsonProperty("active_api_labels")
    private ApiLabels activeApiLabels;

    @JsonProperty("api_spec_info")
    private ApiSpecInfo apiSpecInfo;

    @JsonProperty("description")
    private String description;

    @JsonProperty("file_object_refs")
    private List<String> fileObjectRefs;

    @JsonProperty("label_mappings")
    private List<ApiPolicyLabelActionMapping> labelMappings;

    @JsonProperty("log_labels")
    private Boolean logLabels = true;

    @JsonProperty("name")
    private String name;

    @JsonProperty("non_api_url_labels")
    private ApiLabels nonApiUrlLabels;

    @JsonProperty("orphan_api_classification_settings")
    private OrphanApiClassificationSettings orphanApiClassificationSettings;

    @JsonProperty("orphan_api_labels")
    private ApiLabels orphanApiLabels;

    @JsonProperty("path_refs")
    private List<String> pathRefs;

    @JsonProperty("routing_info")
    private ApiRoutingInfo routingInfo;

    @JsonProperty("server_info")
    private ApiServerInfo serverInfo;

    @JsonProperty("shadow_api_labels")
    private ApiLabels shadowApiLabels;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("validation_settings")
    private ApiValidationSettings validationSettings;

    @JsonProperty("zombie_api_classification_settings")
    private ZombieApiClassificationSettings zombieApiClassificationSettings;

    @JsonProperty("zombie_api_labels")
    private ApiLabels zombieApiLabels;



    /**
     * This is the getter method this will return the attribute value.
     * List of labels applied to active api endpoints.
     * An active api is an endpoint whose type is api_active.
     * Endpoints defined in the policy are active by default.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return activeApiLabels
     */
    public ApiLabels getActiveApiLabels() {
        return activeApiLabels;
    }

    /**
     * This is the setter method to the attribute.
     * List of labels applied to active api endpoints.
     * An active api is an endpoint whose type is api_active.
     * Endpoints defined in the policy are active by default.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param activeApiLabels set the activeApiLabels.
     */
    public void setActiveApiLabels(ApiLabels activeApiLabels) {
        this.activeApiLabels = activeApiLabels;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Api specification metadata extracted from the associated openapi specification.
     * Automatically populated when a fileobject is associated with this policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return apiSpecInfo
     */
    public ApiSpecInfo getApiSpecInfo() {
        return apiSpecInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Api specification metadata extracted from the associated openapi specification.
     * Automatically populated when a fileobject is associated with this policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param apiSpecInfo set the apiSpecInfo.
     */
    public void setApiSpecInfo(ApiSpecInfo apiSpecInfo) {
        this.apiSpecInfo = apiSpecInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description of this api policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description of this api policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Reference to the uploaded openapi specification file associated with this policy.
     * Only one file is supported at a time.
     * It is a reference to an object of type fileobject.
     * Field introduced in 32.2.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fileObjectRefs
     */
    public List<String> getFileObjectRefs() {
        return fileObjectRefs;
    }

    /**
     * This is the setter method. this will set the fileObjectRefs
     * Reference to the uploaded openapi specification file associated with this policy.
     * Only one file is supported at a time.
     * It is a reference to an object of type fileobject.
     * Field introduced in 32.2.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fileObjectRefs
     */
    public void setFileObjectRefs(List<String>  fileObjectRefs) {
        this.fileObjectRefs = fileObjectRefs;
    }

    /**
     * This is the setter method this will set the fileObjectRefs
     * Reference to the uploaded openapi specification file associated with this policy.
     * Only one file is supported at a time.
     * It is a reference to an object of type fileobject.
     * Field introduced in 32.2.1.
     * Maximum of 1 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fileObjectRefs
     */
    public ApiPolicy addFileObjectRefsItem(String fileObjectRefsItem) {
      if (this.fileObjectRefs == null) {
        this.fileObjectRefs = new ArrayList<String>();
      }
      this.fileObjectRefs.add(fileObjectRefsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Mapping of labels to api policy actions.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labelMappings
     */
    public List<ApiPolicyLabelActionMapping> getLabelMappings() {
        return labelMappings;
    }

    /**
     * This is the setter method. this will set the labelMappings
     * Mapping of labels to api policy actions.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labelMappings
     */
    public void setLabelMappings(List<ApiPolicyLabelActionMapping>  labelMappings) {
        this.labelMappings = labelMappings;
    }

    /**
     * This is the setter method this will set the labelMappings
     * Mapping of labels to api policy actions.
     * Field introduced in 32.2.1.
     * Maximum of 256 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return labelMappings
     */
    public ApiPolicy addLabelMappingsItem(ApiPolicyLabelActionMapping labelMappingsItem) {
      if (this.labelMappings == null) {
        this.labelMappings = new ArrayList<ApiPolicyLabelActionMapping>();
      }
      this.labelMappings.add(labelMappingsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enables logging of waap labels effective for a request into apilog.effective_labels in the application log.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return logLabels
     */
    public Boolean getLogLabels() {
        return logLabels;
    }

    /**
     * This is the setter method to the attribute.
     * Enables logging of waap labels effective for a request into apilog.effective_labels in the application log.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param logLabels set the logLabels.
     */
    public void setLogLabels(Boolean  logLabels) {
        this.logLabels = logLabels;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of this object, unique per tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of this object, unique per tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of labels applied to non-api url requests.
     * Non-api urls are methods and urls that are outside the scope of the policy.
     * These are usually used to retrieve static information that are not tied to back-end business logic.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nonApiUrlLabels
     */
    public ApiLabels getNonApiUrlLabels() {
        return nonApiUrlLabels;
    }

    /**
     * This is the setter method to the attribute.
     * List of labels applied to non-api url requests.
     * Non-api urls are methods and urls that are outside the scope of the policy.
     * These are usually used to retrieve static information that are not tied to back-end business logic.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nonApiUrlLabels set the nonApiUrlLabels.
     */
    public void setNonApiUrlLabels(ApiLabels nonApiUrlLabels) {
        this.nonApiUrlLabels = nonApiUrlLabels;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Orphan api classification settings for this api policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return orphanApiClassificationSettings
     */
    public OrphanApiClassificationSettings getOrphanApiClassificationSettings() {
        return orphanApiClassificationSettings;
    }

    /**
     * This is the setter method to the attribute.
     * Orphan api classification settings for this api policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param orphanApiClassificationSettings set the orphanApiClassificationSettings.
     */
    public void setOrphanApiClassificationSettings(OrphanApiClassificationSettings orphanApiClassificationSettings) {
        this.orphanApiClassificationSettings = orphanApiClassificationSettings;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of labels applied to orphan api endpoints.
     * An orphan api is an endpoint that is specified in the api-spec but has not been seen in the datapath for a predefined duration.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return orphanApiLabels
     */
    public ApiLabels getOrphanApiLabels() {
        return orphanApiLabels;
    }

    /**
     * This is the setter method to the attribute.
     * List of labels applied to orphan api endpoints.
     * An orphan api is an endpoint that is specified in the api-spec but has not been seen in the datapath for a predefined duration.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param orphanApiLabels set the orphanApiLabels.
     */
    public void setOrphanApiLabels(ApiLabels orphanApiLabels) {
        this.orphanApiLabels = orphanApiLabels;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of path specifications.
     * When an oas fileobject is associated to this apipolicy, the paths defined in the oas fileobject will be automatically added to this list.
     * If oas fileobject has a path that is already defined in the list, the existing path in the list will be updated as per the oas fileobject.
     * It is a reference to an object of type apipath.
     * Field introduced in 32.2.1.
     * Maximum of 5000 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pathRefs
     */
    public List<String> getPathRefs() {
        return pathRefs;
    }

    /**
     * This is the setter method. this will set the pathRefs
     * List of path specifications.
     * When an oas fileobject is associated to this apipolicy, the paths defined in the oas fileobject will be automatically added to this list.
     * If oas fileobject has a path that is already defined in the list, the existing path in the list will be updated as per the oas fileobject.
     * It is a reference to an object of type apipath.
     * Field introduced in 32.2.1.
     * Maximum of 5000 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pathRefs
     */
    public void setPathRefs(List<String>  pathRefs) {
        this.pathRefs = pathRefs;
    }

    /**
     * This is the setter method this will set the pathRefs
     * List of path specifications.
     * When an oas fileobject is associated to this apipolicy, the paths defined in the oas fileobject will be automatically added to this list.
     * If oas fileobject has a path that is already defined in the list, the existing path in the list will be updated as per the oas fileobject.
     * It is a reference to an object of type apipath.
     * Field introduced in 32.2.1.
     * Maximum of 5000 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pathRefs
     */
    public ApiPolicy addPathRefsItem(String pathRefsItem) {
      if (this.pathRefs == null) {
        this.pathRefs = new ArrayList<String>();
      }
      this.pathRefs.add(pathRefsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Optional header-based routing configuration for evh child vs selection.
     * When set, the rules inside are used in addition to server fqdns (host match) and server_info.path_prefix (path match) to determine which child vs
     * handles a request.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return routingInfo
     */
    public ApiRoutingInfo getRoutingInfo() {
        return routingInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Optional header-based routing configuration for evh child vs selection.
     * When set, the rules inside are used in addition to server fqdns (host match) and server_info.path_prefix (path match) to determine which child vs
     * handles a request.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param routingInfo set the routingInfo.
     */
    public void setRoutingInfo(ApiRoutingInfo routingInfo) {
        this.routingInfo = routingInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Server list defining the scope of this api policy.
     * Requests not matching any server url are treated as non-api traffic.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serverInfo
     */
    public ApiServerInfo getServerInfo() {
        return serverInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Server list defining the scope of this api policy.
     * Requests not matching any server url are treated as non-api traffic.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serverInfo set the serverInfo.
     */
    public void setServerInfo(ApiServerInfo serverInfo) {
        this.serverInfo = serverInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of labels applied to shadow api endpoints.
     * A shadow api is an endpoint that is not specified in the api-spec but is inside the scope of this policy (matching the server url and path
     * prefix) and is seen in the datapath.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return shadowApiLabels
     */
    public ApiLabels getShadowApiLabels() {
        return shadowApiLabels;
    }

    /**
     * This is the setter method to the attribute.
     * List of labels applied to shadow api endpoints.
     * A shadow api is an endpoint that is not specified in the api-spec but is inside the scope of this policy (matching the server url and path
     * prefix) and is seen in the datapath.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param shadowApiLabels set the shadowApiLabels.
     */
    public void setShadowApiLabels(ApiLabels shadowApiLabels) {
        this.shadowApiLabels = shadowApiLabels;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Field introduced in 32.2.1.
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
     * The object uuid.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * The object uuid.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Validation settings for this api policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return validationSettings
     */
    public ApiValidationSettings getValidationSettings() {
        return validationSettings;
    }

    /**
     * This is the setter method to the attribute.
     * Validation settings for this api policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param validationSettings set the validationSettings.
     */
    public void setValidationSettings(ApiValidationSettings validationSettings) {
        this.validationSettings = validationSettings;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Zombie api classification settings for this api policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return zombieApiClassificationSettings
     */
    public ZombieApiClassificationSettings getZombieApiClassificationSettings() {
        return zombieApiClassificationSettings;
    }

    /**
     * This is the setter method to the attribute.
     * Zombie api classification settings for this api policy.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param zombieApiClassificationSettings set the zombieApiClassificationSettings.
     */
    public void setZombieApiClassificationSettings(ZombieApiClassificationSettings zombieApiClassificationSettings) {
        this.zombieApiClassificationSettings = zombieApiClassificationSettings;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of labels applied to zombie api endpoints.
     * A zombie api is an endpoint that is specified in the api-spec but is seen in the datapath only as drip-traffic over a predefined duration.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return zombieApiLabels
     */
    public ApiLabels getZombieApiLabels() {
        return zombieApiLabels;
    }

    /**
     * This is the setter method to the attribute.
     * List of labels applied to zombie api endpoints.
     * A zombie api is an endpoint that is specified in the api-spec but is seen in the datapath only as drip-traffic over a predefined duration.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param zombieApiLabels set the zombieApiLabels.
     */
    public void setZombieApiLabels(ApiLabels zombieApiLabels) {
        this.zombieApiLabels = zombieApiLabels;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ApiPolicy objApiPolicy = (ApiPolicy) o;
      return   Objects.equals(this.uuid, objApiPolicy.uuid)&&
  Objects.equals(this.name, objApiPolicy.name)&&
  Objects.equals(this.description, objApiPolicy.description)&&
  Objects.equals(this.serverInfo, objApiPolicy.serverInfo)&&
  Objects.equals(this.routingInfo, objApiPolicy.routingInfo)&&
  Objects.equals(this.orphanApiClassificationSettings, objApiPolicy.orphanApiClassificationSettings)&&
  Objects.equals(this.zombieApiClassificationSettings, objApiPolicy.zombieApiClassificationSettings)&&
  Objects.equals(this.validationSettings, objApiPolicy.validationSettings)&&
  Objects.equals(this.fileObjectRefs, objApiPolicy.fileObjectRefs)&&
  Objects.equals(this.apiSpecInfo, objApiPolicy.apiSpecInfo)&&
  Objects.equals(this.labelMappings, objApiPolicy.labelMappings)&&
  Objects.equals(this.activeApiLabels, objApiPolicy.activeApiLabels)&&
  Objects.equals(this.shadowApiLabels, objApiPolicy.shadowApiLabels)&&
  Objects.equals(this.orphanApiLabels, objApiPolicy.orphanApiLabels)&&
  Objects.equals(this.zombieApiLabels, objApiPolicy.zombieApiLabels)&&
  Objects.equals(this.nonApiUrlLabels, objApiPolicy.nonApiUrlLabels)&&
  Objects.equals(this.logLabels, objApiPolicy.logLabels)&&
  Objects.equals(this.pathRefs, objApiPolicy.pathRefs)&&
  Objects.equals(this.tenantRef, objApiPolicy.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ApiPolicy {\n");
                  sb.append("    activeApiLabels: ").append(toIndentedString(activeApiLabels)).append("\n");
                        sb.append("    apiSpecInfo: ").append(toIndentedString(apiSpecInfo)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    fileObjectRefs: ").append(toIndentedString(fileObjectRefs)).append("\n");
                        sb.append("    labelMappings: ").append(toIndentedString(labelMappings)).append("\n");
                        sb.append("    logLabels: ").append(toIndentedString(logLabels)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    nonApiUrlLabels: ").append(toIndentedString(nonApiUrlLabels)).append("\n");
                        sb.append("    orphanApiClassificationSettings: ").append(toIndentedString(orphanApiClassificationSettings)).append("\n");
                        sb.append("    orphanApiLabels: ").append(toIndentedString(orphanApiLabels)).append("\n");
                        sb.append("    pathRefs: ").append(toIndentedString(pathRefs)).append("\n");
                        sb.append("    routingInfo: ").append(toIndentedString(routingInfo)).append("\n");
                        sb.append("    serverInfo: ").append(toIndentedString(serverInfo)).append("\n");
                        sb.append("    shadowApiLabels: ").append(toIndentedString(shadowApiLabels)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    validationSettings: ").append(toIndentedString(validationSettings)).append("\n");
                        sb.append("    zombieApiClassificationSettings: ").append(toIndentedString(zombieApiClassificationSettings)).append("\n");
                        sb.append("    zombieApiLabels: ").append(toIndentedString(zombieApiLabels)).append("\n");
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
