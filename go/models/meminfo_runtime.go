// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// MeminfoRuntime meminfo runtime
// swagger:model MeminfoRuntime
type MeminfoRuntime struct {

	//  Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HugepageMemoryStats *HugepageMem `json:"hugepage_memory_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MemoryConfig *MemConfig `json:"memory_config,omitempty"`

	//  Field introduced in 17.2.12, 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MemoryUsage *MemUsage `json:"memory_usage,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcessMemoryStats *Mallstats `json:"process_memory_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProtobufMemoryStats *MemProto `json:"protobuf_memory_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SharedMemoryStats *Jestats `json:"shared_memory_stats,omitempty"`
}
