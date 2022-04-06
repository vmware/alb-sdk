// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APICConfiguration API c configuration
// swagger:model APICConfiguration
type APICConfiguration struct {

	// Name of the Avi specific tenant created within APIC. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ApicAdminTenant *string `json:"apic_admin_tenant,omitempty"`

	// vCenter's virtual machine manager domain within APIC. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ApicDomain *string `json:"apic_domain,omitempty"`

	// The hostname or IP address of the APIC controller. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ApicName []string `json:"apic_name,omitempty"`

	// The password Avi Vantage will use when authenticating with APIC. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ApicPassword *string `json:"apic_password,omitempty"`

	//  Field deprecated in 17.2.10,18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ApicProduct *string `json:"apic_product,omitempty"`

	// The username Avi Vantage will use when authenticating with APIC. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ApicUsername *string `json:"apic_username,omitempty"`

	//  Field deprecated in 17.2.10,18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ApicVendor *string `json:"apic_vendor,omitempty"`

	// The password APIC will use when authenticating with Avi Vantage. Field deprecated in 17.2.10,18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AviControllerPassword *string `json:"avi_controller_password,omitempty"`

	// The username APIC will use when authenticating with Avi Vantage. Field deprecated in 17.2.10,18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	AviControllerUsername *string `json:"avi_controller_username,omitempty"`

	// Context aware for supporting Service Graphs across VRFs. Enum options - SINGLE_CONTEXT, MULTI_CONTEXT. Field deprecated in 21.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ContextAware *string `json:"context_aware,omitempty"`

	//  Field deprecated in 17.2.10,18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Deployment *string `json:"deployment,omitempty"`

	// Use Managed Mode for APIC Service Insertion. Field deprecated in 17.2.10,18.1.2. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ManagedMode *bool `json:"managed_mode,omitempty"`

	// AVI Device Package Minor Version. Field deprecated in 17.2.10,18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Minor *string `json:"minor,omitempty"`

	// Determines if DSR from secondary SE is active or not  False   DSR active. Please ensure that APIC BD's Endpoint Dataplane Learning is disabled True    Disable DSR unconditionally. . Field deprecated in 21.1.1. Field introduced in 17.2.10,18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeTunnelMode *bool `json:"se_tunnel_mode,omitempty"`

	// AVI Device Package Version. Field deprecated in 17.2.10,18.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}
