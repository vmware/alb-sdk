// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnpoolStatsBase connpool stats base
// swagger:model ConnpoolStatsBase
type ConnpoolStatsBase struct {

	// Number of bound connections in the connection pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BoundSize *uint64 `json:"bound_size"`

	// Number of busy connections in the connection pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	BusySize *uint64 `json:"busy_size"`

	// Number of free connections in the connection pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FreeSize *uint64 `json:"free_size"`

	// Number of connections added to the connection pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumAdds *uint64 `json:"num_adds"`

	// Number of connections deleted from the connection pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumDels *uint64 `json:"num_dels"`

	// Number of connections removed from the connection pool due to an error. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumErrorEvicts *uint64 `json:"num_error_evicts"`

	// Number of connections removed from the connection pool due to invalid HTTP2 frame. Field introduced in 22.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumHttp2InvalidFrameEvicts *uint64 `json:"num_http2_invalid_frame_evicts,omitempty"`

	// Number of connections requested from the connection pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumRequested *uint64 `json:"num_requested"`

	// Number of free connections reused from the connection pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	NumReused *uint64 `json:"num_reused"`

	// Number of connections for which strategy was converted. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumStrategyConverted *uint64 `json:"num_strategy_converted,omitempty"`
}
