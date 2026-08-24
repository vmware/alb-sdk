// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SyslogServerConfig syslog server config
// swagger:model SyslogServerConfig
type SyslogServerConfig struct {

	// Syslog output format  SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, or SYSLOG_RFC5425_ENHANCED. Enum options - SYSLOG_LEGACY, SYSLOG_RFC5424, SYSLOG_JSON, SYSLOG_RFC5425_ENHANCED. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Format *string `json:"format,omitempty"`

	// The destination Syslog server's service port. Allowed values are 1-65535. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Port *uint32 `json:"port,omitempty"`

	// IP Address or FQDN of the syslog server. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Server *IPAddr `json:"server"`

	// UDP transport (default true); set to false to use TCP. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UDP *bool `json:"udp,omitempty"`
}
