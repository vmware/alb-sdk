// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MiscStats misc stats
// swagger:model MiscStats
type MiscStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AvgMinmssTooLowDrops *uint64 `json:"avg_minmss_too_low_drops"`

	//  Field introduced in 17.1.6,17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnWithHighRtt *uint64 `json:"conn_with_high_rtt"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ConnectionsUsingAutoGateway *uint64 `json:"connections_using_auto_gateway"`

	// Connections for which auto gateway was reset. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionsWithAutoGatewayReset *uint64 `json:"connections_with_auto_gateway_reset,omitempty"`

	// Connections for which resetting the auto gateway failed. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectionsWithFailedAutoGatewayReset *uint64 `json:"connections_with_failed_auto_gateway_reset,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	EntryAddedToHostcache *uint64 `json:"entry_added_to_hostcache"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	HostcacheBucketOverflow *uint64 `json:"hostcache_bucket_overflow"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MbufFailures *uint64 `json:"mbuf_failures"`

	// Candidates for Connection mirroring on Active. Field introduced in 18.1.3,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MirrorConnListOnActive *uint64 `json:"mirror_conn_list_on_active,omitempty"`

	// Mirrored Connections on Standby. Field introduced in 18.1.3,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MirroredConnectionsOnStandby *uint64 `json:"mirrored_connections_on_standby,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MismatchingSignatureReceived *uint64 `json:"mismatching_signature_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NoSignatureExpectedBySegment *uint64 `json:"no_signature_expected_by_segment"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NoSignatureExpectedBySocket *uint64 `json:"no_signature_expected_by_socket"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ResendsDueToMtuDiscovery *uint64 `json:"resends_due_to_mtu_discovery"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RttAttempts *uint64 `json:"rtt_attempts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RttUpdated *uint64 `json:"rtt_updated"`

	//  Field introduced in 17.1.9,17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TCPTimestampOptionMissing *uint64 `json:"tcp_timestamp_option_missing,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TcpsPcbcachemiss *uint64 `json:"tcps_pcbcachemiss"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesCachedRttInRouteUpdated *uint64 `json:"times_cached_rtt_in_route_updated"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesCachedRttvarInRouteUpdated *uint64 `json:"times_cached_rttvar_in_route_updated"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesCachedSsthreshUpdated *uint64 `json:"times_cached_ssthresh_updated"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesHdrPredictOkForAcks *uint64 `json:"times_hdr_predict_ok_for_acks"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesHdrPredictOkForDataPkts *uint64 `json:"times_hdr_predict_ok_for_data_pkts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesRttInitializedFromRoute *uint64 `json:"times_rtt_initialized_from_route"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesRttvarInitializedFromRoute *uint64 `json:"times_rttvar_initialized_from_route"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TimesSsthreshInitializedFromRoute *uint64 `json:"times_ssthresh_initialized_from_route"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TotalBadSignatureReceived *uint64 `json:"total_bad_signature_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TotalMatchingSignatureReceived *uint64 `json:"total_matching_signature_received"`
}
