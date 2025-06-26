// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiameterServiceApplicationProfile diameter service application profile
// swagger:model DiameterServiceApplicationProfile
type DiameterServiceApplicationProfile struct {

	// Origin-Host AVP towards client. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientOriginHost *string `json:"client_origin_host,omitempty"`

	// Origin-Realm AVP towards client. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientOriginRealm *string `json:"client_origin_realm,omitempty"`

	// Rwrite Host-IP-Address AVP. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HostIPAddrRewrite *bool `json:"host_ip_addr_rewrite,omitempty"`

	// Max number of outstanding request waiting for response. Allowed values are 1-1048576. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxOutstandingReq *uint32 `json:"max_outstanding_req,omitempty"`

	// Response waiting time for the request sent. Allowed values are 1-1800. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ReqTimeout *uint32 `json:"req_timeout,omitempty"`

	// Origin-Host AVP towards server. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ServerOriginHost *string `json:"server_origin_host,omitempty"`

	// Origin-Realm AVP towards server. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ServerOriginRealm *string `json:"server_origin_realm,omitempty"`
}
