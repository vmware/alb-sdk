// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbServiceHmonStat gslb service hmon stat
// swagger:model GslbServiceHmonStat
type GslbServiceHmonStat struct {

	// GSLB service group runtime information. Minimum of 1 items required. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Groups []*GslbPoolHmon `json:"groups,omitempty"`

	// Internal field to depict if HM sharding is enabled for this GSLB service. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HmOff *bool `json:"hm_off,omitempty"`

	// Name for the GSLB service. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
