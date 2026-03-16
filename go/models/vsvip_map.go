// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VsvipMap vsvip map
// swagger:model VsvipMap
type VsvipMap struct {

	// Id of the thread executing the operation. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Threadid *string `json:"threadid,omitempty"`

	// Vsvip id for which an operation is in progress. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vsvipid *string `json:"vsvipid,omitempty"`
}
