// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClusterConfigFailedEvent cluster config failed event
// swagger:model ClusterConfigFailedEvent
type ClusterConfigFailedEvent struct {

	// Failure reason. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`
}
