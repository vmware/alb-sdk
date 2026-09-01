// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TLSConfig Tls config
// swagger:model TlsConfig
type TLSConfig struct {

	// Client certificate for mutual TLS connection. Required when TLS mode is Mutual TLS. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientCertRef *string `json:"client_cert_ref,omitempty"`

	// PKI Profile used to validate the server certificate validation in One-way TLS and Mutual TLS. If this field is not set, the PKI Profile from System Configuration will be used. Effective when TLS Mode is One-way TLS or Mutual TLS. It is a reference to an object of type PKIProfile. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PkiProfileRef *string `json:"pki_profile_ref,omitempty"`

	// Skip hostname verification on the server certificate, chain validation still applies. Effective when TLS Mode is One-way TLS or Mutual TLS. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipHostnameVerification *bool `json:"skip_hostname_verification,omitempty"`

	// How TLS is used for this outbound connection. Certificate validation uses the Truststore PKI Profile (default  Truststore PKI Profile from System Configuration). Enum options - TLS_MODE_NO_VERIFY, TLS_MODE_TLS, TLS_MODE_MTLS. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSMode *string `json:"tls_mode,omitempty"`
}
