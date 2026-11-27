// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfProfileStats clf profile stats
// swagger:model ClfProfileStats
type ClfProfileStats struct {

	// Log record bytes queued for delivery, summed across all pools. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesEnqueued *uint64 `json:"bytes_enqueued,omitempty"`

	// Name of the ClfProfile these stats belong to. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfProfileName *string `json:"clf_profile_name,omitempty"`

	// UUID of the ClfProfile these stats belong to. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfProfileUUID *string `json:"clf_profile_uuid,omitempty"`

	// Records dropped because the datascript log forwarding call had only empty or non-string arguments. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsEmptyPayload *uint64 `json:"drops_empty_payload,omitempty"`

	// Sum across all pools of drops_no_server (see ClfPoolStats) -- a record routed to multiple pools can contribute more than once here. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsNoServer *uint64 `json:"drops_no_server,omitempty"`

	// Records dropped because the payload exceeded the maximum supported log size. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsPayloadTooBig *uint64 `json:"drops_payload_too_big,omitempty"`

	// Records dropped because the profile was disabled or had no pools. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsProfileDisabled *uint64 `json:"drops_profile_disabled,omitempty"`

	// Records dropped because the delivery queue was full, summed across all pools. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsRingFull *uint64 `json:"drops_ring_full,omitempty"`

	// Records dropped because the shared-memory allocation for the request failed, summed across all pools. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsShmAllocFail *uint64 `json:"drops_shm_alloc_fail,omitempty"`

	// Records dropped because in-flight shared memory for CLF was exhausted, summed across all pools. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsShmLimit *uint64 `json:"drops_shm_limit,omitempty"`

	// Log forwarding requests from the datascript that reached this profile. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogForwardCalls *uint64 `json:"log_forward_calls,omitempty"`

	// Per-ClfPool breakdown of the enqueue-side dataplane counters. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pools []*ClfPoolStats `json:"pools,omitempty"`

	// Dataplane process/core that reported this row. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// Log records queued for delivery, summed across all pools. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RecordsEnqueued *uint64 `json:"records_enqueued,omitempty"`

	// UUID of the Service Engine reporting these stats. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// UUID of the Virtual Service these stats belong to. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
