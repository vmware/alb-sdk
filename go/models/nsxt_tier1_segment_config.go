// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtTier1SegmentConfig nsxt tier1 segment config
// swagger:model NsxtTier1SegmentConfig
type NsxtTier1SegmentConfig struct {

	// Avi controller creates and manages logical segments for a Tier-1 LR. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition.
	Automatic *NsxtTier1SegmentAutomaticMode `json:"automatic,omitempty"`

	// Avi Admin selects an available logical segment (created by NSX-T admin) associated with a Tier-1 LR. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Manual *NsxtTier1SegmentManualMode `json:"manual,omitempty"`

	// Config Mode for selecting the placement logical segments for Avi ServiceEngine data path. Enum options - TIER1_SEGMENT_MANUAL, TIER1_SEGMENT_AUTOMATIC. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Enterprise with Cloud Services edition. Allowed in Basic (Allowed values- TIER1_SEGMENT_MANUAL) edition.
	// Required: true
	SegmentConfigMode *string `json:"segment_config_mode"`
}
