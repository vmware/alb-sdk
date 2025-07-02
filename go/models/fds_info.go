// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FdsInfo fds info
// swagger:model FdsInfo
type FdsInfo struct {

	// Captures the federated objects the site supports as per the controller version . Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Objects []string `json:"objects,omitempty"`

	// Capture fds timeline the client is using. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Timeline *string `json:"timeline,omitempty"`
}
