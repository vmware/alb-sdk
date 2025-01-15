// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolRuntimeSummary pool runtime summary
// swagger:model PoolRuntimeSummary
type PoolRuntimeSummary struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumServers *int64 `json:"num_servers"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumServersEnabled *int64 `json:"num_servers_enabled"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumServersUp *int64 `json:"num_servers_up"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	OperStatus *OperationalStatus `json:"oper_status"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PercentServersUpEnabled *int32 `json:"percent_servers_up_enabled,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PercentServersUpTotal *int32 `json:"percent_servers_up_total,omitempty"`
}
