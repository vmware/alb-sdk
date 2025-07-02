// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVsPktBufHighEventDetails se vs pkt buf high event details
// swagger:model SeVsPktBufHighEventDetails
type SeVsPktBufHighEventDetails struct {

	// Current packet buffer usage of the VS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentValue *uint32 `json:"current_value,omitempty"`

	// Buffer usage threshold value. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Threshold *uint32 `json:"threshold,omitempty"`

	// Virtual Service name. It is a reference to an object of type VirtualService. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualService *string `json:"virtual_service,omitempty"`
}
