// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConfigurationStatus configuration status
// swagger:model ConfigurationStatus
type ConfigurationStatus struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastChangedTime *TimeStamp `json:"last_changed_time,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PvtData *int64 `json:"pvt_data,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PvtData2 *int64 `json:"pvt_data_2,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason []string `json:"reason,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReasonCode *uint64 `json:"reason_code,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReasonCodeString *string `json:"reason_code_string,omitempty"`

	//  Enum options - CONFIG_UP, CONFIG_DOWN, CONFIG_CREATING, CONFIG_RESOURCES, CONFIG_INACTIVE, CONFIG_DISABLED, CONFIG_UNUSED, CONFIG_UNKNOWN, CONFIG_PROCESSING, CONFIG_INITIALIZING, CONFIG_ERROR_DISABLED, CONFIG_AWAIT_MANUAL_PLACEMENT, CONFIG_UPGRADING, CONFIG_SE_PROCESSING, CONFIG_PARTITIONED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	State *string `json:"state"`
}
