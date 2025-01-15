// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsGsStatus vs gs status
// swagger:model VsGsStatus
type VsGsStatus struct {

	// Details of the event. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Details []string `json:"details,omitempty"`

	// Config object name. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Config object uuid. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// VsGs config object data. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VsgsObj *VsGs `json:"vsgs_obj,omitempty"`
}
