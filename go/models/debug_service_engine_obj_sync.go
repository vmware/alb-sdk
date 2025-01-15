// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DebugServiceEngineObjSync debug service engine obj sync
// swagger:model DebugServiceEngineObjSync
type DebugServiceEngineObjSync struct {

	// Objsync Logging Verbosity. Enum options - LOG_LVL_ERROR, LOG_LVL_WARNING, LOG_LVL_INFO, LOG_LVL_DEBUG. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LogLevel *string `json:"log_level,omitempty"`

	// Drop 1 packet in every n packets. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PublishPacketDrops *uint32 `json:"publish_packet_drops,omitempty"`
}
