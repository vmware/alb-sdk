// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPath A URI path template defining available operations and endpoints for an API. Paths can be manually defined or imported and synchronized from an OpenAPI specification.
// swagger:model ApiPath
type APIPath struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Description of this API path. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// List of API endpoints for this path. Field introduced in 32.1.4. Maximum of 10 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Endpoints []*APIEndpoint `json:"endpoints,omitempty"`

	// Name of this object, unique per Tenant. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// The URI path template for the object. Parameters can be defined in curly braces, for example /pet/{pet_id}. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	PathTemplate *string `json:"path_template"`

	// Indicates whether this path was user-defined or imported from an OpenAPI specification file. Enum options - SOURCE_USER_DEFINED, SOURCE_API_SPEC, SOURCE_DISCOVERED. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Read Only: true
	Source *string `json:"source,omitempty"`

	//  It is a reference to an object of type Tenant. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Action to take when a request matches this path but uses an HTTP method not defined for this path. Overrides the policy-level unknown_http_method_action when not INHERIT. Enum options - API_ACTION_INHERIT_FROM_API_POLICY, API_ACTION_PASS, API_ACTION_FLAG, API_ACTION_REJECT. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UnknownHTTPMethodAction *string `json:"unknown_http_method_action,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// The object UUID. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
