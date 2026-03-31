// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UpdateDNSEntryOp update DNS entry op
// swagger:model UpdateDNSEntryOp
type UpdateDNSEntryOp struct {

	// Cookie for the request. Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cookie *string `json:"cookie,omitempty"`

	// Received a failure response on the last attempt. Only set in case of receiving a failed status, flag is not set in case of operation timing out in Resource Manager. Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastAttemptFailed *bool `json:"last_attempt_failed,omitempty"`

	// Ticks when the last operation was initiated. Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastOpTicks *uint64 `json:"last_op_ticks,omitempty"`

	// Last status. Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED.... Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastStatus *string `json:"last_status,omitempty"`

	// Last status string. Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastStatusStr *string `json:"last_status_str,omitempty"`

	// Number of attempts for this request. Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumAttempts *uint32 `json:"num_attempts,omitempty"`

	// Update DNS request. Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Request *UpdateDNSEntryReq `json:"request,omitempty"`

	// Request is a DNS entry update. False means DNS entry deletion. Field introduced in 21.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Update *bool `json:"update,omitempty"`
}
