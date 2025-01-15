// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafCrsConfig waf crs config
// swagger:model WafCrsConfig
type WafCrsConfig struct {

	// Enable to automatically download new WAF signatures/CRS version to the Controller. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	EnableAutoDownloadWafSignatures *bool `json:"enable_auto_download_waf_signatures,omitempty"`

	// Enable event notifications when new WAF signatures/CRS versions are available. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition. Special default for Essentials edition is false, Basic edition is false, Enterprise edition is True.
	EnableWafSignaturesNotifications *bool `json:"enable_waf_signatures_notifications,omitempty"`
}
