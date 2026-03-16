// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeSystemInfoRuntime se system info runtime
// swagger:model SeSystemInfoRuntime
type SeSystemInfoRuntime struct {

	// SE Instance in Cloud. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cloud *string `json:"cloud,omitempty"`

	// SE Disk Size. Field introduced in 31.2.1. Unit is MB. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiskSize *int32 `json:"disk_size,omitempty"`

	// SE Disk Type  HDD/SSD. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiskType *string `json:"disk_type,omitempty"`

	// SE Dispatcher Related Info. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DispatcherInfo *SeDispatcherInfo `json:"dispatcher_info,omitempty"`

	// SE FIPS Info. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FipsInfo *SeImageFipsInfo `json:"fips_info,omitempty"`

	// SE Hypervisor Type. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hypervisor *string `json:"hypervisor,omitempty"`

	// SE IOMMU Mode. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IommuMode *string `json:"iommu_mode,omitempty"`

	// SE Memory Distribution Info. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MemdistInfo *SeMemDistInfo `json:"memdist_info,omitempty"`

	// SE System Memory. Field introduced in 31.2.1. Unit is MB. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Memory *int32 `json:"memory,omitempty"`

	// SE Network/Interfaces Related Info. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkInfo *SeNetworkInfo `json:"network_info,omitempty"`

	// Total Num of Cores of SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumCores *int32 `json:"num_cores,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumQatDevices *int32 `json:"num_qat_devices,omitempty"`

	// Num Sockets of SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSockets *int32 `json:"num_sockets,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	ProcID *string `json:"proc_id"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SeUUID *string `json:"se_uuid"`

	// Hyperthreading on SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseHyperThreading *int32 `json:"use_hyper_threading,omitempty"`

	// SE Current Version Info. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VersionInfo *SeImageVersionInfo `json:"version_info,omitempty"`
}
