// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LeaderChangeInfo leader change info
// swagger:model LeaderChangeInfo
type LeaderChangeInfo struct {

	// Leader change mechanism can be disabled in the federation for administration purposes. This would effectively disable Gslb disaster recovery possibilities. The best practice is to change the mode (Auto to manual or vice-versa) rather than disabling the leader change mechanism. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Sites that can be the future Gslb Leader in federation. These sites should be enabled active follower sites.A site that is deactivated or passive or a third-party site cannot be a leader candidate. Field introduced in 31.2.1. Maximum of 1 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LeaderCandidates []*SiteInfo `json:"leader_candidates,omitempty"`

	// Leader change mode, can be auto or manual. Enum options - GSLB_LC_MODE_MANUAL, GSLB_LC_MODE_AUTO. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LeaderChangeMode *string `json:"leader_change_mode,omitempty"`

	// Maximum number of probe failures before considering other site as down for auto leader change. Allowed values are 1-3600. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxUnsuccessfulProbes *uint32 `json:"max_unsuccessful_probes,omitempty"`
}
