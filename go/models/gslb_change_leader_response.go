// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbChangeLeaderResponse gslb change leader response
// swagger:model GslbChangeLeaderResponse
type GslbChangeLeaderResponse struct {

	// Sites eligible to be leader candidates. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EligibleLeaderCandidates []*SiteInfo `json:"eligible_leader_candidates,omitempty"`

	// Leader change runtime information. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LeaderChangeRuntime []*GslbLeaderChangeRuntime `json:"leader_change_runtime,omitempty"`
}
