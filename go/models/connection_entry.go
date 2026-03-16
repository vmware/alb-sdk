// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConnectionEntry connection entry
// swagger:model ConnectionEntry
type ConnectionEntry struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientDstIP *string `json:"client_dst_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientDstPort *uint32 `json:"client_dst_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientSrcIP *string `json:"client_src_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientSrcPort *uint32 `json:"client_src_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientVrfID *uint32 `json:"client_vrf_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DownstreamBufBytes *uint64 `json:"downstream_buf_bytes,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerDstIP *string `json:"server_dst_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerDstPort *uint32 `json:"server_dst_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerSrcIP *string `json:"server_src_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerSrcPort *uint32 `json:"server_src_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerVrfID *uint32 `json:"server_vrf_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpstreamBufBytes *uint64 `json:"upstream_buf_bytes,omitempty"`
}
