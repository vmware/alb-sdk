// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerID server Id
// swagger:model ServerId
type ServerID struct {

	// This is the external cloud uuid of the Pool server. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExternalUUID *string `json:"external_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP *IPAddr `json:"ip"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Port *uint32 `json:"port"`
}
