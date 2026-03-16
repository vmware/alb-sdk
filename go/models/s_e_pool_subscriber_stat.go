// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SEPoolSubscriberStat s e pool subscriber stat
// swagger:model SEPoolSubscriberStat
type SEPoolSubscriberStat struct {

	// SE uuid. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Seuuid *string `json:"seuuid"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Versions []*PoolVersion `json:"versions,omitempty"`
}
