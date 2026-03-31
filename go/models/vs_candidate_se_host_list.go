// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsCandidateSeHostList vs candidate se host list
// swagger:model VsCandidateSeHostList
type VsCandidateSeHostList struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CanSpawnNewSe *bool `json:"can_spawn_new_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Host []*VsCandidateHost `json:"host,omitempty"`

	// List of scaleout candidate Service Engines. The first element is the recommended Service Engine. It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRefs []string `json:"se_refs,omitempty"`
}
