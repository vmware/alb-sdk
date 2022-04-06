// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FailActionHTTPLocalResponse fail action HTTP local response
// swagger:model FailActionHTTPLocalResponse
type FailActionHTTPLocalResponse struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	File *HTTPLocalFile `json:"file,omitempty"`

	//  Enum options - FAIL_HTTP_STATUS_CODE_200, FAIL_HTTP_STATUS_CODE_503. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	StatusCode *string `json:"status_code,omitempty"`
}
