// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsCandidateHost vs candidate host
// swagger:model VsCandidateHost
type VsCandidateHost struct {

	//  It is a reference to an object of type VIMgrHostRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostRef *string `json:"host_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Recommended *bool `json:"recommended,omitempty"`
}
