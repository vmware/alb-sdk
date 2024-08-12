// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DebugServiceEngineObjSync debug service engine obj sync
// swagger:model DebugServiceEngineObjSync
type DebugServiceEngineObjSync struct {

	// Drop 1 packet in every n packets. Field introduced in 31.1.1. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	PublishPacketDrops *uint32 `json:"publish_packet_drops,omitempty"`
}
