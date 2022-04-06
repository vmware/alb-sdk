// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RediscoverVcenterParam rediscover vcenter param
// swagger:model RediscoverVcenterParam
type RediscoverVcenterParam struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Cloud *string `json:"cloud"`
}
