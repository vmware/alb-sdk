// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DomainVsMapEntry domain vs map entry
// swagger:model DomainVsMapEntry
type DomainVsMapEntry struct {

	// Domain hosted by the SE. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Domain *string `json:"domain,omitempty"`

	// DNS Vs uuids hosting this domain. Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUuids []string `json:"vs_uuids,omitempty"`
}
