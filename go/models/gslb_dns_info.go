// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbDNSInfo gslb Dns info
// swagger:model GslbDnsInfo
type GslbDNSInfo struct {

	// This field indicates that atleast one DNS is active at the site. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DNSActive *bool `json:"dns_active,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DNSVsStates []*GslbPerDNSState `json:"dns_vs_states,omitempty"`

	// This field encapsulates the Gs-status edge-triggered framework. . Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GsStatus *GslbDNSGsStatus `json:"gs_status,omitempty"`

	// This field is used to track the retry attempts for SE download errors. . Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RetryCount *int32 `json:"retry_count,omitempty"`

	// This tables holds all the se-related info across all DNS-VS(es). . Field deprecated in 18.2.3. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeTable []*GslbDNSSeInfo `json:"se_table,omitempty"`
}
