// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AdaptReplDetail adapt repl detail
// swagger:model AdaptReplDetail
type AdaptReplDetail struct {

	// Display if a config version is acked or not from SE. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Acked []bool `json:"acked,omitempty"`

	// Config version as reported by SE/SCM. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CfgVersions []*ConfigVersion `json:"cfg_versions,omitempty"`
}
