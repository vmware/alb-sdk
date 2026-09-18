// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FileServiceEntry file service entry
// swagger:model FileServiceEntry
type FileServiceEntry struct {

	// MD5 checksum of the file; present only when the request included the compute_checksum query param. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Md5checksum *string `json:"md5checksum,omitempty"`

	// Last-modified timestamp of the file, ISO-8601. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Modified *string `json:"modified,omitempty"`

	// Name of the referenced Avi object, populated only for vs-pcap/se-pcap entries (derived from the pcap filename), absent for plain files. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// File size in bytes as a string, or the literal *string 'dir' for a nested directory entry. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Size *string `json:"size,omitempty"`

	// Contents of an associated stack-trace file, present only when listing the archive/ sub-directory. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StackTrace *string `json:"stack_trace,omitempty"`

	// JSON-encoded TechSupport status object, present only when listing the tech_support directory. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// Fully-qualified /api/fileservice?uri=... URL to fetch this entry. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	URL *string `json:"url,omitempty"`
}
