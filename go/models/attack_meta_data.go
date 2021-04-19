// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AttackMetaData attack meta data
// swagger:model AttackMetaData
type AttackMetaData struct {

	// DNS amplification attack record. Field introduced in 21.1.1.
	Amplification *AttackDNSAmplification `json:"amplification,omitempty"`

	// ip of AttackMetaData.
	IP *string `json:"ip,omitempty"`

	// Number of max_resp_time.
	MaxRespTime *int32 `json:"max_resp_time,omitempty"`

	// url of AttackMetaData.
	URL *string `json:"url,omitempty"`
}
