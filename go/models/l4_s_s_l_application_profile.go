// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// L4SSLApplicationProfile l4 s s l application profile
// swagger:model L4SSLApplicationProfile
type L4SSLApplicationProfile struct {

	// L4 stream idle connection timeout in seconds. Allowed values are 60-86400. Field introduced in 22.1.2. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslStreamIdleTimeout *uint32 `json:"ssl_stream_idle_timeout,omitempty"`
}
