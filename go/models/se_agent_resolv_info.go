// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentResolvInfo se agent resolv info
// swagger:model SeAgentResolvInfo
type SeAgentResolvInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NameserverIps []*IPAddr `json:"nameserver_ips,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResolverName *string `json:"resolver_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalFqdns *uint32 `json:"total_fqdns,omitempty"`
}
