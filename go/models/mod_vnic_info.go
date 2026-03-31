// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ModVnicInfo mod vnic info
// swagger:model ModVnicInfo
type ModVnicInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MacAddr []string `json:"mac_addr,omitempty"`

	//  It is a reference to an object of type Network. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkRef []string `json:"network_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Recoverable *bool `json:"recoverable,omitempty"`

	//  Enum options - SEVM_SUCCESS, SEVM_CREATE_FAIL_NO_HW_INFO, SEVM_CREATE_FAIL_DUPLICATE_NAME, SEVM_CREATE_FAIL_NO_MGMT_NW, SEVM_CREATE_FAIL_NO_CPU, SEVM_CREATE_FAIL_NO_MEM, SEVM_CREATE_FAIL_NO_LEASE, SEVM_CREATE_FAIL_OVF_ERROR, SEVM_CREATE_NO_HOST_VM_NETWORK, SEVM_CREATE_FAIL_NO_PROGRESS, SEVM_CREATE_FAIL_ABORTED, SEVM_CREATE_FAILURE, SEVM_CREATE_FAIL_POWER_ON, SEVM_VNIC_NO_VM, SEVM_VNIC_MAC_ADDR_ERROR, SEVM_VNIC_FAILURE, SEVM_VNIC_NO_PG_PORTS, SEVM_DELETE_FAILURE, SEVM_CREATE_LIMIT_REACHED, SEVM_SET_MGMT_IP_FAILED, SEVM_CREATE_ACCESS_ERROR, SEVM_CREATE_NO_IMAGE, SEVM_VINFRA_UNINITIALIZED, SEVM_CREATE_NO_HOST, SEVM_CREATE_FAIL_NO_MGMT_NW_PORTS, SEVM_INVALID_DATA, SEVM_VCENTER_CONN_FAIL, SEVM_TIMED_OUT, SEVM_NO_SOURCE_CLONE, SEVM_NO_AVAILABILITY_ZONE, SEVM_FLAVOR_UNAVAIL, SEVM_DELETED, SEVM_VINFRA_FAILURE, SEVM_VNIC_FAILURE_QUESTION, SEVM_VNIC_NO_IPS_AVAILABLE, SEVM_NO_MGMT_IP_AVAILABLE, AUTHENTICATION_FAILURE. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimedOut *bool `json:"timed_out,omitempty"`
}
