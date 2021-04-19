// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPThreatDBEventData IP threat d b event data
// swagger:model IPThreatDBEventData
type IPThreatDBEventData struct {

	// Reason for IPThreatDb transaction failure. Field introduced in 20.1.1.
	Reason *string `json:"reason,omitempty"`

	// Status of IPThreatDb transaction. Field introduced in 20.1.1.
	Status *string `json:"status,omitempty"`

	// Last synced version of the IPThreatDB. Field introduced in 20.1.1.
	Version *string `json:"version,omitempty"`
}
