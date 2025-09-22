// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApplicationInsightsPolicy application insights policy
// swagger:model ApplicationInsightsPolicy
type ApplicationInsightsPolicy struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Application insights parameters to filter application learning from clients. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ApplicationInsightsParams *ApplicationInsightsParams `json:"application_insights_params,omitempty"`

	// Application sampling configuration to control rate and volume of data ingestion for Application Insights that the ServiceEngines are expected to send to the controller. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ApplicationSamplingConfig *ApplicationSamplingConfig `json:"application_sampling_config,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Details of the Application Insights Configuration. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Enable Application Insights, formerly called learning for this virtual service. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnableApplicationInsights *bool `json:"enable_application_insights,omitempty"`

	// The name of the Application Insights Configuration. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Details of the Tenant for the Application Insights Configuration. It is a reference to an object of type Tenant. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the Application Insights Configuration. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
