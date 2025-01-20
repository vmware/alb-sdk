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
 * The GslbCRMRuntime is a POJO class extends AviRestResource that used for creating
 * GslbCRMRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbCRMRuntime extends AviRestResource  {
    @JsonProperty("cluster_uuid")
    private String clusterUuid;

    @JsonProperty("events")
    private List<EventInfo> events;

    @JsonProperty("fds_info")
    private FdsInfo fdsInfo;

    @JsonProperty("local_info")
    private LocalInfo localInfo;

    @JsonProperty("name")
    private String name;

    @JsonProperty("obj_uuid")
    private String objUuid;

    @JsonProperty("remote_info")
    private RemoteInfo remoteInfo;

    @JsonProperty("replication_policy")
    private ReplicationPolicy replicationPolicy;

    @JsonProperty("site_name")
    private String siteName;

    @JsonProperty("status_info")
    private OperationalStatus statusInfo;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * This field tracks the site_uuid for local/remote site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterUuid
     */
    public String getClusterUuid() {
        return clusterUuid;
    }

    /**
     * This is the setter method to the attribute.
     * This field tracks the site_uuid for local/remote site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterUuid set the clusterUuid.
     */
    public void setClusterUuid(String  clusterUuid) {
        this.clusterUuid = clusterUuid;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Events captured wrt to config replication.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public List<EventInfo> getEvents() {
        return events;
    }

    /**
     * This is the setter method. this will set the events
     * Events captured wrt to config replication.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public void setEvents(List<EventInfo>  events) {
        this.events = events;
    }

    /**
     * This is the setter method this will set the events
     * Events captured wrt to config replication.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public GslbCRMRuntime addEventsItem(EventInfo eventsItem) {
      if (this.events == null) {
        this.events = new ArrayList<EventInfo>();
      }
      this.events.add(eventsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Federated data store related info.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return fdsInfo
     */
    public FdsInfo getFdsInfo() {
        return fdsInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Federated data store related info.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param fdsInfo set the fdsInfo.
     */
    public void setFdsInfo(FdsInfo fdsInfo) {
        this.fdsInfo = fdsInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Represents local info for the site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return localInfo
     */
    public LocalInfo getLocalInfo() {
        return localInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Represents local info for the site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param localInfo set the localInfo.
     */
    public void setLocalInfo(LocalInfo localInfo) {
        this.localInfo = localInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of db entry.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * The name of db entry.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb crm runtime object uuid.
     * Points to the gslb to which this belongs.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objUuid
     */
    public String getObjUuid() {
        return objUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb crm runtime object uuid.
     * Points to the gslb to which this belongs.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objUuid set the objUuid.
     */
    public void setObjUuid(String  objUuid) {
        this.objUuid = objUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Respresents remote site's info wrt to replication.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteInfo
     */
    public RemoteInfo getRemoteInfo() {
        return remoteInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Respresents remote site's info wrt to replication.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param remoteInfo set the remoteInfo.
     */
    public void setRemoteInfo(RemoteInfo remoteInfo) {
        this.remoteInfo = remoteInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Policy for replicating configuration to the active follower sites.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return replicationPolicy
     */
    public ReplicationPolicy getReplicationPolicy() {
        return replicationPolicy;
    }

    /**
     * This is the setter method to the attribute.
     * Policy for replicating configuration to the active follower sites.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param replicationPolicy set the replicationPolicy.
     */
    public void setReplicationPolicy(ReplicationPolicy replicationPolicy) {
        this.replicationPolicy = replicationPolicy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field tracks the site name.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This is the setter method to the attribute.
     * This field tracks the site name.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param siteName set the siteName.
     */
    public void setSiteName(String  siteName) {
        this.siteName = siteName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Crm operational status.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return statusInfo
     */
    public OperationalStatus getStatusInfo() {
        return statusInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Crm operational status.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param statusInfo set the statusInfo.
     */
    public void setStatusInfo(OperationalStatus statusInfo) {
        this.statusInfo = statusInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the tenant.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the tenant.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
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
     * The uuid of db entry.
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
     * The uuid of db entry.
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
      GslbCRMRuntime objGslbCRMRuntime = (GslbCRMRuntime) o;
      return   Objects.equals(this.uuid, objGslbCRMRuntime.uuid)&&
  Objects.equals(this.name, objGslbCRMRuntime.name)&&
  Objects.equals(this.objUuid, objGslbCRMRuntime.objUuid)&&
  Objects.equals(this.clusterUuid, objGslbCRMRuntime.clusterUuid)&&
  Objects.equals(this.siteName, objGslbCRMRuntime.siteName)&&
  Objects.equals(this.statusInfo, objGslbCRMRuntime.statusInfo)&&
  Objects.equals(this.fdsInfo, objGslbCRMRuntime.fdsInfo)&&
  Objects.equals(this.replicationPolicy, objGslbCRMRuntime.replicationPolicy)&&
  Objects.equals(this.remoteInfo, objGslbCRMRuntime.remoteInfo)&&
  Objects.equals(this.localInfo, objGslbCRMRuntime.localInfo)&&
  Objects.equals(this.events, objGslbCRMRuntime.events)&&
  Objects.equals(this.tenantRef, objGslbCRMRuntime.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbCRMRuntime {\n");
                  sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
                        sb.append("    events: ").append(toIndentedString(events)).append("\n");
                        sb.append("    fdsInfo: ").append(toIndentedString(fdsInfo)).append("\n");
                        sb.append("    localInfo: ").append(toIndentedString(localInfo)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
                        sb.append("    remoteInfo: ").append(toIndentedString(remoteInfo)).append("\n");
                        sb.append("    replicationPolicy: ").append(toIndentedString(replicationPolicy)).append("\n");
                        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
                        sb.append("    statusInfo: ").append(toIndentedString(statusInfo)).append("\n");
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
