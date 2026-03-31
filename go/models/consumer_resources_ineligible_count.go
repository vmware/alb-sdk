// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConsumerResourcesIneligibleCount consumer resources ineligible count
// swagger:model ConsumerResourcesIneligibleCount
type ConsumerResourcesIneligibleCount struct {

	// Number of SEs in the SE group which are ineligible for this VS for this reason. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Count *uint32 `json:"count,omitempty"`

	// Reason code for why SE(s) are not placement candidates for this VS. Enum options - PLACEMENT_INELIGIBLE_UPGRADE_IN_PROGRESS, PLACEMENT_INELIGIBLE_SE_GRP_UPGRADE_IN_PROGRESS, PLACEMENT_INELIGIBLE_CLOUD_NOT_READY, PLACEMENT_INELIGIBLE_CLOUD_API_NOT_READY, PLACEMENT_INELIGIBLE_VS_ELIGIBLE, PLACEMENT_INELIGIBLE_MULTIPLE_SE_CRASHES, PLACEMENT_INELIGIBLE_SPAWN_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_SPAWN_FAIL_UNRECOVERABLE, PLACEMENT_INELIGIBLE_BOOTUP_FAIL, PLACEMENT_INELIGIBLE_VNIC_FAIL, PLACEMENT_INELIGIBLE_VNIC_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_VNIC_IP_FAIL, PLACEMENT_INELIGIBLE_ATTACH_IP_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_ATTACH_IP_FAIL_UNRECOVERABLE, PLACEMENT_INELIGIBLE_VIP_MULTIPLE_NETWORKS, PLACEMENT_INELIGIBLE_SRVR_MULTIPLE_NETWORKS, PLACEMENT_INELIGIBLE_NO_VIP_NETWORK, PLACEMENT_INELIGIBLE_NO_SRVR_NETWORK, PLACEMENT_INELIGIBLE_VIP_NETWORK_DOES_NOT_EXIST, PLACEMENT_INELIGIBLE_SRVR_NETWORK_DOES_NOT_EXIST.... Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementIneligibleReason *string `json:"placement_ineligible_reason,omitempty"`

	// Timestamp at which this count was obtained. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timestamp *TimeStamp `json:"timestamp,omitempty"`
}
