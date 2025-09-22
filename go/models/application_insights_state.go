// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApplicationInsightsState application insights state
// swagger:model ApplicationInsightsState
type ApplicationInsightsState struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// UUID of the Application Insights Policy. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ApplicationInsightsUUID *string `json:"application_insights_uuid,omitempty"`

	// Runtime application sampling configuration to control rate and volume of data ingestion for Application Insights. Controller updates the configuration based on the application traffic and the associated ServiceEngine load. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ApplicationSamplingRuntime *ApplicationSamplingRuntime `json:"application_sampling_runtime,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// The name of the Application Insights State Configuration. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Details of the Tenant for the Application Insights State. It is a reference to an object of type Tenant. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the ApplicationInsightsState. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
