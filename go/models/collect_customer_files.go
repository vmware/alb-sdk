// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CollectCustomerFiles collect customer files
// swagger:model CollectCustomerFiles
type CollectCustomerFiles struct {

	// Archive policy for file path to have specific threshold.Tech-support will skip collection of file if file size is greater than threshold. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Files []*ArchivePolicy `json:"files,omitempty"`
}
