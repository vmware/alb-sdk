// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// StatediffOperation statediff operation
// swagger:model StatediffOperation
type StatediffOperation struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Info for each Statediff event. Field introduced in 21.1.3.
	Events []*StatediffEvent `json:"events,omitempty"`

	// Name of Statediff operation. Field introduced in 21.1.3.
	Name *string `json:"name,omitempty"`

	// Uuid of node for Statediff operation entry. Field introduced in 21.1.3.
	NodeUUID *string `json:"node_uuid,omitempty"`

	// Type of Statediff operation. Enum options - FB_UPGRADE, FB_ROLLBACK, FB_PATCH, FB_ROLLBACK_PATCH. Field introduced in 21.1.3.
	Operation *string `json:"operation,omitempty"`

	// Phase of Statediff operation. Enum options - FB_PRE_SNAPSHOT, FB_POST_SNAPSHOT. Field introduced in 21.1.3.
	Phase *string `json:"phase,omitempty"`

	// Status of Statediff operation. Enum options - FB_INIT, FB_IN_PROGRESS, FB_COMPLETED, FB_FAILED, FB_COMPLETED_WITH_ERRORS. Field introduced in 21.1.3.
	Status *string `json:"status,omitempty"`

	// Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 21.1.3.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// unique identifier for Statediff entry. Field introduced in 21.1.3.
	UUID *string `json:"uuid,omitempty"`
}
