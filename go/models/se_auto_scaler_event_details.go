// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAutoScalerEventDetails se auto scaler event details
// swagger:model SeAutoScalerEventDetails
type SeAutoScalerEventDetails struct {

	// Actions generated for the request. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Actions []*VipAction `json:"actions,omitempty"`

	// Source of the rebalance request i.e SE autoscaler auto rebalance, SE autoscaler user manual rebalance etc. Enum options - SE_AUTOSCALER_AUTO_REBALANCE, SE_AUTOSCALER_USER_MANUAL_REBALANCE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	RequestSource *string `json:"request_source"`

	// SeGroup Uuid. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	SeGroupUUID *string `json:"se_group_uuid"`
}
