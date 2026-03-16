// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CCAzure c c azure
// swagger:model CC_Azure
type CCAzure struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AzureCfg *AzureConfiguration `json:"azure_cfg,omitempty"`
}
