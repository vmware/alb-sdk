// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkSecurityRule network security rule
// swagger:model NetworkSecurityRule
type NetworkSecurityRule struct {

	//  Enum options - NETWORK_SECURITY_POLICY_ACTION_TYPE_ALLOW, NETWORK_SECURITY_POLICY_ACTION_TYPE_DENY, NETWORK_SECURITY_POLICY_ACTION_TYPE_RATE_LIMIT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- NETWORK_SECURITY_POLICY_ACTION_TYPE_DENY), Basic (Allowed values- NETWORK_SECURITY_POLICY_ACTION_TYPE_DENY) edition.
	// Required: true
	Action *string `json:"action"`

	// Time in minutes after which rule will be deleted. Allowed values are 1-4294967295. Special values are 0- blocked for ever. Unit is MIN. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- 0), Basic (Allowed values- 0) edition.
	Age *uint32 `json:"age,omitempty"`

	// Creator name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreatedBy *string `json:"created_by,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Enable *bool `json:"enable"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Index *uint32 `json:"index"`

	//  Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	Log *bool `json:"log,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Match *NetworkSecurityMatchTarget `json:"match"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RlParam *NetworkSecurityPolicyActionRLParam `json:"rl_param,omitempty"`
}
