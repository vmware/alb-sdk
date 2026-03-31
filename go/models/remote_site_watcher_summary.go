// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RemoteSiteWatcherSummary remote site watcher summary
// swagger:model RemoteSiteWatcherSummary
type RemoteSiteWatcherSummary struct {

	// Capability supported by this agent.. Enum options - MESSAGE_FEDERATED, MESSAGE_HEALTH_STATUS, MESSAGE_PING, MESSAGE_GRPC_STATUS, MESSAGE_STATE_SYNC, MESSAGE_BULK_GET, MESSAGE_DECLARATIVE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AgentType *string `json:"agent_type,omitempty"`

	// Number of objects waiting for the client to consume. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientQueueSize *uint32 `json:"client_queue_size,omitempty"`

	// Remote site watcher mode. Enum options - SERVER_MODE, CLIENT_MODE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mode *string `json:"mode,omitempty"`

	// Site operation. Enum options - OPERATION_SYNC, OPERATION_WATCH, OPERATION_BULK_GET. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Operation *string `json:"operation,omitempty"`

	// Cluster UUID of connected site. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeerUUID *string `json:"peer_uuid,omitempty"`

	// Number of objects waiting for the stream to send/receive. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StreamQueueSize *uint32 `json:"stream_queue_size,omitempty"`
}
