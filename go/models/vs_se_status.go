// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsSeStatus vs se status
// swagger:model VsSeStatus
type VsSeStatus struct {

	// Whether this Service Engine is up and serving traffic for this Virtual Service. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	// Whether this Service Engine is the primary or standby for this Virtual Service. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Role *string `json:"role,omitempty"`

	// The Service Engine this status is for. It is a reference to an object of type ServiceEngine. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
