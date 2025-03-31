// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ContainerCloudBatchSetup container cloud batch setup
// swagger:model ContainerCloudBatchSetup
type ContainerCloudBatchSetup struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ccs []*ContainerCloudSetup `json:"ccs,omitempty"`
}
