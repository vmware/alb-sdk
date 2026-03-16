// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PlacementIneligibleReasonConsumers placement ineligible reason consumers
// swagger:model PlacementIneligibleReasonConsumers
type PlacementIneligibleReasonConsumers struct {

	// Consumer IDs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumerIds []*SeConsumerID `json:"consumer_ids,omitempty"`

	// Placement ineligible reason. Enum options - PLACEMENT_INELIGIBLE_UPGRADE_IN_PROGRESS, PLACEMENT_INELIGIBLE_SE_GRP_UPGRADE_IN_PROGRESS, PLACEMENT_INELIGIBLE_CLOUD_NOT_READY, PLACEMENT_INELIGIBLE_CLOUD_API_NOT_READY, PLACEMENT_INELIGIBLE_VS_ELIGIBLE, PLACEMENT_INELIGIBLE_MULTIPLE_SE_CRASHES, PLACEMENT_INELIGIBLE_SPAWN_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_SPAWN_FAIL_UNRECOVERABLE, PLACEMENT_INELIGIBLE_BOOTUP_FAIL, PLACEMENT_INELIGIBLE_VNIC_FAIL, PLACEMENT_INELIGIBLE_VNIC_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_VNIC_IP_FAIL, PLACEMENT_INELIGIBLE_ATTACH_IP_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_ATTACH_IP_FAIL_UNRECOVERABLE, PLACEMENT_INELIGIBLE_VIP_MULTIPLE_NETWORKS, PLACEMENT_INELIGIBLE_SRVR_MULTIPLE_NETWORKS, PLACEMENT_INELIGIBLE_NO_VIP_NETWORK, PLACEMENT_INELIGIBLE_NO_SRVR_NETWORK, PLACEMENT_INELIGIBLE_VIP_NETWORK_DOES_NOT_EXIST, PLACEMENT_INELIGIBLE_SRVR_NETWORK_DOES_NOT_EXIST.... Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`
}
