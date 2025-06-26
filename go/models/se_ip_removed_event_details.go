// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeIPRemovedEventDetails se Ip removed event details
// swagger:model SeIpRemovedEventDetails
type SeIPRemovedEventDetails struct {

	// Vnic name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IfName *string `json:"if_name,omitempty"`

	// IP added. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IP *string `json:"ip,omitempty"`

	// Vnic linux name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LinuxName *string `json:"linux_name,omitempty"`

	// Mac Address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mac *string `json:"mac,omitempty"`

	// Mask . Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mask *int32 `json:"mask,omitempty"`

	// DCHP or Static. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mode *string `json:"mode,omitempty"`

	// Network UUID. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkUUID *string `json:"network_uuid,omitempty"`

	// Namespace. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ns *string `json:"ns,omitempty"`

	// UUID of the SE responsible for this event. It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
