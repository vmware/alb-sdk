// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbServiceAlgoStat gslb service algo stat
// swagger:model GslbServiceAlgoStat
type GslbServiceAlgoStat struct {

	// GSLB pool algo stat. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Algostat []*AlgoStatRuntime `json:"algostat,omitempty"`

	// GSLB Service name. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// GSLB Service UUID. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
