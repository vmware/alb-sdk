// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// APIPathLabelEntry Api path label entry
// swagger:model ApiPathLabelEntry
type APIPathLabelEntry struct {

	// UUID of the ApiPolicy this entry is attributed to. Omitted only when no ApiPolicy references this ApiPath at all. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApipolicyUUID *string `json:"apipolicy_uuid,omitempty"`

	// This entry's own enabled toggle  the endpoint's own toggle when inherited is false, or the matched ApiPolicy container's toggle when inherited is true. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// HTTP method of the endpoint this label applies to. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPMethod *string `json:"http_method,omitempty"`

	// false when set directly on the endpoint, true when inherited from the parent ApiPolicy's type-based container. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Inherited *bool `json:"inherited,omitempty"`

	// The label name. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// Computed once per label name; every entry for the same label reports the identical status. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *LabelStatus `json:"status,omitempty"`
}
