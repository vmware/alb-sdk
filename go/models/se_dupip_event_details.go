// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeDupipEventDetails se dupip event details
// swagger:model SeDupipEventDetails
type SeDupipEventDetails struct {

	// Mac Address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalMac *string `json:"local_mac,omitempty"`

	// Mac Address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RemoteMac *string `json:"remote_mac,omitempty"`

	// Vnic IP. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicIP *string `json:"vnic_ip,omitempty"`

	// Vnic name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicName *string `json:"vnic_name,omitempty"`
}
