// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MatchTarget match target
// swagger:model MatchTarget
type MatchTarget struct {

	// Configure the bot classification result. Field introduced in 21.1.1.
	BotDetectionResult *BotDetectionMatch `json:"bot_detection_result,omitempty"`

	// Configure client ip addresses.
	ClientIP *IPAddrMatch `json:"client_ip,omitempty"`

	// Configure HTTP cookie(s).
	Cookie *CookieMatch `json:"cookie,omitempty"`

	// Configure the geo information. Field introduced in 21.1.1. Maximum of 1 items allowed.
	GeoMatches []*GeoMatch `json:"geo_matches,omitempty"`

	// Configure HTTP header(s). All configured headers must match.
	Hdrs []*HdrMatch `json:"hdrs,omitempty"`

	// Configure the host header.
	HostHdr *HostHdrMatch `json:"host_hdr,omitempty"`

	// Configure IP reputation. Field introduced in 20.1.3.
	IPReputationType *IPReputationTypeMatch `json:"ip_reputation_type,omitempty"`

	// Configure HTTP methods.
	Method *MethodMatch `json:"method,omitempty"`

	// Configure request paths.
	Path *PathMatch `json:"path,omitempty"`

	// Configure the type of HTTP protocol.
	Protocol *ProtocolMatch `json:"protocol,omitempty"`

	// Configure request query.
	Query *QueryMatch `json:"query,omitempty"`

	// Configure source ip addresses. Field introduced in 21.1.3.
	SourceIP *IPAddrMatch `json:"source_ip,omitempty"`

	// Configure versions of the HTTP protocol.
	Version *HTTPVersionMatch `json:"version,omitempty"`

	// Configure virtual service ports.
	VsPort *PortMatch `json:"vs_port,omitempty"`
}
