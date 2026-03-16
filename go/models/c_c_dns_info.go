// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CCDNSInfo c c Dns info
// swagger:model CC_DnsInfo
type CCDNSInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSUUID *string `json:"dns_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ErrMsg *string `json:"err_msg,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mode *string `json:"mode,omitempty"`

	// Route 53 health client IAM token expiration. Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	R53HtokenExpiry *string `json:"r53_htoken_expiry,omitempty"`

	// Route 53 session client IAM token expiration. Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	R53StokenExpiry *string `json:"r53_stoken_expiry,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ready *bool `json:"ready,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VpcID *string `json:"vpc_id,omitempty"`
}
