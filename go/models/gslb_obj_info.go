// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbObjInfo gslb obj info
// swagger:model GslbObjInfo
type GslbObjInfo struct {

	// The config replication info to SE(es) and peer sites. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ReplState *CfgState `json:"repl_state,omitempty"`
}
