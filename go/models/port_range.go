// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PortRange port range
// swagger:model PortRange
type PortRange struct {

	// TCP/UDP port range end (inclusive). Allowed values are 1-65535. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	End *int32 `json:"end"`

	// TCP/UDP port range start (inclusive). Allowed values are 1-65535. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Start *int32 `json:"start"`
}
