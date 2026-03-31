// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// QatInfo qat info
// swagger:model QatInfo
type QatInfo struct {

	// LIBUSDM Version. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LibusdmVersion *string `json:"libusdm_version,omitempty"`

	// QAT Engine Version. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatEngineVersion *string `json:"qat_engine_version,omitempty"`

	// QAT Hardware offload. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatHwOffload *bool `json:"qat_hw_offload,omitempty"`

	// QAT Library Version. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatLibVersion *string `json:"qat_lib_version,omitempty"`

	// Number of QAT devices. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatNumDevices *uint64 `json:"qat_num_devices,omitempty"`

	// QAT Oper Mode. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatOperMode *string `json:"qat_oper_mode,omitempty"`

	// Running status of the QAT service. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatServiceStatus *bool `json:"qat_service_status,omitempty"`

	// QAT Software Acceleration. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatSwAcceleration *bool `json:"qat_sw_acceleration,omitempty"`

	// QATLIB-SERVICE Version. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatlibServiceVersion *string `json:"qatlib_service_version,omitempty"`

	// QATLib Version. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QatlibVersion *string `json:"qatlib_version,omitempty"`

	// UUID of the Service Engine. It is a reference to an object of type ServiceEngine. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`
}
