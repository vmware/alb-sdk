// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OshiftSharedVirtualService oshift shared virtual service
// swagger:model OshiftSharedVirtualService
type OshiftSharedVirtualService struct {

	// Name of shared virtualservice. VirtualService will be created automatically by Cloud Connector. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	VirtualserviceName *string `json:"virtualservice_name"`
}
