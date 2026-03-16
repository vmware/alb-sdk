// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VserverL4SSLStats vserver l4 s s l stats
// swagger:model VserverL4SSLStats
type VserverL4SSLStats struct {

	// Number of times the client side back pressure happens. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientSideBackPressures *uint64 `json:"client_side_back_pressures,omitempty"`

	// Stats pertaining to Datascript. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4ssldsstats *VserverL4SSLDSStats `json:"l4ssldsstats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NodeObjID *string `json:"node_obj_id"`

	// Number of times the preread phase timedout. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrereadPhaseTimedout *uint64 `json:"preread_phase_timedout,omitempty"`

	// Number of bytes received from the client(s). Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxFromClient *uint64 `json:"rx_from_client,omitempty"`

	// Number of bytes received from the server(s). Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxFromServer *uint64 `json:"rx_from_server,omitempty"`

	// Number of bytes sent to the client(s). Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SentToClient *uint64 `json:"sent_to_client,omitempty"`

	// Number of bytes sent to the server(s). Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SentToServer *uint64 `json:"sent_to_server,omitempty"`

	// Number of times the server side back pressure happens. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerSideBackPressures *uint64 `json:"server_side_back_pressures,omitempty"`

	// Number of errors detected while establishing connection. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionConnectErrors *uint64 `json:"session_connect_errors,omitempty"`

	// Number of network configuration errors on session initialization. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionInitAllocErrors *uint64 `json:"session_init_alloc_errors,omitempty"`

	// Number of network configuration errors on session initialization. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionInitConfErrors *uint64 `json:"session_init_conf_errors,omitempty"`

	// Number of memory allocation errors after establishing connection. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPostConnectAllocErrors *uint64 `json:"session_post_connect_alloc_errors,omitempty"`

	// Number of client errors after establishing connection. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPostConnectClientErrors *uint64 `json:"session_post_connect_client_errors,omitempty"`

	// Number of server errors after establishing connection. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPostConnectServerErrors *uint64 `json:"session_post_connect_server_errors,omitempty"`

	// Number of network configuration errors after establishing connection. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPostConnectSocketErrors *uint64 `json:"session_post_connect_socket_errors,omitempty"`

	// Number of memory allocation errors before establishing connection. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPreConnectAllocErrors *uint64 `json:"session_pre_connect_alloc_errors,omitempty"`

	// Number of network configuration errors before establishing connection. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SessionPreConnectSocketErrors *uint64 `json:"session_pre_connect_socket_errors,omitempty"`
}
