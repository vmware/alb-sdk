// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HorizonInternalPortInfo horizon internal port info
// swagger:model HorizonInternalPortInfo
type HorizonInternalPortInfo struct {

	// Front end horizon Blast mapped port. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HorizonFeBlastPort *uint32 `json:"horizon_fe_blast_port,omitempty"`

	// Front end horizon L7 redirect mapped port is present in mapping table. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HorizonFeBlastPortMapPresent *bool `json:"horizon_fe_blast_port_map_present,omitempty"`

	// Front end horizon L7 redirect mapped port. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HorizonFeL7Port *uint32 `json:"horizon_fe_l7_port,omitempty"`

	// Front end horizon L7 redirect mapped port is present in mapping table. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HorizonFeL7PortMapPresent *bool `json:"horizon_fe_l7_port_map_present,omitempty"`

	// Front end horizon PCoIP mapped port. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HorizonFePcoipPort *uint32 `json:"horizon_fe_pcoip_port,omitempty"`

	// Front end horizon L7 redirect mapped port is present in mapping table. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HorizonFePcoipPortMapPresent *bool `json:"horizon_fe_pcoip_port_map_present,omitempty"`
}
