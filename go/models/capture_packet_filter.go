// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CapturePacketFilter capture packet filter
// swagger:model CapturePacketFilter
type CapturePacketFilter struct {

	// Capture filter for SE IPC. Not applicable for Debug Virtual Service. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CaptureIpcFilters *CaptureIPC `json:"capture_ipc_filters,omitempty"`

	// TCP Params filter. And'ed internally and Or'ed amongst each other. . Field introduced in 30.2.1. Maximum of 20 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CaptureTCPFilters []*CaptureTCPFilter `json:"capture_tcp_filters,omitempty"`

	// Filters all packets of a complete transaction (client and server side), based on client ip. Supported for Virtual Service only. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientIP *DebugIPAddr `json:"client_ip,omitempty"`
}
