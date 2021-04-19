// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VipAutoscaleZones vip autoscale zones
// swagger:model VipAutoscaleZones
type VipAutoscaleZones struct {

	// Availability zone associated with the subnet. Field introduced in 17.2.12, 18.1.2.
	// Read Only: true
	AvailabilityZone *string `json:"availability_zone,omitempty"`

	// Determines if the subnet is capable of hosting publicly accessible IP. Field introduced in 17.2.12, 18.1.2.
	// Read Only: true
	FipCapable *bool `json:"fip_capable,omitempty"`

	// UUID of the subnet for new IP address allocation. Field introduced in 17.2.12, 18.1.2.
	SubnetUUID *string `json:"subnet_uuid,omitempty"`
}
