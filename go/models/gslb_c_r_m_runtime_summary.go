// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbCRMRuntimeSummary gslb c r m runtime summary
// swagger:model GslbCRMRuntimeSummary
type GslbCRMRuntimeSummary struct {

	// Represents Local Info for the site. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocalInfo *LocalInfo `json:"local_info,omitempty"`

	// Remote site replication info. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RemoteInfo *RemoteInfo `json:"remote_info,omitempty"`

	// Policy for replicating configuration across the GSLB sites. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReplicationPolicy *ReplicationPolicy `json:"replication_policy,omitempty"`

	// Config Replication Module operational status. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StatusInfo *OperationalStatus `json:"status_info,omitempty"`
}
