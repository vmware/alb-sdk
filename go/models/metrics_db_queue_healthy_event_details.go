// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsDbQueueHealthyEventDetails metrics db queue healthy event details
// swagger:model MetricsDbQueueHealthyEventDetails
type MetricsDbQueueHealthyEventDetails struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	High *int64 `json:"high,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Instanceport *int64 `json:"instanceport,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Low *int64 `json:"low,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Nodeid *string `json:"nodeid,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Period *string `json:"period,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Runtime *MetricsDbRuntime `json:"runtime,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Watermark *int64 `json:"watermark,omitempty"`
}
