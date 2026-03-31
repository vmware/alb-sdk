// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentStateRuntime se agent state runtime
// swagger:model SeAgentStateRuntime
type SeAgentStateRuntime struct {

	// If active_se_1 tag is set. Field introduced in 20.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveSe1 *bool `json:"active_se_1,omitempty"`

	// If active_se_2 tag is set. Field introduced in 20.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveSe2 *bool `json:"active_se_2,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BatchDequeueTimeoutMs *int32 `json:"batch_dequeue_timeout_ms,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BatchEnqueueTimeoutMs *int32 `json:"batch_enqueue_timeout_ms,omitempty"`

	//  Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BgpPeersStatusUp *bool `json:"bgp_peers_status_up,omitempty"`

	// Displays whether the service engine booted in BIOS or UEFI mode. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BootMode *string `json:"boot_mode,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerIP *string `json:"controller_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ControllerPort *int32 `json:"controller_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CpustatsIntervalSec *int32 `json:"cpustats_interval_sec,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CtrlRegTimeoutSec *int32 `json:"ctrl_reg_timeout_sec,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CtrlRPCTimeoutOnDpHbFailedMsec *int32 `json:"ctrl_rpc_timeout_on_dp_hb_failed_msec,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CtrlRPCTimeoutSec *int32 `json:"ctrl_rpc_timeout_sec,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DebugMode *bool `json:"debug_mode,omitempty"`

	// Reports file system disk space usage. Field introduced in 18.2.10, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiskSpaceUsage *DiskSpaceUsage `json:"disk_space_usage,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpBatchSize *int32 `json:"dp_batch_size,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpResponseTimeoutSec *int32 `json:"dp_response_timeout_sec,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FsmState *string `json:"fsm_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GwMonitorStatusUp *bool `json:"gw_monitor_status_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeadlessMode *bool `json:"headless_mode,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeadlessTimeoutSec *int32 `json:"headless_timeout_sec,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeartbeatMissLimit *int32 `json:"heartbeat_miss_limit,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeartbeatTimeoutSec *int32 `json:"heartbeat_timeout_sec,omitempty"`

	// Indicates status of SE hybrid only RSS mode of operation. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HybridRssMode *bool `json:"hybrid_rss_mode,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastHeartbeatMissTime *TimeStamp `json:"last_heartbeat_miss_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastHeartbeatRecvTime *TimeStamp `json:"last_heartbeat_recv_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastRegisterFailedTime *TimeStamp `json:"last_register_failed_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastRegisterSuccessTime *TimeStamp `json:"last_register_success_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastRegisterTime *TimeStamp `json:"last_register_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastSeHeadlessTime *TimeStamp `json:"last_se_headless_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastSeOnlineTime *TimeStamp `json:"last_se_online_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastSeReadySentTime *TimeStamp `json:"last_se_ready_sent_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastVsDeletedOnSyncTime *TimeStamp `json:"last_vs_deleted_on_sync_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MemMb *int32 `json:"mem_mb,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIP *string `json:"mgmt_ip,omitempty"`

	// Indicates the status of SE NTP synchronization. Field introduced in 22.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NtpSynchronizationStatus *bool `json:"ntp_synchronization_status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumConfigObjects *int32 `json:"num_config_objects,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCPU *int32 `json:"num_cpu,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDataplaneRegistrations *int32 `json:"num_dataplane_registrations,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDispatcherCPU *uint32 `json:"num_dispatcher_cpu,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDpHeartbeatMiss *int32 `json:"num_dp_heartbeat_miss,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCPU *uint32 `json:"num_flow_cpu,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGraphdbDanglingErrors *int32 `json:"num_graphdb_dangling_errors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHeartbeat *int64 `json:"num_heartbeat,omitempty"`

	//  Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumQueues *uint32 `json:"num_queues,omitempty"`

	// Number of queues handled by every dispatcher. Field introduced in 18.2.8, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumQueuesPerDispatcher *uint32 `json:"num_queues_per_dispatcher,omitempty"`

	// Number of NIC RX descriptors. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRxDescriptors *uint32 `json:"num_rx_descriptors,omitempty"`

	// Number of NIC TX descriptors. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTxDescriptors *uint32 `json:"num_tx_descriptors,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnic *int32 `json:"num_vnic,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsDeletedOnSync *int32 `json:"num_vs_deleted_on_sync,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RegisteredWithController *bool `json:"registered_with_controller,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SdbStats []*SeAgentSharedDBStats `json:"sdb_stats,omitempty"`

	// Shows how long the service engine datapath has been up and running. Field introduced in 18.2.10, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeDpUptime *string `json:"se_dp_uptime,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHeadlessCount *int32 `json:"se_headless_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeHeartbeatMissCount *int32 `json:"se_heartbeat_miss_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeReadyCount *int32 `json:"se_ready_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRegistrationCount *int32 `json:"se_registration_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRegistrationFailCount *int32 `json:"se_registration_fail_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsRedisMap []*VsRedisMap `json:"vs_redis_map,omitempty"`
}
