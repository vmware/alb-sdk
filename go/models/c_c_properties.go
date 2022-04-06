// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CCProperties c c properties
// swagger:model CC_Properties
type CCProperties struct {

	//  Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RPCPollInterval *int32 `json:"rpc_poll_interval,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RPCQueueSize *int32 `json:"rpc_queue_size,omitempty"`
}
