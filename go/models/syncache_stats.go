// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SyncacheStats syncache stats
// swagger:model SyncacheStats
type SyncacheStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BucketOverflow *uint64 `json:"bucket_overflow"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	CacheOverflow *uint64 `json:"cache_overflow"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DuplicateSynPacket *uint64 `json:"duplicate_syn_packet"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EntryAddedToSyncache *uint64 `json:"entry_added_to_syncache"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EntryCompleted *uint64 `json:"entry_completed"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EntryDroppedReplyFailed *uint64 `json:"entry_dropped_reply_failed"`

	// Number of connections prematurely ended in syncache state. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntryEnded *uint64 `json:"entry_ended,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EntryRemovedByBadack *uint64 `json:"entry_removed_by_badack"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EntryRemovedByReset *uint64 `json:"entry_removed_by_reset"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EntryRetransmitted *uint64 `json:"entry_retransmitted"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EntryStaled *uint64 `json:"entry_staled"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IcmpUnreachableReceived *uint64 `json:"icmp_unreachable_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SynCookieReceived *uint64 `json:"syn_cookie_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SynCookieSent *uint64 `json:"syn_cookie_sent"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SynOnlyPacketsReceived *uint64 `json:"syn_only_packets_received,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ZoneFailures *uint64 `json:"zone_failures"`
}
