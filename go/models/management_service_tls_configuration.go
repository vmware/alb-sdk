// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ManagementServiceTLSConfiguration management service Tls configuration
// swagger:model ManagementServiceTlsConfiguration
type ManagementServiceTLSConfiguration struct {

	// Management Service Port CertificateAuthorityChain. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CertificateAuthorityChain *string `json:"certificate_authority_chain,omitempty"`

	// Management Service Port hostname. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hostname *string `json:"hostname,omitempty"`
}
