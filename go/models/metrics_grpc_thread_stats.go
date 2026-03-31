// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsGrpcThreadStats metrics grpc thread stats
// swagger:model MetricsGrpcThreadStats
type MetricsGrpcThreadStats struct {

	// Timeout in seconds that SE waits for a grpc channel to connect to server, before it retries. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GrpcChannelConnectTimeout *uint32 `json:"grpc_channel_connect_timeout,omitempty"`

	// When True, indicates se agent is polling grpc-thread expecting response messages from it. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GrpcThreadPollTimerRunning *bool `json:"grpc_thread_poll_timer_running,omitempty"`

	// Number of milliseconds grpc-thread sleeps between successive cycles. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GrpcThreadRelentTime *uint32 `json:"grpc_thread_relent_time,omitempty"`

	// High watermark of main to grpc-thread message queue length. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxGrpcMsgsOustanding *uint32 `json:"max_grpc_msgs_oustanding,omitempty"`

	// Cumulative count of cleanup-channel requests received by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanCleanupReqRcvd *uint32 `json:"num_grpc_chan_cleanup_req_rcvd,omitempty"`

	// Cumulative count of cleanup-channel responses sent to se_agent across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanCleanupRspsRcvd *uint32 `json:"num_grpc_chan_cleanup_rsps_rcvd,omitempty"`

	// Number of grpc-channel contexts maintained by grpc thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanContexts *uint32 `json:"num_grpc_chan_contexts,omitempty"`

	// Cumulative count of duplicate channel creation messages seen by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanCreateDupErrors *uint32 `json:"num_grpc_chan_create_dup_errors,omitempty"`

	// Cumulative count of channel creation failures seen by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanCreateErrors *uint32 `json:"num_grpc_chan_create_errors,omitempty"`

	// Cumulative count of create-channel requests received by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanCreateReqRcvd *uint32 `json:"num_grpc_chan_create_req_rcvd,omitempty"`

	// Cumulative count of channel creation retries by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanCreateRetries *uint32 `json:"num_grpc_chan_create_retries,omitempty"`

	// Cumulative count of create-channel responses sent to se_agent across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanCreateRspsRcvd *uint32 `json:"num_grpc_chan_create_rsps_rcvd,omitempty"`

	// Cumulative count of successful channel creation by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanCreateSuccess *uint32 `json:"num_grpc_chan_create_success,omitempty"`

	// Cumulative count of channel deletion failures seen by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanDeleteErrors *uint32 `json:"num_grpc_chan_delete_errors,omitempty"`

	// Cumulative count of delete-channel requests received by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanDeleteReqRcvd *uint32 `json:"num_grpc_chan_delete_req_rcvd,omitempty"`

	// Cumulative count of delete-channel responses sent to se_agent across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanDeleteRspsRcvd *uint32 `json:"num_grpc_chan_delete_rsps_rcvd,omitempty"`

	// Cumulative count of successful channel deletion by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanDeleteSuccess *uint32 `json:"num_grpc_chan_delete_success,omitempty"`

	// Cumulative count of channel maintenance messages processed by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanMaintMsgsProcessed *uint32 `json:"num_grpc_chan_maint_msgs_processed,omitempty"`

	// Cumulative count of channel reinit failures seen by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanReinitErrors *uint32 `json:"num_grpc_chan_reinit_errors,omitempty"`

	// Cumulative count of reinit-channel requests received by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanReinitReqRcvd *uint32 `json:"num_grpc_chan_reinit_req_rcvd,omitempty"`

	// Cumulative count of reinit-channel responses sent to se_agent across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanReinitRspsRcvd *uint32 `json:"num_grpc_chan_reinit_rsps_rcvd,omitempty"`

	// Cumulative count of reset-channel requests received by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanResetReqRcvd *uint32 `json:"num_grpc_chan_reset_req_rcvd,omitempty"`

	// Cumulative count of reset-channel responses sent to se_agent across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcChanResetRspsRcvd *uint32 `json:"num_grpc_chan_reset_rsps_rcvd,omitempty"`

	// Cumulative count of errors in sending metrics messages on stream rpc across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcDosStreamWriteErrors *uint32 `json:"num_grpc_dos_stream_write_errors,omitempty"`

	// Cumulative count of metrics messages sent on stream rpc by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcDosStreamWriteSuccess *uint32 `json:"num_grpc_dos_stream_write_success,omitempty"`

	// Cumulative count of errors in sending metrics messages on stream rpc across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcMetStreamWriteErrors *uint32 `json:"num_grpc_met_stream_write_errors,omitempty"`

	// Cumulative count of metrics messages sent on stream rpc by the grpc-thread across all metrics targets. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcMetStreamWriteSuccess *uint32 `json:"num_grpc_met_stream_write_success,omitempty"`

	// Current count of of messages outstanding with the grpc-thread. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGrpcMsgsOutstanding *uint32 `json:"num_grpc_msgs_outstanding,omitempty"`

	// Misceleaneous, unlikely errors encountered by metrics agent. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumMiscErrors *uint32 `json:"num_misc_errors,omitempty"`

	// Number of times RPC to metrics manager failed authentication. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRPCAuthErrors *uint32 `json:"num_rpc_auth_errors,omitempty"`

	// Number of times RPC to metrics manager was successfully authenticated. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRPCAuthSuccess *uint32 `json:"num_rpc_auth_success,omitempty"`
}
