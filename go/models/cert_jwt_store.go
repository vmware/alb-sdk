// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CertJwtStore cert jwt store
// swagger:model CertJwtStore
type CertJwtStore struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// JWT containing current portal certificate along with the full certificate bundle chain, signed by the private key of previous portal certificate. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Jwt *string `json:"jwt"`

	// Private key. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Key *string `json:"key"`

	// Private key passphrase. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KeyPassphrase *string `json:"key_passphrase,omitempty"`

	// SHA256 thumbprint of the previous old portal certificate. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Kid *string `json:"kid"`

	// Timestamp of certificate rotation. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LastRotatedAt *TimeStamp `json:"last_rotated_at"`

	// Public key algorithm. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PublicKeyAlgorithm *string `json:"public_key_algorithm"`

	// Type of SSL certificate. Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA, SSL_CERTIFICATE_TYPE_CLIENT, SSL_CERTIFICATE_TYPE_SECURE_CHANNEL. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of JWT. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
