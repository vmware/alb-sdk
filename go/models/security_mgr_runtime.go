// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SecurityMgrRuntime security mgr runtime
// swagger:model SecurityMgrRuntime
type SecurityMgrRuntime struct {

	//  Field introduced in 18.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Thresholds []*SecMgrThreshold `json:"thresholds,omitempty"`
}
