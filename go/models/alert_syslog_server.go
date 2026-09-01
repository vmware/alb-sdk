// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AlertSyslogServer alert syslog server
// swagger:model AlertSyslogServer
type AlertSyslogServer struct {

	// Syslog output format - legacy, RFC 5424, JSON. Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, SYSLOG_RFC5425_ENHANCED. Field introduced in 17.2.8. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Format *string `json:"format,omitempty"`

	// Select the PKIProfile containing a CA or list of CA chainswhich will validate the certificate of the syslog server. When unset, SystemConfiguration.truststore_pkiprofile_uuid is used instead. It is a reference to an object of type PKIProfile. Field introduced in 17.2.17, 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PkiprofileRef *string `json:"pkiprofile_ref,omitempty"`

	// The destination Syslog server IP(v4/v6) address or FQDN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SyslogServer *string `json:"syslog_server"`

	// The destination Syslog server's service port. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SyslogServerPort *uint32 `json:"syslog_server_port,omitempty"`

	// TLS mode and client certificate for the connection to this syslog server, effective only when tls_enable is set. Supersedes ssl_key_and_certificate_uuid, anon_auth, and strict_cert_verify, which are deprecated in favor of this field. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSConfig *TLSConfig `json:"tls_config,omitempty"`

	// Enable TLS to the syslog server. Use tls_config to select the TLS mode and client certificate. Field introduced in 17.2.16, 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TLSEnable *bool `json:"tls_enable,omitempty"`

	// Network protocol to establish syslog session. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	UDP *bool `json:"udp"`
}
