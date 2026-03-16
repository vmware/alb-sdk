// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CltrackInternalMetricsEntry cltrack internal metrics entry
// swagger:model CltrackInternalMetricsEntry
type CltrackInternalMetricsEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Bandwidth *uint64 `json:"bandwidth,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientEnd2endLatency *uint64 `json:"client_end2end_latency,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompleteResponses *uint64 `json:"complete_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CompletedConns *uint64 `json:"completed_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DroppedConns *uint64 `json:"dropped_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorResponses *uint64 `json:"error_responses,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPTimeout *uint64 `json:"http_timeout,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewConns *uint64 `json:"new_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PolicyDrops *uint64 `json:"policy_drops,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalRequests *uint64 `json:"total_requests,omitempty"`
}
