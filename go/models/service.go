// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Service service
// swagger:model Service
type Service struct {

	// Enable HTTP2 on this port. Field introduced in 20.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	EnableHttp2 *bool `json:"enable_http2,omitempty"`

	// Enable SSL termination and offload for traffic from clients. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableSsl *bool `json:"enable_ssl,omitempty"`

	// Used for Horizon deployment. If set used for L7 redirect. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HorizonInternalPorts *bool `json:"horizon_internal_ports,omitempty"`

	// Source port used by VS for active FTP data connections. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IsActiveFtpDataPort *bool `json:"is_active_ftp_data_port,omitempty"`

	// Source port used by VS for passive FTP data connections.Change in this flag is disruptive update. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IsPassiveFtpDataPort *bool `json:"is_passive_ftp_data_port,omitempty"`

	// Enable application layer specific features for the this specific service. It is a reference to an object of type ApplicationProfile. Field introduced in 17.2.4. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OverrideApplicationProfileRef *string `json:"override_application_profile_ref,omitempty"`

	// Override the network profile for this specific service port. It is a reference to an object of type NetworkProfile. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OverrideNetworkProfileRef *string `json:"override_network_profile_ref,omitempty"`

	// The Virtual Service's port number. Allowed values are 0-65535. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Port *uint32 `json:"port"`

	// The end of the Virtual Service's port number range. Allowed values are 1-65535. Special values are 0- single port. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PortRangeEnd *uint32 `json:"port_range_end,omitempty"`
}
