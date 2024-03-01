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
 * The SystemReport is a POJO class extends AviRestResource that used for creating
 * SystemReport.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemReport extends AviRestResource  {
    @JsonProperty("archive_ref")
    private String archiveRef = null;

    @JsonProperty("controller_patch_image_ref")
    private String controllerPatchImageRef = null;

    @JsonProperty("downloadable")
    private Boolean downloadable = false;

    @JsonProperty("events")
    private List<ReportEvent> events = null;

    @JsonProperty("image_ref")
    private String imageRef = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("readiness_reports")
    private List<ReportDetail> readinessReports = null;

    @JsonProperty("se_patch_image_ref")
    private String sePatchImageRef = null;

    @JsonProperty("state")
    private ReportOpsState state = null;

    @JsonProperty("summary")
    private ReportSummary summary = null;

    @JsonProperty("tenant_ref")
    private String tenantRef = null;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * Relative path to the report archive file on filesystem.the archive includes exported system configuration and current object as json.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return archiveRef
     */
    public String getArchiveRef() {
        return archiveRef;
    }

    /**
     * This is the setter method to the attribute.
     * Relative path to the report archive file on filesystem.the archive includes exported system configuration and current object as json.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param archiveRef set the archiveRef.
     */
    public void setArchiveRef(String  archiveRef) {
        this.archiveRef = archiveRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Controller patch image associated with the report.
     * It is a reference to an object of type image.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerPatchImageRef
     */
    public String getControllerPatchImageRef() {
        return controllerPatchImageRef;
    }

    /**
     * This is the setter method to the attribute.
     * Controller patch image associated with the report.
     * It is a reference to an object of type image.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerPatchImageRef set the controllerPatchImageRef.
     */
    public void setControllerPatchImageRef(String  controllerPatchImageRef) {
        this.controllerPatchImageRef = controllerPatchImageRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates whether this report is downloadable as an archive.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return downloadable
     */
    public Boolean getDownloadable() {
        return downloadable;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates whether this report is downloadable as an archive.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param downloadable set the downloadable.
     */
    public void setDownloadable(Boolean  downloadable) {
        this.downloadable = downloadable;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of events associated with the report.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public List<ReportEvent> getEvents() {
        return events;
    }

    /**
     * This is the setter method. this will set the events
     * List of events associated with the report.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public void setEvents(List<ReportEvent>  events) {
        this.events = events;
    }

    /**
     * This is the setter method this will set the events
     * List of events associated with the report.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public SystemReport addEventsItem(ReportEvent eventsItem) {
      if (this.events == null) {
        this.events = new ArrayList<ReportEvent>();
      }
      this.events.add(eventsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * System image associated with the report.
     * It is a reference to an object of type image.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return imageRef
     */
    public String getImageRef() {
        return imageRef;
    }

    /**
     * This is the setter method to the attribute.
     * System image associated with the report.
     * It is a reference to an object of type image.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param imageRef set the imageRef.
     */
    public void setImageRef(String  imageRef) {
        this.imageRef = imageRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the report derived from operation in a readable format.
     * Ex  upgrade_system_1a5c.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the report derived from operation in a readable format.
     * Ex  upgrade_system_1a5c.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Readiness state of the system.
     * Ex  upgrade pre-check results.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return readinessReports
     */
    public List<ReportDetail> getReadinessReports() {
        return readinessReports;
    }

    /**
     * This is the setter method. this will set the readinessReports
     * Readiness state of the system.
     * Ex  upgrade pre-check results.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return readinessReports
     */
    public void setReadinessReports(List<ReportDetail>  readinessReports) {
        this.readinessReports = readinessReports;
    }

    /**
     * This is the setter method this will set the readinessReports
     * Readiness state of the system.
     * Ex  upgrade pre-check results.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return readinessReports
     */
    public SystemReport addReadinessReportsItem(ReportDetail readinessReportsItem) {
      if (this.readinessReports == null) {
        this.readinessReports = new ArrayList<ReportDetail>();
      }
      this.readinessReports.add(readinessReportsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Se patch image associated with the report.
     * It is a reference to an object of type image.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sePatchImageRef
     */
    public String getSePatchImageRef() {
        return sePatchImageRef;
    }

    /**
     * This is the setter method to the attribute.
     * Se patch image associated with the report.
     * It is a reference to an object of type image.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sePatchImageRef set the sePatchImageRef.
     */
    public void setSePatchImageRef(String  sePatchImageRef) {
        this.sePatchImageRef = sePatchImageRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Report state combines all applicable states.
     * Ex  readiness_reports.system_readiness.state.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public ReportOpsState getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Report state combines all applicable states.
     * Ex  readiness_reports.system_readiness.state.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(ReportOpsState state) {
        this.state = state;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Summary of the report.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return summary
     */
    public ReportSummary getSummary() {
        return summary;
    }

    /**
     * This is the setter method to the attribute.
     * Summary of the report.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param summary set the summary.
     */
    public void setSummary(ReportSummary summary) {
        this.summary = summary;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant uuid associated with the object.
     * It is a reference to an object of type tenant.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant uuid associated with the object.
     * It is a reference to an object of type tenant.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
     * Uuid identifier for the report.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid identifier for the report.
     * Field introduced in 22.1.6.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
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
      SystemReport objSystemReport = (SystemReport) o;
      return   Objects.equals(this.uuid, objSystemReport.uuid)&&
  Objects.equals(this.name, objSystemReport.name)&&
  Objects.equals(this.tenantRef, objSystemReport.tenantRef)&&
  Objects.equals(this.imageRef, objSystemReport.imageRef)&&
  Objects.equals(this.controllerPatchImageRef, objSystemReport.controllerPatchImageRef)&&
  Objects.equals(this.sePatchImageRef, objSystemReport.sePatchImageRef)&&
  Objects.equals(this.state, objSystemReport.state)&&
  Objects.equals(this.downloadable, objSystemReport.downloadable)&&
  Objects.equals(this.archiveRef, objSystemReport.archiveRef)&&
  Objects.equals(this.summary, objSystemReport.summary)&&
  Objects.equals(this.readinessReports, objSystemReport.readinessReports)&&
  Objects.equals(this.events, objSystemReport.events);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SystemReport {\n");
                  sb.append("    archiveRef: ").append(toIndentedString(archiveRef)).append("\n");
                        sb.append("    controllerPatchImageRef: ").append(toIndentedString(controllerPatchImageRef)).append("\n");
                        sb.append("    downloadable: ").append(toIndentedString(downloadable)).append("\n");
                        sb.append("    events: ").append(toIndentedString(events)).append("\n");
                        sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    readinessReports: ").append(toIndentedString(readinessReports)).append("\n");
                        sb.append("    sePatchImageRef: ").append(toIndentedString(sePatchImageRef)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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
