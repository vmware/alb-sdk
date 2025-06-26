// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SystemLimitObjectCounts system limit object counts
// swagger:model SystemLimitObjectCounts
type SystemLimitObjectCounts struct {

	// System limit count info for various system limits. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ObjectCounts []*SystemLimitObjectCount `json:"object_counts,omitempty"`
}
