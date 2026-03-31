// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BgpAdvertisedRoutes bgp advertised routes
// swagger:model BgpAdvertisedRoutes
type BgpAdvertisedRoutes struct {

	// Routes advertised to BGP peers. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdvertisedRoutes []*BGPPeerAdvertisedRoutes `json:"advertised_routes,omitempty"`

	// Namespace correspnding to vrf. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Namespace *string `json:"namespace,omitempty"`

	// VRF of BGPd. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrf *string `json:"vrf,omitempty"`
}
