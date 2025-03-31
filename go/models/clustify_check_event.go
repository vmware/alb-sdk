// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClustifyCheckEvent clustify check event
// swagger:model ClustifyCheckEvent
type ClustifyCheckEvent struct {

	// Reason of clustify check event. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`
}
