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
 * The TechSupportProfile is a POJO class extends AviRestResource that used for creating
 * TechSupportProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechSupportProfile extends AviRestResource  {
    @JsonProperty("archive_rules")
    private ArchiveRules archiveRules;

    @JsonProperty("event_params")
    private TechSupportEventParams eventParams;

    @JsonProperty("file_size_threshold")
    private Integer fileSizeThreshold = 128;

    @JsonProperty("max_disk_size_percent")
    private Integer maxDiskSizePercent = 10;

    @JsonProperty("min_free_disk_required")
    private Integer minFreeDiskRequired = 5;

    @JsonProperty("no_of_techsupport_retentions")
    private Integer noOfTechsupportRetentions = 4;

    @JsonProperty("simultaneous_invocations")
    private Integer simultaneousInvocations = 1;

    @JsonProperty("task_timeout")
    private Integer taskTimeout = 180;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Define the policy for techsupport archive rules.
     * These rules allow you to specify files that should be collected in the techsupport bundle, even if they exceed the default file size threshold.
     * E.g.
     * To ensure a 450mb file, such as /var/sample.log, is collected with every invocation, configure and add its path to the techsupportprofile.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return archiveRules
     */
    public ArchiveRules getArchiveRules() {
        return archiveRules;
    }

    /**
     * This is the setter method to the attribute.
     * Define the policy for techsupport archive rules.
     * These rules allow you to specify files that should be collected in the techsupport bundle, even if they exceed the default file size threshold.
     * E.g.
     * To ensure a 450mb file, such as /var/sample.log, is collected with every invocation, configure and add its path to the techsupportprofile.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param archiveRules set the archiveRules.
     */
    public void setArchiveRules(ArchiveRules archiveRules) {
        this.archiveRules = archiveRules;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Specify this params to set threshold for event files.
     * User provided parameters will take precedence over the profile parameters.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventParams
     */
    public TechSupportEventParams getEventParams() {
        return eventParams;
    }

    /**
     * This is the setter method to the attribute.
     * Specify this params to set threshold for event files.
     * User provided parameters will take precedence over the profile parameters.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventParams set the eventParams.
     */
    public void setEventParams(TechSupportEventParams eventParams) {
        this.eventParams = eventParams;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max file size threshold to archive in techsupport collection.
     * Files above this threshold will not be collected and an warning will be flagged.
     * Allowed values are 128-512.
     * Field introduced in 31.2.1.
     * Unit is mb.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 128.
     * @return fileSizeThreshold
     */
    public Integer getFileSizeThreshold() {
        return fileSizeThreshold;
    }

    /**
     * This is the setter method to the attribute.
     * Max file size threshold to archive in techsupport collection.
     * Files above this threshold will not be collected and an warning will be flagged.
     * Allowed values are 128-512.
     * Field introduced in 31.2.1.
     * Unit is mb.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 128.
     * @param fileSizeThreshold set the fileSizeThreshold.
     */
    public void setFileSizeThreshold(Integer  fileSizeThreshold) {
        this.fileSizeThreshold = fileSizeThreshold;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Max disk size in percent of total disk size reserved for the techsupport.
     * The value is in percentage to make it agnostic of controller flavors.
     * E.g.
     * Small [disk=5 gb, ts space available = 500mb] large [ disk= 100gb, ts space available= 10gb] xl [disk=1tb, ts space available=100gb].
     * Allowed values are 10-25.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @return maxDiskSizePercent
     */
    public Integer getMaxDiskSizePercent() {
        return maxDiskSizePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Max disk size in percent of total disk size reserved for the techsupport.
     * The value is in percentage to make it agnostic of controller flavors.
     * E.g.
     * Small [disk=5 gb, ts space available = 500mb] large [ disk= 100gb, ts space available= 10gb] xl [disk=1tb, ts space available=100gb].
     * Allowed values are 10-25.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 10.
     * @param maxDiskSizePercent set the maxDiskSizePercent.
     */
    public void setMaxDiskSizePercent(Integer  maxDiskSizePercent) {
        this.maxDiskSizePercent = maxDiskSizePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Min free disk required for the techsupport invocation.
     * The value is in percentage to make it agnostic of controller flavors.
     * E.g.
     * Small [disk=5 gb, ts space available = 250mb] large [ disk= 100gb, ts space available= 5gb] xl [disk=1tb, ts space available=50gb].
     * Allowed values are 5-10.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return minFreeDiskRequired
     */
    public Integer getMinFreeDiskRequired() {
        return minFreeDiskRequired;
    }

    /**
     * This is the setter method to the attribute.
     * Min free disk required for the techsupport invocation.
     * The value is in percentage to make it agnostic of controller flavors.
     * E.g.
     * Small [disk=5 gb, ts space available = 250mb] large [ disk= 100gb, ts space available= 5gb] xl [disk=1tb, ts space available=50gb].
     * Allowed values are 5-10.
     * Field introduced in 31.2.1.
     * Unit is percent.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param minFreeDiskRequired set the minFreeDiskRequired.
     */
    public void setMinFreeDiskRequired(Integer  minFreeDiskRequired) {
        this.minFreeDiskRequired = minFreeDiskRequired;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of techsupport to retain from techsupport cleanup policy.
     * Allowed values are 1-5.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return noOfTechsupportRetentions
     */
    public Integer getNoOfTechsupportRetentions() {
        return noOfTechsupportRetentions;
    }

    /**
     * This is the setter method to the attribute.
     * Number of techsupport to retain from techsupport cleanup policy.
     * Allowed values are 1-5.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param noOfTechsupportRetentions set the noOfTechsupportRetentions.
     */
    public void setNoOfTechsupportRetentions(Integer  noOfTechsupportRetentions) {
        this.noOfTechsupportRetentions = noOfTechsupportRetentions;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of simultaneous techsupport invocation allowed.
     * Allowed values are 1-2.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return simultaneousInvocations
     */
    public Integer getSimultaneousInvocations() {
        return simultaneousInvocations;
    }

    /**
     * This is the setter method to the attribute.
     * Number of simultaneous techsupport invocation allowed.
     * Allowed values are 1-2.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param simultaneousInvocations set the simultaneousInvocations.
     */
    public void setSimultaneousInvocations(Integer  simultaneousInvocations) {
        this.simultaneousInvocations = simultaneousInvocations;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Generic timeout for techsupport task collection.
     * This can be used for task, script executions etc.
     * Tweak the timeout value in cases of timeout observation in the logs.
     * Field introduced in 31.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 180.
     * @return taskTimeout
     */
    public Integer getTaskTimeout() {
        return taskTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Generic timeout for techsupport task collection.
     * This can be used for task, script executions etc.
     * Tweak the timeout value in cases of timeout observation in the logs.
     * Field introduced in 31.2.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 180.
     * @param taskTimeout set the taskTimeout.
     */
    public void setTaskTimeout(Integer  taskTimeout) {
        this.taskTimeout = taskTimeout;
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
     * Uuid identifier for the techsupport profile.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid identifier for the techsupport profile.
     * Field introduced in 31.2.1.
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
      TechSupportProfile objTechSupportProfile = (TechSupportProfile) o;
      return   Objects.equals(this.uuid, objTechSupportProfile.uuid)&&
  Objects.equals(this.maxDiskSizePercent, objTechSupportProfile.maxDiskSizePercent)&&
  Objects.equals(this.minFreeDiskRequired, objTechSupportProfile.minFreeDiskRequired)&&
  Objects.equals(this.fileSizeThreshold, objTechSupportProfile.fileSizeThreshold)&&
  Objects.equals(this.simultaneousInvocations, objTechSupportProfile.simultaneousInvocations)&&
  Objects.equals(this.noOfTechsupportRetentions, objTechSupportProfile.noOfTechsupportRetentions)&&
  Objects.equals(this.eventParams, objTechSupportProfile.eventParams)&&
  Objects.equals(this.archiveRules, objTechSupportProfile.archiveRules)&&
  Objects.equals(this.taskTimeout, objTechSupportProfile.taskTimeout);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TechSupportProfile {\n");
                  sb.append("    archiveRules: ").append(toIndentedString(archiveRules)).append("\n");
                        sb.append("    eventParams: ").append(toIndentedString(eventParams)).append("\n");
                        sb.append("    fileSizeThreshold: ").append(toIndentedString(fileSizeThreshold)).append("\n");
                        sb.append("    maxDiskSizePercent: ").append(toIndentedString(maxDiskSizePercent)).append("\n");
                        sb.append("    minFreeDiskRequired: ").append(toIndentedString(minFreeDiskRequired)).append("\n");
                        sb.append("    noOfTechsupportRetentions: ").append(toIndentedString(noOfTechsupportRetentions)).append("\n");
                        sb.append("    simultaneousInvocations: ").append(toIndentedString(simultaneousInvocations)).append("\n");
                        sb.append("    taskTimeout: ").append(toIndentedString(taskTimeout)).append("\n");
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
