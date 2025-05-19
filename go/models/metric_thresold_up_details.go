// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricThresoldUpDetails metric thresold up details
// swagger:model MetricThresoldUpDetails
type MetricThresoldUpDetails struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentValue *float64 `json:"current_value,omitempty"`

	// ID of the object whose metric has hit the threshold. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntityUUID *string `json:"entity_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricID *string `json:"metric_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	MetricName *string `json:"metric_name"`

	// Identity of the Pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolUUID *string `json:"pool_uuid,omitempty"`

	// Server IP Port on which event was generated. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Server *string `json:"server,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Threshold *float64 `json:"threshold,omitempty"`

	// VM at which Metric thresold details collected. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VMType *string `json:"vm_type,omitempty"`
}
