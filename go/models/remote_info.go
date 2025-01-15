// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RemoteInfo remote info
// swagger:model RemoteInfo
type RemoteInfo struct {

	// Gslb object related information in the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GslbInfo *GslbObjInfo `json:"gslb_info,omitempty"`

	// Operational information of the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OpsInfo *OpsInfo `json:"ops_info,omitempty"`

	// Configuration sync-info of the site . Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SyncInfo *GslbSiteCfgSyncInfo `json:"sync_info,omitempty"`

	// Site replication specific statistic. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SyncStats *GslbReplicationStats `json:"sync_stats,omitempty"`
}
