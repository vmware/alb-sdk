// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterNonDrsClusterDetails vcenter non drs cluster details
// swagger:model VcenterNonDrsClusterDetails
type VcenterNonDrsClusterDetails struct {

	// Cloud id. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CcID *string `json:"cc_id,omitempty"`

	// A list of cluster IDs having DRS disabled. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NonDrsClusterIds []string `json:"non_drs_cluster_ids,omitempty"`

	// The UUID of the Service Engine whose placement triggered this event. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SeVMUUID *string `json:"se_vm_uuid,omitempty"`
}
