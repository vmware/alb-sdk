// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ALBServicesFileDownload a l b services file download
// swagger:model ALBServicesFileDownload
type ALBServicesFileDownload struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`
}
