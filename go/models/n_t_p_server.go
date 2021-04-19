// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NTPServer n t p server
// swagger:model NTPServer
type NTPServer struct {

	// Key number from the list of trusted keys used to authenticate this server. Allowed values are 1-65534.
	KeyNumber *int32 `json:"key_number,omitempty"`

	// IP Address of the NTP Server.
	// Required: true
	Server *IPAddr `json:"server"`
}
