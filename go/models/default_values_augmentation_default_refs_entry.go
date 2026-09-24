// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DefaultValuesAugmentationDefaultRefsEntry default values augmentation default refs entry
// swagger:model DefaultValuesAugmentation.DefaultRefsEntry
type DefaultValuesAugmentationDefaultRefsEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Key *string `json:"key,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Value *DefaultValuesURLList `json:"value,omitempty"`
}
