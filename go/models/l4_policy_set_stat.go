// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L4PolicySetStat l4 policy set stat
// swagger:model L4PolicySetStat
type L4PolicySetStat struct {

	// Statistics for the L4 Policy Set. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4ConnectionPolicyStat *L4ConnectionPolicyStat `json:"l4_connection_policy_stat,omitempty"`

	// Name of the L4 Policy Set. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// ID of the L4 Policy Set. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
