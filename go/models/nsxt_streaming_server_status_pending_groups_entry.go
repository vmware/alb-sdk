// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtStreamingServerStatusPendingGroupsEntry nsxt streaming server status pending groups entry
// swagger:model NsxtStreamingServerStatus.PendingGroupsEntry
type NsxtStreamingServerStatusPendingGroupsEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *NsxtGroupSyncEntry `json:"value,omitempty"`
}
