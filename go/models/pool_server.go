// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PoolServer pool server
// swagger:model PoolServer
type PoolServer struct {

	// DNS resolvable name of the server.  May be used in place of the IP address. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hostname *string `json:"hostname,omitempty"`

	// IP address of the server in the poool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP *IPAddr `json:"ip"`

	// Port of the pool server listening for HTTP/HTTPS. Default value is the default port in the pool. Allowed values are 1-65535. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Port *uint32 `json:"port,omitempty"`
}
