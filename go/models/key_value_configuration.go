// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// KeyValueConfiguration key value configuration
// swagger:model KeyValueConfiguration
type KeyValueConfiguration struct {

	// Reserved key *string to be used for internal configuration. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Key *string `json:"key"`

	// Value corresponding to the key. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Value *uint32 `json:"value"`
}
