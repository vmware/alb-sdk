// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HSMThalesNetHsm h s m thales net hsm
// swagger:model HSMThalesNetHsm
type HSMThalesNetHsm struct {

	// Electronic serial number of the netHSM device. Use Thales anonkneti utility to find the netHSM ESN. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Esn *string `json:"esn"`

	// Hash of the key that netHSM device uses to authenticate itself. Use Thales anonkneti utility to find the netHSM keyhash. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Keyhash *string `json:"keyhash"`

	// Local module id of the netHSM device. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ModuleID *int32 `json:"module_id,omitempty"`

	// Priority class of the nethsm in an high availability setup. 1 is the highest priority and 100 is the lowest priority. Allowed values are 1-100. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Priority *int32 `json:"priority"`

	// IP address of the netHSM device. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	RemoteIP *IPAddr `json:"remote_ip"`

	// Port at which the netHSM device accepts the connection. Allowed values are 1-65535. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RemotePort *int32 `json:"remote_port,omitempty"`
}
