// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// EventCache event cache
// swagger:model EventCache
type EventCache struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSState *bool `json:"dns_state,omitempty"`

	// Cache the exception strings in the system. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Exceptions []string `json:"exceptions,omitempty"`
}
