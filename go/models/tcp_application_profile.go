// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TCPApplicationProfile TCP application profile
// swagger:model TCPApplicationProfile
type TCPApplicationProfile struct {

	// FTP profile configuration. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FtpProfile *FTPProfile `json:"ftp_profile,omitempty"`

	// Select the PKI profile to be associated with the Virtual Service. This profile defines the Certificate Authority and Revocation List. It is a reference to an object of type PKIProfile. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PkiProfileRef *string `json:"pki_profile_ref,omitempty"`

	// Enable/Disable the usage of proxy protocol to convey client connection information to the back-end servers.  Valid only for L4 application profiles and TCP proxy. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	ProxyProtocolEnabled *bool `json:"proxy_protocol_enabled,omitempty"`

	// Version of proxy protocol to be used to convey client connection information to the back-end servers. Enum options - PROXY_PROTOCOL_VERSION_1, PROXY_PROTOCOL_VERSION_2. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- PROXY_PROTOCOL_VERSION_1), Basic (Allowed values- PROXY_PROTOCOL_VERSION_1) edition.
	ProxyProtocolVersion *string `json:"proxy_protocol_version,omitempty"`

	// Specifies whether the client side verification is set to none, request or require. Enum options - SSL_CLIENT_CERTIFICATE_NONE, SSL_CLIENT_CERTIFICATE_REQUEST, SSL_CLIENT_CERTIFICATE_REQUIRE. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- SSL_CLIENT_CERTIFICATE_NONE), Basic (Allowed values- SSL_CLIENT_CERTIFICATE_NONE) edition.
	SslClientCertificateMode *string `json:"ssl_client_certificate_mode,omitempty"`
}
