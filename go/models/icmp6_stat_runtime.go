// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Icmp6StatRuntime icmp6 stat runtime
// swagger:model Icmp6StatRuntime
type Icmp6StatRuntime struct {

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Icp6sInhist *Icmp6Hist `json:"icp6s_inhist,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Icp6sOuthist *Icmp6Hist `json:"icp6s_outhist,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MoreStats *Icmp6Stat `json:"more_stats,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
