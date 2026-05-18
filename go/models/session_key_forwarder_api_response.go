// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SessionKeyForwarderAPIResponse session key forwarder Api response
// swagger:model SessionKeyForwarderApiResponse
type SessionKeyForwarderAPIResponse struct {

	// count
	// Required: true
	Count *int32 `json:"count"`

	// next
	Next *string `json:"next,omitempty"`

	// results
	// Required: true
	Results []*SessionKeyForwarder `json:"results,omitempty"`
}
