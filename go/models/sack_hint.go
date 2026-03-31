// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SackHint sack hint
// swagger:model SackHint
type SackHint struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastSackAck *uint32 `json:"last_sack_ack,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SackBytesRexmit *int32 `json:"sack_bytes_rexmit,omitempty"`
}
