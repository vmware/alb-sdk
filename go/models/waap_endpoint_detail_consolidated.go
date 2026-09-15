// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapEndpointDetailConsolidated waap endpoint detail consolidated
// swagger:model WaapEndpointDetailConsolidated
type WaapEndpointDetailConsolidated struct {

	// Deterministic UUID identifying the API endpoint. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ContextID *string `json:"context_id,omitempty"`

	// Request data grouped by content type. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Request []*WaapEndpointDetailConsolidatedRequestData `json:"request,omitempty"`

	// Response data grouped by content type. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Response []*WaapEndpointDetailConsolidatedResponseData `json:"response,omitempty"`
}
