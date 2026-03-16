// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnpoolGlobalStats connpool global stats
// swagger:model ConnpoolGlobalStats
type ConnpoolGlobalStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumAdds *uint64 `json:"num_adds"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumDels *uint64 `json:"num_dels"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumDrains *uint64 `json:"num_drains"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumFullEvicts *uint64 `json:"num_full_evicts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumFullUncached *uint64 `json:"num_full_uncached"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumNoServer *uint64 `json:"num_no_server"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumRequested *uint64 `json:"num_requested"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumReused *uint64 `json:"num_reused"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumThreshBreach *uint64 `json:"num_thresh_breach"`
}
