// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PortalFeatureOptIn portal feature opt in
// swagger:model PortalFeatureOptIn
type PortalFeatureOptIn struct {

	// Enable to receive Application specific signature updates. Field introduced in 20.1.4. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition.
	EnableAppsignatureSync *bool `json:"enable_appsignature_sync,omitempty"`

	// Enable to receive IP reputation updates. Field introduced in 20.1.1. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition.
	EnableIPReputation *bool `json:"enable_ip_reputation,omitempty"`

	// Enable Pulse Case Management. Field introduced in 21.1.1. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition. Special default for Basic edition is false, Essentials edition is false, Enterprise is True.
	EnablePulseCaseManagement *bool `json:"enable_pulse_case_management,omitempty"`

	// Enable to receive WAF CRS updates. Field introduced in 21.1.1. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition. Special default for Basic edition is false, Essentials edition is false, Enterprise is True.
	EnablePulseWafManagement *bool `json:"enable_pulse_waf_management,omitempty"`

	// Enable to receive Bot Management updates. Field introduced in 21.1.1. Allowed in Basic(Allowed values- false) edition, Essentials(Allowed values- false) edition, Enterprise edition.
	EnableUserAgentDbSync *bool `json:"enable_user_agent_db_sync,omitempty"`
}
