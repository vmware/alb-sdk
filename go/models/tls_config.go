// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TLSConfig Tls config
// swagger:model TlsConfig
type TLSConfig struct {

	// Client certificate for mutual TLS authentication. Required when tls_mode is TLS_MODE_MTLS. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientCertRef *string `json:"client_cert_ref,omitempty"`

	// TLS authentication mode for outbound connections. TLS_MODE_DISABLED  no TLS. TLS_MODE_TLS  server certificate verification. TLS_MODE_MTLS  mutual TLS; client_cert_uuid must be provided. TLS_MODE_VERIFY_ONLY  certificate chain verification without a full TLS session. Enum options - TLS_MODE_DISABLED, TLS_MODE_TLS, TLS_MODE_MTLS, TLS_MODE_VERIFY_ONLY. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSMode *string `json:"tls_mode,omitempty"`
}
