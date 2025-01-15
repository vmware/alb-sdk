// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TrustedHost trusted host
// swagger:model TrustedHost
type TrustedHost struct {

	// Any valid IPv4, IPv6, or domain address. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Host *IPAddr `json:"host"`

	// Optionally specify the port number. Allowed values are 1-65535. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Port *int32 `json:"port,omitempty"`
}
