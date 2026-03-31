// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPConnectionRuntimeDetail Http connection runtime detail
// swagger:model HttpConnectionRuntimeDetail
type HTTPConnectionRuntimeDetail struct {

	// HTTP Connection Runtime Information. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Runtime *HTTPConnectionRuntime `json:"runtime"`
}
