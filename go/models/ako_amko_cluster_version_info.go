// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AkoAmkoClusterVersionInfo ako amko cluster version info
// swagger:model AkoAmkoClusterVersionInfo
type AkoAmkoClusterVersionInfo struct {

	// AKO/AMKO operator version (e.g., '1.12.0'). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AkoAmkoVersion *string `json:"ako_amko_version,omitempty"`

	// Kubernetes cluster version (e.g., '1.28.3'). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KubernetesVersion *string `json:"kubernetes_version,omitempty"`
}
