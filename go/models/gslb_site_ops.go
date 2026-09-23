// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSiteOps gslb site ops
// swagger:model GslbSiteOps
type GslbSiteOps struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// List of ghm-uuids that need to be deleted. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GhmDelV2 []string `json:"ghm_del_v2,omitempty"`

	// Message Header for Site-to-Site Xchg. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hdr *GslbHdr `json:"hdr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hs *GslbSiteHealthStatus `json:"hs,omitempty"`

	//  Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Objs []*GslbSiteOpsObj `json:"objs,omitempty"`

	//  Enum options - GSLB_NONE, GSLB_CREATE, GSLB_UPDATE, GSLB_DELETE, GSLB_PURGE, GSLB_DECL. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ops *string `json:"ops,omitempty"`

	// Site metadata of the gslb leader site, sent during site invitation. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SiteMetadata *GslbSiteMetadata `json:"site_metadata,omitempty"`

	//  Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipRemote *bool `json:"skip_remote,omitempty"`

	// Current Sw version @ leader when glb-cfg is sent. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SwVersion *string `json:"sw_version,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
