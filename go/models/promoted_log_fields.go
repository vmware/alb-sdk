// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PromotedLogFields promoted log fields
// swagger:model PromotedLogFields
type PromotedLogFields struct {

	// Dot-notation field paths to promote for ApplicationLog. Example  'waf_log' promotes the entire submessage; 'waf_log.status' promotes only the status sub-field. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AppLogFields []string `json:"app_log_fields,omitempty"`

	// Dot-notation field paths to promote for ConnectionLog. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnLogFields []string `json:"conn_log_fields,omitempty"`

	// Dot-notation field paths to promote for EventLog. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EventLogFields []string `json:"event_log_fields,omitempty"`
}
