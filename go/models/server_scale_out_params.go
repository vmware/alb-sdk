// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerScaleOutParams server scale out params
// swagger:model ServerScaleOutParams
type ServerScaleOutParams struct {

	// Reason for the manual scale-out. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
