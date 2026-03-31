// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VipRuntimeDetail vip runtime detail
// swagger:model VipRuntimeDetail
type VipRuntimeDetail struct {

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigStatus *ConfigurationStatus `json:"config_status,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fel4stats []*VserverL4Stats `json:"fel4stats,omitempty"`

	// HTTP2 related stats. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fel7http2stats []*VserverL7Http2Stats `json:"fel7http2stats,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fel7stats []*VserverL7Stats `json:"fel7stats,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FirstSeAssignedTime *TimeStamp `json:"first_se_assigned_time,omitempty"`

	// ICAP related stats. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapStats []*VirtualServiceIcapStats `json:"icap_stats,omitempty"`

	// L4SSL related stats. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4sslstats []*VserverL4SSLStats `json:"l4sslstats,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L7VirtualServiceStatsRuntime []*L7VirtualServiceStatsRuntime `json:"l7_virtual_service_stats_runtime,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastScaleStatus *ScaleStatus `json:"last_scale_status,omitempty"`

	// Microservice representing the virtual service. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MicroserviceUUID *string `json:"microservice_uuid,omitempty"`

	// When true, it indicates vip is in process of migrate. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MigrateInProgress *bool `json:"migrate_in_progress,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MigrateScaleinPending *bool `json:"migrate_scalein_pending,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MigrateScaleoutPending *bool `json:"migrate_scaleout_pending,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeAssigned *uint32 `json:"num_se_assigned,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeRequested *uint32 `json:"num_se_requested,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	// Stats for Out-of-Band HTTP Requests sent via the DataScript. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OutOfBandStats []*VirtualServiceOutOfBandRequestStats `json:"out_of_band_stats,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProgressPercent *int32 `json:"progress_percent,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ScaleStatus *ScaleStatus `json:"scale_status,omitempty"`

	// When true, it indicates vip is in process of scalein. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ScaleinInProgress *bool `json:"scalein_in_progress,omitempty"`

	// When true, it indicates vip is in process of scaleout. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ScaleoutInProgress *bool `json:"scaleout_in_progress,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceEngine []*VipSeAssigned `json:"service_engine,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UserScaleoutPending *bool `json:"user_scaleout_pending,omitempty"`

	// This field is used to uniquely identify the vip. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipID *string `json:"vip_id,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipPlacementResolutionInfo *VipPlacementResolutionInfo `json:"vip_placement_resolution_info,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualServiceAuthStats []*VirtualServiceAuthStats `json:"virtual_service_auth_stats,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsType *string `json:"vs_type,omitempty"`
}
