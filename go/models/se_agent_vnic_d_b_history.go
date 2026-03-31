// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentVnicDBHistory se agent vnic d b history
// swagger:model SeAgentVnicDBHistory
type SeAgentVnicDBHistory struct {

	// show history of vnic and VRF operations. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cmds []string `json:"cmds,omitempty"`
}
