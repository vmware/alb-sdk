// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerSslProfileFault controller ssl profile fault
// swagger:model ControllerSslProfileFault
type ControllerSslProfileFault struct {

	// Only the fixed 'description' key is represented; the real payload also contains one additional key per flagged SSLProfile name mapping to a list of cipher strings, which is not representable here. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`
}
