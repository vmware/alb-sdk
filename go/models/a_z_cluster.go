// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AZCluster a z cluster
// swagger:model AZCluster
type AZCluster struct {

	// A list of Managed Object IDs (MOIDs) of vCenter clusters that are part of this Availability Zone. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClusterIds []string `json:"cluster_ids,omitempty"`

	// The UUID of the vCenter Server that manages the clusters associated with this AvailabilityZone. It is a reference to an object of type VCenterServer. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VcenterRef *string `json:"vcenter_ref,omitempty"`
}
