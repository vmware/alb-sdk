// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsphereStoragePolicy vsphere storage policy
// swagger:model VsphereStoragePolicy
type VsphereStoragePolicy struct {

	// VCenter server configuration , applicable only for Nsxt-Cloud. It is a reference to an object of type VCenterServer. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VcenterRef *string `json:"vcenter_ref,omitempty"`

	// vSphere VM Storage Policy UUID to be associated to the Service Engine. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VsphereStoragePolicyID *string `json:"vsphere_storage_policy_id,omitempty"`
}
