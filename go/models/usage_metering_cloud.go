// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UsageMeteringCloud usage metering cloud
// swagger:model UsageMeteringCloud
type UsageMeteringCloud struct {

	// Name of the cloud. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Status of the task for the cloud. Enum options - USAGE_METERING_CLOUD_STATUS_SUCCESS, USAGE_METERING_CLOUD_STATUS_FAILURE, USAGE_METERING_CLOUD_STATUS_SKIPPED. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`
}
