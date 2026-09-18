// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerBannerList controller banner list
// swagger:model ControllerBannerList
type ControllerBannerList struct {

	// Total number of banner entries matching the filter. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Count *uint32 `json:"count"`

	// URL of the next page of results, present only when more results remain. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Next *string `json:"next,omitempty"`

	// Page of banner entries. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Results []*ControllerBannerEntry `json:"results,omitempty"`
}
