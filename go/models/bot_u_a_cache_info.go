// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotUACacheInfo bot u a cache info
// swagger:model BotUACacheInfo
type BotUACacheInfo struct {

	// The normalized (extensions numerically sorted) TLS fingerprints that can be expected for this User-Agent in legitimate requests. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpectedNormalizedTLSFps []*TLSFingerprint `json:"expected_normalized_tls_fps,omitempty"`

	// The TLS fingerprints that can be expected for this User-Agent in legitimate requests. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpectedTLSFps []*TLSFingerprint `json:"expected_tls_fps,omitempty"`

	// This User-Agent *string itself contains an attack or tries to inject spam. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsAbusive *bool `json:"is_abusive"`

	// This User-Agent *string looks odd, it's unlikely to be used by a legitimate client. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsWeird *bool `json:"is_weird"`

	// The operating system this User-Agent is running on. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	OperatingSystemName *string `json:"operating_system_name"`

	// How often this User-Agent was seen during the last day. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeenLastDay *uint64 `json:"seen_last_day"`

	// How often this User-Agent was seen during the last month. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeenLastMonth *uint64 `json:"seen_last_month"`

	// How often this User-Agent was seen during the last week. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeenLastWeek *uint64 `json:"seen_last_week"`

	// How often this User-Agent was seen during the last year. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeenLastYear *uint64 `json:"seen_last_year"`

	// Simple description of this User-Agent. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SimpleSoftwareString *string `json:"simple_software_string,omitempty"`

	// The software sub-type of this User-Agent. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SoftwareSubtype *string `json:"software_subtype"`

	// The software type of this User-Agent. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SoftwareType *string `json:"software_type"`

	// Contains the User-Agent information from the higher layer's point of view. first_seen, last_seen and times_seen of a BotUACacheResult combine the information of the caller and the callee. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UaCacheDetails *BotUACacheDetails `json:"ua_cache_details"`
}
