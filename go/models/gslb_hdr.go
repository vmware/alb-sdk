// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbHdr gslb hdr
// swagger:model GslbHdr
type GslbHdr struct {

	// Gslb Group - UUID. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GlbUUID *string `json:"glb_uuid,omitempty"`

	// Message type. Enum options - GSLB_SITE_NONE, GSLB_SITE_CONFIG, GSLB_SITE_HS, GSLB_SITE_MMODE, GSLB_SITE_FILE_CONFIG. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mtype *string `json:"mtype,omitempty"`

	// Receiver's Cluster UUID. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RxUUID *string `json:"rx_uuid,omitempty"`

	// Timestamp is used as txn-id to identify a txn.  Responses will contain the same txn-id for id.  . Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timestamp *float32 `json:"timestamp,omitempty"`

	// Sender's Cluster UUID. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TxUUID *string `json:"tx_uuid,omitempty"`

	// view-id used in maintenance mode. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ViewID *uint64 `json:"view_id,omitempty"`
}
