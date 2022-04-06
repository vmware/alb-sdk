// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotConfigUserAgent bot config user agent
// swagger:model BotConfigUserAgent
type BotConfigUserAgent struct {

	// Whether User Agent-based Bot detection is enabled. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`
}
