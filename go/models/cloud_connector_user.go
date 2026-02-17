// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CloudConnectorUser cloud connector user
// swagger:model CloudConnectorUser
type CloudConnectorUser struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	//  Field introduced in 17.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AzureServiceprincipal *AzureServicePrincipalCredentials `json:"azure_serviceprincipal,omitempty"`

	//  Field introduced in 17.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AzureUserpass *AzureUserPassCredentials `json:"azure_userpass,omitempty"`

	// Credentials for Google Cloud Platform. Field introduced in 18.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GcpCredentials *GCPCredentials `json:"gcp_credentials,omitempty"`

	// Timestamp (Unix epoch in seconds) of last successful password rotation. Used to determine when next rotation is due based on cc_user_password_expiry_days. Field introduced in 32.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LastPasswordRotation *uint64 `json:"last_password_rotation,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// New password stored temporarily during rotation. Cleared after successful rotation. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NewPasswordEnc *string `json:"new_password_enc,omitempty"`

	// Credentials to talk to NSX-T manager. Field introduced in 20.1.1. Allowed with any value in Enterprise, Basic, Enterprise with Cloud Services edition.
	NsxtCredentials *NsxtCredentials `json:"nsxt_credentials,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Password *string `json:"password,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrivateKey *string `json:"private_key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PublicKey *string `json:"public_key,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Credentials for Tencent Cloud. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TencentCredentials *TencentCredentials `json:"tencent_credentials,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Credentials to talk to VCenter. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VcenterCredentials *VCenterCredentials `json:"vcenter_credentials,omitempty"`
}
