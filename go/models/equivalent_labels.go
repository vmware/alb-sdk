// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// EquivalentLabels equivalent labels
// swagger:model EquivalentLabels
type EquivalentLabels struct {

	// Equivalent labels. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Labels []string `json:"labels,omitempty"`
}
