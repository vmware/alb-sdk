// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIViolationCorrectionInteractiveRequest Api violation correction interactive request
// swagger:model ApiViolationCorrectionInteractiveRequest
type APIViolationCorrectionInteractiveRequest struct {

	// Endpoint path as shown in WAAP inventory output (e.g. /api/v1/items/{id}). Mutually exclusive with path_uuid/path_ref. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EndpointPath *string `json:"endpoint_path,omitempty"`

	// HTTP method identifying the single ApiEndpoint to update under this ApiPath. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Method *string `json:"method"`

	// Reference to the ApiPath whose endpoint will be corrected. Mutually exclusive with endpoint_path. It is a reference to an object of type ApiPath. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathRef *string `json:"path_ref,omitempty"`

	// Reference to the VirtualService to correct. It is a reference to an object of type VirtualService. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	VirtualserviceRef *string `json:"virtualservice_ref"`
}
