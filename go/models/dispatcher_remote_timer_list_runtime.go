// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DispatcherRemoteTimerListRuntime dispatcher remote timer list runtime
// swagger:model DispatcherRemoteTimerListRuntime
type DispatcherRemoteTimerListRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Close *DispatcherOneTableRuntime `json:"close,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Est *DispatcherOneTableRuntime `json:"est,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Halfclose *DispatcherOneTableRuntime `json:"halfclose,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mac *string `json:"mac,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Syn *DispatcherOneTableRuntime `json:"syn,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Unknown *DispatcherOneTableRuntime `json:"unknown,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vnic *uint32 `json:"vnic,omitempty"`
}
