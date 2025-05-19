// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VCenterConfiguration v center configuration
// swagger:model vCenterConfiguration
type VCenterConfiguration struct {

	// vCenter content library where Service Engine images are stored. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ContentLib *ContentLibConfig `json:"content_lib,omitempty"`

	// Datacenter for virtual infrastructure discovery. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Datacenter *string `json:"datacenter,omitempty"`

	// Managed object id of the datacenter. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition.
	DatacenterManagedObjectID *string `json:"datacenter_managed_object_id,omitempty"`

	// If true, NSX-T segment spanning multiple VDS with vCenter cloud are merged to a single network in Avi. Field introduced in 22.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IsNsxEnvironment *bool `json:"is_nsx_environment,omitempty"`

	// Management subnet to use for Avi Service Engines. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ManagementIPSubnet *IPAddrPrefix `json:"management_ip_subnet,omitempty"`

	// Management network to use for Avi Service Engines. It is a reference to an object of type VIMgrNWRuntime. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ManagementNetwork *string `json:"management_network,omitempty"`

	// The password Avi Vantage will use when authenticating with vCenter. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Password *string `json:"password,omitempty"`

	// Set the access mode to vCenter as either Read, which allows Avi to discover networks and servers, or Write, which also allows Avi to create Service Engines and configure their network properties. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Privilege *string `json:"privilege"`

	// If false, Service Engine image will not be pushed to content library. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition.
	UseContentLib *bool `json:"use_content_lib,omitempty"`

	// The username Avi Vantage will use when authenticating with vCenter. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Username *string `json:"username,omitempty"`

	// Avi Service Engine Template in vCenter to be used for creating Service Engines. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VcenterTemplateSeLocation *string `json:"vcenter_template_se_location,omitempty"`

	// vCenter hostname or IP address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VcenterURL *string `json:"vcenter_url,omitempty"`

	// Flag is used to indicate whether TLS certificate verificationbe done when establishing a connection to a vCenter server. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VerifyCertificate *bool `json:"verify_certificate,omitempty"`
}
