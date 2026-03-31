// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BgpRunningConfig bgp running config
// swagger:model BgpRunningConfig
type BgpRunningConfig struct {

	// Namespace correspnding to vrf. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Namespace *string `json:"namespace,omitempty"`

	// Running Configuration of BGPd in vrf. Dump of CMD = show running-config. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RunningConfig *string `json:"running_config,omitempty"`

	// VRF of BGPd. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf *string `json:"vrf,omitempty"`
}
