// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeHugepageinfoRuntime se hugepageinfo runtime
// swagger:model SeHugepageinfoRuntime
type SeHugepageinfoRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProcID *string `json:"proc_id"`

	// Per-process hugepage information. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcInfo []*ProcHugepageInfo `json:"proc_info,omitempty"`

	// Per-QAT-cgroup hugepage statistics. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatHugepageStats []*QatHugepageStats `json:"qat_hugepage_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`

	// System-wide hugepage information. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemInfo *SystemHugepageInfo `json:"system_info,omitempty"`
}
