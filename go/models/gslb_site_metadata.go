// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSiteMetadata gslb site metadata
// swagger:model GslbSiteMetadata
type GslbSiteMetadata struct {

	// Site resource information like cpu, memory, disk etc. including site version. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClustifyInfo *ClustifyInfo `json:"clustify_info,omitempty"`
}
