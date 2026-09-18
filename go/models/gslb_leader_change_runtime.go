// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbLeaderChangeRuntime gslb leader change runtime
// swagger:model GslbLeaderChangeRuntime
type GslbLeaderChangeRuntime struct {

	// Connection edges of sites know by the reporting site. E.g. [(siteA, siteB), (siteA, siteC)]. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Edges []*SiteLink `json:"edges,omitempty"`

	// This field captures leader change events in both manual and auto mode. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Events []*EventInfo `json:"events,omitempty"`

	// Last update time stamp. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUpdatedTime *TimeStamp `json:"last_updated_time,omitempty"`

	// Current maintenance mode of the peer site for enhanced visibility. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaintenanceMode *bool `json:"maintenance_mode,omitempty"`

	// Mode of leader change - manual or automatic. Enum options - GSLB_LC_MODE_MANUAL, GSLB_LC_MODE_AUTO. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mode *string `json:"mode,omitempty"`

	// This field captures number of consecutive unsuccessful health check probes. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumUnsuccessfulProbes *uint32 `json:"num_unsuccessful_probes,omitempty"`

	// Represents the site with cluster_uuid, name. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteInfo *SiteInfo `json:"site_info,omitempty"`

	// This field captures the status of leader change process in both manual and auto mode. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *GslbLeaderChangeStatus `json:"status,omitempty"`

	// Uuid of leader change record in datastore. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
