// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AWSSetup a w s setup
// swagger:model AWSSetup
type AWSSetup struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccessKeyID *string `json:"access_key_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CcID *string `json:"cc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrorString *string `json:"error_string,omitempty"`

	//  Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Privilege *string `json:"privilege,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Region *string `json:"region"`

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VpcID *string `json:"vpc_id,omitempty"`
}
