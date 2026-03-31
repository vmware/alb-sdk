// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AkoAmkoCluster ako amko cluster
// swagger:model AkoAmkoCluster
type AkoAmkoCluster struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Cloud reference UUID in Avi Controller. It is a reference to an object of type Cloud. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudRef *string `json:"cloud_ref,omitempty"`

	// Type of operator - AKO or AMKO. Enum options - CLUSTER_TYPE_AKO, CLUSTER_TYPE_AMKO. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterType *string `json:"cluster_type,omitempty"`

	// AKO/AMKO user identifier. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CreatedBy *string `json:"created_by"`

	// Deployment configuration information. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DeploymentInfo *AkoAmkoClusterDeploymentInfo `json:"deployment_info,omitempty"`

	// Additional cluster metadata. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Metadata *AkoAmkoClusterMetadata `json:"metadata,omitempty"`

	// Name of the AKO/AMKO cluster. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the AKO/AMKO cluster. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Version information including Kubernetes and AKO/AMKO versions. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VersionInfo *AkoAmkoClusterVersionInfo `json:"version_info,omitempty"`
}
