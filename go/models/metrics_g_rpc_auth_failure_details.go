// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsGRPCAuthFailureDetails metrics g RPC auth failure details
// swagger:model MetricsGRPCAuthFailureDetails
type MetricsGRPCAuthFailureDetails struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Peer *string `json:"peer,omitempty"`
}
