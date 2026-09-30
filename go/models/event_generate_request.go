// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// EventGenerateRequest event generate request
// swagger:model EventGenerateRequest
type EventGenerateRequest struct {

	// The event log to be generated via the API. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EventLog *EventLog `json:"event_log,omitempty"`
}
