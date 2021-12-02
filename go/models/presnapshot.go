// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Presnapshot presnapshot
// swagger:model presnapshot
type Presnapshot struct {

	// FB Gs snapshot data. Field introduced in 21.1.3.
	Gssnapshot *FbGsInfo `json:"gssnapshot,omitempty"`

	// FB Pool snapshot data. Field introduced in 21.1.3.
	Poolsnapshot *FbPoolInfo `json:"poolsnapshot,omitempty"`

	// FB SE snapshot data. Field introduced in 21.1.3.
	Sesnapshot *FbSeInfo `json:"sesnapshot,omitempty"`

	// FB VS snapshot data. Field introduced in 21.1.3.
	Vssnapshot *FbVsInfo `json:"vssnapshot,omitempty"`
}
