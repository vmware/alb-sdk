// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsDss vs dss
// swagger:model VsDss
type VsDss struct {

	// Name of the data-script-set linked to the VS. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsDssName *string `json:"vs_dss_name,omitempty"`
}
