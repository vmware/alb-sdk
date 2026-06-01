// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIEndpointClassificationDetails Api endpoint classification details
// swagger:model ApiEndpointClassificationDetails
type APIEndpointClassificationDetails struct {

	// API classification transition type for the API Endpoint. Enum options - API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ORPHAN, API_CLASSIFICATION_TRANSITION_TYPE_ACTIVE_TO_ZOMBIE, API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ORPHAN_TO_ZOMBIE, API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ACTIVE, API_CLASSIFICATION_TRANSITION_TYPE_ZOMBIE_TO_ORPHAN. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIClassificationTransitionType *string `json:"api_classification_transition_type,omitempty"`

	// API Endpoint Classification details. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	APIEndpoint *string `json:"api_endpoint,omitempty"`
}
