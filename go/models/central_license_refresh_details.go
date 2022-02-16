// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CentralLicenseRefreshDetails central license refresh details
// swagger:model CentralLicenseRefreshDetails
type CentralLicenseRefreshDetails struct {

	// Message. Field introduced in 21.1.4.
	Message *string `json:"message,omitempty"`

	// Service units. Field introduced in 21.1.4.
	ServiceUnits *float64 `json:"service_units,omitempty"`
}
