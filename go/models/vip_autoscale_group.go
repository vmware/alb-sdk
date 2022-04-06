// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VipAutoscaleGroup vip autoscale group
// swagger:model VipAutoscaleGroup
type VipAutoscaleGroup struct {

	//  Field introduced in 17.2.12, 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Configuration *VipAutoscaleConfiguration `json:"configuration,omitempty"`

	//  Field introduced in 17.2.12, 18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Policy *VipAutoscalePolicy `json:"policy,omitempty"`
}
