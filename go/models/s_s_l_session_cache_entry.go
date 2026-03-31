// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLSessionCacheEntry s s l session cache entry
// swagger:model SSLSessionCacheEntry
type SSLSessionCacheEntry struct {

	// Timeout value for this SSL session on this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GlobalEol *uint32 `json:"global_eol,omitempty"`

	// Version scope this SSL session on this SE. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ishub *bool `json:"ishub,omitempty"`

	// Timeout value for this SSL session on this SE. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalEol *uint32 `json:"local_eol,omitempty"`

	// Hexadecimal representation of the SSL session ID. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslSessionID *string `json:"ssl_session_id,omitempty"`

	// Version value for this SSL session on this SE. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *uint64 `json:"version,omitempty"`
}
