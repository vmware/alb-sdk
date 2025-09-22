// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FileObject file object
// swagger:model FileObject
type FileObject struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// SHA1 checksum of the file. . Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Checksum *string `json:"checksum,omitempty"`

	// AVI internal formatted/converted files. It is a reference to an object of type FileObject. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ChildRefs []string `json:"child_refs,omitempty"`

	// This field indicates whether the file is gzip-compressed. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Compressed *bool `json:"compressed,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Timestamp of creation for the file. . Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Created *string `json:"created,omitempty"`

	// This field contains CRL metadata. . Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CrlInfo *CRL `json:"crl_info,omitempty"`

	// Description of the file. . Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// List of all FileObject events. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Events []*FileObjectEventMap `json:"events,omitempty"`

	// Timestamp when the CRL contents are no longer valid and hence CRL-file will be no longer needed and can be removed by the system. If this is set, a garbage collector process shall remove the CRL-file after this time. This field is applicable in the CRL context. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExpiresAt *string `json:"expires_at,omitempty"`

	// This field indicates the file format(Avi/Maxmind and v4/v6/v4-v6) of GSLB geodb file type. . Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V6, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V4_AND_V6, GSLB_GEODB_FILE_FORMAT_AVI_V6, GSLB_GEODB_FILE_FORMAT_AVI_V4_AND_V6. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GslbGeodbFormat *string `json:"gslb_geodb_format,omitempty"`

	// This field indicates if the the given FileObjecthas a parent FileObject or not. . Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HasParent *bool `json:"has_parent,omitempty"`

	// This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines. If the field is set to true, then the object is replicated across the Gslb federation. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IsFederated *bool `json:"is_federated,omitempty"`

	// Name of the file object. . Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Path to the file. . Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Path *string `json:"path,omitempty"`

	// Enforce Read-Only on the file. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReadOnly *bool `json:"read_only,omitempty"`

	// Flag to allow/restrict download of the file. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RestrictDownload *bool `json:"restrict_download,omitempty"`

	// Size of the file. . Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Size *uint64 `json:"size,omitempty"`

	// Tenant that this object belongs to. It is a reference to an object of type Tenant. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Type of the file. . Enum options - OTHER_FILE_TYPES, IP_REPUTATION, GEO_DB, TECH_SUPPORT, HSMPACKAGES, IPAMDNSSCRIPTS, CONTROLLER_IMAGE, CRL_DATA, IP_REPUTATION_IPV6, GSLB_GEO_DB, CSRF_JS. Field introduced in 20.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- OTHER_FILE_TYPES), Basic (Allowed values- OTHER_FILE_TYPES) edition.
	// Required: true
	Type *string `json:"type"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the file. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Version of the file. . Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}
