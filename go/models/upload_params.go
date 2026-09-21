// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UploadParams upload params
// swagger:model UploadParams
type UploadParams struct {

	// Allow updating an existing FileObject with the same name. Currently enforced for OPEN_API_SPEC type only  without this flag, a POST whose name matches an existing OAS FileObject returns HTTP 409. . Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AllowUpdate *bool `json:"allow_update,omitempty"`

	// Signal to merge all previously uploaded parts into the final file. Set to true on the last request of a chunked upload sequence. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Collate *bool `json:"collate,omitempty"`

	// Whether the file is gzip-compressed. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Compressed *bool `json:"compressed,omitempty"`

	// A short user-friendly description related to the uploaded file. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Timestamp indicating when the file can be automatically deleted. Used for garbage collection by CRL and IP Reputation file types. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpiresAt *string `json:"expires_at,omitempty"`

	// This field indicates the file format(Avi/Maxmind and v4/v6/v4-v6) of GSLB geodb file type. . Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V6, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V4_AND_V6, GSLB_GEODB_FILE_FORMAT_AVI_V6, GSLB_GEODB_FILE_FORMAT_AVI_V4_AND_V6. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbGeodbFormat *string `json:"gslb_geodb_format,omitempty"`

	// This field determines if an object is replicated across the GSLB federation (true) or visible within the controller-cluster and its service engines (false). Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsFederated *bool `json:"is_federated,omitempty"`

	// Name of the file. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Part identifier for chunked or multipart uploads. When set, indicates a partial upload in progress. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Part *string `json:"part,omitempty"`

	// Source Path of the File in the local disk. Only applicable in CLI. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Path *string `json:"path,omitempty"`

	// Enforce read-only on the file. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReadOnly *bool `json:"read_only,omitempty"`

	// Restrict download of the file. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RestrictDownload *bool `json:"restrict_download,omitempty"`

	// Size of the file in bytes. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Size *uint64 `json:"size,omitempty"`

	// Type of the file. Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE, CRL_DATA, IP_REPUTATION_IPV6, GSLB_GEO_DB, CSRF_JS, KNOWN_HOSTS, OPEN_API_SPEC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	// Interval in minutes to check for update. If not specified, interval will be 1 day. This field is applicable in the CRL context. . Allowed values are 30-525600. Field introduced in 30.2.1. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpdateInterval *int32 `json:"update_interval,omitempty"`

	// URL to download the CRL file. This field is applicable in the CRL context. . Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	URL *string `json:"url,omitempty"`
}
