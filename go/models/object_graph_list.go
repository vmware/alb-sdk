// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ObjectGraphList object graph list
// swagger:model ObjectGraphList
type ObjectGraphList struct {

	// Number of entries in results. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint32 `json:"count"`

	// Objects returned by the referred_by/refers_to graph traversal. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*ObjectGraphEntry `json:"results,omitempty"`
}
