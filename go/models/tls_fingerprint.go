// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TLSFingerprint TLS fingerprint
// swagger:model TLS_Fingerprint
type TLSFingerprint struct {

	// Whether the ClientHello contained GREASE ciphers, extensions or supported groups. Enum options - ClientHelloUsesGrease, ClientHelloNoGrease, ClientHelloGreaseUnkown. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Grease *string `json:"grease,omitempty"`

	// Values of selected fields from the ClientHello. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSClientInfo *TLSClientInfo `json:"tls_client_info,omitempty"`

	// Hex-encoded Message Digest (MD5) of JA3 from ClientHello. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSFingerprint *string `json:"tls_fingerprint,omitempty"`
}
