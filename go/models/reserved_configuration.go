// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReservedConfiguration reserved configuration
// swagger:model ReservedConfiguration
type ReservedConfiguration struct {

	// List of configurations for internal purposes. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	KeyValueConfigurations []*KeyValueConfiguration `json:"key_value_configurations,omitempty"`
}
