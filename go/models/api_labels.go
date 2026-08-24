// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APILabels Configuration of labels applied to endpoints belonging to a specific classification category, such as active or orphan.
// swagger:model ApiLabels
type APILabels struct {

	// Enables the labels configuration. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// The list of labels to be applied to the API. Field introduced in 32.1.4. Maximum of 256 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Labels []string `json:"labels,omitempty"`
}
