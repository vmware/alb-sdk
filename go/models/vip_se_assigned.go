// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VipSeAssigned vip se assigned
// swagger:model VipSeAssigned
type VipSeAssigned struct {

	// Vip is Active on Cloud. Field introduced in 21.1.3.
	ActiveOnCloud *bool `json:"active_on_cloud,omitempty"`

	// Vip is Active on this ServiceEngine. Field introduced in 21.1.3.
	ActiveOnSe *bool `json:"active_on_se,omitempty"`

	// Placeholder for description of property admin_down_requested of obj type VipSeAssigned field type str  type boolean
	AdminDownRequested *bool `json:"admin_down_requested,omitempty"`

	// Attach IP is in progress. Field introduced in 21.1.3.
	AttachIPInProgress *bool `json:"attach_ip_in_progress,omitempty"`

	// Placeholder for description of property connected of obj type VipSeAssigned field type str  type boolean
	Connected *bool `json:"connected,omitempty"`

	// Detach IP is in progress. Field introduced in 21.1.3.
	DetachIPInProgress *bool `json:"detach_ip_in_progress,omitempty"`

	// Management IPv4 address of SE. Field introduced in 20.1.3.
	MgmtIP *IPAddr `json:"mgmt_ip,omitempty"`

	// Management IPv6 address of SE. Field introduced in 20.1.3.
	MgmtIp6 *IPAddr `json:"mgmt_ip6,omitempty"`

	// Name of the object.
	Name *string `json:"name,omitempty"`

	// Placeholder for description of property oper_status of obj type VipSeAssigned field type str  type object
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	// Placeholder for description of property primary of obj type VipSeAssigned field type str  type boolean
	Primary *bool `json:"primary,omitempty"`

	//  It is a reference to an object of type ServiceEngine.
	Ref *string `json:"ref,omitempty"`

	// Placeholder for description of property scalein_in_progress of obj type VipSeAssigned field type str  type boolean
	ScaleinInProgress *bool `json:"scalein_in_progress,omitempty"`

	// Vip is awaiting scaleout response from this ServiceEngine. Field introduced in 21.1.3.
	ScaleoutInProgress *bool `json:"scaleout_in_progress,omitempty"`

	// Vip is awaiting response from this ServiceEngine. Field introduced in 21.1.3.
	SeReadyInProgress *bool `json:"se_ready_in_progress,omitempty"`

	// Placeholder for description of property snat_ip of obj type VipSeAssigned field type str  type object
	SnatIP *IPAddr `json:"snat_ip,omitempty"`

	// Placeholder for description of property standby of obj type VipSeAssigned field type str  type boolean
	Standby *bool `json:"standby,omitempty"`
}
