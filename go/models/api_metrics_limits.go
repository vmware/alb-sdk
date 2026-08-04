// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIMetricsLimits Api metrics limits
// swagger:model ApiMetricsLimits
type APIMetricsLimits struct {

	// Maximum number of API endpoints for which metrics are tracked across the system. Associating an ApiPolicy with a virtual service is rejected at config time if adding its metrics budget would exceed this limit. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumApis *int32 `json:"num_apis,omitempty"`
}
