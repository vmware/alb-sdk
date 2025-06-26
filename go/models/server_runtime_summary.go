// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerRuntimeSummary server runtime summary
// swagger:model ServerRuntimeSummary
type ServerRuntimeSummary struct {

	// Flag set by the non-owner Service Engines to indicate that they need to get state for this server from Controller. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GetState *bool `json:"get_state,omitempty"`

	// Health monitor name, state and reason if down. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthMonitorList *SHMSummary `json:"health_monitor_list,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hostname *string `json:"hostname,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IPAddr *IPAddr `json:"ip_addr"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsLocal *bool `json:"is_local,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsStandby *bool `json:"is_standby,omitempty"`

	// VirtualService member in case this server is a member of GS group, and Geo Location available. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Location *GeoLocation `json:"location,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	OperStatus *OperationalStatus `json:"oper_status"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Port *int32 `json:"port"`

	// Flag used to indicate if server or GS member hostname is resolved by DNS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ResolveServerByDNS *bool `json:"resolve_server_by_dns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// VirtualService member in case this server is a member of GS group. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
