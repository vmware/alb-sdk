// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserPreferences user preferences
// swagger:model UserPreferences
type UserPreferences struct {

	// UI-owned preferences, JSON-encoded as a string. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UIProperty *string `json:"ui_property,omitempty"`
}
