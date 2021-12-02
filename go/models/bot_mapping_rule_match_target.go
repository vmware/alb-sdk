// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotMappingRuleMatchTarget bot mapping rule match target
// swagger:model BotMappingRuleMatchTarget
type BotMappingRuleMatchTarget struct {

	// How to match the BotClientClass. Field introduced in 21.1.3.
	ClassMatcher *BotClassMatcher `json:"class_matcher,omitempty"`

	// Configure client ip addresses. Field introduced in 21.1.3.
	ClientIP *IPAddrMatch `json:"client_ip,omitempty"`

	// The component for which this mapping is used. Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION. Field introduced in 21.1.3.
	ComponentMatcher *string `json:"component_matcher,omitempty"`

	// Configure HTTP header(s). All configured headers must match. Field introduced in 21.1.3.
	Hdrs []*HdrMatch `json:"hdrs,omitempty"`

	// Configure the host header. Field introduced in 21.1.3.
	HostHdr *HostHdrMatch `json:"host_hdr,omitempty"`

	// The list of bot identifier names and how they're matched. Field introduced in 21.1.3.
	IdentifierMatcher *StringMatch `json:"identifier_matcher,omitempty"`

	// Configure HTTP methods. Field introduced in 21.1.3.
	Method *MethodMatch `json:"method,omitempty"`

	// Configure request paths. Field introduced in 21.1.3.
	Path *PathMatch `json:"path,omitempty"`

	// How to match the BotClientType. Field introduced in 21.1.3.
	TypeMatcher *BotTypeMatcher `json:"type_matcher,omitempty"`
}
