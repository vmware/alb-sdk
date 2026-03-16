// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ExampleChild example child
// swagger:model ExampleChild
type ExampleChild struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Payload *string `json:"payload,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
