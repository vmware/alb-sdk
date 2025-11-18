// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PreChecksParams pre checks params
// swagger:model PreChecksParams
type PreChecksParams struct {

	// Base timeout value for all upgrade pre-checks operations. The timeout value for applicable checks is a multiple of checks_base_timeout. For example, config export timeout = [multiplier] * checks_base_timeout. (The multiplier varies by operation.). Field introduced in 32.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ChecksBaseTimeout *uint32 `json:"checks_base_timeout,omitempty"`

	// Maximum number of alerts allowed for configuration export. Allowed values are 200-500. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxAlerts *uint32 `json:"max_alerts,omitempty"`
}
