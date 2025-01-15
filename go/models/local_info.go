// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LocalInfo local info
// swagger:model LocalInfo
type LocalInfo struct {

	// This field encapsulates the Gs-status edge-triggered framework. . Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GsStatus *GslbDNSGsStatus `json:"gs_status,omitempty"`

	// This field keeps track of gslb object's information . Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GslbInfo *GslbObjInfo `json:"gslb_info,omitempty"`
}
