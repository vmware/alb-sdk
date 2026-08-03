// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentResolvDBRuntimeSummary se agent resolv d b runtime summary
// swagger:model SeAgentResolvDBRuntimeSummary
type SeAgentResolvDBRuntimeSummary struct {

	// Resolve the fqdns on SE. Field introduced in 20.1.5, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSResolutionOnSe *bool `json:"dns_resolution_on_se,omitempty"`

	// FQDN Summary. Field introduced in 20.1.5, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fqdns []*SeAgentFQDNSummary `json:"fqdns,omitempty"`

	// Resolve the Gslb Service group/pool member FQDNs on SE. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GsMemberFqdnResolutionOnSe *bool `json:"gs_member_fqdn_resolution_on_se,omitempty"`

	// Total number of fqdns. Field introduced in 20.1.5, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFqdns *uint32 `json:"num_fqdns,omitempty"`

	// Number of fqdns for which DNS resolution failed. Field introduced in 20.1.5, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFqdnsErr *uint32 `json:"num_fqdns_err,omitempty"`

	// Number of fqdns resolved to ips. Field introduced in 20.1.5, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFqdnsResolved *uint32 `json:"num_fqdns_resolved,omitempty"`

	// Resolver Info. Field introduced in 20.1.5, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resolvers []*SeAgentResolvInfo `json:"resolvers,omitempty"`

	// SE UUID. It is a reference to an object of type ServiceEngine. Field introduced in 20.1.5, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
