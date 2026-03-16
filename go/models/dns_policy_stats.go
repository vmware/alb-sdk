// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSPolicyStats Dns policy stats
// swagger:model DnsPolicyStats
type DNSPolicyStats struct {

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSPolicyStat []*DNSPolicyStat `json:"dns_policy_stat,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProcID *string `json:"proc_id"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`
}
