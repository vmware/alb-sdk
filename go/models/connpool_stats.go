// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnpoolStats connpool stats
// swagger:model ConnpoolStats
type ConnpoolStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BoundSize *uint64 `json:"bound_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BusySize *uint64 `json:"busy_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FreeSize *uint64 `json:"free_size"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumAdds *uint64 `json:"num_adds"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumCloseEvicts *uint64 `json:"num_close_evicts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumDels *uint64 `json:"num_dels"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumErrorEvicts *uint64 `json:"num_error_evicts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumFullEvicts *uint64 `json:"num_full_evicts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumFullUncached *uint64 `json:"num_full_uncached"`

	// Number of connections removed from the connection pool due to invalid HTTP2 frame. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHttp2InvalidFrameEvicts *uint64 `json:"num_http2_invalid_frame_evicts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumIDLEEvicts *uint64 `json:"num_idle_evicts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumLifetimes *uint64 `json:"num_lifetimes"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumRequested *uint64 `json:"num_requested"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumReuseEvicts *uint64 `json:"num_reuse_evicts"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumReused *uint64 `json:"num_reused"`

	// Number of connections for which strategy was converted. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStrategyConverted *uint64 `json:"num_strategy_converted,omitempty"`
}
