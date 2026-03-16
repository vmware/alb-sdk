// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiameterConnections diameter connections
// swagger:model DiameterConnections
type DiameterConnections struct {

	// Diameter connection information. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiamConnInfo []*DiameterConnectionInfo `json:"diam_conn_info,omitempty"`

	// Diameter proxy information. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiamProxyInfo []*DiameterProxyInfo `json:"diam_proxy_info,omitempty"`

	// Process Id on the SE which is reporting data. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	// uuid of the reporting SE. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
