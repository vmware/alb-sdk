// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// QatStatsRuntime qat stats runtime
// swagger:model QatStatsRuntime
type QatStatsRuntime struct {

	// Asymmetric QAT requests in hardware mode. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAsymRequestsInHardware *uint64 `json:"num_asym_requests_in_hardware,omitempty"`

	// Asymmetric QAT requests in software mode. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAsymRequestsInSoftware *uint64 `json:"num_asym_requests_in_software,omitempty"`

	// Symmetric QAT requests in hardware mode. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCipherRequestsInHardware *uint64 `json:"num_cipher_requests_in_hardware,omitempty"`
}
