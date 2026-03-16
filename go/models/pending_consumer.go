// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PendingConsumer pending consumer
// swagger:model PendingConsumer
type PendingConsumer struct {

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cookie *string `json:"cookie,omitempty"`

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	//  Enum options - IDLE, AWAITING_QUERY_HOST, AWAITING_SE_CREATE, AWAITING_SE_BOOTUP, AWAITING_VNIC_ADD, AWAITING_VNIC_IP, AWAITING_ATTACH_IP, AWAITING_PING_RSP, AWAITING_CHECK_SE, AWAITING_CHECK_CREATE_SE. Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ticks *uint64 `json:"ticks,omitempty"`

	//  Field introduced in 17.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
