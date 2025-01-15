// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MesosSeResources mesos se resources
// swagger:model MesosSeResources
type MesosSeResources struct {

	// Attribute (Fleet or Mesos) key of Hosts. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AttributeKey *string `json:"attribute_key"`

	// Attribute (Fleet or Mesos) value of Hosts. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AttributeValue *string `json:"attribute_value"`

	// Obsolete - ignored. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CPU *float32 `json:"cpu,omitempty"`

	// Obsolete - ignored. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Memory *uint32 `json:"memory,omitempty"`
}
