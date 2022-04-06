// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RmRebootSeEventDetails rm reboot se event details
// swagger:model RmRebootSeEventDetails
type RmRebootSeEventDetails struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeName *string `json:"se_name,omitempty"`
}
