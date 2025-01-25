// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CloudStatus cloud status
// swagger:model CloudStatus
type CloudStatus struct {

	// Cloud Id. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	CcID *string `json:"cc_id,omitempty"`

	// If integration with NSX-T streaming service is enabled, this field will contain the state of connection. Applicable to NSX clouds only. Field introduced in 31.1.1. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	NsxtStreamingServerStatus *NsxtStreamingServerStatus `json:"nsxt_streaming_server_status,omitempty"`

	// Reason message for the current state. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// ServiceEngine image state. Field introduced in 18.2.6. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	SeImageState []*SEImageStatus `json:"se_image_state,omitempty"`

	// Cloud State. Enum options - CLOUD_STATE_UNKNOWN, CLOUD_STATE_IN_PROGRESS, CLOUD_STATE_FAILED, CLOUD_STATE_PLACEMENT_READY, CLOUD_STATE_DELETING, CLOUD_STATE_NOT_CONNECTED. Allowed in Enterprise edition with any value, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`
}
