// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PreChecksParams pre checks params
// swagger:model PreChecksParams
type PreChecksParams struct {

	// Maximum wait time for configuration export to complete. Allowed values are 600-5400. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ExportConfigTimeout *uint32 `json:"export_config_timeout,omitempty"`

	// Maximum number of alerts allowed for configuration export. Allowed values are 200-500. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxAlerts *uint32 `json:"max_alerts,omitempty"`
}
