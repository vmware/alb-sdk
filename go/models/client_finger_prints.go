// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClientFingerPrints client finger prints
// swagger:model ClientFingerPrints
type ClientFingerPrints struct {

	// Values of selected fields from the ClientHello. Field introduced in 22.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	TLSClientInfo *TLSClientInfo `json:"tls_client_info,omitempty"`

	// Message Digest (md5) of JA3 from Client Hello. Field introduced in 22.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	TLSFingerprint *string `json:"tls_fingerprint,omitempty"`
}
