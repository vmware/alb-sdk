// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ManagementServicePort management service port
// swagger:model ManagementServicePort
type ManagementServicePort struct {

	// Management Service Port name. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Management Service Port value. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Port *int32 `json:"port"`

	// Management Service Port TLS Configuration. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLS *ManagementServiceTLSConfiguration `json:"tls,omitempty"`

	// Management Service Port transport protocol. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TransportProtocol *string `json:"transport_protocol,omitempty"`
}
