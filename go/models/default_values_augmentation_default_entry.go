// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DefaultValuesAugmentationDefaultEntry default values augmentation default entry
// swagger:model DefaultValuesAugmentation.DefaultEntry
type DefaultValuesAugmentationDefaultEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *DefaultValuesUUIDList `json:"value,omitempty"`
}
