// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPolicyClassificationDetails Api policy classification details
// swagger:model ApiPolicyClassificationDetails
type APIPolicyClassificationDetails struct {

	// API Endpoint classification details. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIEndpointClassificationDetails []*APIEndpointClassificationDetails `json:"api_endpoint_classification_details,omitempty"`

	// Event description for the API Policy classification change. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EventDescription *string `json:"event_description,omitempty"`
}
