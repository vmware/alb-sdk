// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SecurityMgrDebugFilter security mgr debug filter
// swagger:model SecurityMgrDebugFilter
type SecurityMgrDebugFilter struct {

	// HTTP methods to accumulate for consolidated learning (e.g., GET, POST, PUT). If empty, all methods are accumulated. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AccumulateHTTPMethods []string `json:"accumulate_http_methods,omitempty"`

	// Dynamically adapt configuration parameters for Application Learning feature. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableAdaptiveConfig *bool `json:"enable_adaptive_config,omitempty"`

	// uuid of the entity. It is a reference to an object of type Virtualservice. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntityRef *string `json:"entity_ref,omitempty"`

	// Dynamically update the interval for rule generation in PSM programming. Allowed values are 1-60. Field introduced in 31.2.1. Unit is MIN. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PsmProgrammingInterval *uint32 `json:"psm_programming_interval,omitempty"`

	// Dynamically update the multiplier for rule ID generation in PSM programming for Learning feature. Allowed values are 10-100000. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PsmRuleIDMultiplier *uint32 `json:"psm_rule_id_multiplier,omitempty"`
}
