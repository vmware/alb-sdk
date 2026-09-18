// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSiteOpsStaleObjectStatus gslb site ops stale object status
// swagger:model GslbSiteOpsStaleObjectStatus
type GslbSiteOpsStaleObjectStatus struct {

	// Additional details of the command. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Details []string `json:"details,omitempty"`
}
