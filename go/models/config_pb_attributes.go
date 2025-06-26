// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConfigPbAttributes config pb attributes
// swagger:model ConfigPbAttributes
type ConfigPbAttributes struct {

	// Version sequence number that monotonically advances with each configuration update event. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *uint32 `json:"version,omitempty"`
}
