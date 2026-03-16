// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// EcnStats ecn stats
// swagger:model EcnStats
type EcnStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EcnCapableTransport0 *uint64 `json:"ecn_capable_transport_0"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EcnCapableTransport1 *uint64 `json:"ecn_capable_transport_1"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EcnCongestionExperienced *uint64 `json:"ecn_congestion_experienced"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EcnSuccessfulHandshakes *uint64 `json:"ecn_successful_handshakes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesEcnReducedCwnd *uint64 `json:"times_ecn_reduced_cwnd"`
}
