// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WarningEventDetails warning event details
// swagger:model WarningEventDetails
type WarningEventDetails struct {

	// Event data. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EventData *string `json:"event_data,omitempty"`

	// Warning message. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WarningMessage *string `json:"warning_message,omitempty"`
}
