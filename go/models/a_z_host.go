// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AZHost a z host
// swagger:model AZHost
type AZHost struct {

	// A list of Managed Object IDs (MOIDs) of vCenter hosts that are part of this Availability Zone. Field introduced in 31.2.1. Minimum of 1 items required. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HostIds []string `json:"host_ids,omitempty"`

	// The UUID of the vCenter Server that manages the hosts associated with this AvailabilityZone. It is a reference to an object of type VCenterServer. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VcenterRef *string `json:"vcenter_ref,omitempty"`
}
