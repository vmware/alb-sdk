// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WafApplicationSignatureProvider waf application signature provider
// swagger:model WafApplicationSignatureProvider
type WafApplicationSignatureProvider struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Available application names and the ruleset version, when the rules for an application changed the last time. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	// Read Only: true
	AvailableApplications []*WafApplicationSignatureAppVersion `json:"available_applications,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// The error message indicating why the last update check failed. Field deprecated in 20.1.3. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	// Read Only: true
	LastCheckForUpdatesError *string `json:"last_check_for_updates_error,omitempty"`

	// The last time that we checked for updates but did not get a result because of an error. Field deprecated in 20.1.3. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	// Read Only: true
	LastFailedCheckForUpdates *TimeStamp `json:"last_failed_check_for_updates,omitempty"`

	// The last time that we checked for updates sucessfully. Field deprecated in 20.1.3. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	// Read Only: true
	LastSuccessfulCheckForUpdates *TimeStamp `json:"last_successful_check_for_updates,omitempty"`

	// Name of Application Specific Ruleset Provider. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Version of signatures. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	// Read Only: true
	RulesetVersion *string `json:"ruleset_version,omitempty"`

	// If this object is managed by the Application Signatures update  service, this field contain the status of this syncronization. Field introduced in 20.1.3. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ServiceStatus *WebApplicationSignatureServiceStatus `json:"service_status,omitempty"`

	// The WAF rules. Not visible in the API. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	// Read Only: true
	Signatures []*WafRule `json:"signatures,omitempty"`

	//  It is a reference to an object of type Tenant. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
