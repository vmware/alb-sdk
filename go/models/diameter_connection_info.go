// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiameterConnectionInfo diameter connection info
// swagger:model DiameterConnectionInfo
type DiameterConnectionInfo struct {

	// Parsing state. Enum options - DIAM_MSG_NEW, DIAM_MSG_WAIT_LEN, DIAM_MSG_WAIT_REST. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiamMsgParseState *string `json:"diam_msg_parse_state,omitempty"`

	// Cumulative count of diameter messages received and processed on this connection. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumDiamMsgProcessed *int32 `json:"num_diam_msg_processed,omitempty"`

	// Number of parsed diameter messages yet to be processed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumParsedMsgInQueue *int32 `json:"num_parsed_msg_in_queue,omitempty"`

	// Whether partial-diameter-message is received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PartialMsgInQueue *bool `json:"partial_msg_in_queue,omitempty"`

	// Number of bytes of diameter message received so far. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PartialMsgRcvdLen *int32 `json:"partial_msg_rcvd_len,omitempty"`

	// Total number of bytes in the diameter message. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PartialMsgTotalLen *int32 `json:"partial_msg_total_len,omitempty"`

	// IP address of the remote endpoint. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RemIpaddr *IPAddr `json:"rem_ipaddr,omitempty"`
}
