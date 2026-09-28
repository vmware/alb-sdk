// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfProfileHmonStat clf profile hmon stat
// swagger:model ClfProfileHmonStat
type ClfProfileHmonStat struct {

	// Name of the ClfProfile attached to the Virtual Service. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfProfileName *string `json:"clf_profile_name,omitempty"`

	// UUID of the ClfProfile attached to the Virtual Service. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfProfileUUID *string `json:"clf_profile_uuid,omitempty"`

	// Set when no CLF profile is attached to the Virtual Service; describes why no stats are available. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NoClfProfileReason *string `json:"no_clf_profile_reason,omitempty"`

	// Per-pool health-monitor stats. One entry per ClfPool in the profile. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pools []*ClfPoolHmon `json:"pools,omitempty"`

	// Whether logs are replicated to all pools (true) or routed by priority (false). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Replicate *bool `json:"replicate,omitempty"`

	// UUID of the Service Engine reporting these stats. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// UUID of the Virtual Service these stats belong to. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
