// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSiteCfgSyncInfo gslb site cfg sync info
// swagger:model GslbSiteCfgSyncInfo
type GslbSiteCfgSyncInfo struct {

	// Objects that could NOT be synced to the site . Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErroredObjects []*VersionInfo `json:"errored_objects,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	// Last object having replication issue. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LastFailObj *ConfigVersionStatus `json:"last_fail_obj,omitempty"`

	// Previous targer version for a site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PrevTargetVersion *int64 `json:"prev_target_version,omitempty"`

	// Reason for the replication issues. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Recommended way to resolve replication issue. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Recommendation *string `json:"recommendation,omitempty"`

	// Version of the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SiteVersion *int64 `json:"site_version,omitempty"`

	// Configuration sync-state of the site . Enum options - GSLB_SITE_CFG_IN_SYNC, GSLB_SITE_CFG_OUT_OF_SYNC, GSLB_SITE_CFG_SYNC_DISABLED, GSLB_SITE_CFG_SYNC_IN_PROGRESS, GSLB_SITE_CFG_SYNC_NOT_APPLICABLE, GSLB_SITE_CFG_SYNCED_TILL_CHECKPOINT, GSLB_SITE_CFG_SYNC_SUSPENDED, GSLB_SITE_CFG_SYNC_STALLED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SyncState *string `json:"sync_state,omitempty"`

	// Target version of the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TargetVersion *int64 `json:"target_version,omitempty"`
}
