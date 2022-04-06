// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPLocalFile HTTP local file
// swagger:model HTTPLocalFile
type HTTPLocalFile struct {

	// Mime-type of the content in the file. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	ContentType *string `json:"content_type"`

	// File content to used in the local HTTP response body. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	FileContent *string `json:"file_content"`

	// File content length. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	FileLength *int32 `json:"file_length,omitempty"`
}
