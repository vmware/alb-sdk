// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CertificateAuthority certificate authority
// swagger:model CertificateAuthority
type CertificateAuthority struct {

	//  It is a reference to an object of type SSLKeyAndCertificate. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CaRef *string `json:"ca_ref,omitempty"`

	// Common name of the CA certificate issuer. Field introduced in 32.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Issuer *string `json:"issuer,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Expiry date of the CA certificate in UTC *string form. Field introduced in 32.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	NotAfter *string `json:"not_after,omitempty"`

	// Common name of the CA certificate subject. Field introduced in 32.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Subject *string `json:"subject,omitempty"`
}
