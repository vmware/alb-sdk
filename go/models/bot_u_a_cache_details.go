// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotUACacheDetails bot u a cache details
// swagger:model BotUACacheDetails
type BotUACacheDetails struct {

	// The first time this User-Agent *string was seen in a request. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FirstSeen *TimeStamp `json:"first_seen"`

	// The last time this User-Agent *string was seen in a request. If not provided, the same value as first_seen is implied. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastSeen *TimeStamp `json:"last_seen,omitempty"`

	// If the recipient's information about this user agent is older than this, it must send the query further upstream, otherwise it can respond from its own cache. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxAge *TimeStamp `json:"max_age,omitempty"`

	// How often this User-Agent *string was seen since the last report. Allowed values are 1-1000000000. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TimesSeen *uint64 `json:"times_seen,omitempty"`

	// The User-Agent value to look up. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UserAgent *string `json:"user_agent"`
}
