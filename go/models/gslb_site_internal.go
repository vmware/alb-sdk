// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSiteInternal gslb site internal
// swagger:model GslbSiteInternal
type GslbSiteInternal struct {

	// Max retries after which the remote site is treatedas a fresh start. In fresh start all the configsare downloaded. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClearOnMaxRetries *uint32 `json:"clear_on_max_retries,omitempty"`

	// Local controller cluster Id. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MyClusterUUID *string `json:"my_cluster_uuid,omitempty"`

	// Process ID of process reporting this message. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// UUID of SE reporting this message. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Frequency with which group members communicate. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SendInterval *uint32 `json:"send_interval,omitempty"`

	// List of sites. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sites []*GslbSiteEntry `json:"sites,omitempty"`
}
