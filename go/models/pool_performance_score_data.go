// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolPerformanceScoreData pool performance score data
// swagger:model PoolPerformanceScoreData
type PoolPerformanceScoreData struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Apdexc *float64 `json:"apdexc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Apdexr *float64 `json:"apdexr,omitempty"`

	//  Enum options - OPER_UP, OPER_DOWN, OPER_CREATING, OPER_RESOURCES, OPER_INACTIVE, OPER_DISABLED, OPER_UNUSED, OPER_UNKNOWN, OPER_PROCESSING, OPER_INITIALIZING, OPER_ERROR_DISABLED, OPER_AWAIT_MANUAL_PLACEMENT, OPER_UPGRADING, OPER_SE_PROCESSING, OPER_PARTITIONED, OPER_DISABLING, OPER_FAILED, OPER_UNAVAIL, OPER_AGGREGATE_DOWN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperState *string `json:"oper_state,omitempty"`

	//  It is a reference to an object of type Pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PoolRef *string `json:"pool_ref"`

	// Reason for the Health Score. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Reason *string `json:"reason"`

	// Attribute that is dominating the health score. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReasonAttr *string `json:"reason_attr,omitempty"`

	//  It is a reference to an object of type VirtualService. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ref *string `json:"ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SumFinishedConns *float64 `json:"sum_finished_conns,omitempty"`
}
