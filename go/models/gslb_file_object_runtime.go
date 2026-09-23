// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbFileObjectRuntime gslb file object runtime
// swagger:model GslbFileObjectRuntime
type GslbFileObjectRuntime struct {

	// The site controller cluster UUID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterUUID *string `json:"cluster_uuid,omitempty"`

	// Indicates the status of file object related tasks(ex  mm_converter, replication in cluster). Enum options - REPLICATED_WITH_SUCCESS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FileCopySuccess *string `json:"file_copy_success,omitempty"`

	// FileObject follower site config states. Field introduced in 30.2.1, 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FlrState []*CfgState `json:"flr_state,omitempty"`

	// FileObject leader site config state. Field introduced in 30.2.1, 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LdrState *CfgState `json:"ldr_state,omitempty"`

	// FileObject name. Field introduced in 30.2.1, 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// File object uuid. It is a reference to an object of type FileObject. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjRef *string `json:"obj_ref,omitempty"`

	// The config replication info to SE(es) and peer sites. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplState *CfgState `json:"repl_state,omitempty"`

	// Uuid of the tenant. It is a reference to an object of type Tenant. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// UUID of the GslbFileObjectRuntime. Field introduced in 30.2.1, 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
