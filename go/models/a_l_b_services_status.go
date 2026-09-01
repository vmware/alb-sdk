// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ALBServicesStatus a l b services status
// swagger:model ALBServicesStatus
type ALBServicesStatus struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Asset details corresponding to this controller cluster, on registering with pulse. Field introduced in 22.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AssetDetails *ALBServicesAssetDetails `json:"asset_details,omitempty"`

	// Timestamp of last successful connection. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectedAt *TimeStamp `json:"connected_at,omitempty"`

	// Connectivity status of controller with ALBServices. Enum options - ALBSERVICES_CONNECTIVITY_UNKNOWN, ALBSERVICES_DISCONNECTED, ALBSERVICES_CONNECTED. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnectivityStatus *string `json:"connectivity_status,omitempty"`

	// Descriptive error message. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Error *string `json:"error,omitempty"`

	// Name of the ALBServicesStatus object. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Registration status of the controller with ALBServices. Enum options - ALBSERVICES_REGISTRATION_UNKNOWN, ALBSERVICES_REGISTERED, ALBSERVICES_DEREGISTERED. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RegistrationStatus *string `json:"registration_status,omitempty"`

	// Health of hosted services. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServicesHealth []*ServiceHealth `json:"services_health,omitempty"`

	// Tenant UUID associated with the Object. It is a reference to an object of type Tenant. Field introduced in 30.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Tenant based status information. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantStatus *PulseServicesTenantStatus `json:"tenant_status,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Unique identifier of customer portal status object in the database and datastore. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
