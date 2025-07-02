// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UsageMeteringEventDetails usage metering event details
// swagger:model UsageMeteringEventDetails
type UsageMeteringEventDetails struct {

	// Details of the clouds involved in the task. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Clouds []*UsageMeteringCloud `json:"clouds,omitempty"`

	// Additional info about the task. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Message *string `json:"message,omitempty"`

	// Trigger for the task. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Trigger *string `json:"trigger,omitempty"`
}
