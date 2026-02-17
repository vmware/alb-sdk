// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngineGroupInventory service engine group inventory
// swagger:model ServiceEngineGroupInventory
type ServiceEngineGroupInventory struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Configuration summary of the service engine group. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Config *ServiceEngineGroup `json:"config,omitempty"`

	// Service engines the SE-Group is assigned to. It is a reference to an object of type ServiceEngine. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Serviceengines []string `json:"serviceengines,omitempty"`

	// Upgrade status summary of the service engine group. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Upgradestatus *UpgradeStatusSummary `json:"upgradestatus,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the service engine group. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Virtual services the SE-Group is assigned to. It is a reference to an object of type VirtualService. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Virtualservices []string `json:"virtualservices,omitempty"`
}
