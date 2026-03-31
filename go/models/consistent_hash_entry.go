// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConsistentHashEntry consistent hash entry
// swagger:model ConsistentHashEntry
type ConsistentHashEntry struct {

	// Consistent hash wheel is maintained per domain. Domain represents the key to access consistent hash and associated details. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	// Counts the number of times consistent hash lookup was executed. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LookupCount *uint64 `json:"lookup_count,omitempty"`

	// Count the number of times consistent hash lookup return other nodes. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LookupOffCount *uint64 `json:"lookup_off_count,omitempty"`

	// Counts the number of times consistent hash lookup returned current node. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LookupOnCount *uint64 `json:"lookup_on_count,omitempty"`

	// Represents the resources in the consistent hash wheel. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resources []string `json:"resources,omitempty"`

	// Count of number of times the consistent wheel was updated. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpdateCount *uint64 `json:"update_count,omitempty"`
}
