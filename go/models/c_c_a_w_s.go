// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CCAWS c c a w s
// swagger:model CC_AWS
type CCAWS struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccessErr *string `json:"access_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccountAlias *string `json:"account_alias,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccountID *string `json:"account_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AsgconnErr *string `json:"asgconn_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cfg *AwsConfiguration `json:"cfg,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GcCc *CCCron `json:"gc_cc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HtokenExpiry *string `json:"htoken_expiry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IamRole *string `json:"iam_role,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IamUser *string `json:"iam_user,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNwErr *string `json:"mgmt_nw_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNws []*CCMgmtNw `json:"mgmt_nws,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParkIntfs []*CCParkIntf `json:"park_intfs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Route53Err *string `json:"route53_err,omitempty"`

	// AWS SNS/SQS configuration error. Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SnsSqsConfigErr *string `json:"sns_sqs_config_err,omitempty"`

	// True if AWS SNS/SQS is configured for monitoring Auto Scaling Groups. Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SnsSqsConfigured *bool `json:"sns_sqs_configured,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StokenExpiry *string `json:"stoken_expiry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VpcCidr *string `json:"vpc_cidr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VpcID *string `json:"vpc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VpcType *string `json:"vpc_type,omitempty"`
}
