// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// EventLog event log
// swagger:model EventLog
type EventLog struct {

	//  Enum options - EVENT_CONTEXT_SYSTEM, EVENT_CONTEXT_CONFIG, EVENT_CONTEXT_APP, EVENT_CONTEXT_ALL. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	Context *string `json:"context,omitempty"`

	// Summary of event details. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	DetailsSummary *string `json:"details_summary,omitempty"`

	// Event Description for each Event  in the table view. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	EventDescription *string `json:"event_description,omitempty"`

	//  Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	EventDetails *EventDetails `json:"event_details,omitempty"`

	//  Enum options - VINFRA_DISC_DC, VINFRA_DISC_HOST, VINFRA_DISC_CLUSTER, VINFRA_DISC_VM, VINFRA_DISC_NW, MGMT_NW_NAME_CHANGED, DISCOVERY_DATACENTER_DEL, VM_ADDED, VM_REMOVED, VINFRA_DISC_COMPLETE, VCENTER_ADDRESS_ERROR, SE_GROUP_CLUSTER_DEL, SE_GROUP_MGMT_NW_DEL, MGMT_NW_DEL, VCENTER_BAD_CREDENTIALS, ESX_HOST_UNREACHABLE, SERVER_DELETED, SE_GROUP_HOST_DEL, VINFRA_DISC_FAILURE, ESX_HOST_POWERED_DOWN, VCENTER_VERSION_NOT_SUPPORTED, VCENTER_CONNECTIVITY_FAIL, VCENTER_CONNECTIVITY_SUCCESS, VCENTER_ACCESS_SLOW, VCENTER_USER_ROLE_CHANGE, VCENTER_NETWQRK_OBJECT_LIMIT_REACHED, VCENTER_SE_TAGGING_FAIL, SE_FATAL_ERROR, SE_HEARTBEAT_FAILURE, SE_MARKED_DOWN, SE_VM_DELETED, SE_VM_PURGED, SE_UP, SE_POWERED_DOWN, SE_REBOOTED, SE_HEALTH_CHECK_FAIL, SE_EXTERNAL_HM_RESTART, SE_DOWN, SE_VERSION_CHECK_FAILED, SE_UPGRADING, SE_ENABLE_STATE_CHANGED, SE_MIGRATE, SE_MGMT_IP_CHANGE, VSPHERE_HA_HOST_FAILURE, SE_ENABLE, CREATING_SE, CREATED_SE, CREATE_SE_FAIL, CREATE_SE_TIMEOUT, DELETING_SE, DELETED_SE, DELETE_SE_FAIL, ADD_NW_SE, DEL_NW_SE, VS_ADD_SE_INT, VS_REMOVED_SE_INT, VS_ADD_SE, VS_REMOVED_SE, ADD_NW_FAIL, RM_DEL_NETWORK_FAIL, REBOOT_SE, MODIFY_NW, MODIFY_NW_FAIL, VS_SE_BOOTUP_FAIL, VS_SE_IP_FAIL, NO_HOST_AVAIL, VS_SWITCHOVER, VS_SWITCHOVER_FAIL, ADD_VIP_VNIC, DEL_VIP_VNIC, CC_ATTACH_IP_SKIPPED, CC_ATTACH_IP_SUCCESS, CC_ATTACH_IP_TIMEDOUT, CC_ATTACH_IP_FAILURE, CC_DETACH_IP_SKIPPED, CC_DETACH_IP_SUCCESS, CC_DETACH_IP_TIMEDOUT, CC_DETACH_IP_FAILURE, SHARED_VIP_ASYMMETRIC, SHARED_VIP_SYMMETRIC, VS_FSM_INACTIVE, VS_FSM_AWAITING_SE_ASSIGNMENT, VS_FSM_ACTIVE, VS_FSM_ACTIVE_AWAITING_SE_TRANSITION, VS_FSM_DISABLED, NEW_PROBABLE_SRVR, VS_SCALEOUT_DONE, VS_SCALEOUT_DONE_AWAITING_MORE_SE, VS_SCALEOUT_ERR, VS_SCALEIN_DONE, VS_SCALEIN_DONE_AWAITING_MORE_SE, VS_SCALEIN_ERR, VS_MIGRATE_SCALEOUT_DONE, VS_MIGRATE_SCALEOUT_ERROR, VS_MIGRATE_SCALEIN_DONE, VS_MIGRATE_SCALEIN_ERROR, VS_MIGRATE_DONE, VS_FSM_UNEXPECTED_EVENT, VS_RPC_TO_RESMGR_FAILED_EVENT, VS_RPC_TO_SE_FAILED_EVENT, VS_RPC_FAILED_EVENT, VS_SCALEOUT_COMPLETE, VS_SCALEIN_COMPLETE, VS_MIGRATE_STARTED, VS_MIGRATE_COMPLETE, VS_SCALEOUT_FAILED, VS_SCALEIN_FAILED, VS_MIGRATE_FAILED, VS_AWAITING_SE, VS_INITIAL_PLACEMENT_FAILED, VS_FSM_ACTIVE_AWAITING_SCALEOUT_READY, SE_READY_ON_CREATE_TIMEDOUT, SE_SCALEOUT_READY, SE_SCALEOUT_READY_TIMEDOUT, SE_SCALEIN_READY, SE_SCALEIN_READY_TIMEDOUT, SE_PRIMARY_SWITCHOVER_READY, SE_PRIMARY_SWITCHOVER_READY_TIMEDOUT, UPGRADE_ALL_SE_START, UPGRADE_ALL_SE_DONE, UPGRADE_ALL_SE_NOT_NEEDED, UPGRADE_SE_START, UPGRADE_SE_DONE, UPGRADE_SE_NOT_NEEDED, UPGRADE_SE_SUSPENDED, UPGRADE_SE_VS_SCALEOUT, UPGRADE_SE_VS_SCALEIN, UPGRADE_SE_VS_MIGRATE, UPGRADE_SE_VS_DISRUPTED, REBALANCE_VS_SCALEOUT, REBALANCE_VS_SCALEIN, REBALANCE_VS_MIGRATE, DISABLE_SE_VS_MIGRATE, ROLLBACK_ALL_SE_START, ROLLBACK_ALL_SE_DONE, MIGRATE_SE_STARTED, MIGRATE_SE_RESTARTED, MIGRATE_SE_FINISHED, MIGRATE_SE_FAILED, MIGRATE_SE_VS_MIGRATE_STARTED, MIGRATE_SE_VS_MIGRATE_FINISHED, MIGRATE_SE_VS_MIGRATE_FAILED, VIP_SCALEOUT, VIP_SCALEOUT_FAILED, VIP_SCALEIN, VIP_SCALEIN_FAILED, SE_HM_EVENT_SHM_DOWN, SE_HM_EVENT_SHM_UP, SERVER_DOWN, SERVER_UP, POOL_DOWN, POOL_UP, VS_DOWN, VS_UP, SE_SERVER_DELETED, SE_SERVER_DISABLED, SE_POOL_DELETED, SE_SERVER_APP_CHANGED, VS_CONN_LIMIT, VS_THROUGHPUT_LIMIT, CONN_DROP_MAX_SYN_TBL, CONN_DROP_MAX_FLOW_TBL, CONN_DROP_MAX_PERSIST_TBL, CONN_DROP_POOL_LB_FAILURE, CONN_DROP_NO_CONN_MEM, CONN_DROP_NO_PKT_BUFF, PKT_DROP_NO_PKT_BUFF, PKT_BUFF_ALLOC_FAIL, CACHE_OBJ_ALLOC_FAIL, SYN_ATTACK, CONN_THROTTLED_MEMFAIL_FLOW_TBL, SE_CPU_HIGH, SE_MEM_HIGH, SE_PKT_BUFF_HIGH, SE_PERSIST_TBL_HIGH, SE_CONN_MEM_HIGH, SE_DISK_HIGH, SE_FLOW_TBL_HIGH, SE_SYN_TBL_HIGH, SE_DP_HB_FAILED, SE_VNIC_DHCP_IP_ALLOC_FAILURE, SE_VNIC_DUPLICATE_IP, SE_SYN_CACHE_USAGE_HIGH, VM_CPU_HIGH, VM_MEM_HIGH, VS_SE_HA_ACTIVE, VS_SE_HA_COMPROMISED, POOL_SE_HA_ACTIVE, POOL_SE_HA_COMPROMISED, SERVER_DOWN_HA_COMPROMISED, SERVER_UP_HA_ACTIVE, SE_VNIC_IP_ADDED, SE_VNIC_IP_REMOVED, GS_MEMBER_DOWN, GS_MEMBER_UP, GS_GROUP_DOWN, GS_GROUP_UP, GS_DOWN, GS_UP, VIP_DOWN, VIP_UP, SE_GEO_DB_FAILURE, VS_GEO_DB_FAILURE, SE_GEO_DB_SUCCESS, VS_GEO_DB_SUCCESS, SE_EV_SERVER_DOWN, SE_EV_SERVER_UP, SE_EV_POOL_DOWN, SE_EV_POOL_UP, SE_EV_VS_DOWN, SE_EV_VS_UP, SE_HM_EVENT_GHM_DOWN, SE_HM_EVENT_GHM_UP, SE_EV_GS_GROUP_DELETED, SE_EV_GS_MEMBER_DOWN, SE_EV_GS_MEMBER_UP, SE_EV_GS_GROUP_DOWN, SE_EV_GS_GROUP_UP, SE_EV_GS_DOWN, SE_EV_GS_UP, SE_IP6_DAD_FAILED, SE_EV_VS_RL_CONFIG_FAILED, SE_DP_HB_RECOVERED, SE_VS_PKT_BUFF_HIGH, SE_DISCONTINUOUS_TIME_CHANGE, SE_HIGH_INGRESS_PROC_LATENCY, SE_VS_DEL_FLOWS_DISRUPTED, SE_NTP_SYNCHRONIZATION_FAILED, SE_HIGH_EGRESS_PROC_LATENCY, DEBUG_MODE_ON, DEBUG_MODE_OFF, CONFIG_CREATE, CONFIG_UPDATE, CONFIG_DELETE, USER_LOGIN, USER_LOGOUT, CONFIG_ACTION, CONFIG_INTERNAL_CREATE, CONFIG_INTERNAL_UPDATE, USER_PASSWORD_CHANGE_REQUEST, USER_AUTHORIZED_BY_RULE, USER_NOT_AUTHORIZED_BY_ANY_RULE, CONFIG_SE_GRP_FLAVOR_UPDATE, API_VERSION_DEPRECATED, DNS_QUERY_ERROR, SSL_CERT_EXPIRE, SSL_KEY_EXPORTED, SSL_CERT_RENEW, SSL_CERT_RENEW_FAILED, SSL_CERT_IGNORED, SSL_CERT_REVOKED, CONTROLLER_NODE_JOINED, CONTROLLER_NODE_LEFT, CONTROLLER_SERVICE_FAILURE, CONTROLLER_LEADER_FAILOVER, CONTROLLER_WARM_REBOOT, CONTROLLER_SERVICE_RESTORED, CONTROLLER_SERVICE_CRITICAL_FAILURE, CONTROLLER_NODE_SHUTDOWN, CONTROLLER_NODE_STARTED, CLUSTER_CONFIG_FAILED, SE_SECURE_KEY_EXCHANGE, CTLR_SECURE_KEY_EXCHANGE, MALFORMED_SECURE_KEY_EXCHANGE, SYSTEM_UPGRADE_STARTED, SYSTEM_UPGRADE_COMPLETE, SYSTEM_UPGRADE_ABORTED, SYSTEM_ROLLBACK_STARTED, SYSTEM_ROLLBACK_COMPLETE, SYSTEM_ROLLBACK_ABORTED, CONTROLLER_NODE_DB_REPLICATION_FAILED, CONTROLLER_PROCESS_STOPPED, CONTROLLER_MEMORY_BALANCER_DISABLED, CONTROLLER_MEMORY_BALANCER_DEACTIVATED, CONTROLLER_DISCONTINUOUS_TIME_CHANGE, CONTROLLER_PROCESS_MODE_TRANSITION, CONTROLLER_PROCESS_TREND_TRANSITION, CONTROLLER_PROCESS_STOPPED_MEMORY_VIOLATION, METRIC_THRESHOLD_UP_VIOLATION, LICENSE_EXPIRY, ANOMALY, LICENSE_ADDITION_NOTIF, LICENSE_REMOVAL_NOTIF, METRICS_DB_DISK_FULL, METRICS_DB_QUEUE_FULL, METRICS_DB_QUEUE_HEALTHY, METRICS_DBSYNC_FAILURE, METRICS_GRPC_AUTH_FAILURE, OPENSTACK_ACCESS_FAILURE, OPENSTACK_ACCESS_SUCCESS, OPENSTACK_IMAGE_UPLOAD_FAILURE, OPENSTACK_IMAGE_UPLOAD_SUCCESS, OPENSTACK_SE_VM_CREATED, OPENSTACK_SE_VM_DELETED, OPENSTACK_SE_VM_DELETION_DETECTED, OPENSTACK_VNIC_ADDED, OPENSTACK_VNIC_REMOVED, OPENSTACK_IP_DETACHED, OPENSTACK_IP_ATTACHED, OPENSTACK_SE_CREATION_FAILURE, OPENSTACK_SE_DELETION_FAILURE, OPENSTACK_VNIC_ADDITION_FAILURE, OPENSTACK_VNIC_DELETION_FAILURE, OPENSTACK_IP_DETACH_FAILURE, OPENSTACK_IP_ATTACH_FAILURE, OPENSTACK_LBPROV_AUDIT_FAILURE, OPENSTACK_LBPROV_AUDIT_SUCCESS, OPENSTACK_LBPLUGIN_OP_FAILURE, OPENSTACK_LBPLUGIN_OP_SUCCESS, OPENSTACK_SYNC_SERVICES_SUCCESS, OPENSTACK_SYNC_SERVICES_FAILURE, OPENSTACK_TENANTS_DELETED, OPENSTACK_API_VERSION_CHECK_FAILED, AWS_ACCESS_FAILURE, AWS_ACCESS_SUCCESS, AWS_IMAGE_UPLOAD_FAILURE, AWS_IMAGE_UPLOAD_SUCCESS, AWS_SNS_ACCESS_FAILURE, AWS_SNS_ACCESS_SUCCESS, AWS_SQS_ACCESS_FAILURE, AWS_SQS_ACCESS_SUCCESS, AWS_ASG_PUT_NOTIFICATION_CONFIGURATION_FAILURE, AWS_ASG_PUT_NOTIFICATION_CONFIGURATION_SUCCESS, AWS_ASG_DELETE_NOTIFICATION_CONFIGURATION_FAILURE, AWS_ASG_DELETE_NOTIFICATION_CONFIGURATION_SUCCESS, AWS_ASG_NOTIFICATION_PROCESSING_FAILURE, AWS_ASG_NOTIFICATION_PROCESSING_SUCCESS, AWS_ASG_NOTIFICATION_INSTANCE_ADDED, AWS_ASG_NOTIFICATION_INSTANCE_REMOVED, AWS_ASG_ACCESS_FAILURE, AWS_ASG_ACCESS_SUCCESS, AWS_ASG_NOTIFICATION_INSTANCE_LAUNCH_ERROR, AWS_ASG_NOTIFICATION_INSTANCE_TERMINATE_ERROR, AWS_ASG_NOTIFICATION_AUTOSCALE_GROUP_DELETED, CLOUD_AUTOSCALING_CONFIG_FAILURE, CLOUD_AUTOSCALING_DECONFIG_FAILURE, CLOUD_AUTOSCALING_ASG_ADD_FAILURE, CLOUD_AUTOSCALING_ASG_REMOVE_FAILURE, CLOUD_AUTOSCALING_NOTIFICATION_PROCESSING_FAILURE, CLOUD_ROUTE_CREATION_FAILURE, CLOUD_ROUTE_CREATION_SUCCESS, CLOUD_ROUTE_REMOVE_FAILURE, CLOUD_ROUTE_REMOVE_SUCCESS, CLOUDSTACK_ACCESS_FAILURE, CLOUDSTACK_ACCESS_SUCCESS, CLOUDSTACK_IMAGE_UPLOAD_FAILURE, CLOUDSTACK_IMAGE_UPLOAD_SUCCESS, DOCKER_UCP_ACCESS_SUCCESS, DOCKER_UCP_ACCESS_FAILURE, DOCKER_UCP_IMAGE_UPLOAD_FAILURE, DOCKER_UCP_IMAGE_UPLOAD_SUCCESS, DOCKER_UCP_IMAGE_UPLOAD_IN_PROGRESS, VCA_ACCESS_FAILURE, VCA_ACCESS_SUCCESS, VCA_IMAGE_UPLOAD_FAILURE, VCA_IMAGE_UPLOAD_SUCCESS, LS_ACCESS_FAILURE, LS_ACCESS_SUCCESS, LS_IMAGE_UPLOAD_FAILURE, LS_IMAGE_UPLOAD_SUCCESS, MESOS_ACCESS_SUCCESS, MESOS_ACCESS_FAILURE, MESOS_IMAGE_UPLOAD_FAILURE, MESOS_IMAGE_UPLOAD_SUCCESS, MESOS_IMAGE_UPLOAD_IN_PROGRESS, MESOS_CREATED_SE, MESOS_CREATE_SE_FAIL, MESOS_DELETED_SE, MESOS_DELETE_SE_FAIL, MESOS_STOPPED_SE, MESOS_STOP_SE_FAIL, MESOS_STARTED_SE, MESOS_START_SE_FAIL, MESOS_UPDATED_HOSTS, CC_SE_CREATED, CC_SE_CREATION_FAILURE, CC_SE_DELETED, CC_SE_DELETION_FAILURE, CC_SE_DELETION_DETECTED, CC_VNIC_ADDED, CC_VNIC_ADDITION_FAILURE, CC_VNIC_DELETED, CC_VNIC_DELETION_FAILURE, CC_IP_ATTACHED, CC_IP_ATTACH_FAILURE, CC_IP_DETACHED, CC_IP_DETACH_FAILURE, CC_SYNC_SERVICES_SUCCESS, CC_SYNC_SERVICES_FAILURE, CC_UPDATE_VIP_FAILURE, CC_DELETE_VIP_FAILURE, CC_CONFIG_FAILURE, CC_DECONFIG_FAILURE, CC_GENERIC_FAILURE, CC_CLUSTER_VIP_CONFIG_SUCCESS, CC_CLUSTER_VIP_CONFIG_FAILURE, CC_CLUSTER_VIP_DECONFIG_SUCCESS, CC_CLUSTER_VIP_DECONFIG_FAILURE, CC_MARATHON_SERVICE_PORT_OUTSIDE_VALID_RANGE, CC_MARATHON_SERVICE_PORT_ALREADY_IN_USE, CC_VIP_DNS_REGISTER_FAILURE, CC_TENANT_INIT_FAILURE, CC_HEALTH_FAILURE, CC_HEALTH_OK, CC_SE_STARTED, CC_SE_START_FAILURE, CC_SE_STOPPED, CC_SE_STOP_FAILURE, CC_VIP_PARK_INTF_SUCCESS, CC_VIP_PARK_INTF_FAILURE, CC_VIP_DNS_DEREGISTER_FAILURE, CC_VIP_DNS_VALIDATION_FAILURE, CC_VIP_DNS_REGISTER_SUCCESS, CC_VIP_DNS_DEREGISTER_SUCCESS, AWS_ROUTE53_ACCESS_FAILURE, AWS_ROUTE53_ACCESS_SUCCESS, CC_SCALE_SET_POLLING_FAILURE, CC_SCALE_SET_POLLING_SUCCESS, VS_HEALTH_CHANGE, SE_HEALTH_CHANGE, POOL_HEALTH_CHANGE, SERVER_HEALTH_CHANGE, VS_HEALTH_DEGRADED, SE_HEALTH_DEGRADED, POOL_HEALTH_DEGRADED, SERVER_HEALTH_DEGRADED, DUPLICATE_SUBNETS, SUMMARIZED_SUBNETS, IP_POOL_ALMOST_EXHAUSTED, IP_POOL_EXHAUSTED, IP_POOL_ALMOST_EXHAUSTED_VIP, IP_POOL_EXHAUSTED_VIP, IP_POOL_ALMOST_EXHAUSTED_SE, IP_POOL_EXHAUSTED_SE, LICENSE_LIMIT_SERVERS, LICENSE_LIMIT_SE_VCPUS, LICENSE_LIMIT_THROUGHPUT, LICENSE_LIMIT_VS, LICENSE_LIMIT_HOSTS, LICENSE_LIMIT_SE_SOCKETS, LICENSE_EXPIRED, BURST_RESOURCE_CONSUMED, BURST_RESOURCE_EXPIRY_ALERT, LICENSE_LIMIT_SE_SERVICE_CORES, APIC_BAD_CREDENTIALS, APIC_CREATE_LIFS, APIC_DELETE_LIFS, APIC_CREATE_LIF_CONTEXTS, APIC_DELETE_LIF_CONTEXTS, APIC_CREATE_CDEV, APIC_DELETE_CDEV, APIC_ATTACH_CIF_TO_LIF, APIC_DETACH_CIF_FROM_LIF, APIC_VS_PLACEMENT, APIC_BIND_VNIC_TO_NETWORK, APIC_CREATE_TENANT, APIC_DELETE_TENANT, APIC_CREATE_NETWORK, APIC_DELETE_NETWORK, APIC_NETWORK_VRF_CHANGED, APIC_VS_NETWORK_RESOLVE_ERROR, CONTAINER_CLOUD_ACCESS_SUCCESS, CONTAINER_CLOUD_ACCESS_FAILURE, CONTAINER_CLOUD_IMAGE_UPLOAD_FAILURE, CONTAINER_CLOUD_IMAGE_UPLOAD_SUCCESS, CONTAINER_CLOUD_IMAGE_UPLOAD_IN_PROGRESS, CONTAINER_CLOUD_CREATED_SE, CONTAINER_CLOUD_CREATE_SE_FAIL, CONTAINER_CLOUD_DELETED_SE, CONTAINER_CLOUD_DELETE_SE_FAIL, CONTAINER_CLOUD_STOPPED_SE, CONTAINER_CLOUD_STOP_SE_FAIL, CONTAINER_CLOUD_STARTED_SE, CONTAINER_CLOUD_START_SE_FAIL, CONTAINER_CLOUD_UPDATED_HOSTS, CONTAINER_CLOUD_SERVICE_SUCCESS, CONTAINER_CLOUD_SERVICE_FAILURE, CONTAINER_CLOUD_SERVICE_INCOMPLETE, CONTAINER_CLOUD_HEALTHCHECK_SE, CONTAINER_CLOUD_HEALTHCHECK_SE_FAIL, AVG_UPTIME_CHANGE, DOS_ATTACK, SE_DOS_ATTACK, SERVER_AUTOSCALE_OUT, SERVER_AUTOSCALE_IN, SERVER_AUTOSCALE_OUT_COMPLETE, SERVER_AUTOSCALE_IN_COMPLETE, SERVER_AUTOSCALE_FAILED, SERVER_AUTOSCALE_IN_FAILED, SERVER_AUTOSCALE_OUT_FAILED, SE_GATEWAY_HEARTBEAT_FAILED, SE_GATEWAY_HEARTBEAT_SUCCESS, SE_VNIC_DOWN_EVENT, SE_VNIC_TX_QUEUE_STALL, SE_BGP_PEER_STATE_CHANGE, SE_LICENSED_BANDWIDTH_EXCEEDED, SERVER_AUTOSCALE_OUT_TRIGGERED, SERVER_AUTOSCALE_IN_TRIGGERED, SE_BGP_PEER_DOWN, POOL_AUTO_DEPLOYMENT_FAILED, POOL_AUTO_DEPLOYMENT_SUCCESS, SE_VNIC_UP_EVENT, POOL_AUTO_DEPLOYMENT_UPDATE, GSLB_SITE_OPER_STATUS, GSLB_DNS_STATUS, GSLB_SITE_EXCEPTION_STATUS, GSLB_GS_STATUS, GSLB_SITE_SYNC_STATUS, SCHEDULER_ACTION_SUCCESS, SCHEDULER_ACTION_FAILURE, CONTROLLER_SCHEDULER_UNENCRYPTED_CONFIG_EXPORT, REMOTE_BACKUP_FAILURE, GCP_ACCESS_SUCCESS, GCP_ACCESS_FAIL, GCP_SE_DETECTED, GCP_API_FAIL, GCP_SUBNET_NOT_FOUND, GCP_SUBNET_ATTACH_FAIL, GCP_ROUTE_ADD_SUCCESS, GCP_ROUTE_DELETE_SUCCESS, GCP_ROUTE_ADD_FAIL, GCP_ROUTE_DELETE_FAIL, GCP_CLOUD_ROUTER_UPDATE_SUCCESS, GCP_CLOUD_ROUTER_UPDATE_FAIL, VIP_DNS_REGISTER_SUCCESS, VIP_DNS_REGISTER_FAILURE, VIP_DNS_DEREGISTER_SUCCESS, VIP_DNS_DEREGISTER_FAILURE, SYNC_DNS_RECORDS_SUCCESS, SYNC_DNS_RECORDS_FAILURE, FLUSH_DNS_RECORDS_SUCCESS, FLUSH_DNS_RECORDS_FAILURE, CC_HOST_SSH_FAILURE, CC_HOST_SSH_SUCCESS, AZURE_ACCESS_SUCCESS, AZURE_ACCESS_FAILURE, AZURE_ALB_UPDATE_FAILURE, AZURE_NIC_UPDATE_FAILURE, AZURE_ALB_UPDATE_SUCCESS, AZURE_NIC_UPDATE_SUCCESS, AZURE_NIC_DELETE_SUCCESS, AZURE_NIC_DELETE_FAILURE, AZURE_IMAGE_UPLOAD_FAILURE, AZURE_IMAGE_UPLOAD_SUCCESS, AZURE_MARKETPLACE_LICENSE_TERMS_SUCCESS, AZURE_MARKETPLACE_LICENSE_TERMS_FAILURE, VS_FAULT, SE_SHM_MEM_HIGH, SE_CONFIG_MEM_USAGE_ABOVE_LIMIT, OCI_ACCESS_SUCCESS, OCI_ACCESS_FAILURE, TENCENT_ACCESS_SUCCESS, TENCENT_ACCESS_FAILURE, CONTROLLER_CPU_HIGH, CONTROLLER_MEM_HIGH, CONTROLLER_DISK_HIGH, ALBSERVICES_CONNECTION_FAILURE, ALBSERVICES_CONTROLLER_DEREGISTERED, CRS_UPDATE, CRS_DEPLOYMENT_SUCCESS, CRS_DEPLOYMENT_FAILURE, IP_REPUTATION_DB_SYNC_SUCCESS, IP_REPUTATION_DB_SYNC_FAILURE, APPSIGNATURE_SYNC_SUCCESS, APPSIGNATURE_SYNC_FAILURE, PSM_PROGRAM_FAILURE, PSM_MAX_PARAM_EVENT, PSM_MAX_URI_EVENT, SEC_MGR_DATA_ERROR_EVENT, UACACHE_PULSE_CONN_FAILED_EVENT, ALBSERVICES_CONTROLLER_REGISTERED, ALBSERVICES_SUPPORT_CASE_CREATED, ALBSERVICES_SUPPORT_CASE_UPDATED, ALBSERVICES_SUPPORT_CASE_FILE_ATTACHMENT_TRIGGERED, ALBSERVICES_SUPPORT_CASE_FILE_ATTACHMENT_SUCCESS, ALBSERVICES_SUPPORT_CASE_FILE_ATTACHMENT_FAILURE, NSXT_ACCESS_SUCCESS, VCENTER_ACCESS_SUCCESS, NSXT_ACCESS_FAIL, VCENTER_ACCESS_FAIL, NSXT_IMAGE_UPLOAD_FAILURE, NSXT_IMAGE_UPLOAD_SUCCESS, NSXT_IMAGE_DELETE_FAILURE, NSXT_IMAGE_DELETE_SUCCESS, VCENTER_VSPHERE_HA_NOT_CONFIGURED, NSXT_SI_SERVICE_CREATE_UPDATE_SUCCESS, NSXT_SI_SERVICE_CREATE_UPDATE_FAILURE, NSXT_SI_SERVICE_DELETE_SUCCESS, NSXT_SI_SERVICE_DELETE_FAILURE, NSXT_SI_VIRTUALENDPOINT_CREATE_UPDATE_SUCCESS, NSXT_SI_VIRTUALENDPOINT_CREATE_UPDATE_FAILURE, NSXT_SI_VIRTUALENDPOINT_DELETE_SUCCESS, NSXT_SI_VIRTUALENDPOINT_DELETE_FAILURE, NSXT_SI_REDIRECTPOLICY_CREATE_UPDATE_SUCCESS, NSXT_SI_REDIRECTPOLICY_CREATE_UPDATE_FAILURE, NSXT_SI_REDIRECTPOLICY_DELETE_SUCCESS, NSXT_SI_REDIRECTPOLICY_DELETE_FAILURE, NSXT_SI_REDIRECTRULE_CREATE_UPDATE_SUCCESS, NSXT_SI_REDIRECTRULE_CREATE_UPDATE_FAILURE, NSXT_SI_REDIRECTRULE_DELETE_SUCCESS, NSXT_SI_REDIRECTRULE_DELETE_FAILURE, VCENTER_IMAGE_UPLOAD_FAILURE, VCENTER_IMAGE_UPLOAD_SUCCESS, VCENTER_IMAGE_DELETE_FAILURE, VCENTER_IMAGE_DELETE_SUCCESS, NSXT_INVALID_T1_SEG, UPGRADE_CONTROLLER_STARTED, UPGRADE_SE_GROUP_STARTED, RESUME_SE_GROUP_STARTED, PATCH_CONTROLLER_STARTED, PATCH_SE_GROUP_STARTED, ROLLBACK_CONTROLLER_STARTED, ROLLBACK_SE_GROUP_STARTED, ROLLBACKPATCH_CONTROLLER_STARTED, ROLLBACKPATCH_SE_GROUP_STARTED, UPGRADE_CONTROLLER_COMPLETE, UPGRADE_SE_GROUP_COMPLETE, PATCH_CONTROLLER_COMPLETE, PATCH_SE_GROUP_COMPLETE, ROLLBACK_CONTROLLER_COMPLETE, ROLLBACK_SE_GROUP_COMPLETE, ROLLBACKPATCH_CONTROLLER_COMPLETE, ROLLBACKPATCH_SE_GROUP_COMPLETE, UPGRADE_CONTROLLER_ABORTED, PATCH_CONTROLLER_ABORTED, UPGRADE_SE_GROUP_SUSPENDED, PATCH_SE_GROUP_SUSPENDED, ROLLBACK_SE_GROUP_SUSPENDED, ROLLBACKPATCH_SE_GROUP_SUSPENDED, UPGRADE_REQUEST, LICENSE_TRANSACTION, LICENSE_SE_RECONCILE, LICENSE_CONTROLLER_LICENSE_RECONCILE, LICENSE_TIER_SWITCH, CENTRAL_LICENSE_SUBSCRIPTION, CENTRAL_LICENSE_UNSUBSCRIPTION, CENTRAL_LICENSE_REFRESH_SUCCESS, CENTRAL_LICENSE_REFRESH_FAILURE, ROLLBACK_CONTROLLER_ABORTED, ROLLBACKPATCH_CONTROLLER_ABORTED, AUDIT_COMPLIANCE_EVENT, LOGAGENT_STREAMING_CONN_EVENT, CONTROLLER_DB_ERROR, AVI_FALSE_POSITIVE_DETECTION, CONNECT_TO_METRICSMGR_ERROR, DNS_VS_STATUS, CONFIG_VERSION_ACK_STATUS, PRE_CHECK_STARTED, PRE_CHECK_COMPLETED. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EventID *string `json:"event_id"`

	// Pages in which event should come up. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	EventPages []string `json:"event_pages,omitempty"`

	//  Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	IgnoreEventDetailsDisplay *bool `json:"ignore_event_details_display,omitempty"`

	//  Enum options - EVENT_INTERNAL, EVENT_EXTERNAL. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	Internal *string `json:"internal,omitempty"`

	//  Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	IsSecurityEvent *bool `json:"is_security_event,omitempty"`

	//  Enum options - UNKNOWN, VSMGR, SEMGR, RESMGR, VIMGR, METRICSMGR, CONFIG, SE_GENERAL, SE_FLOWTABLE, SE_HM, SE_POOL_PERSISTENCE, SE_POOL, VSERVER, CLOUD_CONNECTOR, CLUSTERMGR, HSMGR, NW_MGR, LICENSE_MGR, RES_MONITOR, STATEDBCACHE, STATEDBCACHEHA, APIC_AGENT, AUTOSCALE_MGR, GLB_MGR, SEC_MGR, PORTAL_CONNECTOR, SE_UPGRADE, CONTROLLER_UPGRADE, AUDIT_MGR, DNS_MGR, WEBAPP_IPAM, ADAPT_REPL. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Module *string `json:"module"`

	//  Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjName *string `json:"obj_name,omitempty"`

	//  Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP, STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT, PKIPROFILE, AUTHPROFILE, CLOUD, SERVERAUTOSCALEPOLICY, AUTOSCALELAUNCHCONFIG, MICROSERVICEGROUP, IPAMPROFILE, HARDWARESECURITYMODULEGROUP, POOLGROUP, PRIORITYLABELS, POOLGROUPDEPLOYMENTPOLICY, GSLBSERVICE, GSLBSERVICERUNTIME, SCHEDULER, GSLBGEODBPROFILE, GSLBAPPLICATIONPERSISTENCEPROFILE, TRAFFICCLONEPROFILE, VSVIP, WAFPOLICY, WAFPROFILE, ERRORPAGEPROFILE, ERRORPAGEBODY, L4POLICYSET, GSLBSERVICERUNTIMEBATCH, WAFPOLICYPSMGROUP, PINGACCESSAGENT, NETWORKSERVICE, NATPOLICY, SSOPOLICY, PROTOCOLPARSER, EXAMPLECHILD, TESTSEDATASTORELEVEL1, TESTSEDATASTORELEVEL2, TESTSEDATASTORELEVEL3, FILEOBJECT, IPREPUTATIONDB, FEDERATIONCHECKPOINT, ICAPPROFILE, DYNAMICDNSRECORD, JWTSERVERPROFILE, GEODB, BOTDETECTIONPOLICY, BOTMAPPING, BOTCONFIGCONSOLIDATOR, JWTPROFILE, BOTIPREPUTATIONTYPEMAPPING, AVIFALSEPOSITIVEDETECTION, VSGS, WAFCRS, SERVICEENGINE, DEBUGSERVICEENGINE, DEBUGCONTROLLER, DEBUGVIRTUALSERVICE, SERVICEENGINEGROUP, SEPROPERTIES, NETWORK, CONTROLLERNODE, CONTROLLERPROPERTIES, SYSTEMCONFIGURATION, VRFCONTEXT, USER, ALERTCONFIG, ALERTSYSLOGCONFIG, ALERTEMAILCONFIG, ALERTTYPECONFIG, APPLICATION, ROLE, CLOUDPROPERTIES, SNMPTRAPPROFILE, ACTIONGROUPPROFILE, MICROSERVICE, ALERTPARAMS, ACTIONGROUPCONFIG, CLOUDCONNECTORUSER, GSLB, GSLBDNSUPDATE, GSLBSITEOPS, GLBMGRWARMSTART, IPAMDNSRECORD, GSLBDNSGSSTATUS, GSLBDNSGEOFILEOPS, GSLBDNSGEOUPDATE, GSLBDNSGEOCLUSTEROPS, GSLBDNSCLEANUP, GSLBSITEOPSRESYNC, IPAMDNSPROVIDERPROFILE, ALBSERVICESCONFIG, SYSTEMLIMITS, REPLICATIONOPERATION, VCENTERSERVER, AVAILABILITYZONE, IMAGE, VSMGRDNSCLEANUP, ALBSERVICESFILEUPLOAD, CONTROLLERSITE, ALERTOBJECTLIST, BACKUPCONFIGURATION, USERACCOUNTPROFILE, WAFAPPLICATIONSIGNATUREPROVIDER, LABELGROUP, CERTIFICATEMANAGEMENTPROFILE, CUSTOMIPAMDNSPROFILE, ALERTSCRIPTCONFIG, WEBHOOK, CLUSTERCLOUDDETAILS, INVENTORYFAULTCONFIG, MEMORYBALANCERREQUEST, SECURECHANNELMAPPING, ALBSERVICESJOB, STATEDIFFOPERATION, SITEVERSION, AUTHMAPPINGPROFILE, WEBAPPUT, ALERT, BACKUP, CONTROLLERLICENSE, CONTROLLERPORTALREGISTRATION, FLOATINGIPSUBNET, GSLBSITE, GSLBTHIRDPARTYSITE, JOBENTRY, LICENSEINFO, LICENSELEDGERDETAILS, LICENSESTATUS, LOGCONTROLLERMAPPING, OBJECTACCESSPOLICY, SCPOOLSERVERSTATEINFO, SCVSSTATEINFO, SECURECHANNELAVAILABLELOCALIPS, SECURECHANNELTOKEN, SECURITYMANAGERDATA, STATEDIFFSNAPSHOT, SYSTEMDEFAULTOBJECT, UPGRADESTATUSSUMMARY, VIDCINFO, VIPGNAMEINFO, TCPSTATRUNTIME, UDPSTATRUNTIME, IPSTATRUNTIME, ARPSTATRUNTIME, MBSTATRUNTIME, IPSTKQSTATSRUNTIME, MALLOCSTATRUNTIME, SHMALLOCSTATRUNTIME, CPUUSAGERUNTIME, L7GLOBALSTATSRUNTIME, L7VIRTUALSERVICESTATSRUNTIME, SEAGENTVNICDBRUNTIME, SEAGENTGRAPHDBRUNTIME, SEAGENTSTATERUNTIME, INTERFACERUNTIME, ARPTABLERUNTIME, DISPATCHERSTATRUNTIME, DISPATCHERSTATCLEARRUNTIME, DISPATCHERTABLEDUMPRUNTIME, DISPATCHERREMOTETIMERLISTDUMPRUNTIME, METRICSAGENTMESSAGE, HEALTHMONITORSTATRUNTIME, METRICSENTITYRUNTIME, PERSISTENCEINTERNAL, HTTPPOLICYSETINTERNAL, DNSPOLICYINTERNAL, CONNECTIONDUMPRUNTIME, SHAREDDBSTATS, SHAREDDBSTATSCLEAR, ICMPSTATRUNTIME, ROUTETABLERUNTIME, VIRTUALMACHINE, POOLSERVER, SEVSLIST, MEMINFORUNTIME, RTERINGSTATRUNTIME, ALGOSTATRUNTIME, HEALTHMONITORRUNTIME, CPUSTATRUNTIME, SEVM, HOST, PORTGROUP, CLUSTER, DATACENTER, VCENTER, HTTPPOLICYSETSTATS, DNSPOLICYSTATS, METRICSSESTATS, RATELIMITERSTATRUNTIME, NETWORKSECURITYPOLICYSTATS, TCPCONNRUNTIME, POOLSTATS, CONNPOOLINTERNAL, CONNPOOLSTATS, VSHASHSHOWRUNTIME, SELOGSTATSRUNTIME, NETWORKSECURITYPOLICYDETAIL, LICENSERUNTIME, SERVERRUNTIME, METRICSRUNTIMESUMMARY, METRICSRUNTIMEDETAIL, DISPATCHERSEHMPROBETEMPDISABLERUNTIME, POOLDEBUG, VSLOGMGRMAP, SERUMINSERTIONSTATS, HTTPCACHE, HTTPCACHESTATS, SEDOSSTATRUNTIME, VSDOSSTATRUNTIME, SERVERUPDATEREQ, VSSCALEOUTLIST, SEMEMDISTRUNTIME, TCPCONNRUNTIMEDETAIL, SEUPGRADESTATUS, SEUPGRADEPREVIEW, SEFAULTINJECTEXHAUSTM, SEFAULTINJECTEXHAUSTMCL, SEFAULTINJECTEXHAUSTMCLSMALL, SEFAULTINJECTEXHAUSTCONN, SEHEADLESSONLINEREQ, SEUPGRADE, SEUPGRADESTATUSDETAIL, SERESERVEDVS, SERESERVEDVSCLEAR, VSCANDIDATESEHOSTLIST, SEGROUPUPGRADE, REBALANCE, SEGROUPREBALANCE, SEAUTHSTATSRUNTIME, AUTOSCALESTATE, VIRTUALSERVICEAUTHSTATS, NETWORKSECURITYPOLICYDOS, KEYVALINTERNAL, KEYVALSUMMARYINTERNAL, SERVERSTATEUPDATEINFO, CLTRACKINTERNAL, CLTRACKSUMMARYINTERNAL, MICROSERVICERUNTIME, SEMICROSERVICE, VIRTUALSERVICEANALYSIS, CLIENTINTERNAL, CLIENTSUMMARYINTERNAL, MICROSERVICEGROUPRUNTIME, BGPRUNTIME, REQUESTQUEUERUNTIME, MIGRATEALL, MIGRATEALLSTATUSSUMMARY, MIGRATEALLSTATUSDETAIL, INTERFACESUMMARYRUNTIME, INTERFACELACPRUNTIME, DNSTABLE, GSLBSERVICEDETAIL, GSLBSERVICEINTERNAL, GSLBSERVICEHMONSTAT, SETROLESREQUEST, TRAFFICCLONERUNTIME, GEOLOCATIONINFO, SEVSHBSTATRUNTIME, GEODBINTERNAL, GSLBSITEINTERNAL, WAFSTATS, USERDEFINEDDATASCRIPTCOUNTERS, LLDPRUNTIME, VSESSHARINGPOOL, NDTABLERUNTIME, IP6STATRUNTIME, ICMP6STATRUNTIME, SEVSSPLACEMENT, L4POLICYSETSTATS, L4POLICYSETINTERNAL, BGPDEBUGINFO, SHARD, CPUSTATRUNTIMEDETAIL, SEASSERTSTATRUNTIME, SEFAULTINJECTINFRA, SEAGENTASSERTSTATRUNTIME, SEDATASTORESTATUS, DIFFQUEUESTATUS, IP6ROUTETABLERUNTIME, SECURITYMGRSTATE, VIRTUALSERVICESESCALEOUTSTATUS, SHARDSERVERSTATUS, SEAGENTSHARDCLIENTRESOURCEMAP, SEAGENTCONSISTENTHASH, SEAGENTVNICDBHISTORY, SEAGENTSHARDCLIENTAPPMAP, SEAGENTSHARDCLIENTEVENTHISTORY, NATSTATRUNTIME, NATFLOWRUNTIME, SECUTIRYMGRRUNTIME, SSOPOLICYSTATS, SENETWORKSERVICERUNTIME, SEGEORUNTIME, NATPOLICYSTATS, SEFAULTRUNTIME, VIRTUALSERVICESCALEOUTSTATUS, VIRTUALSERVICESCALEOUTSTATUSDETAIL, SECURITYMGRLEARN, SECURITYMGRTOPN, SSLSESSIONCACHE, SEGEODETAILS, GSLBSERVICEALGOSTAT, HTTPCONNECTIONRUNTIME, HTTPCONNECTIONRUNTIMEDETAIL, REMOTESITEWATCHERSUMMARY, REMOTESITEWATCHEREVENT, IPREPUTATIONDBRUNTIME, SEFAULTINJECTEXHAUSTCFG, SEFAULTINJECTEXHAUSTSHMCFG, SEFAULTINJECTEXHAUSTSHMCONN, BGPRUNNINGCONFIG, BGPADVERTISEDROUTES, BGPPEERSTATUS, BFDSESSIONSTATUS, BGPPEERINFO, GSLBSITEOPSREPLICATIONPOLICYOPS, FEDERATEDDATASTORESTATUS, FEDERATEDDIFFQUEUESTATUS, ROUTESTATRUNTIME, ROUTEFLOWRUNTIME, NSXTSEGMENTRUNTIME, VIRTUALSERVICEICAPSTATS, KEYVALSUMMARYOBJSYNC, POOLOBJSYNC, KEYVALDISPATCH, SEAGENTOBJSYNCDETAILS, VIRTUALSERVICESCALEOUTSTATUSKEYVAL, VIRTUALSERVICESCALEOUTSTATUSKEYVALSUMMARY, VIRTUALSERVICEOUTOFBANDREQUESTSTATS, GEODBLOCATIONINFO, SEAGENTRESOLVDBRUNTIME, SEAGENTRESOLVDBRUNTIMESUMMARY, METRICSRUNTIMEDEBUG, BOTCLASSIFICATIONRESULTMETRICS, BOTUACACHERUNTIME, BOTUACACHESTATSRUNTIME, POOLGROUPRUNTIMEDETAIL, SECURITYMGRUACACHEQUERY, SECURITYMGRUACACHECLEAR, SECURITYMGRUACACHESUMMARY, GSLBADAPTIVERUNTIME, BGPPEERSSTATE, VSSERVICESERVERMAPKV, VSSERVICESERVERMAPTABLE, UPGRADESTATUSINFO, CLOUDRUNTIME, ALERTPERFDATA, METRICSRUNTIMEDEBUGSUMMARY, SCTPCONNRUNTIME, SCTPCONNRUNTIMEDETAIL, VIMGRCLUSTERRUNTIME, VIMGRCONTROLLERRUNTIME, VIMGRDCRUNTIME, VIMGRIPSUBNETRUNTIME, VIMGRSEVMRUNTIME, VIMGRVMRUNTIME, SERESOURCEPROTO, SECONSUMERPROTO, SECREATEPENDINGPROTO, PLACEMENTSTATS, SEVIPPROTO, RMVRFPROTO, VCENTERMAP, VIMGRVCENTERRUNTIME, INTERESTEDVMS, INTERESTEDHOSTS, VCENTERSUPPORTEDCOUNTERS, ENTITYCOUNTERS, TRANSACTIONSTATS, SEVMCREATEPROGRESS, PLACEMENTSTATUS, VISUBFOLDERS, VIDATASTORE, VIHOSTRESOURCES, CLOUDCONNECTOR, VINETWORKSUBNETVMS, VIDATASTORECONTENTS, VIMGRVCENTERCLOUDRUNTIME, VIVCENTERPORTGROUPS, VIVCENTERDATACENTERS, VIMGRHOSTRUNTIME, PLACEMENTGLOBALS, ALBSERVICES, RMCLOUDOPSPROTO, CLOUDPLACEMENTSUMMARY, CLOUDPLACEMENTINELIGIBLE, SEGROUPPLACEMENTSUMMARY, SEGROUPPLACEMENTDETAIL, SEGROUPPLACEMENTINELIGIBLE, SECONSUMERSUMMARY, SECONSUMERDETAIL, SERESOURCESUMMARY, SERESOURCEDETAIL, PLACEMENTSYSTEMSUMMARY, VIMGRNWRUNTIME, NETWORKRUNTIME, SCTPSTATRUNTIME, APICCONFIGURATION, CIFTABLE, APICTRANSACTION, VIRTUALSERVICESTATEDBCACHESUMMARY, POOLSTATEDBCACHESUMMARY, SERVERSTATEDBCACHESUMMARY, APICAGENTINTERNAL, APICTRANSACTIONFLAP, APICGRAPHINSTANCES, APICEPGS, APICEPGEPS, APICDEVICEPKGVER, APICTENANTS, APICVMMDOMAINS, STATECACHESTATS, STATECACHECONFIG, STATECACHEINTERNAL, STATECACHEDNS, STATECACHECONFIGVERSION, NSXCONFIGURATION, NSXSGTABLE, NSXAGENTINTERNAL, NSXSGINFO, NSXSGIPS, NSXAGENTINTERNALCLI, NSXTAGENT, SERATELIMITINGRLINTERNAL, SERATELIMITINGMSFINTERNAL, ADAPTREPL, POOLGROUPENABLEPRIMARYPOOL, SYSTEMREPORT, MAXOBJECTS. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjType *string `json:"obj_type,omitempty"`

	//  Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjUUID *string `json:"obj_uuid,omitempty"`

	// Reason code for generating the event. This would be added to the alert where it would say alert generated  on event with reason <reason code>. Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_BAD_REQUEST.... Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	ReasonCode *string `json:"reason_code,omitempty"`

	// related objects corresponding to the events. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	RelatedUuids []string `json:"related_uuids,omitempty"`

	//  Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ReportTimestamp *uint64 `json:"report_timestamp"`

	//  Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	Tenant *string `json:"tenant,omitempty"`

	//  Field introduced in 17.2.1. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantName *string `json:"tenant_name,omitempty"`
}
