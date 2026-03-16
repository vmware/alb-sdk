// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PlacementStatus placement status
// swagger:model PlacementStatus
type PlacementStatus struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Consumers []*ConsumerStatus `json:"consumers,omitempty"`
}
