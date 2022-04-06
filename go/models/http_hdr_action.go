// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPHdrAction HTTP hdr action
// swagger:model HTTPHdrAction
type HTTPHdrAction struct {

	// ADD  A new header with the new value is added irrespective of the existence of an HTTP header of the given name. REPLACE  A new header with the new value is added if no header of the given name exists, else existing headers with the given name are removed and a new header with the new value is added. REMOVE  All the headers of the given name are removed. Enum options - HTTP_ADD_HDR, HTTP_REMOVE_HDR, HTTP_REPLACE_HDR. Allowed in Enterprise with any value edition, Essentials(Allowed values- HTTP_REMOVE_HDR,HTTP_REPLACE_HDR) edition, Basic(Allowed values- HTTP_REMOVE_HDR,HTTP_REPLACE_HDR) edition, Enterprise with Cloud Services edition.
	// Required: true
	Action *string `json:"action"`

	// Cookie information. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Cookie *HTTPCookieData `json:"cookie,omitempty"`

	// HTTP header information. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Hdr *HTTPHdrData `json:"hdr,omitempty"`
}
