// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerScaleInParams server scale in params
// swagger:model ServerScaleInParams
type ServerScaleInParams struct {

	// Reason for the manual scale-in. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// List of server IDs that should be scaled in. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Servers []*ServerID `json:"servers,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
