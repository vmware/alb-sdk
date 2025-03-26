// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbServiceSrvRdata gslb service srv rdata
// swagger:model GslbServiceSrvRdata
type GslbServiceSrvRdata struct {

	// Service port. Allowed values are 0-65535. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Port *uint32 `json:"port"`

	// Priority of the target hosting the service, low value implies higher priority for this service record. Allowed values are 0-65535. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Priority *uint32 `json:"priority"`

	// Relative weight for service records with same priority, high value implies higher preference for this service record. Allowed values are 0-65535. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Weight *uint32 `json:"weight"`
}
