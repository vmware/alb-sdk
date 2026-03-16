// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BfdRunningConfig bfd running config
// swagger:model BfdRunningConfig
type BfdRunningConfig struct {

	// Namespace correspnding to vrf. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Namespace *string `json:"namespace,omitempty"`

	// Running Configuration of BFDd in vrf. Dump of CMD = show running-config. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RunningConfig *string `json:"running_config,omitempty"`

	// VRF of BFDd. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf *string `json:"vrf,omitempty"`
}
