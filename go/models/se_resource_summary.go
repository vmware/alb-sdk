// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeResourceSummary se resource summary
// swagger:model SeResourceSummary
type SeResourceSummary struct {

	// Availability zone. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Az *string `json:"az,omitempty"`

	// Cloud UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudUUID *string `json:"cloud_uuid,omitempty"`

	// Deletion pending. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DelPending *bool `json:"del_pending,omitempty"`

	// Disconnected. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Disconnected *bool `json:"disconnected,omitempty"`

	// Enable state. Enum options - SE_STATE_ENABLED, SE_STATE_DISABLED_FOR_PLACEMENT, SE_STATE_DISABLED, SE_STATE_DISABLED_FORCE, SE_STATE_DISABLED_WITH_SCALEIN, SE_STATE_DISABLED_NO_TRAFFIC, SE_STATE_DISABLED_FORCE_WITH_MIGRATE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableState *string `json:"enable_state,omitempty"`

	// Gateway up. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GatewayUp *bool `json:"gateway_up,omitempty"`

	// Max IPs per vNIC. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxIpsPerVnic *uint32 `json:"max_ips_per_vnic,omitempty"`

	// Max vNICs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxVnics *uint32 `json:"max_vnics,omitempty"`

	// Number of vNICs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnics *uint32 `json:"num_vnics,omitempty"`

	// Number of Avi Internal vNICs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicsAviInternal *uint32 `json:"num_vnics_avi_internal,omitempty"`

	// Number of deletion pending vNICs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicsDelPending *uint32 `json:"num_vnics_del_pending,omitempty"`

	// Number of disabled vNICs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicsDisabled *uint32 `json:"num_vnics_disabled,omitempty"`

	// Number of disconnected vNICs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVnicsDisconnected *uint32 `json:"num_vnics_disconnected,omitempty"`

	// Count of VSs pending placement on this SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsPending *uint32 `json:"num_vs_pending,omitempty"`

	// Count of VSs placed on this SE. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumVsPlaced *uint32 `json:"num_vs_placed,omitempty"`

	// Online. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Online *bool `json:"online,omitempty"`

	// Placement ineligible reason. Enum options - PLACEMENT_INELIGIBLE_UPGRADE_IN_PROGRESS, PLACEMENT_INELIGIBLE_SE_GRP_UPGRADE_IN_PROGRESS, PLACEMENT_INELIGIBLE_CLOUD_NOT_READY, PLACEMENT_INELIGIBLE_CLOUD_API_NOT_READY, PLACEMENT_INELIGIBLE_VS_ELIGIBLE, PLACEMENT_INELIGIBLE_MULTIPLE_SE_CRASHES, PLACEMENT_INELIGIBLE_SPAWN_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_SPAWN_FAIL_UNRECOVERABLE, PLACEMENT_INELIGIBLE_BOOTUP_FAIL, PLACEMENT_INELIGIBLE_VNIC_FAIL, PLACEMENT_INELIGIBLE_VNIC_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_VNIC_IP_FAIL, PLACEMENT_INELIGIBLE_ATTACH_IP_FAIL_MAX_LIMIT, PLACEMENT_INELIGIBLE_ATTACH_IP_FAIL_UNRECOVERABLE, PLACEMENT_INELIGIBLE_VIP_MULTIPLE_NETWORKS, PLACEMENT_INELIGIBLE_SRVR_MULTIPLE_NETWORKS, PLACEMENT_INELIGIBLE_NO_VIP_NETWORK, PLACEMENT_INELIGIBLE_NO_SRVR_NETWORK, PLACEMENT_INELIGIBLE_VIP_NETWORK_DOES_NOT_EXIST, PLACEMENT_INELIGIBLE_SRVR_NETWORK_DOES_NOT_EXIST.... Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementIneligibleReason *string `json:"placement_ineligible_reason,omitempty"`

	// Placement ineligible reason string. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementIneligibleReasonStr *string `json:"placement_ineligible_reason_str,omitempty"`

	// Placement ineligible timestamp. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementIneligibleTimestamp *TimeStamp `json:"placement_ineligible_timestamp,omitempty"`

	// SE group UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGroupUUID *string `json:"se_group_uuid,omitempty"`

	// SE group reboot pending. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeGrpRebootPending *bool `json:"se_grp_reboot_pending,omitempty"`

	// Sufficient memory. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SufficientMemory *bool `json:"sufficient_memory,omitempty"`

	// Upgrading. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Upgrading *bool `json:"upgrading,omitempty"`

	// SE UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// vNIC operation. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VnicOp *SeVnicOpProto `json:"vnic_op,omitempty"`

	// Warm starting. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WarmStarting *bool `json:"warm_starting,omitempty"`
}
