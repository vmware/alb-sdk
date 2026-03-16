// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeImageVersionInfo se image version info
// swagger:model SeImageVersionInfo
type SeImageVersionInfo struct {

	// Active root partition currently the system is in. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ActiveRootPartition *string `json:"active_root_partition,omitempty"`

	// SE Boot Mode i.e UEFI/BIOS. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BootMode *string `json:"boot_mode,omitempty"`

	// Host OS Version. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostOsVersion *string `json:"host_os_version,omitempty"`

	// SE Kernel Version. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KernelVersion *string `json:"kernel_version,omitempty"`

	// Deployment Mode docker/podman in case of LSC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LscDeploymentMode *string `json:"lsc_deployment_mode,omitempty"`

	// OpenSSL Base Version in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OpensslBaseVersion *string `json:"openssl_base_version,omitempty"`

	// OpenSSL Providers in SE. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OpensslProviders *string `json:"openssl_providers,omitempty"`

	// SE OS Version. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OsVersion *string `json:"os_version,omitempty"`

	// SE Image Version. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeImageVersion *string `json:"se_image_version,omitempty"`

	// SE Patch Version. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SePatchVersion *string `json:"se_patch_version,omitempty"`
}
