// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLExpiredDetails s s l expired details
// swagger:model SSLExpiredDetails
type SSLExpiredDetails struct {

	// Name of the SSL Certificate that has expired. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}
