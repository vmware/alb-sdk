// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DispatcherRemoteTimerListDumpRuntime dispatcher remote timer list dump runtime
// swagger:model DispatcherRemoteTimerListDumpRuntime
type DispatcherRemoteTimerListDumpRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicTable []*DispatcherRemoteTimerListRuntime `json:"vnic_table,omitempty"`
}
