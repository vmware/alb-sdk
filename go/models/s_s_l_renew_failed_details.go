// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLRenewFailedDetails s s l renew failed details
// swagger:model SSLRenewFailedDetails
type SSLRenewFailedDetails struct {

	// Error when renewing certificate. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Error *string `json:"error,omitempty"`

	// Name of SSL Certificate. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}
