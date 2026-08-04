// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TLSConfig Tls config
// swagger:model TlsConfig
type TLSConfig struct {

	// Client certificate for mutual TLS connection. Required when TLS mode is Mutual TLS. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientCertRef *string `json:"client_cert_ref,omitempty"`

	// Select how TLS is used to establish a secure outbound connection. Certificate validation uses the trust store configured in System Configuration (Truststore PKI Profile). Enum options - TLS_MODE_NO_VERIFY, TLS_MODE_TLS, TLS_MODE_MTLS, TLS_MODE_SKIP_HOSTNAME_VERIFY. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSMode *string `json:"tls_mode,omitempty"`
}
