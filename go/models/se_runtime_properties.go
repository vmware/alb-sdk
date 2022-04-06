// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeRuntimeProperties se runtime properties
// swagger:model SeRuntimeProperties
type SeRuntimeProperties struct {

	// Allow admin user ssh access to SE. Field introduced in 18.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AdminSSHEnabled *bool `json:"admin_ssh_enabled,omitempty"`

	//  Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	AppHeaders []*AppHdr `json:"app_headers,omitempty"`

	// Deprecated in 21.1.3. Use config in ServiceEngineGroup instead. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	BaremetalDispatcherHandlesFlows *bool `json:"baremetal_dispatcher_handles_flows,omitempty"`

	// Rate limit on maximum adf lossy log to pushper second. Allowed in Enterprise with any value edition, Essentials(Allowed values- 1000) edition, Basic(Allowed values- 1000) edition, Enterprise with Cloud Services edition.
	ConnectionsLossyLogRateLimiterThreshold *int32 `json:"connections_lossy_log_rate_limiter_threshold,omitempty"`

	// Rate limit on maximum adf udf or nf log to pushper second. Allowed in Enterprise with any value edition, Essentials(Allowed values- 1000) edition, Basic(Allowed values- 1000) edition, Enterprise with Cloud Services edition.
	ConnectionsUdfnfLogRateLimiterThreshold *int32 `json:"connections_udfnf_log_rate_limiter_threshold,omitempty"`

	// Disable Flow Probes for Scaled out VS'es. (This field has been moved to se_group properties 20.1.3 onwards.). Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DisableFlowProbes *bool `json:"disable_flow_probes,omitempty"`

	// Deprecated. Field deprecated in 17.2.5. Field introduced in 17.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DisableGro *bool `json:"disable_gro,omitempty"`

	// Deprecated. Field deprecated in 17.2.5. Field introduced in 17.2.4. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DisableTso *bool `json:"disable_tso,omitempty"`

	//  Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	DosProfile *DosThresholdProfile `json:"dos_profile,omitempty"`

	// Timeout for downstream to become writable. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DownstreamSendTimeout *int32 `json:"downstream_send_timeout,omitempty"`

	// Frequency of SE - SE HB messages when aggressive failure mode detection is enabled. (This field has been moved to se_group properties 20.1.3 onwards). Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials(Allowed values- 100) edition, Basic(Allowed values- 100) edition, Enterprise with Cloud Services edition.
	DpAggressiveHbFrequency *int32 `json:"dp_aggressive_hb_frequency,omitempty"`

	// Consecutive HB failures after which failure is reported to controller,when aggressive failure mode detection is enabled. (This field has been moved to se_group properties 20.1.3 onwards). Allowed in Enterprise with any value edition, Essentials(Allowed values- 10) edition, Basic(Allowed values- 10) edition, Enterprise with Cloud Services edition.
	DpAggressiveHbTimeoutCount *int32 `json:"dp_aggressive_hb_timeout_count,omitempty"`

	// Frequency of SE - SE HB messages when aggressive failure mode detection is not enabled. (This field has been moved to se_group properties 20.1.3 onwards). Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DpHbFrequency *int32 `json:"dp_hb_frequency,omitempty"`

	// Consecutive HB failures after which failure is reported to controller, when aggressive failure mode detection is not enabled. (This field has been moved to se_group properties 20.1.3 onwards). Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DpHbTimeoutCount *int32 `json:"dp_hb_timeout_count,omitempty"`

	// Frequency of ARP requests sent by SE for each VIP to detect duplicate IP when it loses conectivity to controller. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DupipFrequency *int32 `json:"dupip_frequency,omitempty"`

	// Number of ARP responses received for the VIP after which SE decides that the VIP has been moved and disables the VIP. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DupipTimeoutCount *int32 `json:"dupip_timeout_count,omitempty"`

	// Enable HSM luna engine logs. Field introduced in 16.4.8, 17.1.11, 17.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	EnableHsmLog *bool `json:"enable_hsm_log,omitempty"`

	// Enable proxy ARP from Host interface for Front End  proxies. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FeproxyVipsEnableProxyArp *bool `json:"feproxy_vips_enable_proxy_arp,omitempty"`

	// How often to push the flow table IPC messages in the main loop. The value is the number of times through the loop before pushing the batch. i.e, a value of 1 means every time through the loop. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FlowTableBatchPushFrequency *int32 `json:"flow_table_batch_push_frequency,omitempty"`

	// Deprecated. Field deprecated in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FlowTableMaxEntriesDeprecated *int32 `json:"flow_table_max_entries_deprecated,omitempty"`

	// Deprecated. Field deprecated in 17.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FlowTableNewSynMaxEntries *int32 `json:"flow_table_new_syn_max_entries,omitempty"`

	// Overrides the MTU value received via DHCP or some other means. Use this when the infrastructure advertises an MTU that is not supported by all devices in the network. For example, in AWS or when an overlay is used. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GlobalMtu *int32 `json:"global_mtu,omitempty"`

	// Enable Javascript console logs on the client browser when collecting client insights. Allowed in Enterprise with any value edition, Essentials(Allowed values- false) edition, Basic(Allowed values- false) edition, Enterprise with Cloud Services edition.
	HTTPRumConsoleLog *bool `json:"http_rum_console_log,omitempty"`

	// Minimum response size content length to sample for client insights. Allowed in Enterprise with any value edition, Essentials(Allowed values- 64) edition, Basic(Allowed values- 64) edition, Enterprise with Cloud Services edition.
	HTTPRumMinContentLength *int32 `json:"http_rum_min_content_length,omitempty"`

	// How often to push the LB IPC messages in the main loop. The value is the number of times the loop has to run before pushing the batch. i.e, a value of 1 means the batch is pushed every time the loop runs. Field deprecated in 18.1.3. Field introduced in 17.2.8. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LbBatchPushFrequency *int32 `json:"lb_batch_push_frequency,omitempty"`

	// Deprecated. Field deprecated in 17.1.1. Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LbFailMaxTime *int32 `json:"lb_fail_max_time,omitempty"`

	// Number of requests to dispatch from the request queue at a regular interval. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LbactionNumRequestsToDispatch *int32 `json:"lbaction_num_requests_to_dispatch,omitempty"`

	// Maximum retries per request in the request queue. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LbactionRqPerRequestMaxRetries *int32 `json:"lbaction_rq_per_request_max_retries,omitempty"`

	// Deprecated in 21.1.1. Flag to indicate if log files are compressed upon full on the Service Engine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentCompressLogs *bool `json:"log_agent_compress_logs,omitempty"`

	// [DEPRECATED]Log-agent test property used to simulate slow TCP connections. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentConnSendBufferSize *int32 `json:"log_agent_conn_send_buffer_size,omitempty"`

	// [DEPRECATED]Maximum size of data sent by log-agent to Controller over the TCP connection. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentExportMsgBufferSize *int32 `json:"log_agent_export_msg_buffer_size,omitempty"`

	// [DEPRECATED]Time log-agent waits before sending data to the Controller. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentExportWaitTime *int32 `json:"log_agent_export_wait_time,omitempty"`

	// Deprecated in 21.1.1. Maximum application log file size before rollover. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentFileSzAppl *int32 `json:"log_agent_file_sz_appl,omitempty"`

	// Deprecated in 21.1.1. Maximum connection log file size before rollover. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentFileSzConn *int32 `json:"log_agent_file_sz_conn,omitempty"`

	// Deprecated in 21.1.1. Maximum debug log file size before rollover. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentFileSzDebug *int32 `json:"log_agent_file_sz_debug,omitempty"`

	// Deprecated in 21.1.1. Maximum event log file size before rollover. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentFileSzEvent *int32 `json:"log_agent_file_sz_event,omitempty"`

	//  Deprecated in 21.1.1. Minimum storage allocated for logs irrespective of memory and cores. Unit is MB. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentLogStorageMinSz *int32 `json:"log_agent_log_storage_min_sz,omitempty"`

	// [DEPRECATED] Maximum number of Virtual Service log files maintained for significant logs on the Service Engine. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentMaxActiveAdfFilesPerVs *int32 `json:"log_agent_max_active_adf_files_per_vs,omitempty"`

	// Deprecated in 21.1.1. Maximum concurrent rsync requests initiated from log-agent to the Controller. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentMaxConcurrentRsync *int32 `json:"log_agent_max_concurrent_rsync,omitempty"`

	// [DEPRECATED] Maximum size of serialized log message on the Service Engine. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentMaxLogmessageProtoSz *int32 `json:"log_agent_max_logmessage_proto_sz,omitempty"`

	// Deprecated in 21.1.1. Excess percentage threshold of disk size to trigger cleanup of logs on the Service Engine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentMaxStorageExcessPercent *int32 `json:"log_agent_max_storage_excess_percent,omitempty"`

	// Deprecated in 21.1.1. Maximum storage on the disk not allocated for logs on the Service Engine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentMaxStorageIgnorePercent *float32 `json:"log_agent_max_storage_ignore_percent,omitempty"`

	// Deprecated in 21.1.1. Minimum storage allocated to any given VirtualService on the Service Engine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentMinStoragePerVs *int32 `json:"log_agent_min_storage_per_vs,omitempty"`

	// [DEPRECATED]Time interval log-agent pauses between logs obtained from the dataplane. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentPauseInterval *int32 `json:"log_agent_pause_interval,omitempty"`

	// Deprecated in 21.1.1. Internal timer to stall log-agent and prevent it from hogging CPU cycles on the Service Engine. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentSleepInterval *int32 `json:"log_agent_sleep_interval,omitempty"`

	// Deprecated in 21.1.1. Timeout to purge unknown Virtual Service logs from the Service Engine. Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogAgentUnknownVsTimer *int32 `json:"log_agent_unknown_vs_timer,omitempty"`

	// Deprecated in 21.1.1. Maximum number of file names in a log message. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LogMessageMaxFileListSize *int32 `json:"log_message_max_file_list_size,omitempty"`

	// Deprecated. Field deprecated in 17.1.1. Unit is MBPS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	MaxThroughput *int32 `json:"max_throughput,omitempty"`

	// Deprecated in 21.1.1. Use enabled under caching in application profile. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	McacheEnabled *bool `json:"mcache_enabled,omitempty"`

	// enables mcache_fetch. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	McacheFetchEnabled *bool `json:"mcache_fetch_enabled,omitempty"`

	// Use SE Group's app_cache_percent to set cache memory usage limit on SE. Field deprecated in 18.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	McacheMaxCacheSize *int64 `json:"mcache_max_cache_size,omitempty"`

	// enables mcache_store. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	McacheStoreInEnabled *bool `json:"mcache_store_in_enabled,omitempty"`

	// Deprecated in 21.1.1. Use max_object_size under caching in application profile. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	McacheStoreInMaxSize *int32 `json:"mcache_store_in_max_size,omitempty"`

	// Deprecated in 21.1.1. Use min_object_size under caching in application profile. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	McacheStoreInMinSize *int32 `json:"mcache_store_in_min_size,omitempty"`

	// enables mcache_store_out. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	McacheStoreOutEnabled *bool `json:"mcache_store_out_enabled,omitempty"`

	// Use SE Group's app_cache_percent to set cache memory usage limit on SE. Field deprecated in 18.2.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	McacheStoreSeMaxSize *int64 `json:"mcache_store_se_max_size,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NgxFreeConnectionStack *bool `json:"ngx_free_connection_stack,omitempty"`

	// Deprecated. Field deprecated in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PersistenceEntriesLowWatermark *int32 `json:"persistence_entries_low_watermark,omitempty"`

	// Maximum memory in bytes allocated for persistence entries. Allowed values are 0-33554432. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PersistenceMemMax *int32 `json:"persistence_mem_max,omitempty"`

	// Enable punting of UDP packets from primary to other Service Engines. This applies to Virtual Services with Per-Packet Loadbalancing enabled. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ScaleoutUDPPerPkt *bool `json:"scaleout_udp_per_pkt,omitempty"`

	// LDAP basicauth default bind timeout enforced on connections to LDAP server. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeAuthLdapBindTimeout *int32 `json:"se_auth_ldap_bind_timeout,omitempty"`

	// Size of LDAP basicauth credentials cache used on the dataplane. Unit is BYTES. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeAuthLdapCacheSize *int32 `json:"se_auth_ldap_cache_size,omitempty"`

	// LDAP basicauth default connection timeout enforced on connections to LDAP server. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeAuthLdapConnectTimeout *int32 `json:"se_auth_ldap_connect_timeout,omitempty"`

	// Number of concurrent connections to LDAP server by a single basic auth LDAP process. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeAuthLdapConnsPerServer *int32 `json:"se_auth_ldap_conns_per_server,omitempty"`

	// LDAP basicauth default reconnect timeout enforced on connections to LDAP server. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeAuthLdapReconnectTimeout *int32 `json:"se_auth_ldap_reconnect_timeout,omitempty"`

	// LDAP basicauth default login or group search request timeout enforced on connections to LDAP server. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeAuthLdapRequestTimeout *int32 `json:"se_auth_ldap_request_timeout,omitempty"`

	// LDAP basicauth uses multiple ldap servers in the event of a failover only. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeAuthLdapServersFailoverOnly *bool `json:"se_auth_ldap_servers_failover_only,omitempty"`

	//  Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	SeDpCompression *SeRuntimeCompressionProperties `json:"se_dp_compression,omitempty"`

	// Deprecated - This field has been moved to se_group properties 20.1.3 onwards. Internal only. Used to simulate SE - SE HB failure. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpHmDrops *int32 `json:"se_dp_hm_drops,omitempty"`

	// Deprecated in 21.1.3. Use config in ServiceEngineGroup instead. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpIfStatePollInterval *int32 `json:"se_dp_if_state_poll_interval,omitempty"`

	// Deprecated in 21.1.1. Internal buffer full indicator on the Service Engine beyond which the unfiltered logs are abandoned. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpLogNfEnqueuePercent *int32 `json:"se_dp_log_nf_enqueue_percent,omitempty"`

	// Deprecated in 21.1.1. Internal buffer full indicator on the Service Engine beyond which the user filtered logs are abandoned. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpLogUdfEnqueuePercent *int32 `json:"se_dp_log_udf_enqueue_percent,omitempty"`

	// Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpVnicQueueStallEventSleep *int32 `json:"se_dp_vnic_queue_stall_event_sleep,omitempty"`

	// Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpVnicQueueStallThreshold *int32 `json:"se_dp_vnic_queue_stall_threshold,omitempty"`

	// Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpVnicQueueStallTimeout *int32 `json:"se_dp_vnic_queue_stall_timeout,omitempty"`

	// Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.14, 17.2.5, 18.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpVnicRestartOnQueueStallCount *int32 `json:"se_dp_vnic_restart_on_queue_stall_count,omitempty"`

	// Deprecated. Field deprecated in 18.2.5. Field introduced in 17.1.14, 17.2.5, 18.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDpVnicStallSeRestartWindow *int32 `json:"se_dp_vnic_stall_se_restart_window,omitempty"`

	// Deprecated in 21.1.3. Use config in ServiceEngineGroup instead. Field introduced in 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeDumpCoreOnAssert *bool `json:"se_dump_core_on_assert,omitempty"`

	// Accept/ignore interface routes (i.e, no next hop IP address). Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeHandleInterfaceRoutes *bool `json:"se_handle_interface_routes,omitempty"`

	// Internal use only. Allowed values are 0-7. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeHbPersistFudgeBits *int32 `json:"se_hb_persist_fudge_bits,omitempty"`

	// Number of packets with wrong mac after which SE attempts to disable promiscious mode. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeMacErrorThresholdToDisablePromiscious *int32 `json:"se_mac_error_threshold_to_disable_promiscious,omitempty"`

	// Deprecated. Field deprecated in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeMallocThresh *int32 `json:"se_malloc_thresh,omitempty"`

	// Internal use only. Enables poisoning of freed memory blocks. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeMemoryPoison *bool `json:"se_memory_poison,omitempty"`

	// Internal use only. Frequency (ms) of metrics updates from SE to controller. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials(Allowed values- 60000) edition, Basic(Allowed values- 60000) edition, Enterprise with Cloud Services edition.
	SeMetricsInterval *int32 `json:"se_metrics_interval,omitempty"`

	// Internal use only. Enable or disable real time metrics irrespective of virtualservice or SE group configuration. Allowed in Enterprise with any value edition, Essentials(Allowed values- false) edition, Basic(Allowed values- false) edition, Enterprise with Cloud Services edition. Special default for Essentials edition is false, Basic edition is false, Enterprise is True.
	SeMetricsRtEnabled *bool `json:"se_metrics_rt_enabled,omitempty"`

	// Internal use only. Frequency (ms) of realtime metrics updates from SE to controller. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeMetricsRtInterval *int32 `json:"se_metrics_rt_interval,omitempty"`

	// Deprecated in 21.1.3. Use config in ServiceEngineGroup instead. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SePacketBufferMax *int32 `json:"se_packet_buffer_max,omitempty"`

	// Internal use only. If enabled, randomly packets are dropped. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeRandomTCPDrops *bool `json:"se_random_tcp_drops,omitempty"`

	// SE rate limiters. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	SeRateLimiters *SeRateLimiters `json:"se_rate_limiters,omitempty"`

	// IP ranges on which there may be virtual services (for configuring iptables/routes). Maximum of 128 items allowed. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ServiceIPSubnets []*IPAddrPrefix `json:"service_ip_subnets,omitempty"`

	// Port ranges on which there may be virtual services (for configuring iptables). Applicable in container ecosystems like Mesos. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ServicePortRanges []*PortRange `json:"service_port_ranges,omitempty"`

	// Make service ports accessible on all Host interfaces in addition to East-West VIP and/or bridge IP. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ServicesAccessibleAllInterfaces *bool `json:"services_accessible_all_interfaces,omitempty"`

	//  Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SpdyFwdProxyParseEnable *bool `json:"spdy_fwd_proxy_parse_enable,omitempty"`

	// Maximum size of the SYN cache table. After this limit is reached, SYN cookies are used. This is per core of the serviceengine. Field deprecated in 17.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TCPSynCacheMax *int32 `json:"tcp_syn_cache_max,omitempty"`

	// Default value for max number of retransmissions for a SYN packet. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TCPSyncacheMaxRetransmitDefault *int32 `json:"tcp_syncache_max_retransmit_default,omitempty"`

	// Timeout for backend connection. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnectTimeout *int32 `json:"upstream_connect_timeout,omitempty"`

	// L7 Upstream Connection pool cache threshold in percentage. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolCacheThresh *int32 `json:"upstream_connpool_cache_thresh,omitempty"`

	// Idle timeout value for a connection in the upstream connection pool, when the current cache size is above the threshold. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolConnIDLEThreshTmo *int32 `json:"upstream_connpool_conn_idle_thresh_tmo,omitempty"`

	// Deprecated. Field deprecated in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolConnIDLETmo *int32 `json:"upstream_connpool_conn_idle_tmo,omitempty"`

	// Deprecated. Field deprecated in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolConnLifeTmo *int32 `json:"upstream_connpool_conn_life_tmo,omitempty"`

	// Deprecated. Field deprecated in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolConnMaxReuse *int32 `json:"upstream_connpool_conn_max_reuse,omitempty"`

	// L7 Upstream Connection pool max cache size per core. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolCoreMaxCache *int32 `json:"upstream_connpool_core_max_cache,omitempty"`

	// Enable upstream connection pool. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolEnable *bool `json:"upstream_connpool_enable,omitempty"`

	// Deprecated. Field deprecated in 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolServerMaxCache *int32 `json:"upstream_connpool_server_max_cache,omitempty"`

	// Deprecated in 21.1.1, set in application profile. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamConnpoolStrategy *int32 `json:"upstream_connpool_strategy,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamKeepalive *bool `json:"upstream_keepalive,omitempty"`

	// Timeout for data to be received from backend. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UpstreamReadTimeout *int32 `json:"upstream_read_timeout,omitempty"`

	// Timeout for upstream to become writable. Unit is MILLISECONDS. Allowed in Enterprise with any value edition, Essentials(Allowed values- 3600000) edition, Basic(Allowed values- 3600000) edition, Enterprise with Cloud Services edition.
	UpstreamSendTimeout *int32 `json:"upstream_send_timeout,omitempty"`

	// Defines in seconds how long before an unused user-defined-metric is garbage collected. Field introduced in 17.1.5. Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UserDefinedMetricAge *int32 `json:"user_defined_metric_age,omitempty"`
}
