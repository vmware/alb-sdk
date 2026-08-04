// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConsumerStats consumer stats
// swagger:model ConsumerStats
type ConsumerStats struct {

	// Count of shared VsVIPs with asymmetrically scaled out VSs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAsymmetricSharedVip *uint32 `json:"num_asymmetric_shared_vip,omitempty"`

	// Count of VSs which have not completed cloud programming of the VIP. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAttachIPIncomplete *uint32 `json:"num_attach_ip_incomplete,omitempty"`

	// Count of disabled VSs. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDisabled *uint32 `json:"num_disabled,omitempty"`

	// Count of VSs with enable_rhi. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEnableRhi *uint32 `json:"num_enable_rhi,omitempty"`

	// Count of VSs with enable_rhi_snat. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumEnableRhiSnat *uint32 `json:"num_enable_rhi_snat,omitempty"`

	// Count of VSs which are placed on the requested number of SEs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumFullyPlaced *uint32 `json:"num_fully_placed,omitempty"`

	// Count of VSs which are idle and not placed on the requested number of SEs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIdle *uint32 `json:"num_idle,omitempty"`

	// Count of VSs with ign_pool_net_reach. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumIgnPoolNetReach *uint32 `json:"num_ign_pool_net_reach,omitempty"`

	// Count of VSs not placed on any SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumNotPlaced *uint32 `json:"num_not_placed,omitempty"`

	// Count of VSs which are placed on at least one SE, but not the requested number. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPartiallyPlaced *uint32 `json:"num_partially_placed,omitempty"`

	// Count of VSs currently pending placement on a SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPendingPlacement *uint32 `json:"num_pending_placement,omitempty"`

	// Count of VSs which are placement ineligible (unable to proceed with placement). Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumPlacementIneligible *uint32 `json:"num_placement_ineligible,omitempty"`

	// Count of VSs with scaleout_ecmp. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumScaleoutEcmp *uint32 `json:"num_scaleout_ecmp,omitempty"`

	// Count of shared VsVIPs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSharedVip *uint32 `json:"num_shared_vip,omitempty"`

	// Count of SNI child VSs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSniChild *uint32 `json:"num_sni_child,omitempty"`

	// Count of SNI parent VSs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSniParent *uint32 `json:"num_sni_parent,omitempty"`

	// Total VS count. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTotal *uint32 `json:"num_total,omitempty"`

	// Count of VSs with traffic disabled. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumTrafficDisabled *uint32 `json:"num_traffic_disabled,omitempty"`

	// Count of wildcard VIP VSs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumWildcard *uint32 `json:"num_wildcard,omitempty"`

	// Count of wildcard VIP VSs which are placed on all placement networks. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumWildcardFullyPlacedAllNws *uint32 `json:"num_wildcard_fully_placed_all_nws,omitempty"`

	// Count of wildcard VIP VSs which are placed on a subset of placement networks. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumWildcardFullyPlacedSomeNws *uint32 `json:"num_wildcard_fully_placed_some_nws,omitempty"`
}
