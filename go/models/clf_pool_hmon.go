// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfPoolHmon clf pool hmon
// swagger:model ClfPoolHmon
type ClfPoolHmon struct {

	// Health-monitor runtime stats for all servers in this CLF pool. Populated when an active se_pool_t backs this CLF pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hmon []*HealthMonitorStatRuntime `json:"hmon,omitempty"`

	// Wire format configured for log records delivered to this pool. Enum options - CLF_LOG_FORMAT_SYSLOG_LEGACY, CLF_LOG_FORMAT_SYSLOG_OCTET, CLF_LOG_FORMAT_CUSTOM. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogFormat *string `json:"log_format,omitempty"`

	// Zero-based index of this pool within the ClfProfile.clf_pools list. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolIndex *uint32 `json:"pool_index,omitempty"`

	// Name of this CLF pool as configured in ClfPool.name. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolName *string `json:"pool_name,omitempty"`

	// Priority of this CLF pool (higher value = higher precedence). Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Priority *uint32 `json:"priority,omitempty"`

	// Transport protocol for log delivery to this pool. Enum options - CLF_TRANSPORT_TCP, CLF_TRANSPORT_UDP, CLF_TRANSPORT_TCP_TLS. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Transport *string `json:"transport,omitempty"`
}
