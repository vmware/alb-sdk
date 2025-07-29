// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// QatConfig qat config
// swagger:model QatConfig
type QatConfig struct {

	// This knob enables the QAT offloads for TLS application data. (if the host CPU is capable, and the QAT device is exposed). Requires SE Reboot. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DisableQatBulkCrypto *bool `json:"disable_qat_bulk_crypto,omitempty"`

	// Enalbes Hardware QAT. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	QatHwEnable *bool `json:"qat_hw_enable,omitempty"`

	// Enable Software QAT. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	QatSwEnable *bool `json:"qat_sw_enable,omitempty"`
}
