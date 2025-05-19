// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPReputationConfig Ip reputation config
// swagger:model IpReputationConfig
type IPReputationConfig struct {

	// Enable IPv4 Reputation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnableIPV4Reputation *bool `json:"enable_ipv4_reputation,omitempty"`

	// Enable IPv6 Reputation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnableIPV6Reputation *bool `json:"enable_ipv6_reputation,omitempty"`

	// IP reputation db file object expiry duration in days. Allowed values are 1-7. Field introduced in 20.1.1. Unit is DAYS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPReputationFileObjectExpiryDuration *uint32 `json:"ip_reputation_file_object_expiry_duration,omitempty"`

	// IP reputation db sync interval in minutes. Allowed values are 30-1440. Field introduced in 20.1.1. Unit is MIN. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- 60), Basic (Allowed values- 60) edition.
	IPReputationSyncInterval *uint32 `json:"ip_reputation_sync_interval,omitempty"`
}
