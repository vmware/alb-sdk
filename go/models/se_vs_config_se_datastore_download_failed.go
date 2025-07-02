// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeVsConfigSeDatastoreDownloadFailed se vs config se datastore download failed
// swagger:model SeVsConfigSeDatastoreDownloadFailed
type SeVsConfigSeDatastoreDownloadFailed struct {

	// Name of the failed config Object where Downlaod Fails. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FailObjName *string `json:"fail_obj_name,omitempty"`

	// UUID of the failed config object. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FailObjUUID *string `json:"fail_obj_uuid,omitempty"`

	// Reason for config download failure. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FailReason *string `json:"fail_reason,omitempty"`

	// UUID of the Top Level Object where Config Downlaod Failed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ParentObjUUID *string `json:"parent_obj_uuid,omitempty"`

	// UUID of the SE responsible for this event. It is a reference to an object of type ServiceEngine. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`

	// UUID of the VS where Config Downlaod Failed. It is a reference to an object of type VirtualService. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	VsRef *string `json:"vs_ref,omitempty"`
}
