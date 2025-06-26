// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CertificateAuthority certificate authority
// swagger:model CertificateAuthority
type CertificateAuthority struct {

	//  It is a reference to an object of type SSLKeyAndCertificate. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CaRef *string `json:"ca_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}
