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
 * The CaseConfig is a POJO class extends AviRestResource that used for creating
 * CaseConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CaseConfig  {
    @JsonProperty("category")
    private String category = "ALB_SUPPORT_CATEGORY";

    @JsonProperty("enable_auto_case_creation_on_controller_failure")
    private Boolean enableAutoCaseCreationOnControllerFailure = false;

    @JsonProperty("enable_auto_case_creation_on_se_failure")
    private Boolean enableAutoCaseCreationOnSeFailure = false;

    @JsonProperty("enable_cleanup_of_attached_files")
    private Boolean enableCleanupOfAttachedFiles = true;



    /**
     * This is the getter method this will return the attribute value.
     * Service category.
     * Enum options - ALB_THREAT_INTELLIGENCE_CATEGORY, ALB_SUPPORT_CATEGORY, ALB_LICENSE_CATEGORY.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ALB_SUPPORT_CATEGORY".
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * This is the setter method to the attribute.
     * Service category.
     * Enum options - ALB_THREAT_INTELLIGENCE_CATEGORY, ALB_SUPPORT_CATEGORY, ALB_LICENSE_CATEGORY.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as "ALB_SUPPORT_CATEGORY".
     * @param category set the category.
     */
    public void setCategory(String  category) {
        this.category = category;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable pro-active support case creation when a controller failure occurs.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableAutoCaseCreationOnControllerFailure
     */
    public Boolean getEnableAutoCaseCreationOnControllerFailure() {
        return enableAutoCaseCreationOnControllerFailure;
    }

    /**
     * This is the setter method to the attribute.
     * Enable pro-active support case creation when a controller failure occurs.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableAutoCaseCreationOnControllerFailure set the enableAutoCaseCreationOnControllerFailure.
     */
    public void setEnableAutoCaseCreationOnControllerFailure(Boolean  enableAutoCaseCreationOnControllerFailure) {
        this.enableAutoCaseCreationOnControllerFailure = enableAutoCaseCreationOnControllerFailure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable pro-active support case creation when a service engine failure occurs.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return enableAutoCaseCreationOnSeFailure
     */
    public Boolean getEnableAutoCaseCreationOnSeFailure() {
        return enableAutoCaseCreationOnSeFailure;
    }

    /**
     * This is the setter method to the attribute.
     * Enable pro-active support case creation when a service engine failure occurs.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param enableAutoCaseCreationOnSeFailure set the enableAutoCaseCreationOnSeFailure.
     */
    public void setEnableAutoCaseCreationOnSeFailure(Boolean  enableAutoCaseCreationOnSeFailure) {
        this.enableAutoCaseCreationOnSeFailure = enableAutoCaseCreationOnSeFailure;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable cleanup of successfully attached files to support case.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Special default for basic edition is false, essentials edition is false, enterprise is true.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enableCleanupOfAttachedFiles
     */
    public Boolean getEnableCleanupOfAttachedFiles() {
        return enableCleanupOfAttachedFiles;
    }

    /**
     * This is the setter method to the attribute.
     * Enable cleanup of successfully attached files to support case.
     * Field introduced in 21.1.1.
     * Allowed in basic(allowed values- false) edition, essentials(allowed values- false) edition, enterprise edition.
     * Special default for basic edition is false, essentials edition is false, enterprise is true.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enableCleanupOfAttachedFiles set the enableCleanupOfAttachedFiles.
     */
    public void setEnableCleanupOfAttachedFiles(Boolean  enableCleanupOfAttachedFiles) {
        this.enableCleanupOfAttachedFiles = enableCleanupOfAttachedFiles;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      CaseConfig objCaseConfig = (CaseConfig) o;
      return   Objects.equals(this.enableAutoCaseCreationOnControllerFailure, objCaseConfig.enableAutoCaseCreationOnControllerFailure)&&
  Objects.equals(this.enableAutoCaseCreationOnSeFailure, objCaseConfig.enableAutoCaseCreationOnSeFailure)&&
  Objects.equals(this.enableCleanupOfAttachedFiles, objCaseConfig.enableCleanupOfAttachedFiles)&&
  Objects.equals(this.category, objCaseConfig.category);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CaseConfig {\n");
                  sb.append("    category: ").append(toIndentedString(category)).append("\n");
                        sb.append("    enableAutoCaseCreationOnControllerFailure: ").append(toIndentedString(enableAutoCaseCreationOnControllerFailure)).append("\n");
                        sb.append("    enableAutoCaseCreationOnSeFailure: ").append(toIndentedString(enableAutoCaseCreationOnSeFailure)).append("\n");
                        sb.append("    enableCleanupOfAttachedFiles: ").append(toIndentedString(enableCleanupOfAttachedFiles)).append("\n");
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
