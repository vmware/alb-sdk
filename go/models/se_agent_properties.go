package models

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

// SeAgentProperties se agent properties
// swagger:model SeAgentProperties
type SeAgentProperties struct {

	// Aggressive Count of HB misses for se health check failure. Allowed values are 1-1000.
	ControllerEchoMissAggressiveLimit int32 `json:"controller_echo_miss_aggressive_limit,omitempty"`

	// Count of HB misses for se health check failure. Allowed values are 1-1000.
	ControllerEchoMissLimit int32 `json:"controller_echo_miss_limit,omitempty"`

	// Aggressive Timeout used for se health check. Units(MILLISECONDS).
	ControllerEchoRPCAggressiveTimeout int32 `json:"controller_echo_rpc_aggressive_timeout,omitempty"`

	// Timeout used for se health check. Units(MILLISECONDS).
	ControllerEchoRPCTimeout int32 `json:"controller_echo_rpc_timeout,omitempty"`

	//  Allowed values are 1-20.
	ControllerHeartbeatMissLimit int32 `json:"controller_heartbeat_miss_limit,omitempty"`

	//  Allowed values are 1-60. Units(SEC).
	ControllerHeartbeatTimeoutSec int32 `json:"controller_heartbeat_timeout_sec,omitempty"`

	// . Units(SEC).
	ControllerRegistrationTimeoutSec int32 `json:"controller_registration_timeout_sec,omitempty"`

	// . Units(SEC).
	ControllerRPCTimeout int32 `json:"controller_rpc_timeout,omitempty"`

	// . Units(SEC).
	CpustatsInterval int32 `json:"cpustats_interval,omitempty"`

	// Max time to wait for ctrl registration before assert. Allowed values are 1-1000. Units(SEC).
	CtrlRegPendingMaxWaitTime int32 `json:"ctrl_reg_pending_max_wait_time,omitempty"`

	// Placeholder for description of property debug_mode of obj type SeAgentProperties field type str  type boolean
	DebugMode bool `json:"debug_mode,omitempty"`

	//  Allowed values are 1-1000. Units(MILLISECONDS).
	DpAggressiveDeqIntervalMsec int32 `json:"dp_aggressive_deq_interval_msec,omitempty"`

	//  Allowed values are 1-1000. Units(MILLISECONDS).
	DpAggressiveEnqIntervalMsec int32 `json:"dp_aggressive_enq_interval_msec,omitempty"`

	// Number of dp_batch_size.
	DpBatchSize int32 `json:"dp_batch_size,omitempty"`

	//  Allowed values are 1-1000. Units(MILLISECONDS).
	DpDeqIntervalMsec int32 `json:"dp_deq_interval_msec,omitempty"`

	//  Allowed values are 1-1000. Units(MILLISECONDS).
	DpEnqIntervalMsec int32 `json:"dp_enq_interval_msec,omitempty"`

	// . Units(SEC).
	DpMaxWaitRspTimeSec int32 `json:"dp_max_wait_rsp_time_sec,omitempty"`

	// Max time to wait for dp registration before assert. Units(SEC).
	DpRegPendingMaxWaitTime int32 `json:"dp_reg_pending_max_wait_time,omitempty"`

	// . Units(SEC).
	HeadlessTimeoutSec int32 `json:"headless_timeout_sec,omitempty"`

	// Placeholder for description of property ignore_docker_mac_change of obj type SeAgentProperties field type str  type boolean
	IgnoreDockerMacChange bool `json:"ignore_docker_mac_change,omitempty"`

	// SDB pipeline flush interval. Allowed values are 1-10000. Units(MILLISECONDS).
	SdbFlushInterval int32 `json:"sdb_flush_interval,omitempty"`

	// SDB pipeline size. Allowed values are 1-10000.
	SdbPipelineSize int32 `json:"sdb_pipeline_size,omitempty"`

	// SDB scan count. Allowed values are 1-1000.
	SdbScanCount int32 `json:"sdb_scan_count,omitempty"`

	// DHCP ip check interval. Allowed values are 1-1000. Units(SEC).
	VnicDhcpIPCheckInterval int32 `json:"vnic_dhcp_ip_check_interval,omitempty"`

	// DHCP ip max retries.
	VnicDhcpIPMaxRetries int32 `json:"vnic_dhcp_ip_max_retries,omitempty"`

	// wait interval before deleting IP. Units(SEC).
	VnicIPDeleteInterval int32 `json:"vnic_ip_delete_interval,omitempty"`

	// Probe vnic interval. Units(SEC).
	VnicProbeInterval int32 `json:"vnic_probe_interval,omitempty"`
}
