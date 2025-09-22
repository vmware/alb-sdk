// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DebugController debug controller
// swagger:model DebugController
type DebugController struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Filters *DebugFilterUnion `json:"filters,omitempty"`

	// Global logging level for the application. Enum options - LOG_LEVEL_DISABLED, LOG_LEVEL_INFO, LOG_LEVEL_WARNING, LOG_LEVEL_ERROR, LOG_LEVEL_DEBUG. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LogLevel *string `json:"log_level"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  Enum options - TASK_QUEUE_DEBUG, RPC_INFRA_DEBUG, JOB_MGR_DEBUG, TRANSACTION_DEBUG, SE_AGENT_DEBUG, SE_AGENT_METRICS_DEBUG, VIRTUALSERVICE_DEBUG, RES_MGR_DEBUG, SE_MGR_DEBUG, VI_MGR_DEBUG, METRICS_MANAGER_DEBUG, METRICS_MGR_DEBUG, EVENT_API_DEBUG, HS_MGR_DEBUG, ALERT_MGR_DEBUG, AUTOSCALE_MGR_DEBUG, APIC_AGENT_DEBUG, REDIS_INFRA_DEBUG, CLOUD_CONNECTOR_DEBUG, MESOS_METRICS_DEBUG, STATECACHE_MGR_DEBUG, NSX_AGENT_DEBUG, SE_AGENT_CPU_UTIL_DEBUG, SE_AGENT_MEM_UTIL_DEBUG, SE_RPC_PROXY_DEBUG, SE_AGENT_GSLB_DEBUG, METRICSAPI_SRV_DEBUG, SECURITYMGR_DEBUG, RES_MGR_READ_DEBUG, LICENSE_VMWSRVR_DEBUG, SE_AGENT_RESOLVERDB_DEBUG, LOGMANAGER_DEBUG, OSYNC_DEBUG, EVENTMANAGER_DEBUG, SHARD_ORCHESTRATOR_DEBUG, RUNNOTIFICATIONS_DEBUG, JOBMANAGER_DEBUG, DNS_MANAGER_DEBUG, SECURE_KEY_EXCHANGE_DEBUG, SE_DATASTORE_DEBUG, FEDERATED_DATASTORE_DEBUG, SHARD_SERVER_DEBUG, SE_GRPC_AUTH_SERVER_DEBUG, SE_CONTROLLER_INTF_DEBUG, CLUSTER_SERVICES_WATCHER_DEBUG, SEUPGRADE_PARENT_DEBUG, PORTALCONNECTOR_DEBUG, PROCESS_EVENT_FORWARDER_DEBUG, DIFF_COMPACTOR_DEBUG, RES_MGR_GO_DEBUG, PLACEMENT_ORCHESTRATOR_DEBUG, LICENSE_MGR_DEBUG, OCTAVIUS_DEBUG, GSLB_LOCAL_WORKER_DEBUG, GSLB_REMOTE_WORKER_DEBUG, IMAGE_MANAGER_DEBUG, STATEDIFF_SERVICE_DEBUG, REMOTE_TASK_MANAGER_DEBUG, REMOTE_TASK_MANAGER_CLIENT_DEBUG, AVISCP_SERVER_DEBUG, UPGRADE_PORTAL_DEBUG, AUTHSERVER_DEBUG, APISERVER_DEBUG, GSLBPORTAL_DEBUG, ANALYTICS_ENGINE_LOGRECEIVER_DEBUG, CLUSTIFY_DEBUG, IPGEOLOCATIONSERVER_DEBUG, SYSTEM_HEALTH_AGENT_DEBUG, SYSTEM_HEALTH_SERVICE_DEBUG, TECH_SUPPORT_HANDLER_DEBUG, SE_AUTOSCALER_DEBUG, REPORTING_SERVER_DEBUG. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SubModule *string `json:"sub_module"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Application specific customization of trace level for logs. Enum options - TRACE_LEVEL_DISABLED, TRACE_LEVEL_ERROR, TRACE_LEVEL_DEBUG, TRACE_LEVEL_DEBUG_DETAIL. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TraceLevel *string `json:"trace_level"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
