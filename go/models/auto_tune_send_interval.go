// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AutoTuneSendInterval auto tune send interval
// swagger:model AutoTuneSendInterval
type AutoTuneSendInterval struct {

	// Time period to check if the send interval is valid. Allowed values are 100-3600. Field introduced in 30.2.5, 31.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AutoTuneSendIntervalTimeout *uint32 `json:"auto_tune_send_interval_timeout,omitempty"`

	// Set the flag to enable auto tune send interval. Field introduced in 30.2.5, 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`
}
