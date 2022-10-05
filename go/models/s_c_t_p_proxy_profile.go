// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SCTPProxyProfile s c t p proxy profile
// swagger:model SCTPProxyProfile
type SCTPProxyProfile struct {

	// Number of SCTP Streams. Allowed values are 2-16. Field introduced in 22.1.3. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	NumberOfStreams *int32 `json:"number_of_streams,omitempty"`
}
