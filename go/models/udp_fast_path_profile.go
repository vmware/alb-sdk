// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UDPFastPathProfile UDP fast path profile
// swagger:model UDPFastPathProfile
type UDPFastPathProfile struct {

	// DSR profile information. Field introduced in 18.2.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	DsrProfile *DsrProfile `json:"dsr_profile,omitempty"`

	// When enabled, every UDP packet is considered a new transaction and may be load balanced to a different server.  When disabled, packets from the same client source IP and port are sent to the same server. Allowed in Enterprise with any value edition, Essentials(Allowed values- false) edition, Basic(Allowed values- false) edition, Enterprise with Cloud Services edition.
	PerPktLoadbalance *bool `json:"per_pkt_loadbalance,omitempty"`

	// The amount of time (in sec) for which a flow needs to be idle before it is deleted. Allowed values are 2-3600. Unit is SEC. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SessionIDLETimeout *int32 `json:"session_idle_timeout,omitempty"`

	// When disabled, Source NAT will not be performed for all client UDP packets. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Snat *bool `json:"snat,omitempty"`
}
