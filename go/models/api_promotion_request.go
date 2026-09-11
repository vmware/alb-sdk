// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPromotionRequest Api promotion request
// swagger:model ApiPromotionRequest
type APIPromotionRequest struct {

	// The Api Endpoint to promote, including its path, HTTP method, and consolidated WAAP inventory detail. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Endpoint *APIPromotionEndpointDetail `json:"endpoint,omitempty"`

	// Reference to the VirtualService that receives the promoted endpoint via its associated ApiPolicy. It is a reference to an object of type VirtualService. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualServiceRef *string `json:"virtual_service_ref,omitempty"`
}
