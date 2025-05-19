// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MarathonSeDeployment marathon se deployment
// swagger:model MarathonSeDeployment
type MarathonSeDeployment struct {

	// Docker image to be used for Avi SE installation e.g. fedora, ubuntu. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DockerImage *string `json:"docker_image,omitempty"`

	// Host OS distribution e.g. COREOS, UBUNTU, REDHAT. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostOs *string `json:"host_os,omitempty"`

	// Accepted resource roles for SEs. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourceRoles []string `json:"resource_roles,omitempty"`

	// URIs to be resolved for starting the application. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Uris []string `json:"uris,omitempty"`
}
