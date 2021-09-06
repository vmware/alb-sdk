// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerAutoScalePolicy server auto scale policy
// swagger:model ServerAutoScalePolicy
type ServerAutoScalePolicy struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Delay in minutes after which a down server will be removed from Pool. Value 0 disables this functionality. Field introduced in 20.1.3.
	DelayForServerGarbageCollection *int32 `json:"delay_for_server_garbage_collection,omitempty"`

	// User defined description for the object.
	Description *string `json:"description,omitempty"`

	// Use Avi intelligent autoscale algorithm where autoscale is performed by comparing load on the pool against estimated capacity of all the servers.
	IntelligentAutoscale *bool `json:"intelligent_autoscale,omitempty"`

	// Maximum extra capacity as percentage of load used by the intelligent scheme. Scale-in is triggered when available capacity is more than this margin. Allowed values are 1-99.
	IntelligentScaleinMargin *int32 `json:"intelligent_scalein_margin,omitempty"`

	// Minimum extra capacity as percentage of load used by the intelligent scheme. Scale-out is triggered when available capacity is less than this margin. Allowed values are 1-99.
	IntelligentScaleoutMargin *int32 `json:"intelligent_scaleout_margin,omitempty"`

	// Key value pairs for granular object access control. Also allows for classification and tagging of similar objects. Field deprecated in 20.1.5. Field introduced in 20.1.3. Maximum of 4 items allowed.
	Labels []*KeyValue `json:"labels,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 20.1.5. Allowed in Basic edition, Essentials edition, Enterprise edition.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	// Maximum number of servers to scale-in simultaneously. The actual number of servers to scale-in is chosen such that target number of servers is always more than or equal to the min_size.
	MaxScaleinAdjustmentStep *int32 `json:"max_scalein_adjustment_step,omitempty"`

	// Maximum number of servers to scale-out simultaneously. The actual number of servers to scale-out is chosen such that target number of servers is always less than or equal to the max_size.
	MaxScaleoutAdjustmentStep *int32 `json:"max_scaleout_adjustment_step,omitempty"`

	// Maximum number of servers after scale-out. Allowed values are 0-400.
	MaxSize *int32 `json:"max_size,omitempty"`

	// No scale-in happens once number of operationally up servers reach min_servers. Allowed values are 0-400.
	MinSize *int32 `json:"min_size,omitempty"`

	// Name of the object.
	// Required: true
	Name *string `json:"name"`

	// Trigger scale-in when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.
	ScaleinAlertconfigRefs []string `json:"scalein_alertconfig_refs,omitempty"`

	// Cooldown period during which no new scale-in is triggered to allow previous scale-in to successfully complete. Unit is SEC.
	ScaleinCooldown *int32 `json:"scalein_cooldown,omitempty"`

	// Trigger scale-out when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.
	ScaleoutAlertconfigRefs []string `json:"scaleout_alertconfig_refs,omitempty"`

	// Cooldown period during which no new scale-out is triggered to allow previous scale-out to successfully complete. Unit is SEC.
	ScaleoutCooldown *int32 `json:"scaleout_cooldown,omitempty"`

	// Scheduled-based scale-in/out policy. During scheduled intervals, metrics based autoscale is not enabled and number of servers will be solely derived from ScheduleScale policy. Field introduced in 21.1.1. Maximum of 1 items allowed.
	ScheduledScalings []*ScheduledScaling `json:"scheduled_scalings,omitempty"`

	//  It is a reference to an object of type Tenant.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Use predicted load rather than current load.
	UsePredictedLoad *bool `json:"use_predicted_load,omitempty"`

	// Unique object identifier of the object.
	UUID *string `json:"uuid,omitempty"`
}
