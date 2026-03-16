// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VirtualServiceIcapStats virtual service icap stats
// swagger:model VirtualServiceIcapStats
type VirtualServiceIcapStats struct {

	// Number of requests that have been blocked by ICAP server. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapBlocked *uint64 `json:"icap_blocked,omitempty"`

	// Number of requests that resulted in an error response from the ICAP server. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapError *uint64 `json:"icap_error,omitempty"`

	// Number of requests that failed due to internal error while processing ICAP. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapInternalError *uint64 `json:"icap_internal_error,omitempty"`

	// Number of requests that have been modified by ICAP server. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapModified *uint64 `json:"icap_modified,omitempty"`

	// Number of requests that have been allowed by ICAP server. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapPassed *uint64 `json:"icap_passed,omitempty"`

	// Number of requests sent to ICAP server. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapRequests *uint64 `json:"icap_requests,omitempty"`

	// Number of requests that resulted in an error response from the ICAP server. Field introduced in 20.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapServerError *uint64 `json:"icap_server_error,omitempty"`

	// Number of requests that exceeded the time warning threshold configured in the ICAP Profile during ICAP processing. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapTimeExceededWarningThreshold *uint64 `json:"icap_time_exceeded_warning_threshold,omitempty"`

	// Number of requests that timed out during ICAP processing. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IcapTimedout *uint64 `json:"icap_timedout,omitempty"`
}
