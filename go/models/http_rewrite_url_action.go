// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HTTPRewriteURLAction HTTP rewrite URL action
// swagger:model HTTPRewriteURLAction
type HTTPRewriteURLAction struct {

	// Host config. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostHdr *URIParam `json:"host_hdr,omitempty"`

	// Path config. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Path *URIParam `json:"path,omitempty"`

	// Query config. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Query *URIParamQuery `json:"query,omitempty"`
}
