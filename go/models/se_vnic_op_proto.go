// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVnicOpProto se vnic op proto
// swagger:model SeVnicOpProto
type SeVnicOpProto struct {

	// Success response received from Cloud Connector for vNIC operation. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CcVnicOpSuccess *bool `json:"cc_vnic_op_success,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cookie *string `json:"cookie,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Macs []string `json:"macs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStartTicks *uint64 `json:"oper_start_ticks,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStartTime *string `json:"oper_start_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeVMName *string `json:"se_vm_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualNetworkIds []string `json:"virtual_network_ids,omitempty"`

	//  Enum options - VNIC_OP_VCENTER, VNIC_OP_OPENSTACK. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicOpInfra *string `json:"vnic_op_infra,omitempty"`

	//  Enum options - SE_VNIC_OP_ADD, SE_VNIC_OP_DEL. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VnicOpType *string `json:"vnic_op_type"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfUuids []string `json:"vrf_uuids,omitempty"`
}
