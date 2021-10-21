// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConfigVersionStatus config version status
// swagger:model ConfigVersionStatus
type ConfigVersionStatus struct {

	// Name of config object. Field introduced in 21.1.3.
	ObjName *string `json:"obj_name,omitempty"`

	// Uuid of config object. Field introduced in 21.1.3.
	ObjUUID *string `json:"obj_uuid,omitempty"`
}
