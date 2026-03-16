// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolInternal pool internal
// swagger:model PoolInternal
type PoolInternal struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationPersistenceProfileUUID *string `json:"application_persistence_profile_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CapacityEstimation *bool `json:"capacity_estimation,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CapacityEstimationTtfbThresh *uint32 `json:"capacity_estimation_ttfb_thresh,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionRampDuration *int32 `json:"connection_ramp_duration,omitempty"`

	// Indicates whether VS is L4 or L7. Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Dpthread *uint32 `json:"dpthread,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FewestTasksFeedbackDelay *uint32 `json:"fewest_tasks_feedback_delay,omitempty"`

	// Used to gracefully disable a server. Virtual service waits for the specified time before terminating the existing connections  to the servers that are disabled. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GracefulDisableTimeoutSec *int32 `json:"graceful_disable_timeout_sec,omitempty"`

	// Indicates whether server port is ignored in consistent hash and lpbm creation. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IgnoreServerPort *bool `json:"ignore_server_port,omitempty"`

	// Pool latitude for GSLB pools, calculated based on server locations. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Latitude *uint32 `json:"latitude,omitempty"`

	// Indicates whether round robin load balancing algorithm is per SE. Field introduced in 21.1.5, 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbAlgoRrPerSe *bool `json:"lb_algo_rr_per_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbState *PoolLbState `json:"lb_state,omitempty"`

	// Flag indicating if pool location is valid for GSLB pools. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocationValid *bool `json:"location_valid,omitempty"`

	// Pool longitude for GSLB pools, calculated based on server locations. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Longitude *uint32 `json:"longitude,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHmsDeduped *uint32 `json:"num_hms_deduped,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPersistenceObjs *int64 `json:"num_persistence_objs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPhms *uint32 `json:"num_phms,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServers *int32 `json:"num_servers,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PersistenceHandleInternal *PersistenceHandleInternal `json:"persistence_handle_internal,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolConfig *Pool `json:"pool_config,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolRefcnt *PoolRefCnt `json:"pool_refcnt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrstHdrName *string `json:"prst_hdr_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrstID *uint64 `json:"prst_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RefCount *int32 `json:"ref_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerAutoScale *bool `json:"server_auto_scale,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseServicePort *bool `json:"use_service_port,omitempty"`

	// This applies only when use_service_port is set to true. If enabled, SSL mode of the connection to the server is decided by the SSL mode on the Virtualservice service port, on which the request was received. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseServiceSslMode *bool `json:"use_service_ssl_mode,omitempty"`
}
