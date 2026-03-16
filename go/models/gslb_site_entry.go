// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSiteEntry gslb site entry
// swagger:model GslbSiteEntry
type GslbSiteEntry struct {

	// Field to indicate if site is enabled. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Flag to indicate if this site is the leader site. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsLeader *bool `json:"is_leader,omitempty"`

	// Flag to indicate if this site is a third-party site. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsThirdParty *bool `json:"is_third_party,omitempty"`

	// Location. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Location *GeoLocation `json:"location,omitempty"`

	// GSLB Site name. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Flag to indicate if members of this site should not be health-monitored. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NoHm *bool `json:"no_hm,omitempty"`

	// Ratio of the members belonging to this site. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ratio *uint32 `json:"ratio,omitempty"`

	// GSLB Site cluster UUID. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
