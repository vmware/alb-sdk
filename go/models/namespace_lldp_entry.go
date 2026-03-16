// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NamespaceLldpEntry namespace lldp entry
// swagger:model NamespaceLldpEntry
type NamespaceLldpEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NsName *string `json:"ns_name"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`
}
