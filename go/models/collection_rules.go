// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CollectionRules collection rules
// swagger:model CollectionRules
type CollectionRules struct {

	// The period for report generation. Enum options - REPORT_PERIOD_LAST_24_HOURS, REPORT_PERIOD_LAST_7_DAYS, REPORT_PERIOD_LAST_30_DAYS. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnforcedReportPeriod *string `json:"enforced_report_period,omitempty"`

	// Minimum data samples required for report generation. Allowed values are 200-5000. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnforcedReportSamples *uint32 `json:"enforced_report_samples,omitempty"`

	// Maximum number of concurrent workers used for data collection during report generation. Allowed values are 1-10. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxConcurrentWorkers *uint32 `json:"max_concurrent_workers,omitempty"`

	// Minimum free disk required for report generation in GB. Allowed values are 0.1-20. Field introduced in 31.2.1. Unit is GB. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinFreeDiskRequired *float32 `json:"min_free_disk_required,omitempty"`

	// Timeout for report generation in seconds. Allowed values are 300-3600. Field introduced in 31.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Timeout *uint32 `json:"timeout,omitempty"`
}
