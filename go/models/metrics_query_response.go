// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MetricsQueryResponse metrics query response
// swagger:model MetricsQueryResponse
type MetricsQueryResponse struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EntityUUID *string `json:"entity_uuid,omitempty"`

	// returns the ID specified in the query. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ID *string `json:"id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Limit *int32 `json:"limit,omitempty"`

	//  Enum options - VSERVER_METRICS_ENTITY, VM_METRICS_ENTITY, SE_METRICS_ENTITY, CONTROLLER_METRICS_ENTITY, APPLICATION_METRICS_ENTITY, TENANT_METRICS_ENTITY, POOL_METRICS_ENTITY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricEntity *string `json:"metric_entity,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetricID *string `json:"metric_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Series []*MetricsDataSeries `json:"series,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Start *string `json:"start,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Step *int32 `json:"step,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Stop *string `json:"stop,omitempty"`
}
