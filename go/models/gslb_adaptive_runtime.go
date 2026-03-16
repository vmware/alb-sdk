// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbAdaptiveRuntime gslb adaptive runtime
// swagger:model GslbAdaptiveRuntime
type GslbAdaptiveRuntime struct {

	// Config Event for Adaptive Replication. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdaptiveEvents []*AdaptiveEvent `json:"adaptive_events,omitempty"`

	// SE UUID. It is a reference to an object of type ServiceEngine. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
