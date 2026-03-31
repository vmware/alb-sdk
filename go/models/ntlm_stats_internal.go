// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NtlmStatsInternal ntlm stats internal
// swagger:model NtlmStatsInternal
type NtlmStatsInternal struct {

	// NTLM requests with authentication failure. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NtlmAuthFail *uint64 `json:"ntlm_auth_fail,omitempty"`

	// NTLM requests with authentication successful. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NtlmAuthSuccess *uint64 `json:"ntlm_auth_success,omitempty"`

	// NTLM requests over an already authenticated connection. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NtlmAuthenticatedRequests *uint64 `json:"ntlm_authenticated_requests,omitempty"`

	// NTLM requests under negotiation. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NtlmNegotiation *uint64 `json:"ntlm_negotiation,omitempty"`

	// NTLM unauthorized requests. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NtlmUnauthorized *uint64 `json:"ntlm_unauthorized,omitempty"`
}
