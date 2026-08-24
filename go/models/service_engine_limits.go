// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngineLimits service engine limits
// swagger:model ServiceEngineLimits
type ServiceEngineLimits struct {

	// Maximum number of logical interfaces (vlan, bond) per serviceengine. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLogicalIntfPerSe *int32 `json:"num_logical_intf_per_se,omitempty"`

	// Maximum number of physical interfaces per serviceengine. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPhyIntfPerSe *int32 `json:"num_phy_intf_per_se,omitempty"`

	// Maximum number of virtualservices with realtime metrics enabled. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVirtualservicesRtMetrics *int32 `json:"num_virtualservices_rt_metrics,omitempty"`

	// Maximum number of vlan interfaces per physical interface. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVlanIntfPerPhyIntf *int32 `json:"num_vlan_intf_per_phy_intf,omitempty"`

	// Maximum number of vlan interfaces per serviceengine. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVlanIntfPerSe *int32 `json:"num_vlan_intf_per_se,omitempty"`

	// Serviceengine system limits specific to cloud type. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceengineCloudLimits []*ServiceEngineCloudLimits `json:"serviceengine_cloud_limits,omitempty"`

	// Per-tier WAAP SE sizing limits (SMALL, MEDIUM, LARGE). Defines the min_vcpus, min_memory, and max_vs_per_se for each tier. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceengineWaapLimits []*ServiceEngineSizingWaapLimits `json:"serviceengine_waap_limits,omitempty"`
}
