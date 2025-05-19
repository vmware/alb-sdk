// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsgsOpsInfo vsgs ops info
// swagger:model VsgsOpsInfo
type VsgsOpsInfo struct {

	// DNSVS UUID associated with the object(GSLB, GSLBSERVICE, GSLBGEODB). Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DNSVSUUID *string `json:"dnsvs_uuid,omitempty"`

	// VSGS operation type, Changed or deleted. Enum options - GSLB_OBJECT_CHANGED, GSLB_OBJECT_UNCHANGED, GSLB_OBJECT_DELETE. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Ops *string `json:"ops,omitempty"`

	// Timestamp for VSGS CUD operation. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Timestamp *TimeStamp `json:"timestamp,omitempty"`
}
