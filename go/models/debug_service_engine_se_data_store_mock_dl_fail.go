// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DebugServiceEngineSeDataStoreMockDlFail debug service engine se data store mock dl fail
// swagger:model DebugServiceEngineSeDataStoreMockDlFail
type DebugServiceEngineSeDataStoreMockDlFail struct {

	// Se Datastore Notification RPC type to be failed. Set true for UPDATE and false for CREATE. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IsSedatastoreUpdateRPC *bool `json:"is_sedatastore_update_rpc,omitempty"`

	// Incoming Stream Response Object Type to be failed. Eg  'VirtualServiceSe', 'Pool', 'FileObject', etc. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ObjectType *string `json:"object_type,omitempty"`
}
