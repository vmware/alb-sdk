// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConfigExportBundleInfo config export bundle info
// swagger:model ConfigExportBundleInfo
type ConfigExportBundleInfo struct {

	// Relative URI to download the generated export bundle, e.g. api/configuration/export/download/<key>. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DownloadLink *string `json:"download_link"`

	// Human-readable UTC timestamp after which the download link expires. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	FileExpiry *string `json:"file_expiry"`
}
