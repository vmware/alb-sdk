// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VIGuestvNicIPAddr v i guestv nic IP addr
// swagger:model VIGuestvNicIPAddr
type VIGuestvNicIPAddr struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	IPAddr *string `json:"ip_addr"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Mask *int32 `json:"mask"`
}
