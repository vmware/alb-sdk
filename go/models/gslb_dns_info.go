// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbDNSInfo gslb Dns info
// swagger:model GslbDnsInfo
type GslbDNSInfo struct {

	// This field indicates that atleast one DNS is active at the site. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSActive *bool `json:"dns_active,omitempty"`

	// This field tracks the service engine resource hosting the DNS virtual service. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSSeResource *SeResources `json:"dns_se_resource,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSVsStates []*GslbPerDNSState `json:"dns_vs_states,omitempty"`
}
