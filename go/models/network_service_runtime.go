// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NetworkServiceRuntime network service runtime
// swagger:model NetworkServiceRuntime
type NetworkServiceRuntime struct {

	// Network service name. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkServiceName *string `json:"network_service_name,omitempty"`

	// Network service uuid. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkServiceUUID *string `json:"network_service_uuid,omitempty"`

	// Routing service info. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RoutingService *RoutingServiceRuntime `json:"routing_service,omitempty"`

	// Indicates the type of NetworkService. Enum options - ROUTING_SERVICE. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceType *string `json:"service_type,omitempty"`

	// Tenant uuid. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantUUID *string `json:"tenant_uuid,omitempty"`

	// Vrf name. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfName *string `json:"vrf_name,omitempty"`
}
