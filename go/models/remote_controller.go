// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RemoteController remote controller
// swagger:model RemoteController
type RemoteController struct {

	// Remote controller address. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Address *string `json:"address,omitempty"`

	// Enable remote controller request. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Remote controller password. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Password *string `json:"password,omitempty"`

	// Remote controller tenant name. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Tenant *string `json:"tenant,omitempty"`

	// Remote controller username. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Username *string `json:"username,omitempty"`
}
