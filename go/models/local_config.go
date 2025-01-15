// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LocalConfig local config
// swagger:model LocalConfig
type LocalConfig struct {

	// VSGS operational information. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VsgsInfo []*VsgsOpsInfo `json:"vsgs_info,omitempty"`
}
