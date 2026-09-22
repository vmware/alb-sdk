// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L4SSLApplicationProfile l4 s s l application profile
// swagger:model L4SSLApplicationProfile
type L4SSLApplicationProfile struct {

	// If enabled, the client's TLS fingerprint will be collected for this L4 SSL/TLS Virtual Service and made available to DataScripts via avi.ssl.get_tls_fingerprint(). Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CollectClientTLSFingerprint *bool `json:"collect_client_tls_fingerprint,omitempty"`

	// L4 stream idle connection timeout in seconds. Allowed values are 60-86400. Field introduced in 22.1.2. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslStreamIdleTimeout *uint32 `json:"ssl_stream_idle_timeout,omitempty"`
}
