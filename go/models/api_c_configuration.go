// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APICConfiguration API c configuration
// swagger:model APICConfiguration
type APICConfiguration struct {

	// Name of the Avi specific tenant created within APIC. Field deprecated in 21.1.1.
	ApicAdminTenant *string `json:"apic_admin_tenant,omitempty"`

	// vCenter's virtual machine manager domain within APIC. Field deprecated in 21.1.1.
	ApicDomain *string `json:"apic_domain,omitempty"`

	// The hostname or IP address of the APIC controller. Field deprecated in 21.1.1.
	ApicName []string `json:"apic_name,omitempty"`

	// The password Avi Vantage will use when authenticating with APIC. Field deprecated in 21.1.1.
	ApicPassword *string `json:"apic_password,omitempty"`

	//  Field deprecated in 17.2.10,18.1.2.
	ApicProduct *string `json:"apic_product,omitempty"`

	// The username Avi Vantage will use when authenticating with APIC. Field deprecated in 21.1.1.
	ApicUsername *string `json:"apic_username,omitempty"`

	//  Field deprecated in 17.2.10,18.1.2.
	ApicVendor *string `json:"apic_vendor,omitempty"`

	// The password APIC will use when authenticating with Avi Vantage. Field deprecated in 17.2.10,18.1.2.
	AviControllerPassword *string `json:"avi_controller_password,omitempty"`

	// The username APIC will use when authenticating with Avi Vantage. Field deprecated in 17.2.10,18.1.2.
	AviControllerUsername *string `json:"avi_controller_username,omitempty"`

	// Context aware for supporting Service Graphs across VRFs. Enum options - SINGLE_CONTEXT, MULTI_CONTEXT. Field deprecated in 21.1.1.
	ContextAware *string `json:"context_aware,omitempty"`

	//  Field deprecated in 17.2.10,18.1.2.
	Deployment *string `json:"deployment,omitempty"`

	// Use Managed Mode for APIC Service Insertion. Field deprecated in 17.2.10,18.1.2. Field introduced in 17.1.1.
	ManagedMode *bool `json:"managed_mode,omitempty"`

	// AVI Device Package Minor Version. Field deprecated in 17.2.10,18.1.2.
	Minor *string `json:"minor,omitempty"`

	// Determines if DSR from secondary SE is active or not  False   DSR active. Please ensure that APIC BD's Endpoint Dataplane Learning is disabled True    Disable DSR unconditionally. . Field deprecated in 21.1.1. Field introduced in 17.2.10,18.1.2.
	SeTunnelMode *bool `json:"se_tunnel_mode,omitempty"`

	// AVI Device Package Version. Field deprecated in 17.2.10,18.1.2.
	Version *string `json:"version,omitempty"`
}
