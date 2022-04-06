// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// EventCache event cache
// swagger:model EventCache
type EventCache struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DNSState *bool `json:"dns_state,omitempty"`

	// Cache the exception strings in the system. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Exceptions []string `json:"exceptions,omitempty"`
}
