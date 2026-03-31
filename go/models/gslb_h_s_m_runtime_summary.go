// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbHSMRuntimeSummary gslb h s m runtime summary
// swagger:model GslbHSMRuntimeSummary
type GslbHSMRuntimeSummary struct {

	// Represents Local Info for the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalInfo *LocalInfo `json:"local_info,omitempty"`

	// Gslb site Health Status Module status. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	// Remote site health status info. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RemoteInfo *RemoteInfo `json:"remote_info,omitempty"`
}
