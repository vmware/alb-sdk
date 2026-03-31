// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AkoAmkoClusterMetadata ako amko cluster metadata
// swagger:model AkoAmkoClusterMetadata
type AkoAmkoClusterMetadata struct {

	// Container Network Interface (CNI) type. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cni *string `json:"cni,omitempty"`

	// Number of nodes in the Kubernetes cluster. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NodeCount *int32 `json:"node_count,omitempty"`
}
