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
 * The UpgradeProfile is a POJO class extends AviRestResource that used for creating
 * UpgradeProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpgradeProfile extends AviRestResource  {
    @JsonProperty("controller_params")
    private ControllerParams controllerParams;

    @JsonProperty("dry_run")
    private DryRunParams dryRun;

    @JsonProperty("image")
    private ImageParams image;

    @JsonProperty("pre_checks")
    private PreChecksParams preChecks;

    @JsonProperty("service_engine")
    private ServiceEngineParams serviceEngine;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * List of controller upgrade related configurable parameters.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerParams
     */
    public ControllerParams getControllerParams() {
        return controllerParams;
    }

    /**
     * This is the setter method to the attribute.
     * List of controller upgrade related configurable parameters.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerParams set the controllerParams.
     */
    public void setControllerParams(ControllerParams controllerParams) {
        this.controllerParams = controllerParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of dryrun related configurable parameters.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dryRun
     */
    public DryRunParams getDryRun() {
        return dryRun;
    }

    /**
     * This is the setter method to the attribute.
     * List of dryrun related configurable parameters.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dryRun set the dryRun.
     */
    public void setDryRun(DryRunParams dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of image related configurable parameters.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return image
     */
    public ImageParams getImage() {
        return image;
    }

    /**
     * This is the setter method to the attribute.
     * List of image related configurable parameters.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param image set the image.
     */
    public void setImage(ImageParams image) {
        this.image = image;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of upgrade pre-checks related configurable parameters.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preChecks
     */
    public PreChecksParams getPreChecks() {
        return preChecks;
    }

    /**
     * This is the setter method to the attribute.
     * List of upgrade pre-checks related configurable parameters.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param preChecks set the preChecks.
     */
    public void setPreChecks(PreChecksParams preChecks) {
        this.preChecks = preChecks;
    }

    /**
     * This is the getter method this will return the attribute value.
     * List of service engine upgrade related configurable parameters.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceEngine
     */
    public ServiceEngineParams getServiceEngine() {
        return serviceEngine;
    }

    /**
     * This is the setter method to the attribute.
     * List of service engine upgrade related configurable parameters.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceEngine set the serviceEngine.
     */
    public void setServiceEngine(ServiceEngineParams serviceEngine) {
        this.serviceEngine = serviceEngine;
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
     * Uuid identifier for the upgradeprofile object.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid identifier for the upgradeprofile object.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
      UpgradeProfile objUpgradeProfile = (UpgradeProfile) o;
      return   Objects.equals(this.uuid, objUpgradeProfile.uuid)&&
  Objects.equals(this.serviceEngine, objUpgradeProfile.serviceEngine)&&
  Objects.equals(this.image, objUpgradeProfile.image)&&
  Objects.equals(this.dryRun, objUpgradeProfile.dryRun)&&
  Objects.equals(this.preChecks, objUpgradeProfile.preChecks)&&
  Objects.equals(this.controllerParams, objUpgradeProfile.controllerParams);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UpgradeProfile {\n");
                  sb.append("    controllerParams: ").append(toIndentedString(controllerParams)).append("\n");
                        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
                        sb.append("    image: ").append(toIndentedString(image)).append("\n");
                        sb.append("    preChecks: ").append(toIndentedString(preChecks)).append("\n");
                        sb.append("    serviceEngine: ").append(toIndentedString(serviceEngine)).append("\n");
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
