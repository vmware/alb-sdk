// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AlertCountEntry alert count entry
// swagger:model AlertCountEntry
type AlertCountEntry struct {

	// ISO8601 timestamp of the bucket end. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	End *string `json:"end,omitempty"`

	// ISO8601 timestamp of the bucket start (bucket end minus step seconds). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Start *string `json:"start,omitempty"`

	// ISO8601 timestamp of the bucket end (same value as end). Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timestamp *string `json:"timestamp,omitempty"`

	// Number of alerts counted in this bucket. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *uint32 `json:"value,omitempty"`
}
