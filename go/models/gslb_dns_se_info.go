// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbDNSSeInfo gslb Dns se info
// swagger:model GslbDnsSeInfo
type GslbDNSSeInfo struct {

	// This field describes the fd download status to the SE. Field deprecated in 18.2.3. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FdDownload *GslbDownloadStatus `json:"fd_download,omitempty"`

	// Geo files queue for sequencing files to SE. Field deprecated in 18.2.3. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	FdInfo *ConfigInfo `json:"fd_info,omitempty"`

	// Service engine's fabric IP used to push Geo files. Field deprecated in 18.2.3. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IP *IPAddr `json:"ip,omitempty"`

	// UUID of the service engine. Field deprecated in 18.2.3. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
