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
 * The LicenseStatus is a POJO class extends AviRestResource that used for creating
 * LicenseStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseStatus extends AviRestResource  {
    @JsonProperty("saas_status")
    private SaasLicensingStatus saasStatus = null;

    @JsonProperty("service_update")
    private LicenseServiceUpdate serviceUpdate = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Saas licensing status.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return saasStatus
     */
    public SaasLicensingStatus getSaasStatus() {
        return saasStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Saas licensing status.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param saasStatus set the saasStatus.
     */
    public void setSaasStatus(SaasLicensingStatus saasStatus) {
        this.saasStatus = saasStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Pulse license service update.
     * Field introduced in 21.1.4.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return serviceUpdate
     */
    public LicenseServiceUpdate getServiceUpdate() {
        return serviceUpdate;
    }

    /**
     * This is the setter method to the attribute.
     * Pulse license service update.
     * Field introduced in 21.1.4.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param serviceUpdate set the serviceUpdate.
     */
    public void setServiceUpdate(LicenseServiceUpdate serviceUpdate) {
        this.serviceUpdate = serviceUpdate;
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
     * Uuid.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid.
     * Field introduced in 21.1.3.
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
      LicenseStatus objLicenseStatus = (LicenseStatus) o;
      return   Objects.equals(this.uuid, objLicenseStatus.uuid)&&
  Objects.equals(this.saasStatus, objLicenseStatus.saasStatus)&&
  Objects.equals(this.serviceUpdate, objLicenseStatus.serviceUpdate);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LicenseStatus {\n");
                  sb.append("    saasStatus: ").append(toIndentedString(saasStatus)).append("\n");
                        sb.append("    serviceUpdate: ").append(toIndentedString(serviceUpdate)).append("\n");
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
