// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentGraphDBNodeTxnStats se agent graph d b node txn stats
// swagger:model SeAgentGraphDBNodeTxnStats
type SeAgentGraphDBNodeTxnStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	History []*SeAgentGraphDBNodeTxnDetail `json:"history,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LongestTxn *SeAgentGraphDBNodeTxnDetail `json:"longest_txn,omitempty"`
}
