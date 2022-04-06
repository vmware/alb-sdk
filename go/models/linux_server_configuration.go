// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LinuxServerConfiguration linux server configuration
// swagger:model LinuxServerConfiguration
type LinuxServerConfiguration struct {

	// Private docker registry for SE image storage. Field deprecated in 17.1.2. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DockerRegistrySe *DockerRegistry `json:"docker_registry_se,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Hosts []*LinuxServerHost `json:"hosts,omitempty"`

	// Flag to notify the SE's in this cloud have an inband management interface, this can be overridden at SE host level by setting host_attr attr_key as SE_INBAND_MGMT with value of true or false. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeInbandMgmt *bool `json:"se_inband_mgmt,omitempty"`

	// SE Client Logs disk path for cloud. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeLogDiskPath *string `json:"se_log_disk_path,omitempty"`

	// SE Client Log disk size for cloud. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeLogDiskSizeGB *int32 `json:"se_log_disk_size_GB,omitempty"`

	// SE System Logs disk path for cloud. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeSysDiskPath *string `json:"se_sys_disk_path,omitempty"`

	// SE System Logs disk size for cloud. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SeSysDiskSizeGB *int32 `json:"se_sys_disk_size_GB,omitempty"`

	// Parameters for SSH to hosts. Field deprecated in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SSHAttr *SSHSeDeployment `json:"ssh_attr,omitempty"`

	// Cloud connector user uuid for SSH to hosts. It is a reference to an object of type CloudConnectorUser. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	SSHUserRef *string `json:"ssh_user_ref,omitempty"`
}
