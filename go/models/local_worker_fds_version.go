// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LocalWorkerFdsVersion local worker fds version
// swagger:model LocalWorkerFdsVersion
type LocalWorkerFdsVersion struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Default GLW fds version name. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Uuid of the tenant. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Fds timeline maintained by GLW. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Timeline *string `json:"timeline,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Default GLW fds version uuid. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Fds version maintained by GLW. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Version *int64 `json:"version,omitempty"`
}
