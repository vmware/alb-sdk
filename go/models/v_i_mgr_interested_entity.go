// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIMgrInterestedEntity v i mgr interested entity
// swagger:model VIMgrInterestedEntity
type VIMgrInterestedEntity struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	InterestedUUID *string `json:"interested_uuid"`
}
