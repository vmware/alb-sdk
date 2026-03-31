// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeResourceVnic se resource vnic
// swagger:model SeResourceVnic
type SeResourceVnic struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Connected *bool `json:"connected,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DelRetries *int32 `json:"del_retries,omitempty"`

	// Flag indicating that the datapath has cleaned up state associated with this interface. Field introduced in 18.2.7, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpDeletionDone *bool `json:"dp_deletion_done,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InUse *bool `json:"in_use,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsAviInternalNetwork *bool `json:"is_avi_internal_network"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastVnicOpTicks *int64 `json:"last_vnic_op_ticks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Lif *string `json:"lif,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LinuxName *string `json:"linux_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MacAddr *string `json:"mac_addr"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MarkedForDel *bool `json:"marked_for_del,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PortUUID *string `json:"port_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Subnet *IPAddrPrefix `json:"subnet,omitempty"`

	// Tepless IP for TEP-less VPC. Used as source IP for all SE-originated traffic in this VRF. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TeplessIP *IPAddr `json:"tepless_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vips []string `json:"vips,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualNetworkID *string `json:"virtual_network_id,omitempty"`

	//  Enum options - RM_VNIC_FRONTEND, RM_VNIC_BACKEND. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicType *string `json:"vnic_type,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfUUID *string `json:"vrf_uuid,omitempty"`
}
