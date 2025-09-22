// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PasswordPolicy password policy
// swagger:model PasswordPolicy
type PasswordPolicy struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 31.3.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Time window for evaluating failed attempts in seconds. Defaults to 900 seconds. Allowed values are 300-1800. Field introduced in 31.3.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LockoutEvaluationPeriod *uint32 `json:"lockout_evaluation_period,omitempty"`

	// Number of failed attempts before account lockout. Defaults to 3. Allowed values are 0-5. Special values are 0- Unlimited login attempts allowed.. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LockoutMaxAuthFailures *uint32 `json:"lockout_max_auth_failures,omitempty"`

	// Account lockout duration in seconds. Defaults to 900 seconds. Allowed values are 600-1800. Field introduced in 31.3.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LockoutPeriod *uint32 `json:"lockout_period,omitempty"`

	// Minimum password length. Defaults to 15 characters. Allowed values are 8-64. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinLength *uint32 `json:"min_length,omitempty"`

	// Minimum number of lowercase characters required. Allowed values are 0-10. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinLowercase *uint32 `json:"min_lowercase,omitempty"`

	// Minimum number of numeric characters required. Allowed values are 0-10. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinNumeric *uint32 `json:"min_numeric,omitempty"`

	// Minimum number of special characters required. Allowed values are 0-10. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinSpecial *uint32 `json:"min_special,omitempty"`

	// Minimum number of uppercase characters required. Allowed values are 0-10. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinUppercase *uint32 `json:"min_uppercase,omitempty"`

	// Name of the password policy configuration. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Password expiry period in days. Defaults to 365 days. Allowed values are 30-730. Field introduced in 31.3.1. Unit is DAYS. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PasswordExpirationDays *uint32 `json:"password_expiration_days,omitempty"`

	// Number of previous passwords to remember. Defaults to 5. Allowed values are 1-10. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PasswordHistory *uint32 `json:"password_history,omitempty"`

	// Tenant ref for the PasswordPolicy. It is a reference to an object of type Tenant. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Unique object identifier of the PasswordPolicy. Field introduced in 31.3.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
