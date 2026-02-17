// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LockoutConstraint lockout constraint
// swagger:model LockoutConstraint
type LockoutConstraint struct {

	// Time window for evaluating failed attempts in seconds. Defaults to 900 seconds. Allowed values are 300-1800. Special values are 0 - Do not reset login failure counts on the basis of any evaluation window.. Field introduced in 32.1.1. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LockoutEvaluationPeriod *uint32 `json:"lockout_evaluation_period,omitempty"`

	// Number of failed attempts before account lockout. Defaults to 3. Setting it to 0 allows unlimited login failure attempts without any lockout. Allowed values are 0-5. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LockoutMaxAuthFailures *uint32 `json:"lockout_max_auth_failures,omitempty"`

	// Account lockout duration in seconds. Defaults to 900 seconds. Allowed values are 600-1800. Field introduced in 32.1.1. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LockoutPeriod *uint32 `json:"lockout_period,omitempty"`
}
