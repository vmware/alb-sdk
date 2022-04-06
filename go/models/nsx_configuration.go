// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxConfiguration nsx configuration
// swagger:model NsxConfiguration
type NsxConfiguration struct {

	// This prefix will be added to the names of all NSX objects created by Avi Controller. It should be unique across all the Avi Controller clusters. Field deprecated in 21.1.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	AviNsxPrefix *string `json:"avi_nsx_prefix"`

	// The hostname or IP address of the NSX MGr. Field deprecated in 21.1.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	NsxManagerName *string `json:"nsx_manager_name"`

	// The password Avi Vantage will use when authenticating with NSX Mgr. Field deprecated in 21.1.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	NsxManagerPassword *string `json:"nsx_manager_password"`

	// The username Avi Vantage will use when authenticating with NSX Mgr. Field deprecated in 21.1.1. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	NsxManagerUsername *string `json:"nsx_manager_username"`

	// The interval (in secs) with which Avi Controller polls the NSX Manager for updates. Field deprecated in 21.1.1. Field introduced in 17.1.1. Unit is SECONDS. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	NsxPollTime *int32 `json:"nsx_poll_time"`
}
