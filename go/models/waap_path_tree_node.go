// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// WaapPathTreeNode waap path tree node
// swagger:model WaapPathTreeNode
type WaapPathTreeNode struct {

	// HTTP methods configured on this path template. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Endpoints []*WaapPathTreeEndpoint `json:"endpoints,omitempty"`

	// Name of the ApiPath object for this path template. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathName *string `json:"path_name,omitempty"`

	// Path template for this ApiPath object. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PathTemplate *string `json:"path_template,omitempty"`
}
