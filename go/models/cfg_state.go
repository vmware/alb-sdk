package models

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

// CfgState cfg state
// swagger:model CfgState
type CfgState struct {

	// cfg-version synced to follower. .
	CfgVersion *int32 `json:"cfg_version,omitempty"`

	// cfg-version in flight to follower. .
	CfgVersionInFlight *int32 `json:"cfg_version_in_flight,omitempty"`

	// Placeholder for description of property last_changed_time of obj type CfgState field type str  type object
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// reason of CfgState.
	Reason *string `json:"reason,omitempty"`

	// site_uuid to which the object was synced.
	SiteUUID *string `json:"site_uuid,omitempty"`

	// Status of the object. . Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_BAD_REQUEST, SYSERR_TEST1, SYSERR_TEST2, SYSERR_QUEUE_TRANSPORT_FAILURE, SYSERR_QUEUE_RETRY_TASK, SYSERR_DATASTORE_TRANSPORT_FAILURE, SYSERR_DATASTORE_UNKNOWN_FAILURE, SYSERR_DATASTORE_OBJECT_DOES_NOT_EXIST, SYSERR_DATASTORE_REFERENCE_DOES_NOT_EXIST, SYSERR_DATASTORE_DB_LOCKED, SYSERR_DATASTORE_LOCK_FAILURE, SYSERR_DATASTORE_TBL_NOT_EXIST, SYSERR_SVC_COMMON_OBJECT_NOT_IN_CACHED_VIEW, SYSERR_RPC_CANCELED_BY_CLIENT, SYSERR_RPC_TIMED_OUT, SYSERR_RPC_SEND_FAILED, SYSERR_RPC_CANCELED_BY_TRANSACTION_CLEANUP, SYSERR_NO_MULTICAST_RECEIVERS, SYSERR_RPC_FAILED, SYSERR_RPC_CONNECT_FAILED, SYSERR_CONTROLLER_NOT_READY, SYSERR_VERSION_MISMATCH, SYSERR_ALREADY_REGISTERED, SYSERR_INVALID_METHOD, SYSERR_DESERIALIZATION, SYSERR_SERIALIZATION, SYSERR_ENQUEUE, SYSERR_DEQUEUE, SYSERR_INVALID_READ_LEVEL, SYSERR_ADD_HM_PHM_OBJECT_NOT_FOUND, SYSERR_CREATE_INVALID_PERSISTENCE_TYPE, SYSERR_VS_INVALID_METHOD, SYSERR_VS_NOT_PRESENT, SYSERR_VS_INVALID_REQUEST, SYSERR_VS_NOT_ENOUGH_RESOURCES, SYSERR_VS_SE_NOT_AVAILABLE, SYSERR_VS_VNIC_FAILURE, SYSERR_VS_DELETE_WHILE_STILL_BEING_REFERRED, SYSERR_INVALID_HEALTH_MONITOR_TYPE, SYSERR_VS_SE_ASSIGNMENT_FAILED, SYSERR_VS_INVALID_OBJECT, SYSERR_VS_SERVICE_ENGINE_DOWN, SYSERR_VS_RPC_FAILURE, SYSERR_VS_NOT_BOUND, SYSERR_VS_DISABLED, SYSERR_VS_INTERNAL_ERROR, SYSERR_VS_SCALEOUT_ERROR, SYSERR_VS_SCALEIN_ERROR, SYSERR_VS_MIGRATE_ERROR, SYSERR_VS_MIGRATE_SCALEOUT_ERROR, SYSERR_VS_MIGRATE_SCALEIN_ERROR, SYSERR_VS_AWAIT_STATIC_SE, SYSERR_VS_MIN_SE_NOT_ASSIGNED, SYSERR_VS_SE_NOT_AT_CURRENT_VERSION, SYSERR_VS_RUNTIME_ABSENT, SYSERR_VS_STATEDB_ERR, SYSERR_VS_SNI_CHILD_PARENT_SELIST_MISMATCH, SYSERR_VS_SNI_PARENT_NOT_FOUND, SYSERR_VS_SNI_CHILD_PARENT_SEGROUP_MISMATCH, SYSERR_VS_STATS_INDEX_NOT_AVAILABLE, SYSERR_VS_UPDATE_FAILED, SYSERR_VS_CREATE_FAILED, SYSERR_SE_MGR_VNIC_ALLOC_FAIL, SYSERR_SE_MGR_VNIC_NOT_FOUND, SYSERR_SE_MGR_UNKNOWN_SE, SYSERR_SE_MGR_UNKNOWN_STATE_TRANSITION, SYSERR_SE_MGR_SE_OFFLINE_HB_FAILURE, SYSERR_SE_UPGRADE_IN_PROGRESS, SYSERR_SE_NOT_CONNECTED, SYSERR_RM_RES_UNAVAIL, SYSERR_RM_RES_UNAVAIL_NOTIFY, SYSERR_RM_RES_NOT_INUSE, SYSERR_RM_CONSUMER_NOT_FOUND, SYSERR_RM_REACHABILITY_FAILED, SYSERR_RM_RELEASE_SE_UNAVAIL, SYSERR_RM_UNKNOWN_SE_GROUP, SYSERR_RM_NO_SE_FOUND, SYSERR_RM_PARTIAL_SE_FOUND, SYSERR_RM_AWAIT_VM_CREATE, SYSERR_RM_AWAIT_VNIC_ADD, SYSERR_RM_AWAIT_BOOTUP, SYSERR_RM_RESOURCE_NOT_FOUND, SYSERR_RM_CANNOT_SPAWN_SE, SYSERR_RM_RES_NOT_NEEDED, SYSERR_RM_RES_INFRA_DELETED, SYSERR_RM_RES_USER_DELETED, SYSERR_RM_RES_USER_REBOOTED, SYSERR_RM_RES_CRASHED, SYSERR_RM_RES_CONN_LOST, SYSERR_RM_RES_VIP_REACH_LOST, SYSERR_RM_VS_PROCESSING, SYSERR_RM_VNIC_IP_FAILURE, SYSERR_RM_STATIC_NO_POOL, SYSERR_RM_STATIC_POOL_EXHAUSTED, SYSERR_RM_VIP_MULT_NETWORKS, SYSERR_RM_SRVR_MULT_NETWORKS, SYSERR_RM_VIP_NO_NETWORK, SYSERR_RM_SRVR_NO_NETWORK, SYSERR_RM_MAX_PARALLEL_SE_CREATE, SYSERR_RM_MAX_SE_CREATE_ATTEMPTS, SYSERR_RM_MULT_SE_CRASH, SYSERR_RM_VS_SE_CREATE_IN_PROG, SYSERR_RM_VS_SE_BOOTUP_IN_PROG, SYSERR_RM_VS_SE_VNIC_ADD_IN_PROG, SYSERR_RM_VS_SE_VNIC_IP_IN_PROG, SYSERR_RM_NO_SUITABLE_HOST, SYSERR_RM_NO_SE_IN_SE_GRP, SYSERR_RM_ALL_SE_IN_SE_GRP_DOWN, SYSERR_RM_NO_SE_IN_SE_GRP_SRVR_ACC, SYSERR_RM_NO_SE_IN_SE_GRP_VIP_ACC, SYSERR_RM_ALL_SE_IN_SE_GRP_MAX_VS, SYSERR_RM_ALL_SE_IN_SE_GRP_NW_ACC_MAX_VS, SYSERR_RM_VIP_SE_NW_ACC, SYSERR_RM_VIP_SE_MAX_VS, SYSERR_RM_VIP_SE_GRP_MISMATCH, SYSERR_RM_VIP_SE_PENDING_OP, SYSERR_RM_MULT_MGMT_SUBNET, SYSERR_RM_MAX_SE_IN_GRP, SYSERR_RM_BOOTUP_FAILURE, SYSERR_RM_PENDING_VNIC_OP, SYSERR_RM_SE_MGMT_NO_STATIC_IPS_CONFIGURED, SYSERR_RM_SE_MGMT_STATIC_IPS_EXHAUSTED, SYSERR_RM_NO_MGMT_SUBNET, SYSERR_RM_MGMT_DHCP_FAILURE, SYSERR_RM_CANNOT_ADD_VNICS, SYSERR_RM_CONSUMER_RESOURCES_SATISFIED, SYSERR_RM_DATA_DHCP_FAILURE, SYSERR_RM_QUERY_HOST_IN_PROGRESS, SYSERR_RM_INSUFFICIENT_BUFFER_SE, SYSERR_RM_NO_DEFAULT_GW_SE_MGMT_NW, SYSERR_RM_PARENT_SE_NW_ACC, SYSERR_RM_PARENT_SE_MAX_VS, SYSERR_RM_PARENT_SE_GRP_MISMATCH, SYSERR_RM_DEF_GW_INCORRECT, SYSERR_RM_NETWORK_NOT_FOUND, SYSERR_RM_ALL_SE_IN_SE_GRP_USED, SYSERR_RM_SE_GRP_PENDING_OP, SYSERR_RM_ALL_SE_IN_SE_GRP_DISABLED, SYSERR_RM_VS_SE_PING_CHECK_IN_PROG, SYSERR_RM_CONSUMER_PENDING_TASK, SYSERR_RM_SE_GRP_VIP_NW_ACC, SYSERR_RM_SE_GRP_NW_ACC, SYSERR_RM_SE_GRP_MAX_VS, SYSERR_RM_ALL_SE_IN_SE_GRP_GW_DOWN, SYSERR_RM_SE_GW_DOWN, SYSERR_RM_SE_DISCONNECTED, SYSERR_RM_RES_USER_DISABLED_FORCE, SYSERR_RM_VS_SE_ATTACH_IP_IN_PROG, SYSERR_RM_LICENSE_EXCEEDED_CANNOT_SPAWN_SE, SYSERR_RM_RES_SWTICHOVER_FORCE, SYSERR_VI_MGR_SEVM_VNIC_SUCCESS, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_HW_INFO, SYSERR_VI_MGR_SEVM_CREATE_FAIL_DUPLICATE_NAME, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_MGMT_NW, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_CPU, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_MEM, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_LEASE, SYSERR_VI_MGR_SEVM_CREATE_FAIL_OVF_ERROR, SYSERR_VI_MGR_SEVM_CREATE_NO_HOST_VM_NETWORK, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_PROGRESS, SYSERR_VI_MGR_SEVM_CREATE_FAIL_ABORTED, SYSERR_VI_MGR_SEVM_CREATE_FAILURE, SYSERR_VI_MGR_SEVM_CREATE_FAIL_POWER_ON, SYSERR_VI_MGR_SEVM_VNIC_NO_VM, SYSERR_VI_MGR_SEVM_VNIC_MAC_ADDR_ERROR, SYSERR_VI_MGR_SEVM_VNIC_FAILURE, SYSERR_VI_MGR_SEVM_VNIC_NO_PG_PORTS, SYSERR_VI_MGR_SEVM_DELETE_FAILURE, SYSERR_VI_MGR_SEVM_CREATE_LIMIT_REACHED, SYSERR_VI_MGR_SEVM_SET_MGMT_IP_FAILED, SYSERR_VI_MGR_SEVM_CREATE_ACCESS_ERROR, SYSERR_VI_MGR_SEVM_CREATE_NO_IMAGE, SYSERR_VI_MGR_SEVM_VINFRA_UNINITIALIZED, SYSERR_VI_MGR_SEVM_CREATE_NO_HOST, SYSERR_VI_MGR_SEVM_CREATE_FAIL_NO_MGMT_NW_PORTS, SYSERR_VI_MGR_SEVM_INVALID_DATA, SYSERR_VI_MGR_SEVM_CREATE_FAIL_MULTIPLE_MGMT_NW, SYSERR_VI_MGR_SEVM_VCENTER_CONN_FAIL, SYSERR_VI_MGR_SEVM_TIMED_OUT, SYSERR_VI_MGR_SEVM_NO_SOURCE_CLONE, SYSERR_VI_MGR_SEVM_NO_AVAILABILITY_ZONE, SYSERR_VI_MGR_SEVM_FLAVOR_UNAVAIL, SYSERR_VI_MGR_SEVM_DELETED, SYSERR_VI_MGR_SEVM_VINFRA_FAILURE, SYSERR_VI_MGR_SEVM_VNIC_FAILURE_QUESTION, SYSERR_VI_MGR_LOGIN_FAIL_NO_VCENTER, SYSERR_VI_MGR_LOGIN_FAIL_USER_CREDENTIALS, SYSERR_VI_MGR_VCENTER_VERSION_MISMATCH, SYSERR_DB_CACHE_TBL_NOT_FOUND, SYSERR_DB_CACHE_OBJ_NOT_FOUND, SYSERR_DB_QUERY_QUEUED, SYSERR_DB_QUERY_BATCHED, SYSERR_DB_UPDATE_FAILED, SYSERR_DB_QUERY_FAILED, SYSERR_OS_AGENT_Q_FULL, SYSERR_OS_AGENT_OPENSTACK_UNINITIALIZED, SYSERR_OS_AGENT_OPENSTACK_ACCESSERR, SYSERR_OS_AGENT_OPENSTACK_RESOURCEERR, SYSERR_OS_AGENT_TENANT_ABSENT, SYSERR_OS_AGENT_INVALID_DATA, SYSERR_CC_SVC_Q_FULL, SYSERR_CC_AGENT_UNINITIALIZED, SYSERR_CC_AGENT_ACCESSERR, SYSERR_CC_AGENT_RESOURCEERR, SYSERR_CC_AGENT_TENANT_ACCESSERR, SYSERR_CC_AGENT_TENANT_ABSENT, SYSERR_CC_SVC_INVALID_DATA, SYSERR_CC_OS_AGENT_NEUTRON_HOST_ACCESSERR, SYSERR_CC_NO_FLAVOR, SYSERR_CC_AGENT_ABSENT, SYSERR_CC_AGENT_CONFIG_FAILURE, SYSERR_CC_AGENT_DECONFIG_FAILURE, SYSERR_CC_AGENT_NON_INFRA_SEVM, SYSERR_MESOS_DISCOVERY_DEPLOYMENT_FAIL, SYSERR_MESOS_DISCOVERY_TIMEOUT, SYSERR_MARATHON_APP_TERMINATED, SYSERR_MARATHON_INACCESSIBLE, SYSERR_FLEET_API_ERROR, SYSERR_MESOS_SSH_CMD_TIMEOUT, SYSERR_MESOS_SSH_ABORTED, SYSERR_MESOS_SSH_FAILURE, SYSERR_MESOS_SSH_NOTFOUND, SYSERR_CC_AGENT_VNIC_NO_IPS_AVAILABLE, SYSERR_CC_AGENT_VNIC_NO_SUBNETWORK, SYSERR_CC_AGENT_VNIC_FAILURE, SYSERR_CC_AGENT_SCALE_IN_FAILED, SYSERR_CC_AGENT_DS_FAILED, SYSERR_CC_AGENT_SCALE_OUT_FAILED, SYSERR_CC_AGENT_NOT_IMPLEMENTED, SYSERR_CC_AGENT_METHOD_NOT_IMPLEMENTED, SYSERR_CC_AGENT_GENERIC_FAILURE, SYSERR_RUM_TOOMANYSAMPLES, SYSERR_METRICS_TOO_MANY_MSG, SYSERR_METRICS_TOO_MANY_MSG_ACROSS_ENTITIES, SYSERR_ANOMALYZER_NOT_ENOUGH_SAMPLES, SYSERR_AUTOSCALE_REASON_INTELLIGENT_AUTOSCALE, SYSERR_AUTOSCALE_REASON_CONFIG_UPDATE, SYSERR_AUTOSCALE_REASON_POOL_STATE_CHANGE, SYSERR_AUTOSCALE_REASON_ALERT, SYSERR_AUTOSCALEIN_FAILED_LIMIT_EXCEEDED, SYSERR_AUTOSCALEOUT_FAILED_LIMIT_EXCEEDED, SYSERR_AUTOSCALE_IGNORED_AS_WITHIN_COOLDOWN, SYSERR_AUTOSCALE_ORCHESTRATION_TIMEOUT, SYSERR_AUTOSCALE_REASON_NOT_ENOUGH_SERVERS, SYSERR_AUTOSCALE_REASON_TOO_MANY_SERVERS, SYSERR_AUTOSCALE_REASON_ORCHESTRATION_FAILED, SYSERR_AUTOSCALE_REASON_MANUAL, SYSERR_AUTOSCALE_POLICY_NOT_FOUND, SYSERR_LICENSE_FIELD_NAME_NOT_SET, SYSERR_LICENSE_FILE_NOT_FOUND, SYSERR_LICENSE_FIELD_VALID_UNTIL_NOT_SET, SYSERR_LICENSE_INVALID_TIERS, SYSERR_LICENSE_FIELD_LICENSE_ID_NOT_PRESENT, SYSERR_LICENSE_INVALID_VERSION, SYSERR_LICENSE_DECRYPTION_FAILED, SYSERR_LICENSE_ENFORCEMENT_KEY_NOT_VALID, SYSERR_SEAGENT_OBJ_INACTIVE, SYSERR_SEAGENT_OBJ_AWAITING_DP_PROGRAMMING, SYSERR_SEAGENT_OBJ_ACTIVE, SYSERR_SEAGENT_OBJ_GRAPHDB_ERROR, SYSERR_SEAGENT_OBJ_DP_ERROR, SYSERR_SEAGENT_OBJ_DISABLED_RULE_POOL, SYSERR_SEAGENT_EASTWEST_VS_SUBNET_ERROR, SYSERR_SEAGENT_OBJ_NOT_FOUND, SYSERR_SEAGENT_VS_NOT_FOUND, SYSERR_SEAGENT_VS_VRF_ERROR, SYSERR_SEAGENT_VS_SELIST_LIMIT_ERROR, SYSERR_SEAGENT_VS_SELIST_SE_INTF_ERROR, SYSERR_SEAGENT_VS_CHILD_PARENT_UUID_MISSING, SYSERR_SEDP_PARENT_VS_NOT_EXIST_FOR_CHILD, SYSERR_SEAGENT_TENANT_CREATE_FAILED, SYSERR_SEAGENT_TENANT_UPDATE_FAILED, SYSERR_SEDP_VNIC_CREATION_FAILURE, SYSERR_SEDP_VNIC_ATTACH_FAILURE, SYSERR_SEDP_VNIC_IF_CREATION_FAILURE, SYSERR_SEDP_VNIC_START_FAILURE, SYSERR_SEDP_VNIC_NOT_FOUND, SYSERR_SEDP_VNIC_MISMATCH_VRF, SYSERR_SEDP_VNIC_IP_ADDR_ADD_FAILURE, SYSERR_SEDP_VNIC_IP_ADDR_DEL_FAILURE, SYSERR_SEDP_VNIC_OWNER_CORE_NOT_FOUND, SYSERR_SEDP_VNIC_MAIN_VNIC_NOT_FOUND, SYSERR_SEDP_VNIC_MEMBER_VNIC_NOT_FOUND, SYSERR_SEDP_VNIC_VLAN_FILTER_ADD_FAILURE, SYSERR_SEDP_VNIC_VLAN_FILTER_REMOVE_FAILURE, SYSERR_SEDP_VNIC_UNKNOWN_MSG_TYPE, SYSERR_GSLB_INVALID_MTYPE, SYSERR_GSLB_INVALID_SITE_CREDENTIALS, SYSERR_GSLB_OBJECT_NOT_FOUND, SYSERR_GSLB_INVALID_OPS, SYSERR_GSLB_PARTIAL_SUCCESS, SYSERR_GSLB_FQDN_CONFLICT, SYSERR_GSLB_CLEANUP_IN_PROGRESS, SYSERR_GSLB_METHOD_NOP, SYSERR_GSLB_API_NOT_SUPPORTED_FOR_UNFEDERATED_OBJECTS, SYSERR_GSLB_STATEDB_ERR, SYSERR_GSLB_SERVICE_MEMBER_VIPS_NOT_IN_SYNC, SYSERR_GSLB_SERVICE_MEMBER_DISABLED, SYSERR_GSLB_SITE_DISABLED, SYSERR_GSLB_SERVICE_DISABLED, SYSERR_GSLB_HM_PROXY_DOWN, SYSERR_GSLB_DNS_DISABLED, SYSERR_GSLB_SERVICE_NON_AVI_VIP_INFO_UNAVAILABLE, SYSERR_GSLB_SERVICE_DATAPATH_STATUS_UNAVAILABLE, SYSERR_GSLB_SERVICE_MEMBER_SERVICES_NOT_IN_SYNC, SYSERR_GSLB_SERVICE_INCONSISTENT_APPLICATION_PROFILE, SYSERR_GSLB_SERVICE_INVALID_APPLICATION_PROFILE, SYSERR_GSLB_SERVICE_SP_INCONSISTENT_CONFIGURED_SERVERS, SYSERR_GSLB_SERVICE_SP_INCONSISTENT_OPERATIONAL_SERVERS, SYSERR_GSLB_SERVICE_SP_ALL_SERVERS_DOWN, SYSERR_GSLB_SERVICE_SP_SOME_SERVERS_DOWN, SYSERR_GSLB_CONFIGURED_VS_IS_NOT_A_DNS_VS, SYSERR_GSLB_NOT_CONFIGURED, SYSERR_GSLB_INVALID_SENDER, SYSERR_GSLB_INVALID_SENDER_STATE, SYSERR_GSLB_INVALID_RX_ID, SYSERR_GSLB_INVALID_VIEW_ID, SYSERR_GSLB_GROUP_CONFLICT, SYSERR_GSLB_INVALID_MTYPE_AT_FOLLOWER, SYSERR_GSLB_LEADER_NOT_IN_LIST, SYSERR_GSLB_SERVICE_CTRL_STATUS_UNAVAILABLE, SYSERR_GSLB_SITE_FSM_NULL, SYSERR_GSLB_SITE_FSM_DISABLE_IN_PROGRESS, SYSERR_GSLB_SITE_FSM_DISABLED, SYSERR_GSLB_SITE_FSM_JOIN_IN_PROGRESS, SYSERR_GSLB_SITE_FSM_INIT, SYSERR_GSLB_SITE_FSM_UNREACHABLE, SYSERR_GSLB_SITE_FSM_LEAVE_IN_PROGRESS, SYSERR_GSLB_SITE_FSM_MMODE, SYSERR_GSLB_SITE_ACTIVE_TO_PASSIVE_TRANSITION, SYSERR_GSLB_SITE_PASSIVE_TO_ACTIVE_TRANSITION, SYSERR_GSLB_SITE_MAX_RETRIES_DONE, SYSERR_GSLB_TIMEOUT, SYSERR_GSLB_CONNECTION_TIMEOUT, SYSERR_GSLB_CONNECTION_REFUSED_ERROR, SYSERR_GSLB_SERVICE_CTRL_STATUS_NA_DUE_TO_UNREACHABLE_SITE, SYSERR_GSLB_SERVICE_SP_NO_CONFIGURED_SERVERS, SYSERR_GSLB_INVALID_OBJECT, SYSERR_DNS_POLICY_CREATE_FAIL, SYSERR_DNS_POLICY_UPDATE_FAIL, SYSERR_LCM_CORE_NOT_COPIED_DUE_TO_MAX_LIMIT, SYSERR_LCM_CORE_NOT_COPIED_INSUFFICIENT_DISK_SIZE, SYSERR_LCM_SKIP_SIMILAR_CORE, SYSERR_LCM_CORE_NOT_COPIED_DUE_TO_ERRORS, SYSERR_LCM_STOP, SYSERR_POOL_SERVER_CAPEST_BREACHED, SYSERR_POOL_CREATE_FAILED, SYSERR_POOL_UPDATE_FAILED_INCONSISTENT, SYSERR_POOL_UPDATE_FAILED, SYSERR_POOL_SERVER_STATE_UPDATE_FAILED, SYSERR_POOL_UPDATE_SERVER_FAILED, SYSERR_POOL_UPDATE_LB_ALGO_NO_STATE, SYSERR_SHM_HASH_INSERT_FAILED, SYSERR_SE_RPC_PROXY_STREAM_NOT_CONNECTED, SYSERR_SE_RPC_PROXY_STREAM_WRITE_FAILED, SYSERR_SE_RPC_PROXY_UNABLE_TO_FIND_SYNC_RPC, SYSERR_PRST_PROF_OBJECT_TYPE_MISMATCH, SYSERR_PRST_PROF_OBJECT_NOT_FOUND, SYSERR_PRST_PROF_NULL, SYSERR_PRST_PROF_OBJECT_PRESENT, SYSERR_MS_OBJECT_EXISTS, SYSERR_MS_OBJECT_NOT_FOUND, SYSERR_MS_GRP_OBJECT_EXISTS, SYSERR_MS_GRP_OBJECT_NOT_FOUND, SYSERR_HTTP_POLICY_CREATE_FAILED, SYSERR_HTTP_POLICY_CREATE_EXISTS, SYSERR_HTTP_POLICY_CREATE_SHM_INSERT, SYSERR_HTTP_POLICY_UPDATE_FAILED, SYSERR_STR_GRP_REGISTER_INVAL, SYSERR_STR_GRP_DEREGISTER_INVAL, SYSERR_AG_CREATE_POST_FAILED, SYSERR_AG_CREATE_PRE_FAILED, SYSERR_AG_UPDATE_FAILED, SYSERR_APP_PROF_UPDATE_TYPE_MISMATCH, SYSERR_APP_PROF_CREATE_INVALID_TYPE, SYSERR_APP_PROF_UPDATE_PRESERVE_CLIENT_IP_CHANGED, SYSERR_APP_PROF_NOT_FOUND, SYSERR_POOL_GRP_MEMBER_NOT_FOUND, SYSERR_POOL_GRP_UPDATE_FAILED, SYSERR_POOL_GRP_CREATE_FAILED, SYSERR_L4PS_CONNPOL_POOL_FAILED, SYSERR_L4PS_CONNPOL_POOL_GRP_FAILED, SYSERR_L4PS_CONNPOL_IP_GRP_FAILED, SYSERR_L4PS_CREATE_FAILED, SYSERR_ANT_PROF_NOT_FOUND, SYSERR_LB_CHASH_INVALID_TYPE.
	Status *string `json:"status,omitempty"`

	// object-uuid that is being synced to follower. .
	UUID *string `json:"uuid,omitempty"`
}
