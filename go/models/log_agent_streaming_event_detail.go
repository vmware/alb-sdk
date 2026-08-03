// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LogAgentStreamingEventDetail log agent streaming event detail
// swagger:model LogAgentStreamingEventDetail
type LogAgentStreamingEventDetail struct {

	//  Field introduced in 32.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorCode *uint32 `json:"error_code,omitempty"`

	//  Field introduced in 32.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ErrorReason *string `json:"error_reason,omitempty"`

	//  Field introduced in 32.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Host *string `json:"host,omitempty"`

	//  Field introduced in 32.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Port *uint32 `json:"port,omitempty"`
}
