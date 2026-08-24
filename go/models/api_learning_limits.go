// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APILearningLimits Api learning limits
// swagger:model ApiLearningLimits
type APILearningLimits struct {

	// Maximum total number of API parameters stored across all endpoints in the system. Enabling ApplicationInsights on a virtual service is rejected at config time if adding its parameter budget would exceed this limit. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAPIParams *int32 `json:"num_api_params,omitempty"`

	// Maximum total number of API endpoints stored across the system. Enabling ApplicationInsights on a virtual service is rejected at config time if adding its endpoint budget would exceed this limit. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumApis *int32 `json:"num_apis,omitempty"`
}
