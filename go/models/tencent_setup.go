// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TencentSetup tencent setup
// swagger:model TencentSetup
type TencentSetup struct {

	// Tencent Cloud id. Field introduced in 18.2.3.
	CcID *string `json:"cc_id,omitempty"`

	// Tencent error message. Field introduced in 18.2.3.
	ErrorString *string `json:"error_string,omitempty"`

	// Tencent Region id. Field introduced in 18.2.3.
	Region *string `json:"region,omitempty"`

	// Tencent VPC id. Field introduced in 18.2.3.
	VpcID *string `json:"vpc_id,omitempty"`
}
