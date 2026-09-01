// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APISpecServer Api spec server
// swagger:model ApiSpecServer
type APISpecServer struct {

	// Description of this server entry. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Server URL or relative path. May be an absolute URL (e.g. 'https //api.example.com/v1', 'https //api.example.com 8443/v1') or a relative path (e.g. '/v1', '/'). When populated from an OpenAPI spec, server URL template variables are resolved to concrete URLs at import time before being stored here. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	URL *string `json:"url"`
}
