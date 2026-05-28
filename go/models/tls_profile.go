// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TLSProfile TLS profile
// swagger:model TLSProfile
type TLSProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Client certificate (and private key) presented to the remote server during the TLS handshake. Needed when a consumer requests MTLS tls_mode against this TLS profile. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CertificateRef *string `json:"certificate_ref,omitempty"`

	// Human-readable description for this TLS Profile. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Name of the TLS Profile. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// PKI profile containing the CA certificates used to validate the TLS certificate presented by the remote server. Needed when a consumer (e.g. AuthProfile) requests TLS, MTLS, or VERIFY_ONLY tls_mode against this TLS profile. It is a reference to an object of type PKIProfile. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PkiProfileRef *string `json:"pki_profile_ref,omitempty"`

	// Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the TLS Profile. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
