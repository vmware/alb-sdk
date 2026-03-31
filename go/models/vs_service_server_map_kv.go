// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsServiceServerMapKv vs service server map kv
// swagger:model VsServiceServerMapKv
type VsServiceServerMapKv struct {

	// Service server map kv for horizon. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeyvalEntries []*KeyvalInternalEntry `json:"keyval_entries,omitempty"`

	// SE uuid. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
