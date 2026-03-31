// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsGrpcTargetStats metrics grpc target stats
// swagger:model MetricsGrpcTargetStats
type MetricsGrpcTargetStats struct {

	// State of dos-data stream grpc to the metrics target. Enum options - STREAM_RPC_IDLE, STREAM_RPC_AUTHENTICATING, STREAM_RPC_AUTH_SUCCESS, STREAM_RPC_AUTH_FAILED, STREAM_RPC_ACTIVE, STREAM_RPC_FINISHED. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DosStreamRPCState *string `json:"dos_stream_rpc_state,omitempty"`

	// State of GRPC channel to the metrics target. Enum options - METRICS_GRPC_CHANNEL_DOWN, METRICS_GRPC_CHANNEL_CREATING, METRICS_GRPC_CHANNEL_READY. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GrpcChannelState *string `json:"grpc_channel_state,omitempty"`

	// State of metrics stream grpc to the metrics target. Enum options - STREAM_RPC_IDLE, STREAM_RPC_AUTHENTICATING, STREAM_RPC_AUTH_SUCCESS, STREAM_RPC_AUTH_FAILED, STREAM_RPC_ACTIVE, STREAM_RPC_FINISHED. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricsStreamRPCState *string `json:"metrics_stream_rpc_state,omitempty"`

	// Cumulative count of grpc-channel create requests sent to grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanCreateReqsSent *uint32 `json:"num_chan_create_reqs_sent,omitempty"`

	// Cumulative count of grpc-channel create responses received from grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanCreateRspsRcvd *uint32 `json:"num_chan_create_rsps_rcvd,omitempty"`

	// Cumulative count of grpc-channel delete requests sent to grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanDeleteReqsSent *uint32 `json:"num_chan_delete_reqs_sent,omitempty"`

	// Cumulative count of grpc-channel delete responses received from grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanDeleteRspsRcvd *uint32 `json:"num_chan_delete_rsps_rcvd,omitempty"`

	// Number of grpc-channel maintenance messages currently outstanding with grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanMaintMsgsOutstanding *uint32 `json:"num_chan_maint_msgs_outstanding,omitempty"`

	// Number of times grpc-channel maintenance message was not sent - because a message was already outstanding with grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanMaintMsgsSkipped *uint32 `json:"num_chan_maint_msgs_skipped,omitempty"`

	// Cumulative count of grpc-channel re-init requests sent to grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanReinitReqsSent *uint32 `json:"num_chan_reinit_reqs_sent,omitempty"`

	// Cumulative count of grpc-channel re-init responses received from grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanReinitRspsRcvd *uint32 `json:"num_chan_reinit_rsps_rcvd,omitempty"`

	// Cumulative count of grpc-channel reset requests sent to grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanResetReqsSent *uint32 `json:"num_chan_reset_reqs_sent,omitempty"`

	// Cumulative count of grpc-channel reset responses received from grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChanResetRspsRcvd *uint32 `json:"num_chan_reset_rsps_rcvd,omitempty"`

	// Cumulative count of errors when sending DOS messages to metrics target. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosMsgDrops *uint32 `json:"num_dos_msg_drops,omitempty"`

	// Cumulative count of DOS messages sent to metrics target. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosMsgsSent *uint32 `json:"num_dos_msgs_sent,omitempty"`

	// Number of attempts to authenticate DOS stream rpc with metrics manager. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosRPCAuthAttempts *uint32 `json:"num_dos_rpc_auth_attempts,omitempty"`

	// Number of times DOS stream rpc failed to authenticated with metrics manager. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosRPCAuthFailure *uint32 `json:"num_dos_rpc_auth_failure,omitempty"`

	// Number of times DOS stream rpc successfully authenticated with metrics manager. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDosRPCAuthSuccess *uint32 `json:"num_dos_rpc_auth_success,omitempty"`

	// Number of metrics objects sending data to this target. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetObjects *uint32 `json:"num_met_objects,omitempty"`

	// Number of attempts to authenticate metrics stream rpc with metrics manager. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetRPCAuthAttempts *uint32 `json:"num_met_rpc_auth_attempts,omitempty"`

	// Number of times metrics stream rpc failed to authenticated with metrics manager. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetRPCAuthFailure *uint32 `json:"num_met_rpc_auth_failure,omitempty"`

	// Number of times metrics stream rpc successfully authenticated with metrics manager. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetRPCAuthSuccess *uint32 `json:"num_met_rpc_auth_success,omitempty"`

	// Cumulative count of errors when sending metrics messages to metrics target. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetricsMsgDrops *uint32 `json:"num_metrics_msg_drops,omitempty"`

	// Cumulative count of metrics messages sent to metrics target. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMetricsMsgsSent *uint32 `json:"num_metrics_msgs_sent,omitempty"`

	// IP addresses of the metrics-manager node to which grpc-channel is setup. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TargetIP *string `json:"target_ip,omitempty"`

	// Node name of the metrics-manager to which grpc-channel is setup. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TargetName *string `json:"target_name,omitempty"`

	// Port of the metrics-manager to which grpc-channel is setup. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TargetPort *string `json:"target_port,omitempty"`
}
