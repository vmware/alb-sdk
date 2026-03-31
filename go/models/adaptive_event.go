// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AdaptiveEvent adaptive event
// swagger:model AdaptiveEvent
type AdaptiveEvent struct {

	// Name of the Object. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntityName *string `json:"entity_name,omitempty"`

	// Object UUID. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntityUUID *string `json:"entity_uuid,omitempty"`

	// Time Config applied on SE. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EventTime *string `json:"event_time,omitempty"`

	// Current Config version of Object. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *int64 `json:"version,omitempty"`
}
