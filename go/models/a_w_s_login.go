// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AWSLogin a w s login
// swagger:model AWSLogin
type AWSLogin struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccessKeyID *string `json:"access_key_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IamAssumeRole *string `json:"iam_assume_role,omitempty"`

	// AWS region. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Region *string `json:"region,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecretAccessKey *string `json:"secret_access_key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseIamRoles *bool `json:"use_iam_roles,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VpcID *string `json:"vpc_id,omitempty"`
}
