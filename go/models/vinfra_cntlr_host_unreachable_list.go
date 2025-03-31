// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// VinfraCntlrHostUnreachableList vinfra cntlr host unreachable list
// swagger:model VinfraCntlrHostUnreachableList
type VinfraCntlrHostUnreachableList struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostName []string `json:"host_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Vcenter *string `json:"vcenter"`
}
