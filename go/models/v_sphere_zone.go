// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VSphereZone v sphere zone
// swagger:model VSphereZone
type VSphereZone struct {

	// The UUID of the vCenter Server where the vSphere zone belongs. It is a reference to an object of type VCenterServer. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VcenterRef *string `json:"vcenter_ref,omitempty"`

	// Name of the vSphere zone in vCenter. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ZoneName *string `json:"zone_name,omitempty"`
}
