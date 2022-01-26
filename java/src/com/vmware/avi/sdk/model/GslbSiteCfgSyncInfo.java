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
 * The GslbSiteCfgSyncInfo is a POJO class extends AviRestResource that used for creating
 * GslbSiteCfgSyncInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbSiteCfgSyncInfo  {
    @JsonProperty("errored_objects")
    private List<VersionInfo> erroredObjects = null;

    @JsonProperty("last_changed_time")
    private TimeStamp lastChangedTime = null;

    @JsonProperty("last_fail_obj")
    private ConfigVersionStatus lastFailObj = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("recommendation")
    private String recommendation = null;

    @JsonProperty("sync_state")
    private String syncState = null;


    /**
     * This is the getter method this will return the attribute value.
     * Objects that could not be synced to the site .
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return erroredObjects
     */
    public List<VersionInfo> getErroredObjects() {
        return erroredObjects;
    }

    /**
     * This is the setter method. this will set the erroredObjects
     * Objects that could not be synced to the site .
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return erroredObjects
     */
    public void setErroredObjects(List<VersionInfo>  erroredObjects) {
        this.erroredObjects = erroredObjects;
    }

    /**
     * This is the setter method this will set the erroredObjects
     * Objects that could not be synced to the site .
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return erroredObjects
     */
    public GslbSiteCfgSyncInfo addErroredObjectsItem(VersionInfo erroredObjectsItem) {
      if (this.erroredObjects == null) {
        this.erroredObjects = new ArrayList<VersionInfo>();
      }
      this.erroredObjects.add(erroredObjectsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Placeholder for description of property last_changed_time of obj type gslbsitecfgsyncinfo field type str  type ref.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastChangedTime
     */
    public TimeStamp getLastChangedTime() {
        return lastChangedTime;
    }

    /**
     * This is the setter method to the attribute.
     * Placeholder for description of property last_changed_time of obj type gslbsitecfgsyncinfo field type str  type ref.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastChangedTime set the lastChangedTime.
     */
    public void setLastChangedTime(TimeStamp lastChangedTime) {
        this.lastChangedTime = lastChangedTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Last object having replication issue.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastFailObj
     */
    public ConfigVersionStatus getLastFailObj() {
        return lastFailObj;
    }

    /**
     * This is the setter method to the attribute.
     * Last object having replication issue.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastFailObj set the lastFailObj.
     */
    public void setLastFailObj(ConfigVersionStatus lastFailObj) {
        this.lastFailObj = lastFailObj;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Reason for the replication issues.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * Reason for the replication issues.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Recommended way to resolve replication issue.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return recommendation
     */
    public String getRecommendation() {
        return recommendation;
    }

    /**
     * This is the setter method to the attribute.
     * Recommended way to resolve replication issue.
     * Field introduced in 21.1.3.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param recommendation set the recommendation.
     */
    public void setRecommendation(String  recommendation) {
        this.recommendation = recommendation;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Configuration sync-state of the site.
     * Enum options - GSLB_SITE_CFG_IN_SYNC, GSLB_SITE_CFG_OUT_OF_SYNC, GSLB_SITE_CFG_SYNC_DISABLED, GSLB_SITE_CFG_SYNC_IN_PROGRESS,
     * GSLB_SITE_CFG_SYNC_NOT_APPLICABLE, GSLB_SITE_CFG_SYNCED_TILL_CHECKPOINT, GSLB_SITE_CFG_SYNC_SUSPENDED, GSLB_SITE_CFG_SYNC_STALLED.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return syncState
     */
    public String getSyncState() {
        return syncState;
    }

    /**
     * This is the setter method to the attribute.
     * Configuration sync-state of the site.
     * Enum options - GSLB_SITE_CFG_IN_SYNC, GSLB_SITE_CFG_OUT_OF_SYNC, GSLB_SITE_CFG_SYNC_DISABLED, GSLB_SITE_CFG_SYNC_IN_PROGRESS,
     * GSLB_SITE_CFG_SYNC_NOT_APPLICABLE, GSLB_SITE_CFG_SYNCED_TILL_CHECKPOINT, GSLB_SITE_CFG_SYNC_SUSPENDED, GSLB_SITE_CFG_SYNC_STALLED.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param syncState set the syncState.
     */
    public void setSyncState(String  syncState) {
        this.syncState = syncState;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GslbSiteCfgSyncInfo objGslbSiteCfgSyncInfo = (GslbSiteCfgSyncInfo) o;
      return   Objects.equals(this.syncState, objGslbSiteCfgSyncInfo.syncState)&&
  Objects.equals(this.lastChangedTime, objGslbSiteCfgSyncInfo.lastChangedTime)&&
  Objects.equals(this.erroredObjects, objGslbSiteCfgSyncInfo.erroredObjects)&&
  Objects.equals(this.reason, objGslbSiteCfgSyncInfo.reason)&&
  Objects.equals(this.recommendation, objGslbSiteCfgSyncInfo.recommendation)&&
  Objects.equals(this.lastFailObj, objGslbSiteCfgSyncInfo.lastFailObj);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbSiteCfgSyncInfo {\n");
                  sb.append("    erroredObjects: ").append(toIndentedString(erroredObjects)).append("\n");
                        sb.append("    lastChangedTime: ").append(toIndentedString(lastChangedTime)).append("\n");
                        sb.append("    lastFailObj: ").append(toIndentedString(lastFailObj)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
                        sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
                        sb.append("    syncState: ").append(toIndentedString(syncState)).append("\n");
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
