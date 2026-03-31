// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// KeyvalDispatch keyval dispatch
// swagger:model KeyvalDispatch
type KeyvalDispatch struct {

	// Key value entries. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeyvalEntry []*KeyvalInternalEntry `json:"keyval_entry,omitempty"`

	// VS uuid. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
