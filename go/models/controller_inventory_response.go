// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerInventoryResponse controller inventory response
// swagger:model ControllerInventoryResponse
type ControllerInventoryResponse struct {

	// Number of fault categories present in results (0-7), not total fault count. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint32 `json:"count"`

	// Present fault categories, each list is only populated when the corresponding controller_faults flag is enabled and faults exist. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results *ControllerInventoryFaults `json:"results,omitempty"`
}
