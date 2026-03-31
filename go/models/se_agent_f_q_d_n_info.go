// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentFQDNInfo se agent f q d n info
// swagger:model SeAgentFQDNInfo
type SeAgentFQDNInfo struct {

	// Number of times FQDN failed to resolve after last failed resolution. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentErrorCount *uint64 `json:"current_error_count,omitempty"`

	// Number of times duplicate IP was detected during GSLB Service member IP updates. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DuplicateIPDetected *uint64 `json:"duplicate_ip_detected,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrResponse *string `json:"err_response,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fqdn *string `json:"fqdn,omitempty"`

	// CPU core id performing the DNS resolution. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HelperCore *uint32 `json:"helper_core,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ips []*IPAddr `json:"ips,omitempty"`

	// Time stamp of second last successful resolution of the FQDN. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastLastResolvedTime *string `json:"last_last_resolved_time,omitempty"`

	// Update time stamp of the second last update of the FQDN IP. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastLastUpdatedTime *string `json:"last_last_updated_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastResolvedTime *string `json:"last_resolved_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdatedTime *string `json:"last_updated_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjUuids []string `json:"obj_uuids,omitempty"`

	// Number of times FQDN failed to resolve before last successful resolution. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PreviousErrorCount *uint64 `json:"previous_error_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resolved *bool `json:"resolved,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Stats *FQDnstats `json:"stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TTL *uint32 `json:"ttl,omitempty"`
}
