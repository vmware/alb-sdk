// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AdaptReplWindowSummary adapt repl window summary
// swagger:model AdaptReplWindowSummary
type AdaptReplWindowSummary struct {

	// UUID of the object. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjUUID *string `json:"obj_uuid,omitempty"`

	// version of this config object. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VersionNum *uint32 `json:"version_num,omitempty"`
}
