// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AkoAmkoClusterInventory ako amko cluster inventory
// swagger:model AkoAmkoClusterInventory
type AkoAmkoClusterInventory struct {

	// AKO/AMKO operator version (e.g., '1.12.0'). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AkoAmkoVersion *string `json:"ako_amko_version,omitempty"`

	// Cloud reference UUID in Avi Controller. It is a reference to an object of type Cloud. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudRef *string `json:"cloud_ref,omitempty"`

	// Name of the AKO/AMKO cluster. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterName *string `json:"cluster_name,omitempty"`

	// Type of the AKO/AMKO cluster. Enum options - CLUSTER_TYPE_AKO, CLUSTER_TYPE_AMKO. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterType *string `json:"cluster_type,omitempty"`

	// Health status of the AKO/AMKO cluster. Enum options - HEALTH_STATUS_UP, HEALTH_STATUS_DOWN, HEALTH_STATUS_UNKNOWN. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthStatus *string `json:"health_status,omitempty"`

	// Kubernetes cluster version (e.g., '1.28.3'). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KubernetesVersion *string `json:"kubernetes_version,omitempty"`

	// Last seen timestamp of the AKO/AMKO cluster. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastSeen *string `json:"last_seen,omitempty"`

	// Tenant reference UUID in Avi Controller. It is a reference to an object of type Tenant. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Number of virtual services in the AKO/AMKO cluster. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualServiceCount *int32 `json:"virtual_service_count,omitempty"`
}
