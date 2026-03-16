// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SESubsriberStat s e subsriber stat
// swagger:model SESubsriberStat
type SESubsriberStat struct {

	// SE uuid. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Seuuid *string `json:"seuuid"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Versions []*KVVersion `json:"versions,omitempty"`
}
