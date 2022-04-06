// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPReputationConfig Ip reputation config
// swagger:model IpReputationConfig
type IPReputationConfig struct {

	// IP reputation db file object expiry duration in days. Allowed values are 1-7. Field introduced in 20.1.1. Unit is DAYS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IPReputationFileObjectExpiryDuration *int32 `json:"ip_reputation_file_object_expiry_duration,omitempty"`

	// IP reputation db sync interval in minutes. Allowed values are 2-1440. Field introduced in 20.1.1. Unit is MIN. Allowed in Enterprise with any value edition, Essentials(Allowed values- 60) edition, Basic(Allowed values- 60) edition, Enterprise with Cloud Services edition.
	IPReputationSyncInterval *int32 `json:"ip_reputation_sync_interval,omitempty"`
}
