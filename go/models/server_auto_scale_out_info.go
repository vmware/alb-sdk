package models

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

// ServerAutoScaleOutInfo server auto scale out info
// swagger:model ServerAutoScaleOutInfo
type ServerAutoScaleOutInfo struct {

	// alertconfig_name of ServerAutoScaleOutInfo.
	AlertconfigName string `json:"alertconfig_name,omitempty"`

	//  It is a reference to an object of type AlertConfig.
	AlertconfigRef string `json:"alertconfig_ref,omitempty"`

	// Placeholder for description of property available_capacity of obj type ServerAutoScaleOutInfo field type str  type number
	AvailableCapacity float64 `json:"available_capacity,omitempty"`

	// Placeholder for description of property load of obj type ServerAutoScaleOutInfo field type str  type number
	Load float64 `json:"load,omitempty"`

	// Number of num_scaleout_servers.
	// Required: true
	NumScaleoutServers int32 `json:"num_scaleout_servers"`

	// Number of num_servers_up.
	// Required: true
	NumServersUp int32 `json:"num_servers_up"`

	// UUID of the Pool. It is a reference to an object of type Pool.
	// Required: true
	PoolRef string `json:"pool_ref"`

	// reason of ServerAutoScaleOutInfo.
	Reason string `json:"reason,omitempty"`

	//  Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_BAD_REQUEST, SYSERR_TEST1, SYSERR_TEST2, SYSERR_QUEUE_TRANSPORT_FAILURE, SYSERR_QUEUE_RETRY_TASK, SYSERR_DATASTORE_TRANSPORT_FAILURE, SYSERR_DATASTORE_UNKNOWN_FAILURE, SYSERR_DATASTORE_OBJECT_DOES_NOT_EXIST, SYSERR_DATASTORE_REFERENCE_DOES_NOT_EXIST, SYSERR_DATASTORE_DB_LOCKED, SYSERR_DATASTORE_LOCK_FAILURE, SYSERR_DATASTORE_TBL_NOT_EXIST, SYSERR_SVC_COMMON_OBJECT_NOT_IN_CACHED_VIEW, SYSERR_RPC_CANCELED_BY_CLIENT, SYSERR_RPC_TIMED_OUT, SYSERR_RPC_SEND_FAILED, SYSERR_RPC_CANCELED_BY_TRANSACTION_CLEANUP, SYSERR_NO_MULTICAST_RECEIVERS, SYSERR_RPC_FAILED, SYSERR_RPC_CONNECT_FAILED, SYSERR_CONTROLLER_NOT_READY, SYSERR_VERSION_MISMATCH, SYSERR_INVALID_METHOD, SYSERR_DESERIALIZATION, SYSERR_SERIALIZATION, SYSERR_ENQUEUE, SYSERR_DEQUEUE, SYSERR_VS_INVALID_METHOD, SYSERR_VS_NOT_PRESENT, SYSERR_VS_INVALID_REQUEST, SYSERR_VS_NOT_ENOUGH_RESOURCES, SYSERR_VS_SE_NOT_AVAILABLE, SYSERR_VS_VNIC_FAILURE, SYSERR_VS_DELETE_WHILE_STILL_BEING_REFERRED, SYSERR_INVALID_HEALTH_MONITOR_TYPE, SYSERR_VS_SE_ASSIGNMENT_FAILED, SYSERR_VS_INVALID_OBJECT, SYSERR_VS_SERVICE_ENGINE_DOWN, SYSERR_VS_RPC_FAILURE, SYSERR_VS_NOT_BOUND, SYSERR_VS_DISABLED, SYSERR_VS_INTERNAL_ERROR, SYSERR_VS_SCALEOUT_ERROR, SYSERR_VS_SCALEIN_ERROR, SYSERR_VS_MIGRATE_ERROR, SYSERR_VS_MIGRATE_SCALEOUT_ERROR, SYSERR_VS_MIGRATE_SCALEIN_ERROR, SYSERR_VS_AWAIT_STATIC_SE, SYSERR_VS_MIN_SE_NOT_ASSIGNED, SYSERR_SE_MGR_VNIC_ALLOC_FAIL, SYSERR_SE_MGR_VNIC_NOT_FOUND, SYSERR_SE_MGR_UNKNOWN_SE, SYSERR_SE_MGR_UNKNOWN_STATE_TRANSITION, SYSERR_SE_MGR_SE_OFFLINE_HB_FAILURE, SYSERR_SE_UPGRADE_IN_PROGRESS, SYSERR_SE_NOT_CONNECTED, SYSERR_RM_RES_UNAVAIL, SYSERR_RM_RES_UNAVAIL_NOTIFY, SYSERR_RM_RES_NOT_INUSE, SYSERR_RM_CONSUMER_NOT_FOUND, SYSERR_RM_REACHABILITY_FAILED, SYSERR_RM_RELEASE_SE_UNAVAIL, SYSERR_RM_UNKNOWN_SE_GROUP, SYSERR_RM_NO_SE_FOUND, SYSERR_RM_PARTIAL_SE_FOUND, SYSERR_RM_AWAIT_VM_CREATE, SYSERR_RM_AWAIT_VNIC_ADD, SYSERR_RM_AWAIT_BOOTUP, SYSERR_RM_RESOURCE_NOT_FOUND, SYSERR_RM_CANNOT_SPAWN_SE, SYSERR_RM_RES_NOT_NEEDED, SYSERR_RM_RES_INFRA_DELETED, SYSERR_RM_RES_USER_DELETED, SYSERR_RM_RES_USER_REBOOTED, SYSERR_RM_RES_CRASHED, SYSERR_RM_RES_CONN_LOST, SYSERR_RM_RES_VIP_REACH_LOST, SYSERR_RM_VS_PROCESSING, SYSERR_RM_VNIC_IP_FAILURE, SYSERR_RM_STATIC_NO_POOL, SYSERR_RM_STATIC_POOL_EXHAUSTED, SYSERR_RM_VIP_MULT_NETWORKS, SYSERR_RM_SRVR_MULT_NETWORKS, SYSERR_RM_VIP_NO_NETWORK, SYSERR_RM_SRVR_NO_NETWORK, SYSERR_RM_MAX_PARALLEL_SE_CREATE, SYSERR_RM_MAX_SE_CREATE_ATTEMPTS, SYSERR_RM_MULT_SE_CRASH, SYSERR_RM_VS_SE_CREATE_IN_PROG, SYSERR_RM_VS_SE_BOOTUP_IN_PROG, SYSERR_RM_VS_SE_VNIC_ADD_IN_PROG, SYSERR_RM_VS_SE_VNIC_IP_IN_PROG, SYSERR_RM_NO_SUITABLE_HOST, SYSERR_RM_NO_SE_IN_SE_GRP, SYSERR_RM_ALL_SE_IN_SE_GRP_DOWN, SYSERR_RM_NO_SE_IN_SE_GRP_SRVR_ACC, SYSERR_RM_NO_SE_IN_SE_GRP_VIP_ACC, SYSERR_RM_ALL_SE_IN_SE_GRP_MAX_VS, SYSERR_RM_ALL_SE_IN_SE_GRP_NW_ACC_MAX_VS, SYSERR_RM_VIP_SE_NW_ACC, SYSERR_RM_VIP_SE_MAX_VS, SYSERR_RM_VIP_SE_GRP_MISMATCH, SYSERR_RM_VIP_SE_PENDING_OP, SYSERR_RM_MULT_MGMT_SUBNET, SYSERR_RM_MAX_SE_IN_GRP, SYSERR_RM_BOOTUP_FAILURE, SYSERR_RM_PENDING_VNIC_OP, SYSERR_RM_SE_MGMT_NO_STATIC_IPS_CONFIGURED, SYSERR_RM_SE_MGMT_STATIC_IPS_EXHAUSTED, SYSERR_RM_NO_MGMT_SUBNET, SYSERR_RM_MGMT_DHCP_FAILURE, SYSERR_RM_CANNOT_ADD_VNICS, SYSERR_RM_CONSUMER_RESOURCES_SATISFIED, SYSERR_RM_DATA_DHCP_FAILURE, SYSERR_RM_QUERY_HOST_IN_PROGRESS, SYSERR_RM_INSUFFICIENT_BUFFER_SE, SYSERR_RM_NO_DEFAULT_GW_SE_MGMT_NW, SYSERR_RM_PARENT_SE_NW_ACC, SYSERR_RM_PARENT_SE_MAX_VS, SYSERR_RM_PARENT_SE_GRP_MISMATCH, SYSERR_RM_DEF_GW_INCORRECT, SYSERR_RM_NETWORK_NOT_FOUND, SYSERR_RM_ALL_SE_IN_SE_GRP_USED, SYSERR_RM_SE_GRP_PENDING_OP, SYSERR_RM_ALL_SE_IN_SE_GRP_DISABLED, SYSERR_RM_VS_SE_PING_CHECK_IN_PROG, SYSERR_RM_CONSUMER_PENDING_TASK, SYSERR_RM_SE_GRP_VIP_NW_ACC, SYSERR_RM_SE_GRP_NW_ACC, SYSERR_RM_SE_GRP_MAX_VS, SYSERR_RM_ALL_SE_IN_SE_GRP_GW_DOWN, SYSERR_RM_SE_GW_DOWN, SYSERR_RM_SE_DISCONNECTED, SYSERR_VI_MGR_SEVM_VNIC_SUCCESS, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_HW_INFO, SYSERR_VI_MGR_SEVM_CREATE_FAIL_DUPLICATE_NAME, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_MGMT_NW, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_CPU, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_MEM, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_LEASE, SYSERR_VI_MGR_SEVM_CREATE_FAIL_OVF_ERROR, SYSERR_VI_MGR_SEVM_CREATE_NO_HOST_VM_NETWORK, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_PROGRESS, SYSERR_VI_MGR_SEVM_CREATE_FAIL_ABORTED, SYSERR_VI_MGR_SEVM_CREATE_FAILURE, SYSERR_VI_MGR_SEVM_CREATE_FAIL_POWER_ON, SYSERR_VI_MGR_SEVM_VNIC_NO_VM, SYSERR_VI_MGR_SEVM_VNIC_MAC_ADDR_ERROR, SYSERR_VI_MGR_SEVM_VNIC_FAILURE, SYSERR_VI_MGR_SEVM_VNIC_NO_PG_PORTS, SYSERR_VI_MGR_SEVM_DELETE_FAILURE, SYSERR_VI_MGR_SEVM_CREATE_LIMIT_REACHED, SYSERR_VI_MGR_SEVM_SET_MGMT_IP_FAILED, SYSERR_VI_MGR_SEVM_CREATE_ACCESS_ERROR, SYSERR_VI_MGR_SEVM_CREATE_NO_IMAGE, SYSERR_VI_MGR_SEVM_VINFRA_UNINITIALIZED, SYSERR_VI_MGR_SEVM_CREATE_NO_HOST, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_MGMT_NW_PORTS, SYSERR_VI_MGR_SEVM_INVALID_DATA, SYSERR_VI_MGR_SEVM_CREATE_FAIL_MULTIPLE_MGMT_NW, SYSERR_VI_MGR_SEVM_VCENTER_CONN_FAIL, SYSERR_VI_MGR_SEVM_TIMED_OUT, SYSERR_VI_MGR_SEVM_NO_SOURCE_CLONE, SYSERR_VI_MGR_SEVM_NO_AVAILABILITY_ZONE, SYSERR_VI_MGR_SEVM_FLAVOR_UNAVAIL, SYSERR_VI_MGR_SEVM_DELETED, SYSERR_VI_MGR_SEVM_VINFRA_FAILURE, SYSERR_VI_MGR_SEVM_VNIC_FAILURE_QUESTION, SYSERR_VI_MGR_LOGIN_FAIL_NO_VCENTER, SYSERR_VI_MGR_LOGIN_FAIL_USER_CREDENTIALS, SYSERR_VI_MGR_VCENTER_VERSION_MISMATCH, SYSERR_DB_CACHE_TBL_NOT_FOUND, SYSERR_DB_CACHE_OBJ_NOT_FOUND, SYSERR_DB_QUERY_QUEUED, SYSERR_DB_QUERY_BATCHED, SYSERR_DB_UPDATE_FAILED, SYSERR_DB_QUERY_FAILED, SYSERR_OS_AGENT_Q_FULL, SYSERR_OS_AGENT_OPENSTACK_UNINITIALIZED, SYSERR_OS_AGENT_OPENSTACK_ACCESSERR, SYSERR_OS_AGENT_OPENSTACK_RESOURCEERR, SYSERR_OS_AGENT_TENANT_ABSENT, SYSERR_OS_AGENT_INVALID_DATA, SYSERR_CC_SVC_Q_FULL, SYSERR_CC_AGENT_UNINITIALIZED, SYSERR_CC_AGENT_ACCESSERR, SYSERR_CC_AGENT_RESOURCEERR, SYSERR_CC_AGENT_TENANT_ACCESSERR, SYSERR_CC_AGENT_TENANT_ABSENT, SYSERR_CC_SVC_INVALID_DATA, SYSERR_CC_OS_AGENT_NEUTRON_HOST_ACCESSERR, SYSERR_CC_NO_FLAVOR, SYSERR_CC_AGENT_ABSENT, SYSERR_CC_AGENT_CONFIG_FAILURE, SYSERR_CC_AGENT_DECONFIG_FAILURE, SYSERR_CC_AGENT_NON_INFRA_SEVM, SYSERR_MESOS_DISCOVERY_DEPLOYMENT_FAIL, SYSERR_MESOS_DISCOVERY_TIMEOUT, SYSERR_MARATHON_APP_TERMINATED, SYSERR_MARATHON_INACCESSIBLE, SYSERR_FLEET_API_ERROR, SYSERR_MESOS_SSH_CMD_TIMEOUT, SYSERR_MESOS_SSH_ABORTED, SYSERR_MESOS_SSH_FAILURE, SYSERR_MESOS_SSH_NOTFOUND, SYSERR_CC_AGENT_VNIC_NO_IPS_AVAILABLE, SYSERR_CC_AGENT_VNIC_NO_SUBNETWORK, SYSERR_CC_AGENT_VNIC_FAILURE, SYSERR_CC_AGENT_SCALE_IN_FAILED, SYSERR_CC_AGENT_DS_FAILED, SYSERR_CC_AGENT_NOT_IMPLEMENTED, SYSERR_CC_AGENT_METHOD_NOT_IMPLEMENTED, SYSERR_CC_AGENT_GENERIC_FAILURE, SYSERR_RUM_TOOMANYSAMPLES, SYSERR_METRICS_TOO_MANY_MSG, SYSERR_METRICS_TOO_MANY_MSG_ACROSS_ENTITIES, SYSERR_ANOMALYZER_NOT_ENOUGH_SAMPLES, SYSERR_AUTOSCALE_REASON_INTELLIGENT_AUTOSCALE, SYSERR_AUTOSCALE_REASON_CONFIG_UPDATE, SYSERR_AUTOSCALE_REASON_POOL_STATE_CHANGE, SYSERR_AUTOSCALE_REASON_ALERT, SYSERR_AUTOSCALEIN_FAILED_LIMIT_EXCEEDED, SYSERR_AUTOSCALEOUT_FAILED_LIMIT_EXCEEDED, SYSERR_AUTOSCALE_IGNORED_AS_WITHIN_COOLDOWN, SYSERR_AUTOSCALE_ORCHESTRATION_TIMEOUT, SYSERR_AUTOSCALE_REASON_NOT_ENOUGH_SERVERS, SYSERR_AUTOSCALE_REASON_TOO_MANY_SERVERS, SYSERR_AUTOSCALE_REASON_ORCHESTRATION_FAILED, SYSERR_AUTOSCALE_REASON_MANUAL, SYSERR_AUTOSCALE_POLICY_NOT_FOUND, SYSERR_SEAGENT_OBJ_INACTIVE, SYSERR_SEAGENT_OBJ_AWAITING_DP_PROGRAMMING, SYSERR_SEAGENT_OBJ_ACTIVE, SYSERR_SEAGENT_OBJ_GRAPHDB_ERROR, SYSERR_SEAGENT_OBJ_DP_ERROR, SYSERR_SEAGENT_OBJ_DISABLED_RULE_POOL, SYSERR_SEAGENT_EASTWEST_VS_SUBNET_ERROR, SYSERR_GSLB_INVALID_MTYPE, SYSERR_GSLB_INVALID_SITE_CREDENTIALS, SYSERR_GSLB_OBJECT_NOT_FOUND, SYSERR_GSLB_INVALID_OPS, SYSERR_GSLB_PARTIAL_SUCCESS, SYSERR_GSLB_FQDN_CONFLICT, SYSERR_GSLB_CLEANUP_IN_PROGRESS, SYSERR_GSLB_METHOD_NOP.
	ReasonCode string `json:"reason_code,omitempty"`
}
