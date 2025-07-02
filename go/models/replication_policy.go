// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReplicationPolicy replication policy
// swagger:model ReplicationPolicy
type ReplicationPolicy struct {

	// Leader's checkpoint. Follower attempt to replicate configuration till this checkpoint. Field deprecated in 31.2.1. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CheckpointUUID *string `json:"checkpoint_uuid,omitempty"`

	// Replication mode. Enum options - REPLICATION_MODE_CONTINUOUS, REPLICATION_MODE_MANUAL, REPLICATION_MODE_ADAPTIVE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplicationMode *string `json:"replication_mode,omitempty"`
}
