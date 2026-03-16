// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeDispatcherInfo se dispatcher info
// swagger:model SeDispatcherInfo
type SeDispatcherInfo struct {

	// Num of Active/Licensed Cores. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveCores *int32 `json:"active_cores,omitempty"`

	// Dedicated Dispatcher Status in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DedicatedDispatcherOn *bool `json:"dedicated_dispatcher_on,omitempty"`

	// Num of Dispatcher Cores in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DispatcherCores *int32 `json:"dispatcher_cores,omitempty"`

	// Num of DP Isolation Cores in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpIsolatedCores *int32 `json:"dp_isolated_cores,omitempty"`

	// Num queues per vnic. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumQueues *int32 `json:"num_queues,omitempty"`

	// Num of queues per dispatcher. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumQueuesPerDispatcher *int32 `json:"num_queues_per_dispatcher,omitempty"`

	// Num of Proxy Cores in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProxyCores *int32 `json:"proxy_cores,omitempty"`
}
