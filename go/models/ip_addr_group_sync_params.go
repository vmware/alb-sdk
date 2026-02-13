// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// IPAddrGroupSyncParams Ip addr group sync params
// swagger:model IpAddrGroupSyncParams
type IPAddrGroupSyncParams struct {

	// Name of the IpAddrGroup to sync NSX group IPs for. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Name *string `json:"name,omitempty"`

	// UUID of the IpAddrGroup to sync NSX group IPs for. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
