// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClusterServiceCriticalFailureEvent cluster service critical failure event
// swagger:model ClusterServiceCriticalFailureEvent
type ClusterServiceCriticalFailureEvent struct {

	// Name of controller node. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NodeName *string `json:"node_name,omitempty"`

	// Name of the controller service. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ServiceName *string `json:"service_name,omitempty"`
}
