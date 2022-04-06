// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MicroServiceContainer micro service container
// swagger:model MicroServiceContainer
type MicroServiceContainer struct {

	// ID of the container. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ContainerID *string `json:"container_id,omitempty"`

	// ID or name of the host where the container is. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Host *string `json:"host,omitempty"`

	// IP Address of the container. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	IP *IPAddr `json:"ip"`

	// Port nunber of the instance. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Port *int32 `json:"port,omitempty"`

	// Marathon Task ID of the instance. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TaskID *string `json:"task_id,omitempty"`
}
