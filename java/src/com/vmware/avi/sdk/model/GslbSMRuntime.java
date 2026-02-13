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
 * The GslbSMRuntime is a POJO class extends AviRestResource that used for creating
 * GslbSMRuntime.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbSMRuntime extends AviRestResource  {
    @JsonProperty("cluster_leader")
    private String clusterLeader;

    @JsonProperty("cluster_uuid")
    private String clusterUuid;

    @JsonProperty("controller_flavor")
    private String controllerFlavor;

    @JsonProperty("dns_configs")
    private List<DNSConfig> dnsConfigs;

    @JsonProperty("dns_info")
    private GslbDnsInfo dnsInfo;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("events")
    private List<EventInfo> events;

    @JsonProperty("health_monitor_info")
    private String healthMonitorInfo;

    @JsonProperty("leader_cluster_uuid")
    private String leaderClusterUuid;

    @JsonProperty("member_type")
    private String memberType = "GSLB_PASSIVE_MEMBER";

    @JsonProperty("name")
    private String name;

    @JsonProperty("node_uuid")
    private String nodeUuid;

    @JsonProperty("num_of_retries")
    private Integer numOfRetries = 0;

    @JsonProperty("obj_uuid")
    private String objUuid;

    @JsonProperty("oper_status")
    private OperationalStatus operStatus;

    @JsonProperty("remote_info")
    private RemoteInfo remoteInfo;

    @JsonProperty("role")
    private String role = "GSLB_NOT_A_MEMBER";

    @JsonProperty("site_name")
    private String siteName;

    @JsonProperty("site_type")
    private String siteType;

    @JsonProperty("state")
    private String state = "SITE_STATE_NULL";

    @JsonProperty("sw_version")
    private String swVersion = "Not-Initialized";

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("view_id")
    private Integer viewId = 0;



    /**
     * This is the getter method this will return the attribute value.
     * The controller cluster leader node uuid.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterLeader
     */
    public String getClusterLeader() {
        return clusterLeader;
    }

    /**
     * This is the setter method to the attribute.
     * The controller cluster leader node uuid.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterLeader set the clusterLeader.
     */
    public void setClusterLeader(String  clusterLeader) {
        this.clusterLeader = clusterLeader;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The site controller cluster uuid.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return clusterUuid
     */
    public String getClusterUuid() {
        return clusterUuid;
    }

    /**
     * This is the setter method to the attribute.
     * The site controller cluster uuid.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param clusterUuid set the clusterUuid.
     */
    public void setClusterUuid(String  clusterUuid) {
        this.clusterUuid = clusterUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Controller flavor of the peer site controller.
     * Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE, CONTROLLER_EXTRA_LARGE.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return controllerFlavor
     */
    public String getControllerFlavor() {
        return controllerFlavor;
    }

    /**
     * This is the setter method to the attribute.
     * Controller flavor of the peer site controller.
     * Enum options - CONTROLLER_ESSENTIALS, CONTROLLER_SMALL, CONTROLLER_MEDIUM, CONTROLLER_LARGE, CONTROLLER_EXTRA_LARGE.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param controllerFlavor set the controllerFlavor.
     */
    public void setControllerFlavor(String  controllerFlavor) {
        this.controllerFlavor = controllerFlavor;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Sub domain configuration for the gslb.
     * Gslb service's fqdn must be a match one of these subdomains.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsConfigs
     */
    public List<DNSConfig> getDnsConfigs() {
        return dnsConfigs;
    }

    /**
     * This is the setter method. this will set the dnsConfigs
     * Sub domain configuration for the gslb.
     * Gslb service's fqdn must be a match one of these subdomains.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsConfigs
     */
    public void setDnsConfigs(List<DNSConfig>  dnsConfigs) {
        this.dnsConfigs = dnsConfigs;
    }

    /**
     * This is the setter method this will set the dnsConfigs
     * Sub domain configuration for the gslb.
     * Gslb service's fqdn must be a match one of these subdomains.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsConfigs
     */
    public GslbSMRuntime addDnsConfigsItem(DNSConfig dnsConfigsItem) {
      if (this.dnsConfigs == null) {
        this.dnsConfigs = new ArrayList<DNSConfig>();
      }
      this.dnsConfigs.add(dnsConfigsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Dns info at the site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dnsInfo
     */
    public GslbDnsInfo getDnsInfo() {
        return dnsInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Dns info at the site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dnsInfo set the dnsInfo.
     */
    public void setDnsInfo(GslbDnsInfo dnsInfo) {
        this.dnsInfo = dnsInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Activate/de-activate state retrieved from the cfg.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Activate/de-activate state retrieved from the cfg.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Captures sm related events.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public List<EventInfo> getEvents() {
        return events;
    }

    /**
     * This is the setter method. this will set the events
     * Captures sm related events.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public void setEvents(List<EventInfo>  events) {
        this.events = events;
    }

    /**
     * This is the setter method this will set the events
     * Captures sm related events.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return events
     */
    public GslbSMRuntime addEventsItem(EventInfo eventsItem) {
      if (this.events == null) {
        this.events = new ArrayList<EventInfo>();
      }
      this.events.add(eventsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field will provide information on origin(site name) of the health monitoring information.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return healthMonitorInfo
     */
    public String getHealthMonitorInfo() {
        return healthMonitorInfo;
    }

    /**
     * This is the setter method to the attribute.
     * This field will provide information on origin(site name) of the health monitoring information.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param healthMonitorInfo set the healthMonitorInfo.
     */
    public void setHealthMonitorInfo(String  healthMonitorInfo) {
        this.healthMonitorInfo = healthMonitorInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Mark this site as leader of gslb configuration.
     * This site is the one among the avi sites.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return leaderClusterUuid
     */
    public String getLeaderClusterUuid() {
        return leaderClusterUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Mark this site as leader of gslb configuration.
     * This site is the one among the avi sites.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param leaderClusterUuid set the leaderClusterUuid.
     */
    public void setLeaderClusterUuid(String  leaderClusterUuid) {
        this.leaderClusterUuid = leaderClusterUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The site's member type  a leader is set to active while all members are set to passive.
     * Enum options - GSLB_ACTIVE_MEMBER, GSLB_PASSIVE_MEMBER.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_PASSIVE_MEMBER".
     * @return memberType
     */
    public String getMemberType() {
        return memberType;
    }

    /**
     * This is the setter method to the attribute.
     * The site's member type  a leader is set to active while all members are set to passive.
     * Enum options - GSLB_ACTIVE_MEMBER, GSLB_PASSIVE_MEMBER.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_PASSIVE_MEMBER".
     * @param memberType set the memberType.
     */
    public void setMemberType(String  memberType) {
        this.memberType = memberType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of db entry.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The controller cluster node uuid that processes the site.sites are sharded across the cluster nodes.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nodeUuid
     */
    public String getNodeUuid() {
        return nodeUuid;
    }

    /**
     * This is the setter method to the attribute.
     * The controller cluster node uuid that processes the site.sites are sharded across the cluster nodes.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nodeUuid set the nodeUuid.
     */
    public void setNodeUuid(String  nodeUuid) {
        this.nodeUuid = nodeUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of retry attempts to reach the remote site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return numOfRetries
     */
    public Integer getNumOfRetries() {
        return numOfRetries;
    }

    /**
     * This is the setter method to the attribute.
     * Number of retry attempts to reach the remote site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param numOfRetries set the numOfRetries.
     */
    public void setNumOfRetries(Integer  numOfRetries) {
        this.numOfRetries = numOfRetries;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb sm runtime object uuid.
     * Points to the gslb to which this belongs.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return objUuid
     */
    public String getObjUuid() {
        return objUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb sm runtime object uuid.
     * Points to the gslb to which this belongs.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param objUuid set the objUuid.
     */
    public void setObjUuid(String  objUuid) {
        this.objUuid = objUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Gslb site operational status, represents whether site is up or down.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return operStatus
     */
    public OperationalStatus getOperStatus() {
        return operStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Gslb site operational status, represents whether site is up or down.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param operStatus set the operStatus.
     */
    public void setOperStatus(OperationalStatus operStatus) {
        this.operStatus = operStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Remote info is basically updated by grw.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteInfo
     */
    public RemoteInfo getRemoteInfo() {
        return remoteInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Remote info is basically updated by grw.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param remoteInfo set the remoteInfo.
     */
    public void setRemoteInfo(RemoteInfo remoteInfo) {
        this.remoteInfo = remoteInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Site role  leader or follower.
     * Enum options - GSLB_LEADER, GSLB_MEMBER, GSLB_NOT_A_MEMBER.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_NOT_A_MEMBER".
     * @return role
     */
    public String getRole() {
        return role;
    }

    /**
     * This is the setter method to the attribute.
     * Site role  leader or follower.
     * Enum options - GSLB_LEADER, GSLB_MEMBER, GSLB_NOT_A_MEMBER.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_NOT_A_MEMBER".
     * @param role set the role.
     */
    public void setRole(String  role) {
        this.role = role;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The gslb site name.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return siteName
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * This is the setter method to the attribute.
     * The gslb site name.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param siteName set the siteName.
     */
    public void setSiteName(String  siteName) {
        this.siteName = siteName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Indicates if it is avi site or third-party.
     * Enum options - GSLB_AVI_SITE, GSLB_THIRD_PARTY_SITE.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return siteType
     */
    public String getSiteType() {
        return siteType;
    }

    /**
     * This is the setter method to the attribute.
     * Indicates if it is avi site or third-party.
     * Enum options - GSLB_AVI_SITE, GSLB_THIRD_PARTY_SITE.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param siteType set the siteType.
     */
    public void setSiteType(String  siteType) {
        this.siteType = siteType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Represents the state of the site.
     * Enum options - SITE_STATE_NULL, SITE_STATE_JOIN_IN_PROGRESS, SITE_STATE_LEAVE_IN_PROGRESS, SITE_STATE_INIT, SITE_STATE_UNREACHABLE,
     * SITE_STATE_MMODE, SITE_STATE_DISABLE_IN_PROGRESS, SITE_STATE_DISABLED, SITE_STATE_HS_IN_PROGRESS.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SITE_STATE_NULL".
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Represents the state of the site.
     * Enum options - SITE_STATE_NULL, SITE_STATE_JOIN_IN_PROGRESS, SITE_STATE_LEAVE_IN_PROGRESS, SITE_STATE_INIT, SITE_STATE_UNREACHABLE,
     * SITE_STATE_MMODE, SITE_STATE_DISABLE_IN_PROGRESS, SITE_STATE_DISABLED, SITE_STATE_HS_IN_PROGRESS.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SITE_STATE_NULL".
     * @param state set the state.
     */
    public void setState(String  state) {
        this.state = state;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current software version of the site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "Not-Initialized".
     * @return swVersion
     */
    public String getSwVersion() {
        return swVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Current software version of the site.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "Not-Initialized".
     * @param swVersion set the swVersion.
     */
    public void setSwVersion(String  swVersion) {
        this.swVersion = swVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the tenant.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * The uuid of db entry.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The view-id is used in change-leader mode to differentiate partitioned groups while they have the same gslb namespace.
     * Each partitioned group will be able to operate independently by using the view-id.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return viewId
     */
    public Integer getViewId() {
        return viewId;
    }

    /**
     * This is the setter method to the attribute.
     * The view-id is used in change-leader mode to differentiate partitioned groups while they have the same gslb namespace.
     * Each partitioned group will be able to operate independently by using the view-id.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param viewId set the viewId.
     */
    public void setViewId(Integer  viewId) {
        this.viewId = viewId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GslbSMRuntime objGslbSMRuntime = (GslbSMRuntime) o;
      return   Objects.equals(this.uuid, objGslbSMRuntime.uuid)&&
  Objects.equals(this.name, objGslbSMRuntime.name)&&
  Objects.equals(this.clusterUuid, objGslbSMRuntime.clusterUuid)&&
  Objects.equals(this.siteName, objGslbSMRuntime.siteName)&&
  Objects.equals(this.objUuid, objGslbSMRuntime.objUuid)&&
  Objects.equals(this.nodeUuid, objGslbSMRuntime.nodeUuid)&&
  Objects.equals(this.clusterLeader, objGslbSMRuntime.clusterLeader)&&
  Objects.equals(this.role, objGslbSMRuntime.role)&&
  Objects.equals(this.memberType, objGslbSMRuntime.memberType)&&
  Objects.equals(this.enabled, objGslbSMRuntime.enabled)&&
  Objects.equals(this.siteType, objGslbSMRuntime.siteType)&&
  Objects.equals(this.swVersion, objGslbSMRuntime.swVersion)&&
  Objects.equals(this.state, objGslbSMRuntime.state)&&
  Objects.equals(this.operStatus, objGslbSMRuntime.operStatus)&&
  Objects.equals(this.dnsConfigs, objGslbSMRuntime.dnsConfigs)&&
  Objects.equals(this.dnsInfo, objGslbSMRuntime.dnsInfo)&&
  Objects.equals(this.remoteInfo, objGslbSMRuntime.remoteInfo)&&
  Objects.equals(this.events, objGslbSMRuntime.events)&&
  Objects.equals(this.leaderClusterUuid, objGslbSMRuntime.leaderClusterUuid)&&
  Objects.equals(this.viewId, objGslbSMRuntime.viewId)&&
  Objects.equals(this.numOfRetries, objGslbSMRuntime.numOfRetries)&&
  Objects.equals(this.healthMonitorInfo, objGslbSMRuntime.healthMonitorInfo)&&
  Objects.equals(this.tenantRef, objGslbSMRuntime.tenantRef)&&
  Objects.equals(this.controllerFlavor, objGslbSMRuntime.controllerFlavor);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbSMRuntime {\n");
                  sb.append("    clusterLeader: ").append(toIndentedString(clusterLeader)).append("\n");
                        sb.append("    clusterUuid: ").append(toIndentedString(clusterUuid)).append("\n");
                        sb.append("    controllerFlavor: ").append(toIndentedString(controllerFlavor)).append("\n");
                        sb.append("    dnsConfigs: ").append(toIndentedString(dnsConfigs)).append("\n");
                        sb.append("    dnsInfo: ").append(toIndentedString(dnsInfo)).append("\n");
                        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    events: ").append(toIndentedString(events)).append("\n");
                        sb.append("    healthMonitorInfo: ").append(toIndentedString(healthMonitorInfo)).append("\n");
                        sb.append("    leaderClusterUuid: ").append(toIndentedString(leaderClusterUuid)).append("\n");
                        sb.append("    memberType: ").append(toIndentedString(memberType)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    nodeUuid: ").append(toIndentedString(nodeUuid)).append("\n");
                        sb.append("    numOfRetries: ").append(toIndentedString(numOfRetries)).append("\n");
                        sb.append("    objUuid: ").append(toIndentedString(objUuid)).append("\n");
                        sb.append("    operStatus: ").append(toIndentedString(operStatus)).append("\n");
                        sb.append("    remoteInfo: ").append(toIndentedString(remoteInfo)).append("\n");
                        sb.append("    role: ").append(toIndentedString(role)).append("\n");
                        sb.append("    siteName: ").append(toIndentedString(siteName)).append("\n");
                        sb.append("    siteType: ").append(toIndentedString(siteType)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    swVersion: ").append(toIndentedString(swVersion)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    viewId: ").append(toIndentedString(viewId)).append("\n");
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
