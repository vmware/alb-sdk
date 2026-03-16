// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CCDiscovery c c discovery
// swagger:model CC_Discovery
type CCDiscovery struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiscoveryTenants []*CCTenant `json:"discovery_tenants,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailedTenants []*CCTenant `json:"failed_tenants,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Poll *CCCron `json:"poll,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RanDiscovery *bool `json:"ran_discovery,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TrackedTenants []*CCTenant `json:"tracked_tenants,omitempty"`
}
