// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TimeoutStats timeout stats
// swagger:model TimeoutStats
type TimeoutStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	KeepaliveTimeout *uint64 `json:"keepalive_timeout"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PersistTimeout *uint64 `json:"persist_timeout"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RetransmitTimeout *uint64 `json:"retransmit_timeout"`
}
