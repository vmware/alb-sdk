// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolObjsync pool objsync
// swagger:model PoolObjsync
type PoolObjsync struct {

	// Pool hub versions. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HubVersions []*PoolVersion `json:"hubVersions,omitempty"`

	// Hub uuid. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Hubuuid *string `json:"hubuuid"`

	// Number of subscribers. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSub *uint32 `json:"numSub,omitempty"`

	// Process id. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// SE uuid. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Pool subscriber stats. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SubStats []*SEPoolSubscriberStat `json:"subStats,omitempty"`
}
