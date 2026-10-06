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
 * The ObjSyncConfig is a POJO class extends AviRestResource that used for creating
 * ObjSyncConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjSyncConfig  {
    @JsonProperty("cert_validation_mode")
    private String certValidationMode = "OBJSYNC_CERT_VALIDATION_STRICT";

    @JsonProperty("objsync_cpu_limit")
    private Integer objsyncCpuLimit = 0;

    @JsonProperty("objsync_hub_elect_interval")
    private Integer objsyncHubElectInterval = 60;

    @JsonProperty("objsync_reconcile_interval")
    private Integer objsyncReconcileInterval = 10;



    /**
     * This is the getter method this will return the attribute value.
     * Tls certificate validation mode for inter-se objsync, validated against the system secure channel certificate.
     * Strict (default) is the most secure mode.
     * Compat also accepts legacy se certificates for backward compatibility.
     * Enum options - OBJSYNC_CERT_VALIDATION_COMPAT, OBJSYNC_CERT_VALIDATION_STRICT, OBJSYNC_CERT_VALIDATION_AUTO.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "OBJSYNC_CERT_VALIDATION_STRICT".
     * @return certValidationMode
     */
    public String getCertValidationMode() {
        return certValidationMode;
    }

    /**
     * This is the setter method to the attribute.
     * Tls certificate validation mode for inter-se objsync, validated against the system secure channel certificate.
     * Strict (default) is the most secure mode.
     * Compat also accepts legacy se certificates for backward compatibility.
     * Enum options - OBJSYNC_CERT_VALIDATION_COMPAT, OBJSYNC_CERT_VALIDATION_STRICT, OBJSYNC_CERT_VALIDATION_AUTO.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "OBJSYNC_CERT_VALIDATION_STRICT".
     * @param certValidationMode set the certValidationMode.
     */
    public void setCertValidationMode(String  certValidationMode) {
        this.certValidationMode = certValidationMode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se cpu limit for interse object distribution.
     * Allowed values are 0-100.
     * Special values are 0- no restriction.
     * Field introduced in 20.1.3.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return objsyncCpuLimit
     */
    public Integer getObjsyncCpuLimit() {
        return objsyncCpuLimit;
    }

    /**
     * This is the setter method to the attribute.
     * Se cpu limit for interse object distribution.
     * Allowed values are 0-100.
     * Special values are 0- no restriction.
     * Field introduced in 20.1.3.
     * Unit is percent.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param objsyncCpuLimit set the objsyncCpuLimit.
     */
    public void setObjsyncCpuLimit(Integer  objsyncCpuLimit) {
        this.objsyncCpuLimit = objsyncCpuLimit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Hub election interval for interse object distribution.
     * Allowed values are 30-300.
     * Field introduced in 20.1.3.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return objsyncHubElectInterval
     */
    public Integer getObjsyncHubElectInterval() {
        return objsyncHubElectInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Hub election interval for interse object distribution.
     * Allowed values are 30-300.
     * Field introduced in 20.1.3.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param objsyncHubElectInterval set the objsyncHubElectInterval.
     */
    public void setObjsyncHubElectInterval(Integer  objsyncHubElectInterval) {
        this.objsyncHubElectInterval = objsyncHubElectInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reconcile interval for interse object distribution.
     * Allowed values are 1-120.
     * Field introduced in 20.1.3.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return objsyncReconcileInterval
     */
    public Integer getObjsyncReconcileInterval() {
        return objsyncReconcileInterval;
    }

    /**
     * This is the setter method to the attribute.
     * Reconcile interval for interse object distribution.
     * Allowed values are 1-120.
     * Field introduced in 20.1.3.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param objsyncReconcileInterval set the objsyncReconcileInterval.
     */
    public void setObjsyncReconcileInterval(Integer  objsyncReconcileInterval) {
        this.objsyncReconcileInterval = objsyncReconcileInterval;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ObjSyncConfig objObjSyncConfig = (ObjSyncConfig) o;
      return   Objects.equals(this.objsyncCpuLimit, objObjSyncConfig.objsyncCpuLimit)&&
  Objects.equals(this.objsyncReconcileInterval, objObjSyncConfig.objsyncReconcileInterval)&&
  Objects.equals(this.objsyncHubElectInterval, objObjSyncConfig.objsyncHubElectInterval)&&
  Objects.equals(this.certValidationMode, objObjSyncConfig.certValidationMode);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ObjSyncConfig {\n");
                  sb.append("    certValidationMode: ").append(toIndentedString(certValidationMode)).append("\n");
                        sb.append("    objsyncCpuLimit: ").append(toIndentedString(objsyncCpuLimit)).append("\n");
                        sb.append("    objsyncHubElectInterval: ").append(toIndentedString(objsyncHubElectInterval)).append("\n");
                        sb.append("    objsyncReconcileInterval: ").append(toIndentedString(objsyncReconcileInterval)).append("\n");
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
