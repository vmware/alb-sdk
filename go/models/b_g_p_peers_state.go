// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BGPPeersState b g p peers state
// swagger:model BGPPeersState
type BGPPeersState struct {

	// Peers state in the Vrf. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeersState []*BGPPeerState `json:"peers_state,omitempty"`

	// Vrf name. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfName *string `json:"vrf_name,omitempty"`
}
