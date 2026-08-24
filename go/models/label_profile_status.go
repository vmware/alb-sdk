// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LabelProfileStatus label profile status
// swagger:model LabelProfileStatus
type LabelProfileStatus struct {

	// One entry per label defined in the LabelProfile. Field introduced in 32.1.4. Maximum of 256 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Labels []*LabelStatusEntry `json:"labels,omitempty"`
}
