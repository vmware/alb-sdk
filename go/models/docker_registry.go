// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DockerRegistry docker registry
// swagger:model DockerRegistry
type DockerRegistry struct {

	// Openshift integrated registry config. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	OshiftRegistry *OshiftDockerRegistryMetaData `json:"oshift_registry,omitempty"`

	// Password for docker registry. Authorized 'regular user' password if registry is Openshift integrated registry. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Password *string `json:"password,omitempty"`

	// Set if docker registry is private. Avi controller will not attempt to push SE image to the registry, unless se_repository_push is set. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Private *bool `json:"private,omitempty"`

	// Avi ServiceEngine repository name. For private registry, it's registry port/repository, for public registry, it's registry/repository, for openshift registry, it's registry port/namespace/repo. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Registry *string `json:"registry,omitempty"`

	// Avi Controller will push ServiceEngine image to docker repository. Field deprecated in 18.2.6. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeRepositoryPush *bool `json:"se_repository_push,omitempty"`

	// Username for docker registry. Authorized 'regular user' if registry is Openshift integrated registry. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Username *string `json:"username,omitempty"`
}
