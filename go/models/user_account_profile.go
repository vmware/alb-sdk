// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserAccountProfile user account profile
// swagger:model UserAccountProfile
type UserAccountProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Password complexity constraints for the user account profile. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ComplexityConstraint *ComplexityConstraint `json:"complexity_constraint"`

	// Password expiration settings for the user account profile. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ExpirationConstraint *ExpirationConstraint `json:"expiration_constraint"`

	// Account lockout settings for the user account profile. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	LockoutConstraint *LockoutConstraint `json:"lockout_constraint"`

	// Maximum number of concurrent sessions allowed. There are unlimited sessions by default. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxConcurrentSessions *uint32 `json:"max_concurrent_sessions,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
