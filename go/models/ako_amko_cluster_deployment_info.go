// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AkoAmkoClusterDeploymentInfo ako amko cluster deployment info
// swagger:model AkoAmkoClusterDeploymentInfo
type AkoAmkoClusterDeploymentInfo struct {

	// Kubernetes namespace where AKO/AMKO is deployed. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Namespace *string `json:"namespace,omitempty"`

	// Pod name for identification. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PodName *string `json:"pod_name,omitempty"`

	// Number of replicas in the deployment. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplicaCount *int32 `json:"replica_count,omitempty"`
}
