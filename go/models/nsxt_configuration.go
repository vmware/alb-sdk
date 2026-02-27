// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtConfiguration nsxt configuration
// swagger:model NsxtConfiguration
type NsxtConfiguration struct {

	// Set this flag to true to enable automatic import of NSX projects into Avi.This flag is only applicable when VPC mode is enabled for this cloud; it is ignored when VPC mode is disabled.NSX projects under VCF-A management are excluded from this automatic import process, as VCF-A creates these projects in Avi through its own integration workflow. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AutoImportNsxProjects *bool `json:"auto_import_nsx_projects,omitempty"`

	// Automatically create/delete DFW objects such as NSGroups and NSServices in NSX-T Manager. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AutomateDfwObjects *bool `json:"automate_dfw_objects,omitempty"`

	// Automatically create DFW rules for VirtualService in NSX-T Manager. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition. Allowed in Basic (Allowed values- false) edition.
	AutomateDfwRules *bool `json:"automate_dfw_rules,omitempty"`

	// Data network configuration for Avi Service Engines. Field introduced in 20.1.5. Allowed with any value in Enterprise, Basic, Enterprise with Cloud Services edition.
	DataNetworkConfig *DataNetworkConfig `json:"data_network_config,omitempty"`

	// Domain where NSGroup objects belongs to. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DomainID *string `json:"domain_id,omitempty"`

	// Enforcement point is where the rules of a policy to apply. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnforcementpointID *string `json:"enforcementpoint_id,omitempty"`

	// Management network configuration for Avi Service Engines. Field introduced in 20.1.5. Allowed with any value in Enterprise, Basic, Enterprise with Cloud Services edition.
	ManagementNetworkConfig *ManagementNetworkConfig `json:"management_network_config,omitempty"`

	// Credentials to access NSX-T manager. It is a reference to an object of type CloudConnectorUser. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NsxtCredentialsRef *string `json:"nsxt_credentials_ref,omitempty"`

	// NSX-T manager hostname or IP address. URL changes are allowed only between IP and FQDN formats that resolve to the same NSX-T manager. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NsxtURL *string `json:"nsxt_url,omitempty"`

	// Enable to automatically register the Avi Controller with NSX-T Manager. This triggers the NSX onboarding workflow API to configure the ALB cluster and create an enforcement point. Note  This flag must be enabled on exactly one NSX-T Cloud to avoid conflicts. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OnboardAviIntoNsx *bool `json:"onboard_avi_into_nsx,omitempty"`

	// Site where transport zone belongs to. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteID *string `json:"site_id,omitempty"`

	// Flag is used to indicate whether TLS certificate verificationbe done when establishing a connection to a vCenter and NSX-T Manager. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VerifyCertificate *bool `json:"verify_certificate,omitempty"`

	// VMC mode. Field introduced in 30.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VmcMode *bool `json:"vmc_mode,omitempty"`

	// VPC Mode. Field introduced in 30.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VpcMode *bool `json:"vpc_mode,omitempty"`
}
