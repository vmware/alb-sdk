// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SipMessage sip message
// swagger:model SipMessage
type SipMessage struct {

	// Contents up to first 128 bytes of a SIP message for which could not be parsed. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Content *string `json:"content,omitempty"`

	// Indicates if SIP message is received from a client. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FromClient *bool `json:"from_client,omitempty"`

	// SIP request method string. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Method *string `json:"method,omitempty"`

	// SIP message receive time stamp. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RcvTimestamp *int64 `json:"rcv_timestamp,omitempty"`

	// SIP message size before modifications. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	RxBytes *int32 `json:"rx_bytes,omitempty"`

	// SIP response status string. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// SIP response status code, 2xx response means success. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	StatusCode *int32 `json:"status_code,omitempty"`

	// SIP message size post modifications. Field introduced in 17.2.12, 18.1.3, 18.2.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TxBytes *int32 `json:"tx_bytes,omitempty"`
}
