// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LicenseStatus license status
// swagger:model LicenseStatus
type LicenseStatus struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.3.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Name. Field introduced in 21.1.3.
	// Required: true
	Name *string `json:"name"`

	// Saas licensing status. Field introduced in 21.1.3.
	SaasStatus *SaasLicensingStatus `json:"saas_status,omitempty"`

	// Tenant. It is a reference to an object of type Tenant. Field introduced in 21.1.3.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Uuid. Field introduced in 21.1.3.
	UUID *string `json:"uuid,omitempty"`
}
