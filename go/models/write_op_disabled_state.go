// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WriteOpDisabledState write op disabled state
// swagger:model WriteOpDisabledState
type WriteOpDisabledState struct {

	// Reason for why operation is disabled. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Reason code for why operation is disabled. Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED.... Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReasonCode *string `json:"reason_code,omitempty"`

	// Timestamp when this operation was disabled. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Timestamp *TimeStamp `json:"timestamp,omitempty"`

	// Type of operation. Enum options - WRITE_OP_CREATE_SE, WRITE_OP_VNIC_OP, WRITE_OP_VNIC_IP. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`
}
