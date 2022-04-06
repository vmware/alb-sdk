// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VcenterClusters vcenter clusters
// swagger:model VcenterClusters
type VcenterClusters struct {

	//  It is a reference to an object of type VIMgrClusterRuntime. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ClusterRefs []string `json:"cluster_refs,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Include *bool `json:"include,omitempty"`
}
