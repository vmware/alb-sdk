// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolDeploymentUpdateInfo pool deployment update info
// swagger:model PoolDeploymentUpdateInfo
type PoolDeploymentUpdateInfo struct {

	// Pool deployment state used with the PG deployment policy. Enum options - EVALUATION_IN_PROGRESS, IN_SERVICE, OUT_OF_SERVICE, EVALUATION_FAILED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DeploymentState *string `json:"deployment_state,omitempty"`

	// Evaluation period for deployment update. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EvaluationDuration *uint32 `json:"evaluation_duration,omitempty"`

	// Operational traffic ratio for the pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ratio *uint32 `json:"ratio,omitempty"`

	// List of results for each deployment rule. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*PGDeploymentRuleResult `json:"results,omitempty"`

	// Member Pool's ID. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Reason returned in webhook callback when configured. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WebhookReason *string `json:"webhook_reason,omitempty"`

	// Result of webhook callback when configured. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WebhookResult *bool `json:"webhook_result,omitempty"`
}
