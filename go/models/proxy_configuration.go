// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ProxyConfiguration proxy configuration
// swagger:model ProxyConfiguration
type ProxyConfiguration struct {

	// Proxy hostname or IP address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Host *string `json:"host"`

	// Password for proxy. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Password *string `json:"password,omitempty"`

	// Proxy port. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Port *uint32 `json:"port"`

	// Username for proxy. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Username *string `json:"username,omitempty"`
}
