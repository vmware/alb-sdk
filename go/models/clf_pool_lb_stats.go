// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfPoolLbStats clf pool lb stats
// swagger:model ClfPoolLbStats
type ClfPoolLbStats struct {

	// Composite UUID of this ClfPool ('<clfprofile_uuid>-<SHA256(pool_name)>'). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfPoolUUID *string `json:"clf_pool_uuid,omitempty"`

	// Number of servers (collectors) configured in this pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServers *int64 `json:"num_servers,omitempty"`

	// Number of enabled servers (collectors) in this pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServersEnabled *int64 `json:"num_servers_enabled,omitempty"`

	// Number of servers (collectors) currently UP in this pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumServersUp *int64 `json:"num_servers_up,omitempty"`

	// Name of this ClfPool as configured in ClfPool.name. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`

	// Connection-level stats for this pool's backing se_pool_t. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolStats *PoolStats `json:"pool_stats,omitempty"`
}
