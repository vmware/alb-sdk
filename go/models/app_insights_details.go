// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AppInsightsDetails app insights details
// swagger:model AppInsightsDetails
type AppInsightsDetails struct {

	// Error details for the Application Insights Event. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Error *string `json:"error,omitempty"`

	// Name of the application insights policy. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}
