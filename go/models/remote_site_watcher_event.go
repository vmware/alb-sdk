// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RemoteSiteWatcherEvent remote site watcher event
// swagger:model RemoteSiteWatcherEvent
type RemoteSiteWatcherEvent struct {

	// Remote Site Watcher Agent ID. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AgentID *uint32 `json:"agent_id,omitempty"`

	// Remote Site Watcher Event. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Event *string `json:"event,omitempty"`

	// UUID of peer site. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeerUUID *string `json:"peer_uuid,omitempty"`
}
