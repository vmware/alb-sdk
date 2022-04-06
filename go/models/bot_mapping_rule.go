// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotMappingRule bot mapping rule
// swagger:model BotMappingRule
type BotMappingRule struct {

	// How to match the BotClientClass. Field deprecated in 21.1.3. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ClassMatcher *BotClassMatcher `json:"class_matcher,omitempty"`

	// The assigned classification for this client. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	// Required: true
	Classification *BotClassification `json:"classification"`

	// The component for which this mapping is used. Enum options - BOT_DECIDER_CONSOLIDATION, BOT_DECIDER_USER_AGENT, BOT_DECIDER_IP_REPUTATION, BOT_DECIDER_IP_NETWORK_LOCATION. Field deprecated in 21.1.3. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ComponentMatcher *string `json:"component_matcher,omitempty"`

	// The list of bot identifier names and how they're matched. Field deprecated in 21.1.3. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	IdentifierMatcher *StringMatch `json:"identifier_matcher,omitempty"`

	// Rules are processed in order of this index field. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	// Required: true
	Index *int32 `json:"index"`

	// How to match the request  all the specified properties must be fulfilled. Field introduced in 21.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	// Required: true
	Match *BotMappingRuleMatchTarget `json:"match"`

	// A name describing the rule in a short form. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// How to match the BotClientType. Field deprecated in 21.1.3. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	TypeMatcher *BotTypeMatcher `json:"type_matcher,omitempty"`
}
