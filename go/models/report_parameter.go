// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReportParameter report parameter
// swagger:model ReportParameter
type ReportParameter struct {

	// The name of the parameter. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// The value of the parameter. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Value *string `json:"value,omitempty"`
}
