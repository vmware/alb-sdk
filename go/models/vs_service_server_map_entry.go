// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsServiceServerMapEntry vs service server map entry
// swagger:model VsServiceServerMapEntry
type VsServiceServerMapEntry struct {

	// Front end service port. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppServicePort *uint32 `json:"app_service_port,omitempty"`

	// Front end service port type. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppServiceType *string `json:"app_service_type,omitempty"`

	// Server mapped for the service. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPPortStr *string `json:"ip_port_str,omitempty"`
}
