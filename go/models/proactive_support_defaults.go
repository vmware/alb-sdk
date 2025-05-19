// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ProactiveSupportDefaults proactive support defaults
// swagger:model ProactiveSupportDefaults
type ProactiveSupportDefaults struct {

	// Opt-in to attach core dump with support case. Field introduced in 20.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	AttachCoreDump *bool `json:"attach_core_dump,omitempty"`

	// Opt-in to attach tech support with support case. Field introduced in 20.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition. Special default for Essentials edition is false, Basic edition is false, Enterprise edition is True.
	AttachTechSupport *bool `json:"attach_tech_support,omitempty"`

	// Case severity to be used for proactive support case creation. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CaseSeverity *string `json:"case_severity,omitempty"`
}
