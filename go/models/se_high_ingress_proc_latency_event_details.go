// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeHighIngressProcLatencyEventDetails se high ingress proc latency event details
// swagger:model SeHighIngressProcLatencyEventDetails
type SeHighIngressProcLatencyEventDetails struct {

	// Dispatcher core which received the packet. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DispatcherCore *int32 `json:"dispatcher_core,omitempty"`

	// Dispatcher processing latency. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DispatcherLatencyIngress *int32 `json:"dispatcher_latency_ingress,omitempty"`

	// Number of events in a 30 second interval. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	EventCount *int64 `json:"event_count,omitempty"`

	// Proxy core which processed the packet. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FlowCore *int32 `json:"flow_core,omitempty"`

	// Proxy dequeue latency. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ProxyLatencyIngress *int32 `json:"proxy_latency_ingress,omitempty"`

	// SE name. It is a reference to an object of type ServiceEngine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeName *string `json:"se_name,omitempty"`

	// SE UUID. It is a reference to an object of type ServiceEngine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`

	// VS name. It is a reference to an object of type VirtualService. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VsName *string `json:"vs_name,omitempty"`

	// VS UUID. It is a reference to an object of type VirtualService. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VsRef *string `json:"vs_ref,omitempty"`
}
