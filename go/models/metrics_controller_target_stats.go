// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsControllerTargetStats metrics controller target stats
// swagger:model MetricsControllerTargetStats
type MetricsControllerTargetStats struct {

	// Health of grpc channel. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ChannelHealthOk *bool `json:"channel_health_ok,omitempty"`

	// Set to True if grpc channel is being setup. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ChannelMaintenanceActive *bool `json:"channel_maintenance_active,omitempty"`

	// IP addresses or name of controller node to which grpc-channel is setup. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerIP *string `json:"controller_ip,omitempty"`

	// Metrics-manager port to which grpc-channel is setup. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerPort *string `json:"controller_port,omitempty"`

	// Current number of messages waiting to be sent on the grpc channel. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GrpcChannelQueueLen *uint32 `json:"grpc_channel_queue_len,omitempty"`

	// Number of dos messages successfully sent on the grpc channel. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosDataMsgsSent *uint32 `json:"num_dos_data_msgs_sent,omitempty"`

	// Number of times messages could not be sent on the grpc channel even after retries. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcSendFailures *uint32 `json:"num_grpc_send_failures,omitempty"`

	// Number of times sending of messages on the grpc channel had to be retried. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcSendRetries *uint32 `json:"num_grpc_send_retries,omitempty"`

	// Number of messages successfully sent on the grpc channel. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcSendSuccess *uint32 `json:"num_grpc_send_success,omitempty"`

	// Number of times initialization of grpc channel was requested. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumInitChannelRequested *uint32 `json:"num_init_channel_requested,omitempty"`

	// Number of times initialization of grpc channel had to be retried - did not succeed in the first attempt. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumInitChannelRetries *uint32 `json:"num_init_channel_retries,omitempty"`

	// Number of times initialization of grpc channel successfully completed. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumInitChannelSuccess *uint32 `json:"num_init_channel_success,omitempty"`

	// Number of metrics messages successfully sent on the grpc channel. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetricsDataMsgsSent *uint32 `json:"num_metrics_data_msgs_sent,omitempty"`

	// Total number of messages dequeued from secondary queue of the grpc channel. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMsgsDequeuedFromTargetq *uint32 `json:"num_msgs_dequeued_from_target_q,omitempty"`

	// Total number of messages queued to the secondary queue of the grpc channel. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMsgsQueuedToTargetq *uint32 `json:"num_msgs_queued_to_target_q,omitempty"`
}
