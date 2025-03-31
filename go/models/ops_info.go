// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// OpsInfo ops info
// swagger:model OpsInfo
type OpsInfo struct {

	// Current outstanding request-response token of the message to this site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Rrtoken []string `json:"rrtoken,omitempty"`
}
