// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PolicySpec policy spec
// swagger:model PolicySpec
type PolicySpec struct {

	// Disk usage policy. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Disk *DiskThreshold `json:"disk,omitempty"`

	// Objects policy. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Object *ObjectRule `json:"object,omitempty"`

	// Periodic policy. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Periodic *Periodicity `json:"periodic,omitempty"`
}
