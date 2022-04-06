// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VinfraPoolServerDeleteDetails vinfra pool server delete details
// swagger:model VinfraPoolServerDeleteDetails
type VinfraPoolServerDeleteDetails struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	PoolName *string `json:"pool_name"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ServerIP []string `json:"server_ip,omitempty"`
}
