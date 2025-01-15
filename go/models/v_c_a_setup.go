// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VCASetup v c a setup
// swagger:model VCASetup
type VCASetup struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CcID *string `json:"cc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Instance *string `json:"instance"`

	//  Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Privilege *string `json:"privilege,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Username *string `json:"username,omitempty"`
}
