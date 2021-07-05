// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SecureChannelAvailableLocalIps secure channel available local ips
// swagger:model SecureChannelAvailableLocalIPs
type SecureChannelAvailableLocalIps struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Number of end.
	End *int32 `json:"end,omitempty"`

	//  Field deprecated in 21.1.1.
	FreeControllerIps []string `json:"free_controller_ips,omitempty"`

	// Number of free_ips.
	FreeIps []int64 `json:"free_ips,omitempty,omitempty"`

	// Name of the object.
	// Required: true
	Name *string `json:"name"`

	// Number of start.
	Start *int32 `json:"start,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Unique object identifier of the object.
	UUID *string `json:"uuid,omitempty"`
}
