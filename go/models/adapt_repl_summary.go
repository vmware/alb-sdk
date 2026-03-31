// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AdaptReplSummary adapt repl summary
// swagger:model AdaptReplSummary
type AdaptReplSummary struct {

	// replication status. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplStatus *string `json:"repl_status,omitempty"`

	// site replication. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteRepl []*AdaptReplSiteReplication `json:"site_repl,omitempty"`
}
