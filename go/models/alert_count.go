// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AlertCount alert count
// swagger:model AlertCount
type AlertCount struct {

	// Number of time buckets returned. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Count *uint32 `json:"count,omitempty"`

	// One entry per time bucket, ordered per the sort query param. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Result []*AlertCountEntry `json:"result,omitempty"`
}
