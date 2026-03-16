// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BfdSessionStatus bfd session status
// swagger:model BfdSessionStatus
type BfdSessionStatus struct {

	// Namespace correspnding to vrf. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Namespace *string `json:"namespace,omitempty"`

	// Status of all bfd sessions in vrf. Dump of bfdd status CMD. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// VRF of BFDd. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf *string `json:"vrf,omitempty"`
}
