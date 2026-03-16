// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RouteProtoStats route proto stats
// swagger:model RouteProtoStats
type RouteProtoStats struct {

	// Total number of occurences where non-syn packets were seen from the end pointafter the RST packet. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFakeRstPkts *uint64 `json:"num_fake_rst_pkts,omitempty"`

	// Total number of flow creation failures. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowCreationFailures *uint64 `json:"num_flow_creation_failures,omitempty"`

	// Number of flows. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlows *uint64 `json:"num_flows,omitempty"`

	// Total number of TCP flows timedout/terminated in closed state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsFinishedInClosed *uint64 `json:"num_flows_finished_in_closed,omitempty"`

	// Total number of TCP flows timedout/terminated in established state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsFinishedInEstablished *uint64 `json:"num_flows_finished_in_established,omitempty"`

	// Total number of TCP flows timedout/terminated in half_closed state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsFinishedInHalfClosed *uint64 `json:"num_flows_finished_in_half_closed,omitempty"`

	// Total number of UDP flows closed in noresponse state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsFinishedInNoresponse *uint64 `json:"num_flows_finished_in_noresponse,omitempty"`

	// Total number of TCP flows timedout/terminated in reset state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsFinishedInReset *uint64 `json:"num_flows_finished_in_reset,omitempty"`

	// Total number of UDP flows closed in response state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsFinishedInResponse *uint64 `json:"num_flows_finished_in_response,omitempty"`

	// Total number of TCP flows timedout/terminated in setup state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsFinishedInSetup *uint64 `json:"num_flows_finished_in_setup,omitempty"`

	// Total number of TCP flows where FIN is seen from both the endpoints. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsInClosed *uint64 `json:"num_flows_in_closed,omitempty"`

	// Total number of TCP flows where both SYN and SYN+ACK are seen. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsInEstablished *uint64 `json:"num_flows_in_established,omitempty"`

	// Total number of TCP flows where FIN from one endpoint is seen. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsInHalfClosed *uint64 `json:"num_flows_in_half_closed,omitempty"`

	// Total number of UDP flows in noresponse state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsInNoresponse *uint64 `json:"num_flows_in_noresponse,omitempty"`

	// Total number of TCP flows where reset is seen. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsInReset *uint64 `json:"num_flows_in_reset,omitempty"`

	// Total number of UDP flows in response state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsInResponse *uint64 `json:"num_flows_in_response,omitempty"`

	// Total number of TCP flows where SYN is seen but not SYN+ACK. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFlowsInSetup *uint64 `json:"num_flows_in_setup,omitempty"`

	// Total number of incorrect nat flow state transitions. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumInvalidTransitions *uint64 `json:"num_invalid_transitions,omitempty"`

	// Total number of NAT flows failed for no free port. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLportFailures *uint64 `json:"num_lport_failures,omitempty"`

	// Total number of NAT flows failed for no free natip. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumNatipFailures *uint64 `json:"num_natip_failures,omitempty"`

	// Total number of TCP non syn pkts that did not match any flow. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumNonSynPktDrops *uint64 `json:"num_non_syn_pkt_drops,omitempty"`

	// Total number of packets dropped. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPktDrops *uint64 `json:"num_pkt_drops,omitempty"`

	// Total number of route lookup failures. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRouteLookupFailures *uint64 `json:"num_route_lookup_failures,omitempty"`

	// Total number of bytes received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRxBytes *uint64 `json:"num_rx_bytes,omitempty"`

	// Total number of packets received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumRxPkts *uint64 `json:"num_rx_pkts,omitempty"`

	// Total number of bytes sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTxBytes *uint64 `json:"num_tx_bytes,omitempty"`

	// Total number of bytes sent. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTxPkts *uint64 `json:"num_tx_pkts,omitempty"`

	// Total number of unexpected packets received. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumUnexpectedPkts *uint64 `json:"num_unexpected_pkts,omitempty"`
}
