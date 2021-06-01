// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApicVSPlacementReq apic v s placement req
// swagger:model ApicVSPlacementReq
type ApicVSPlacementReq struct {

	//  Field deprecated in 21.1.1.
	Graph *string `json:"graph,omitempty"`

	//  Field deprecated in 21.1.1.
	Lifs []*Lif `json:"lifs,omitempty"`

	//  Field deprecated in 21.1.1.
	NetworkRel []*APICNetworkRel `json:"network_rel,omitempty"`

	//  Field deprecated in 21.1.1.
	TenantName *string `json:"tenant_name,omitempty"`

	//  Field deprecated in 21.1.1.
	Vdev *string `json:"vdev,omitempty"`

	//  Field deprecated in 21.1.1.
	Vgrp *string `json:"vgrp,omitempty"`
}
