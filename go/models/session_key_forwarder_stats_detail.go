// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SessionKeyForwarderStatsDetail session key forwarder stats detail
// swagger:model SessionKeyForwarderStatsDetail
type SessionKeyForwarderStatsDetail struct {

	// One stats row per Session Key Forwarder endpoint (ip_port). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Stats []*SessionKeyForwarderStats `json:"stats,omitempty"`
}
