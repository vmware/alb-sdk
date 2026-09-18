// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BGPPeerStateMsg b g p peer state msg
// swagger:model BGPPeerStateMsg
type BGPPeerStateMsg struct {

	// Peer IP. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeerIP *string `json:"peer_ip,omitempty"`

	// Peer's state. Enum options - BGP_PEER_IDLE, BGP_PEER_NOT_APPLICABLE_TO_THIS_SE, BGP_PEER_ESTABLISHED, BGP_PEER_NOT_ESTABLISHED, BGP_PEER_PREFIX_EXCEEDED. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	// Up/Down time. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpOrDownTime *string `json:"upOrDownTime,omitempty"`
}
