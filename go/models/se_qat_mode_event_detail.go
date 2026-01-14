// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeQatModeEventDetail se qat mode event detail
// swagger:model SeQatModeEventDetail
type SeQatModeEventDetail struct {

	// Intel QAT Service is Oper_Down. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Name of the SE, reporting this event. It is a reference to an object of type ServiceEngine. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SeName *string `json:"se_name,omitempty"`

	// UUID of the SE, responsible for this event. It is a reference to an object of type ServiceEngine. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
