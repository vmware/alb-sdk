// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PendingLicResInfo pending lic res info
// swagger:model PendingLicResInfo
type PendingLicResInfo struct {

	// UUID of the consumer (VS) whose license reservation is currently in flight for this SE group. Valid only while source == SE_CREATE_SOURCE_CONSUMER. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumerUUID *string `json:"consumer_uuid,omitempty"`

	// Cookie of the in-flight license reservation for this SE group. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cookie *string `json:"cookie,omitempty"`

	// CloudFlavor the license reservation was sized for, computed when it was fired. Non-vCenter clouds only. Re-checked against the current value before the deferred spawn runs. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Flavor *CloudFlavor `json:"flavor,omitempty"`

	// Memory (MB) the license reservation was sized for, computed when it was fired. Re-checked against the current value before the deferred spawn runs. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Memory *int32 `json:"memory,omitempty"`

	// skip_non_ha_hosts, preserved across the license reservation window and re-applied when the deferred spawn runs. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipNonHaHosts *bool `json:"skip_non_ha_hosts,omitempty"`

	// Source of the in-flight license reservation for this SE group  consumer-driven (VS) or SE-group-driven (buffer SE). Enum options - SE_CREATE_SOURCE_CONSUMER, SE_CREATE_SOURCE_SERVICEENGINEGROUP. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Source *string `json:"source,omitempty"`

	// Caller-requested host to force this SE onto, preserved across the license reservation window and re-applied when the deferred spawn runs. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SpawnOnHostUUID *string `json:"spawn_on_host_uuid,omitempty"`

	// Tick at which the in-flight license reservation for this SE group was fired. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ticks *uint64 `json:"ticks,omitempty"`

	// vCPU count the license reservation was sized for, computed when it was fired. Re-checked against the current value before the deferred spawn runs, since the SE group's sizing may have changed while the reservation was in flight. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vcpus *int32 `json:"vcpus,omitempty"`
}
