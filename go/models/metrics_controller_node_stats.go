// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsControllerNodeStats metrics controller node stats
// swagger:model MetricsControllerNodeStats
type MetricsControllerNodeStats struct {

	// IP addresses or name of controller node. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerIP *string `json:"controller_ip,omitempty"`

	// Current number of messages queued by se_agent main thread for the controller node. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerNodeQueueLen *uint32 `json:"controller_node_queue_len,omitempty"`

	// Time stamp when the last message for this controller node was queued by se_agent main thread. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastQueuedTime *uint32 `json:"last_queued_time,omitempty"`

	// Number of dos messages dequeued by metrics thread. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosMsgsDequeued *uint32 `json:"num_dos_msgs_dequeued,omitempty"`

	// Number of dos messages enqueued to controller node. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosMsgsEnqueued *uint32 `json:"num_dos_msgs_enqueued,omitempty"`

	// Number of grpc-channel create or init messages dequeued by metrics thread. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcCreateChanMsgsDequeued *uint32 `json:"num_grpc_create_chan_msgs_dequeued,omitempty"`

	// Number of grpc-channel create or init messages enqueued to controller node. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcCreateChanMsgsEnqueued *uint32 `json:"num_grpc_create_chan_msgs_enqueued,omitempty"`

	// Number of metrics messages dequeued by metrics thread. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetricsMsgsDequeued *uint32 `json:"num_metrics_msgs_dequeued,omitempty"`

	// Number of metrics messages enqueued to controller node. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetricsMsgsEnqueued *uint32 `json:"num_metrics_msgs_enqueued,omitempty"`
}
