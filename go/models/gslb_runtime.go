// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbRuntime gslb runtime
// swagger:model GslbRuntime
type GslbRuntime struct {

	//  Field introduced in 17.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Checksum *string `json:"checksum,omitempty"`

	// This field indicates delete is in progress for this Gslb instance. . Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DeleteInProgress *bool `json:"delete_in_progress,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSEnabled *bool `json:"dns_enabled,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EventCache *EventCache `json:"event_cache,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlrState []*CfgState `json:"flr_state,omitempty"`

	// Contains the replication Details. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GslbCrmRuntime []*GslbCRMRuntime `json:"gslb_crm_runtime,omitempty"`

	// Contains the health status Details. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GslbHsmRuntime []*GslbHSMRuntime `json:"gslb_hsm_runtime,omitempty"`

	// Contains the Site Details. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GslbSmRuntime []*GslbSMRuntime `json:"gslb_sm_runtime,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LdrState *CfgState `json:"ldr_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Site []*GslbSiteRuntime `json:"site,omitempty"`

	// Remap the tenant_uuid to its tenant-name so that we can use the tenant_name directly in remote-site ops. . Field introduced in 17.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantName *string `json:"tenant_name,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ThirdPartySites []*GslbThirdPartySiteRuntime `json:"third_party_sites,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
