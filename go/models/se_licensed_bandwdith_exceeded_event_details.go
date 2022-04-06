// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeLicensedBandwdithExceededEventDetails se licensed bandwdith exceeded event details
// swagger:model SeLicensedBandwdithExceededEventDetails
type SeLicensedBandwdithExceededEventDetails struct {

	// Number of packets dropped since the last event. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	NumPktsDropped *int32 `json:"num_pkts_dropped,omitempty"`

	// UUID of the SE responsible for this event. It is a reference to an object of type ServiceEngine. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
