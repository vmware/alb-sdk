// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PostgresEventInfo postgres event info
// swagger:model PostgresEventInfo
type PostgresEventInfo struct {

	// Name of the DB. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DbName *string `json:"db_name,omitempty"`

	// Description of the event. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EventDesc *string `json:"event_desc,omitempty"`

	// Timestamp at which this event occurred. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timestamp *string `json:"timestamp,omitempty"`
}
