// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceRuntimeDetail virtual service runtime detail
// swagger:model VirtualServiceRuntimeDetail
type VirtualServiceRuntimeDetail struct {

	// SAML Authentication rules stats. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthnPolicyStats *AuthNPolicyStats `json:"authn_policy_stats,omitempty"`

	// SAML Authorization rules stats. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthzPolicyStats *AuthZPolicyStats `json:"authz_policy_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigStatus *ConfigurationStatus `json:"config_status,omitempty"`

	// Datascript counters. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DatascriptCounters *DatascriptCounters `json:"datascript_counters,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSStats []*VserverDNSStats `json:"dns_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EastWest *bool `json:"east_west,omitempty"`

	// HTTP2 related stats. Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fel7http2stats []*VserverL7Http2Stats `json:"fel7http2stats,omitempty"`

	// L4SSL related stats. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4sslstats []*VserverL4SSLStats `json:"l4sslstats,omitempty"`

	// Microservice representing the virtual service. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MicroserviceUUID *string `json:"microservice_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OnePlusOneHa *bool `json:"one_plus_one_ha,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Enum options - VS_TYPE_NORMAL, VS_TYPE_VH_PARENT, VS_TYPE_VH_CHILD. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	//  It is a reference to an object of type VirtualService. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  It is a reference to an object of type VirtualService. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VhChildVsRef []string `json:"vh_child_vs_ref,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipDetail []*VipRuntimeDetail `json:"vip_detail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualServiceAuthStats []*VirtualServiceAuthStats `json:"virtual_service_auth_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsType *string `json:"vs_type,omitempty"`
}
