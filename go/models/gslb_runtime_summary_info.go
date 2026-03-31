// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbRuntimeSummaryInfo gslb runtime summary info
// swagger:model GslbRuntimeSummaryInfo
type GslbRuntimeSummaryInfo struct {

	// This field is used to Config replication module runtime summary. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CrmStatus *GslbCRMRuntimeSummary `json:"crm_status,omitempty"`

	// This field is used to get Health Status Module runtime summary. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HsmStatus *GslbHSMRuntimeSummary `json:"hsm_status,omitempty"`

	// Gslb object name. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// This field is used to Site Module runtime summary. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SmStatus *GslbSMRuntimeSummary `json:"sm_status,omitempty"`
}
