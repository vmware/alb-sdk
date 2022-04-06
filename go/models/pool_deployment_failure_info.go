// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolDeploymentFailureInfo pool deployment failure info
// swagger:model PoolDeploymentFailureInfo
type PoolDeploymentFailureInfo struct {

	// Curent in-service pool. It is a reference to an object of type Pool. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CurrInServicePoolName *string `json:"curr_in_service_pool_name,omitempty"`

	// Curent in service pool. It is a reference to an object of type Pool. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CurrInServicePoolRef *string `json:"curr_in_service_pool_ref,omitempty"`

	// Operational traffic ratio for the pool. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Ratio *int32 `json:"ratio,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Results []*PGDeploymentRuleResult `json:"results,omitempty"`

	// Pool's ID. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Reason returned in webhook callback when configured. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	WebhookReason *string `json:"webhook_reason,omitempty"`

	// Result of webhook callback when configured. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	WebhookResult *bool `json:"webhook_result,omitempty"`
}
