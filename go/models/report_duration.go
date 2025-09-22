// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ReportDuration report duration
// swagger:model ReportDuration
type ReportDuration struct {

	// The end timestamp of the report when period is custom. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndTime *TimeStamp `json:"end_time,omitempty"`

	// The period for report generation. Enum options - REPORT_PERIOD_LAST_24_HOURS, REPORT_PERIOD_LAST_7_DAYS, REPORT_PERIOD_LAST_30_DAYS. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Period *string `json:"period,omitempty"`

	// The start timestamp of the report when period is custom. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	StartTime *TimeStamp `json:"start_time,omitempty"`
}
