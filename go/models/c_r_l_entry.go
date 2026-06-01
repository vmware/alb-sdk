// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CRLEntry c r l entry
// swagger:model CRLEntry
type CRLEntry struct {

	// CRL sequence number from the CRL Number extension (RFC 5280 §5.2.3). Empty when the extension is absent. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CrlNumber *string `json:"crl_number,omitempty"`

	// Common Name extracted from the CRL issuer DN. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IssuerCn *string `json:"issuer_cn,omitempty"`

	// Full Distinguished Name of the CRL issuer (RFC 5280 Issuer field). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IssuerDn *string `json:"issuer_dn,omitempty"`

	// Milliseconds since the Unix epoch (1970-01-01 00 00 00 UTC) when the next CRL is expected (NextUpdate field, RFC 5280 §5.1.2.5). Empty when the extension is absent. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NextUpdate *string `json:"next_update,omitempty"`

	// Decimal serial numbers of all certificates revoked in this CRL block. Used for revocation status checks against a certificate's serial number. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SerialNumbers []string `json:"serial_numbers,omitempty"`

	// Milliseconds since the Unix epoch (1970-01-01 00 00 00 UTC) when this CRL was issued (ThisUpdate field, RFC 5280 §5.1.2.4). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ThisUpdate *string `json:"this_update,omitempty"`
}
