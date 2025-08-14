// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HSMSafenetLuna h s m safenet luna
// swagger:model HSMSafenetLuna
type HSMSafenetLuna struct {

	// Group Number of generated HA Group. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HaGroupNum *uint64 `json:"ha_group_num,omitempty"`

	// Set to indicate HA across more than one servers. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IsHa *bool `json:"is_ha"`

	// Node specific information. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NodeInfo []*HSMSafenetClientInfo `json:"node_info,omitempty"`

	// SafeNet/Gemalto HSM Servers used for crypto operations. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Server []*HSMSafenetLunaServer `json:"server,omitempty"`

	// Generated File - server.pem. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerPem *string `json:"server_pem,omitempty"`

	// If enabled, dedicated network is used to communicate with HSM,else, the management network is used. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseDedicatedNetwork *bool `json:"use_dedicated_network,omitempty"`

	// If enabled, Thales Luna client will use legacy gem engine library, instead of a Luna provider. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UseLegacyEngine *bool `json:"use_legacy_engine,omitempty"`
}
