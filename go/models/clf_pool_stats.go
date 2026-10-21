// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfPoolStats clf pool stats
// swagger:model ClfPoolStats
type ClfPoolStats struct {

	// Log record bytes queued for delivery to this pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BytesEnqueued *uint64 `json:"bytes_enqueued,omitempty"`

	// Composite UUID of this ClfPool ('<clfprofile_uuid>-<SHA256(pool_name)>'). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfPoolUUID *string `json:"clf_pool_uuid,omitempty"`

	// Records for which this pool had no UP server, independent of whether another pool for the same record succeeded. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsNoServer *uint64 `json:"drops_no_server,omitempty"`

	// Records dropped because the delivery queue was full. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsRingFull *uint64 `json:"drops_ring_full,omitempty"`

	// Records dropped because the shared-memory allocation for the request failed. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsShmAllocFail *uint64 `json:"drops_shm_alloc_fail,omitempty"`

	// Records dropped because in-flight shared memory for CLF was exhausted. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DropsShmLimit *uint64 `json:"drops_shm_limit,omitempty"`

	// Name of this ClfPool as configured in ClfPool.name. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`

	// Log records queued for delivery to this pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RecordsEnqueued *uint64 `json:"records_enqueued,omitempty"`
}
