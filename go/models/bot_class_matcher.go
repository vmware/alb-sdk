// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotClassMatcher bot class matcher
// swagger:model BotClassMatcher
type BotClassMatcher struct {

	// The list of client classes. Enum options - HUMAN_CLIENT, BOT_CLIENT. Field introduced in 21.1.1.
	ClientClasses []string `json:"client_classes,omitempty"`

	// The match operation. Enum options - IS_IN, IS_NOT_IN. Field introduced in 21.1.1.
	Op *string `json:"op,omitempty"`
}
