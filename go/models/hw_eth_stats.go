// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HwEthStats hw eth stats
// swagger:model HwEthStats
type HwEthStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EthStats *EthStats `json:"eth_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EthXstats []*EthXStats `json:"eth_xstats,omitempty"`
}
