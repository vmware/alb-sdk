// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SCProperties s c properties
// swagger:model SCProperties
type SCProperties struct {

	// Introduce delay faults in SCM Config, SE, ResMgrGo paths. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DelayInjections []*SCFaultOptions `json:"delay_injections,omitempty"`
}
