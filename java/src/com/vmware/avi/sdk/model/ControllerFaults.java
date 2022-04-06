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
 * The ControllerFaults is a POJO class extends AviRestResource that used for creating
 * ControllerFaults.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControllerFaults  {
    @JsonProperty("backup_scheduler_faults")
    private Boolean backupSchedulerFaults = true;

    @JsonProperty("cluster_faults")
    private Boolean clusterFaults = true;

    @JsonProperty("deprecated_api_version_faults")
    private Boolean deprecatedApiVersionFaults = true;

    @JsonProperty("license_faults")
    private Boolean licenseFaults = true;

    @JsonProperty("migration_faults")
    private Boolean migrationFaults = true;

    @JsonProperty("sslprofile_faults")
    private Boolean sslprofileFaults = true;



    /**
     * This is the getter method this will return the attribute value.
     * Enable backup scheduler faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return backupSchedulerFaults
     */
    public Boolean getBackupSchedulerFaults() {
        return backupSchedulerFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable backup scheduler faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param backupSchedulerFaults set the backupSchedulerFaults.
     */
    public void setBackupSchedulerFaults(Boolean  backupSchedulerFaults) {
        this.backupSchedulerFaults = backupSchedulerFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable cluster faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return clusterFaults
     */
    public Boolean getClusterFaults() {
        return clusterFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable cluster faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param clusterFaults set the clusterFaults.
     */
    public void setClusterFaults(Boolean  clusterFaults) {
        this.clusterFaults = clusterFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable deprecated api version faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return deprecatedApiVersionFaults
     */
    public Boolean getDeprecatedApiVersionFaults() {
        return deprecatedApiVersionFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable deprecated api version faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param deprecatedApiVersionFaults set the deprecatedApiVersionFaults.
     */
    public void setDeprecatedApiVersionFaults(Boolean  deprecatedApiVersionFaults) {
        this.deprecatedApiVersionFaults = deprecatedApiVersionFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable license faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return licenseFaults
     */
    public Boolean getLicenseFaults() {
        return licenseFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable license faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param licenseFaults set the licenseFaults.
     */
    public void setLicenseFaults(Boolean  licenseFaults) {
        this.licenseFaults = licenseFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable db migration faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return migrationFaults
     */
    public Boolean getMigrationFaults() {
        return migrationFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable db migration faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param migrationFaults set the migrationFaults.
     */
    public void setMigrationFaults(Boolean  migrationFaults) {
        this.migrationFaults = migrationFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable ssl profile faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return sslprofileFaults
     */
    public Boolean getSslprofileFaults() {
        return sslprofileFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable ssl profile faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param sslprofileFaults set the sslprofileFaults.
     */
    public void setSslprofileFaults(Boolean  sslprofileFaults) {
        this.sslprofileFaults = sslprofileFaults;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControllerFaults objControllerFaults = (ControllerFaults) o;
      return   Objects.equals(this.licenseFaults, objControllerFaults.licenseFaults)&&
  Objects.equals(this.clusterFaults, objControllerFaults.clusterFaults)&&
  Objects.equals(this.migrationFaults, objControllerFaults.migrationFaults)&&
  Objects.equals(this.backupSchedulerFaults, objControllerFaults.backupSchedulerFaults)&&
  Objects.equals(this.sslprofileFaults, objControllerFaults.sslprofileFaults)&&
  Objects.equals(this.deprecatedApiVersionFaults, objControllerFaults.deprecatedApiVersionFaults);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControllerFaults {\n");
                  sb.append("    backupSchedulerFaults: ").append(toIndentedString(backupSchedulerFaults)).append("\n");
                        sb.append("    clusterFaults: ").append(toIndentedString(clusterFaults)).append("\n");
                        sb.append("    deprecatedApiVersionFaults: ").append(toIndentedString(deprecatedApiVersionFaults)).append("\n");
                        sb.append("    licenseFaults: ").append(toIndentedString(licenseFaults)).append("\n");
                        sb.append("    migrationFaults: ").append(toIndentedString(migrationFaults)).append("\n");
                        sb.append("    sslprofileFaults: ").append(toIndentedString(sslprofileFaults)).append("\n");
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
