// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AutoScaleMgrDebugFilter auto scale mgr debug filter
// swagger:model AutoScaleMgrDebugFilter
type AutoScaleMgrDebugFilter struct {

	// Enable aws autoscale integration. This is an alpha feature. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	EnableAwsAutoscaleIntegration *bool `json:"enable_aws_autoscale_integration,omitempty"`

	// period of running intelligent autoscale check. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IntelligentAutoscalePeriod *int32 `json:"intelligent_autoscale_period,omitempty"`

	// uuid of the Pool. It is a reference to an object of type Pool. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PoolRef *string `json:"pool_ref,omitempty"`
}
