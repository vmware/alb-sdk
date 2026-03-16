// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnectionStats connection stats
// swagger:model ConnectionStats
type ConnectionStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnectionsAccepted *uint64 `json:"connections_accepted"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnectionsClosed *uint64 `json:"connections_closed"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnectionsEstablished *uint64 `json:"connections_established"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnectionsInitiated *uint64 `json:"connections_initiated"`
}
