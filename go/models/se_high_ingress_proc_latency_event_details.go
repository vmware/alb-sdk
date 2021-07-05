// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeHighIngressProcLatencyEventDetails se high ingress proc latency event details
// swagger:model SeHighIngressProcLatencyEventDetails
type SeHighIngressProcLatencyEventDetails struct {

	// Dispatcher core which received the packet.
	DispatcherCore *int32 `json:"dispatcher_core,omitempty"`

	// Dispatcher processing latency. Unit is MILLISECONDS.
	DispatcherLatencyIngress *int32 `json:"dispatcher_latency_ingress,omitempty"`

	// Number of events in a 30 second interval.
	EventCount *int64 `json:"event_count,omitempty"`

	// Proxy core which processed the packet.
	FlowCore *int32 `json:"flow_core,omitempty"`

	// Proxy dequeue latency. Unit is MILLISECONDS.
	ProxyLatencyIngress *int32 `json:"proxy_latency_ingress,omitempty"`

	// SE name. It is a reference to an object of type ServiceEngine.
	SeName *string `json:"se_name,omitempty"`

	// SE UUID. It is a reference to an object of type ServiceEngine.
	SeRef *string `json:"se_ref,omitempty"`

	// VS name. It is a reference to an object of type VirtualService.
	VsName *string `json:"vs_name,omitempty"`

	// VS UUID. It is a reference to an object of type VirtualService.
	VsRef *string `json:"vs_ref,omitempty"`
}
