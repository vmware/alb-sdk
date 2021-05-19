// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotMappingRule bot mapping rule
// swagger:model BotMappingRule
type BotMappingRule struct {

	// How to match the BotClientClass. Field introduced in 21.1.1.
	ClassMatcher *BotClassMatcher `json:"class_matcher,omitempty"`

	// The assigned classification for this client. Field introduced in 21.1.1.
	// Required: true
	Classification *BotClassification `json:"classification"`

	// The component for which this mapping is used. Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION. Field introduced in 21.1.1.
	// Required: true
	ComponentMatcher *string `json:"component_matcher"`

	// The list of bot identifier names and how they're matched. Field introduced in 21.1.1.
	IdentifierMatcher *StringMatch `json:"identifier_matcher,omitempty"`

	// Rules are processed in order of this index field. Field introduced in 21.1.1.
	// Required: true
	Index *int32 `json:"index"`

	// A name describing the rule in a short form. Field introduced in 21.1.1.
	Name *string `json:"name,omitempty"`

	// How to match the BotClientType. Field introduced in 21.1.1.
	TypeMatcher *BotTypeMatcher `json:"type_matcher,omitempty"`
}
