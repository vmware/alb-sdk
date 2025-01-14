// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterClusters vcenter clusters
// swagger:model VcenterClusters
type VcenterClusters struct {

	//  It is a reference to an object of type VIMgrClusterRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterRefs []string `json:"cluster_refs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Include *bool `json:"include,omitempty"`
}
