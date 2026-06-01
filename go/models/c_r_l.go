// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CRL c r l
// swagger:model CRL
type CRL struct {

	// Common name of the issuer in the Certificate Revocation list. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CommonName *string `json:"common_name,omitempty"`

	// Distinguished name of the issuer in the Certificate Revocation list. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DistinguishedName *string `json:"distinguished_name,omitempty"`

	// Per-block CRL metadata populated automatically when a CRL file is uploaded or refreshed. Each element corresponds to one PEM CRL block in the file in order. A file concatenating CRLs from multiple CAs has one entry per CA. Not settable by API clients. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Entries []*CRLEntry `json:"entries,omitempty"`

	// Cached etag to optimize the download of the CRL. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Etag *string `json:"etag,omitempty"`

	// Fingerprint of the CRL. Used to avoid configuring duplicates. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fingerprint *string `json:"fingerprint,omitempty"`

	// Last time CRL was refreshed by the system. This is an internal field used by the system. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastRefreshed *string `json:"last_refreshed,omitempty"`

	// The date when this CRL was last issued. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdate *string `json:"last_update,omitempty"`

	// The date when a newer CRL will be available. Also conveys the date after which the CRL should be considered obsolete. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NextUpdate *string `json:"next_update,omitempty"`

	// URL of a server that issues the Certificate Revocation list. If this is configured, CRL will be periodically downloaded either based on the configured update interval or the next update interval in the CRL. CRL itself is stored in the body. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerURL *string `json:"server_url,omitempty"`

	// Certificate Revocation list in plain text for readability. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Text *string `json:"text,omitempty"`

	// Interval in minutes to check for CRL update. If not specified, interval will be 1 day. Allowed values are 30-525600. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpdateInterval *int32 `json:"update_interval,omitempty"`
}
