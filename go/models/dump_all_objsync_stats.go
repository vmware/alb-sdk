// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DumpAllObjsyncStats dump all objsync stats
// swagger:model DumpAllObjsyncStats
type DumpAllObjsyncStats struct {

	// Shows if it successfully dumped or not. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Message *string `json:"message,omitempty"`
}
