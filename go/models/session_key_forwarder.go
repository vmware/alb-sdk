// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SessionKeyForwarder session key forwarder
// swagger:model SessionKeyForwarder
type SessionKeyForwarder struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Enable or disable Session Key Forwarder. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enable *bool `json:"enable,omitempty"`

	// IP addresses and ports to be used for connection with Session Key Forwarder. At least one entry required; maximum 16 (matches the per-core stats slot limit). Field introduced in 32.1.4. Minimum of 1 items required. Maximum of 16 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPPorts []*IPAddrPort `json:"ip_ports,omitempty"`

	// Name of the Session Key Forwarder Profile. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// PKI profile used to validate the SSL certificate presented by a server. It is a reference to an object of type PKIProfile. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PkiProfileRef *string `json:"pki_profile_ref,omitempty"`

	// Service engines will present this SSL certificate to the server. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKeyAndCertificateRef *string `json:"ssl_key_and_certificate_ref,omitempty"`

	// SSL profile defines ciphers and SSL versions to be used for Session Key Forwarder. It is a reference to an object of type SSLProfile. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslProfileRef *string `json:"ssl_profile_ref,omitempty"`

	// Tenant reference for the Session Key Forwarder object. It is a reference to an object of type Tenant. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// If enabled, Connection with Session Key Forwarder will use the management network. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseMgmt *bool `json:"use_mgmt,omitempty"`

	// UUID of the Session Key Forwarder Profile. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
