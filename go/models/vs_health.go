// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsHealth vs health
// swagger:model VsHealth
type VsHealth struct {

	// Status of every Service Engine currently serving this Virtual Service. Field introduced in 32.2.1. Maximum of 64 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeStatuses []*VsSeStatus `json:"se_statuses,omitempty"`

	// Whether this Virtual Service's configuration has been fully applied. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsConfigStatus *ConfigurationStatus `json:"vs_config_status,omitempty"`

	// Whether this Virtual Service is currently up. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsOperStatus *OperationalStatus `json:"vs_oper_status,omitempty"`
}
