// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeDupipEventDetails se dupip event details
// swagger:model SeDupipEventDetails
type SeDupipEventDetails struct {

	// Mac Address. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	LocalMac *string `json:"local_mac,omitempty"`

	// Mac Address. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RemoteMac *string `json:"remote_mac,omitempty"`

	// Vnic IP. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VnicIP *string `json:"vnic_ip,omitempty"`

	// Vnic name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	VnicName *string `json:"vnic_name,omitempty"`
}
