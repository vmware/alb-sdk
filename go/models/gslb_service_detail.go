// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbServiceDetail gslb service detail
// swagger:model GslbServiceDetail
type GslbServiceDetail struct {

	// Fully qualified domain name of the GSLB service. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DomainNames []string `json:"domain_names,omitempty"`

	// Select list of pools belonging to this GSLB service. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GroupsDetail []*GslbPoolDetail `json:"groups_detail,omitempty"`

	// Internal field to depict if HM sharding is enabled for this GSLB service. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HmOff *bool `json:"hm_off,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastDpOperState *OperationalStatus `json:"last_dp_oper_state,omitempty"`

	// Name for the GSLB service. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Number of IP addresses of this GSLB service to be returned by the DNS Service. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDNSIP *uint32 `json:"num_dns_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// TTL value for A records for this GSLB service served by the DNS Service. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TTL *uint32 `json:"ttl,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// VRF Id. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfID *uint32 `json:"vrf_id,omitempty"`
}
