// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbApplicationPersistenceProfileRuntime gslb application persistence profile runtime
// swagger:model GslbApplicationPersistenceProfileRuntime
type GslbApplicationPersistenceProfileRuntime struct {

	// The site controller cluster UUID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterUUID *string `json:"cluster_uuid,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// ApplicationPersistenceProfile object uuid. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjUUID *string `json:"obj_uuid,omitempty"`

	// The config replication info to SE(es) and peer sites. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplState *CfgState `json:"repl_state,omitempty"`

	// The unique identifier of the tenant to which the ApplicationPersistenceProfile belongs. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
