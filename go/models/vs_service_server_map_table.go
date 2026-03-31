// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsServiceServerMapTable vs service server map table
// swagger:model VsServiceServerMapTable
type VsServiceServerMapTable struct {

	// SE uuid. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Service server map table for horizon. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsServiceServerMapEntry []*VsServiceServerMapEntry `json:"vs_service_server_map_entry,omitempty"`
}
