// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SecMgrDataEvent sec mgr data event
// swagger:model SecMgrDataEvent
type SecMgrDataEvent struct {

	// Type of the generated for an application. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Error *string `json:"error,omitempty"`

	// Name of the application. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`
}
