// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserAgentDBConfig user agent d b config
// swagger:model UserAgentDBConfig
type UserAgentDBConfig struct {

	// Batch query limit. Allowed values are 1-500. Field introduced in 21.1.1. Allowed in Basic(Allowed values- 500) edition, Essentials(Allowed values- 500) edition, Enterprise edition.
	AllowedBatchSize *int32 `json:"allowed_batch_size,omitempty"`

	// Service category. Enum options - ALB_THREAT_INTELLIGENCE_CATEGORY, ALB_SUPPORT_CATEGORY, ALB_LICENSE_CATEGORY. Field introduced in 21.1.3.
	Category *string `json:"category,omitempty"`
}
