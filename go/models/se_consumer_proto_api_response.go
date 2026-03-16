// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeConsumerProtoAPIResponse se consumer proto Api response
// swagger:model SeConsumerProtoApiResponse
type SeConsumerProtoAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*SeConsumerProto `json:"results,omitempty"`
}
