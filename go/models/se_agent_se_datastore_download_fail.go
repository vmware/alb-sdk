// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentSeDatastoreDownloadFail se agent se datastore download fail
// swagger:model SeAgentSeDatastoreDownloadFail
type SeAgentSeDatastoreDownloadFail struct {

	// Objects which a service engine failed to download objects from controller. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DlFailedObjs []*SeAgentSeDatastoreDownloadFailObj `json:"dl_failed_objs,omitempty"`

	// SE UUID. It is a reference to an object of type ServiceEngine. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
