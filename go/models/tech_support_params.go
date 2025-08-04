// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupportParams tech support params
// swagger:model TechSupportParams
type TechSupportParams struct {

	// 'Customer case number for which this techsupport is generated. ''Useful for connected portal and other use-cases.'. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CaseNumber *string `json:"case_number,omitempty"`

	// User provided description to capture additional details and context regarding the techsupport invocation. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Collect events based on duration, specify one from choices [m, h, d, w]. i.e. minutes, hours, days, weeks. e.g. 10m, 5h, 2d, 1w. e.g. techsupport debuglogs duration 30m. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Duration *string `json:"duration,omitempty"`

	// Specify this params to set threshold for all event files. User provided parameters will take precedence over the profile parameters. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EventParams *TechSupportEventParams `json:"event_params,omitempty"`

	// Techsupport collection level. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Level *string `json:"level,omitempty"`

	// Name of the objects like service engine, vs, pool etc. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Specify pattern to collect specific info in techsupport. User can specify error patterns to filter files based on pattern only. This way will reduce unnecessary collection. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Pattern *string `json:"pattern,omitempty"`

	// Use this flag for skippable warnings. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SkipWarnings *bool `json:"skip_warnings,omitempty"`

	// Techsupport collection slug; Typically uuid of a vs, gslb etc. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Slug *string `json:"slug,omitempty"`

	// Start timestamp of techsupport collection. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StartTimestamp *string `json:"start_timestamp,omitempty"`

	// X-Avi-Tenant of HTTP POST request for authentication. Always admin for now, can be override in the future. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Tenant *string `json:"tenant,omitempty"`

	// Techsupport uuid for RPC related requirements. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
