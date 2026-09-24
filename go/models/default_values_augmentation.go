// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DefaultValuesAugmentation default values augmentation
// swagger:model DefaultValuesAugmentation
type DefaultValuesAugmentation struct {

	// Keyed by lowercased object_model name, value is the list of system-default object UUIDs for that type. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Default map[string]DefaultValuesUUIDList `json:"default,omitempty"`

	// Keyed by lowercased object_model name, value is the list of REST URLs for that type's system-default objects. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DefaultRefs map[string]DefaultValuesURLList `json:"default_refs,omitempty"`
}
