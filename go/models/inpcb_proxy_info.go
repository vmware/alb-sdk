// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// InpcbProxyInfo inpcb proxy info
// swagger:model InpcbProxyInfo
type InpcbProxyInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpProxyIPMinttl *uint32 `json:"inp_proxy_ip_minttl,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpProxyIPp *uint32 `json:"inp_proxy_ip_p,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpProxyIPTos *uint32 `json:"inp_proxy_ip_tos,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InpProxyIPTTL *uint32 `json:"inp_proxy_ip_ttl,omitempty"`
}
