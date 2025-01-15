// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngineParams service engine params
// swagger:model ServiceEngineParams
type ServiceEngineParams struct {

	// This parameter is used to control the number of concurrent segroup upgrades. This field value takes affect upon controller warm reboot. The value is modified based on flavor size of controller. Allowed values are 1-24. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ConcurrentSegroupUpgrades *uint32 `json:"concurrent_segroup_upgrades,omitempty"`

	// This parameter defines the buffer size during ServiceEngine image downloads in a ServiceEngineGroup.It is used to pace the ServiceEngine upgrade package downloads so that controller network/CPU/Memory bandwidth is a bounded operation. It generally specifies the buffer size used for data transfer. Allowed values are 64-2048. Field introduced in 31.1.1. Unit is KB. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ImageDataTransferSize *uint32 `json:"image_data_transfer_size,omitempty"`

	// Amount of time Controller waits for a large-sized SE (>=128GB memory)to reconnect after it is rebooted during upgrade. Allowed values are 1200-2400. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LargeSeConnectTimeout *uint32 `json:"large_se_connect_timeout,omitempty"`

	// Amount of time Controller waits for a regular-sized SE (<128GB memory)to reconnect after it is rebooted during upgrade. Allowed values are 600-1200. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SeConnectTimeout *uint32 `json:"se_connect_timeout,omitempty"`

	// Number of simultaneous ServiceEngine image downloads in a ServiceEngineGroup. It is used to pace ServiceEngine upgrade package downloads so that controller network/CPU bandwidth is a bounded operation. Allowed values are 1-20. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SimultaneousImageDownloads *uint32 `json:"simultaneous_image_downloads,omitempty"`

	// Base timeout value for all service engine upgrade operation tasks. The timeout for certain tasks is a multiple of this field. For example, in the CopyAndInstallImage task, the ServiceEngine has a maximum wait time to install an image or package, i.e., timeout = [scaling factor] * task_base_timeout. Allowed values are 300-3600. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TaskBaseTimeout *uint32 `json:"task_base_timeout,omitempty"`
}
