// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AdaptReplSiteReplication adapt repl site replication
// swagger:model AdaptReplSiteReplication
type AdaptReplSiteReplication struct {

	// replication status of the sites. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplStatus *string `json:"repl_status,omitempty"`

	// site name. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteName *string `json:"site_name,omitempty"`

	// site type  leader/follwer. Enum options - GSLB_LEADER, GSLB_MEMBER, GSLB_NOT_A_MEMBER. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteType *string `json:"site_type,omitempty"`

	// FDS version till sites are safe to replicate. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TargetVersion *int64 `json:"target_version,omitempty"`

	// FDS version at which site is at. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *int64 `json:"version,omitempty"`
}
