// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeHmEventGslbPoolDetails se hm event gslb pool details
// swagger:model SeHmEventGslbPoolDetails
type SeHmEventGslbPoolDetails struct {

	// GslbService Pool name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Gsgroup *string `json:"gsgroup,omitempty"`

	// Gslb service name. It is a reference to an object of type GslbService. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GslbService *string `json:"gslb_service,omitempty"`

	// GslbService member details. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Gsmember *SeHmEventGslbPoolMemberDetails `json:"gsmember,omitempty"`

	// HA Compromised reason. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	HaReason *string `json:"ha_reason,omitempty"`

	// Service Engine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeName *string `json:"se_name,omitempty"`

	// UUID of the event generator. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SrcUUID *string `json:"src_uuid,omitempty"`
}
