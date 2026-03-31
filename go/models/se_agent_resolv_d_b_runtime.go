// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentResolvDBRuntime se agent resolv d b runtime
// swagger:model SeAgentResolvDBRuntime
type SeAgentResolvDBRuntime struct {

	// Resolve the fqdns on SE. Field introduced in 20.1.5, 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSResolutionOnSe *bool `json:"dns_resolution_on_se,omitempty"`

	// FQDN Info. Field introduced in 20.1.5, 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fqdns []*SeAgentFQDNInfo `json:"fqdns,omitempty"`

	// Resolve the Gslb Service group/pool member FQDNs on SE. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GsMemberFqdnResolutionOnSe *bool `json:"gs_member_fqdn_resolution_on_se,omitempty"`

	// Total number of fqdns. Field introduced in 20.1.5, 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFqdns *uint32 `json:"num_fqdns,omitempty"`

	// Number of fqdns failed to get ips. Field introduced in 20.1.5, 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFqdnsErr *uint32 `json:"num_fqdns_err,omitempty"`

	// Number of fqdns resolved to ips. Field introduced in 20.1.5, 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFqdnsResolved *uint32 `json:"num_fqdns_resolved,omitempty"`

	// ResolverInfo. Field introduced in 20.1.5, 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Resolvers []*SeAgentResolvInfo `json:"resolvers,omitempty"`

	// SE UUID. It is a reference to an object of type ServiceEngine. Field introduced in 20.1.5, 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
