// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLExpireDetails s s l expire details
// swagger:model SSLExpireDetails
type SSLExpireDetails struct {

	// Number of days until certificate is expired. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DaysLeft *int32 `json:"days_left,omitempty"`

	// Name of SSL Certificate. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}
