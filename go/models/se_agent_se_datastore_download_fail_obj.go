// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentSeDatastoreDownloadFailObj se agent se datastore download fail obj
// swagger:model SeAgentSeDatastoreDownloadFailObj
type SeAgentSeDatastoreDownloadFailObj struct {

	// UUID of object which se failed to download. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DlFailObjUUID *string `json:"dl_fail_obj_uuid,omitempty"`

	// error-ed notification's in_progres_version. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NotificationInProgressVersion *int64 `json:"notification_in_progress_version,omitempty"`

	// error-ed notification's start time. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NotificationStartTime *string `json:"notification_start_time,omitempty"`

	// notification's version. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NotificationVersion *int64 `json:"notification_version,omitempty"`

	// top level object name associated with download failed obj. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TopLevelObjName *string `json:"top_level_obj_name,omitempty"`

	// top level object uuid associated with download failed obj. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TopLevelObjUUID *string `json:"top_level_obj_uuid,omitempty"`
}
