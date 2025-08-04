// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VipAction vip action
// swagger:model VipAction
type VipAction struct {

	//  Enum options - PLACEMENT_ORCHESTRATOR_VIP_MIGRATE, PLACEMENT_ORCHESTRATOR_VIP_SCALEOUT, PLACEMENT_ORCHESTRATOR_VIP_SCALEIN, PLACEMENT_ORCHESTRATOR_VIP_FORCE_SCALEIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Action *string `json:"action,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FromSe *string `json:"from_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NewVcpus *uint32 `json:"new_vcpus,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeList []string `json:"se_list,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timestamp *int64 `json:"timestamp,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToNewSe *bool `json:"to_new_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ToSe *string `json:"to_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipID *string `json:"vip_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipUUID *string `json:"vip_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WaitingForSibling *bool `json:"waiting_for_sibling,omitempty"`
}
