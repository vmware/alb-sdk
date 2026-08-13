// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPolicy Top-level configuration for API protection and validation. Traffic for defined APIs is evaluated and validated against configured path templates, server scopes, and endpoint usage classifications.
// swagger:model ApiPolicy
type APIPolicy struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// List of labels applied to active API endpoints. An active API is an endpoint whose type is API_ACTIVE. Endpoints defined in the policy are active by default. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveAPILabels *APILabels `json:"active_api_labels,omitempty"`

	// API specification metadata extracted from the associated OpenAPI specification. Automatically populated when a FileObject is associated with this policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	APISpecInfo *APISpecInfo `json:"api_spec_info,omitempty"`

	// Description of this API policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Reference to the uploaded OpenAPI specification file associated with this policy. Only one file is supported at a time. It is a reference to an object of type FileObject. Field introduced in 32.2.1. Maximum of 1 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FileObjectRefs []string `json:"file_object_refs,omitempty"`

	// Mapping of labels to API policy actions. Field introduced in 32.2.1. Maximum of 256 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LabelMappings []*APIPolicyLabelActionMapping `json:"label_mappings,omitempty"`

	// Name of this object, unique per Tenant. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// List of labels applied to non-API URL requests. Non-API URLs are methods and URLs that are outside the scope of the policy. These are usually used to retrieve static information that are not tied to back-end business logic. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NonAPIURLLabels *APILabels `json:"non_api_url_labels,omitempty"`

	// Orphan API Classification settings for this API policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanAPIClassificationSettings *OrphanAPIClassificationSettings `json:"orphan_api_classification_settings,omitempty"`

	// List of labels applied to orphan API endpoints. An orphan API is an endpoint that is specified in the API-Spec but has not been seen in the datapath for a predefined duration. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OrphanAPILabels *APILabels `json:"orphan_api_labels,omitempty"`

	// List of path specifications. When an OAS fileobject is associated to this ApiPolicy, the paths defined in the OAS fileobject will be automatically added to this list. If OAS fileobject has a path that is already defined in the list, the existing path in the list will be updated as per the OAS fileobject. It is a reference to an object of type ApiPath. Field introduced in 32.2.1. Maximum of 2000 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathRefs []string `json:"path_refs,omitempty"`

	// Optional header-based routing configuration for EVH child VS selection. When set, the rules inside are used in addition to server FQDNs (host match) and server_info.path_prefix (path match) to determine which child VS handles a request. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RoutingInfo *APIRoutingInfo `json:"routing_info,omitempty"`

	// Server list defining the scope of this API policy. Requests not matching any server URL are treated as non-API traffic. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerInfo *APIServerInfo `json:"server_info,omitempty"`

	// List of labels applied to shadow API endpoints. A shadow API is an endpoint that is not specified in the API-Spec but is inside the scope of this policy (matching the server URL and path prefix) and is seen in the datapath. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ShadowAPILabels *APILabels `json:"shadow_api_labels,omitempty"`

	//  It is a reference to an object of type Tenant. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// The object UUID. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Validation settings for this API policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ValidationSettings *APIValidationSettings `json:"validation_settings,omitempty"`

	// Zombie API Classification settings for this API policy. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieAPIClassificationSettings *ZombieAPIClassificationSettings `json:"zombie_api_classification_settings,omitempty"`

	// List of labels applied to zombie API endpoints. A zombie API is an endpoint that is specified in the API-Spec but is seen in the datapath only as drip-traffic over a predefined duration. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ZombieAPILabels *APILabels `json:"zombie_api_labels,omitempty"`
}
