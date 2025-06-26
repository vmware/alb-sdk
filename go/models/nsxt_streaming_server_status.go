// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// NsxtStreamingServerStatus nsxt streaming server status
// swagger:model NsxtStreamingServerStatus
type NsxtStreamingServerStatus struct {

	// Timestamp (unix time since epoch) of last message received from NSX-T streaming service. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Cursor *CorfuTimestamp `json:"cursor,omitempty"`

	// Error encountered while processing updates fromstreaming agent. This will be empty if the last update was successful. This message should also indicate if the failure was in full-sync or delta-sync processing. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LastUpdateErr *string `json:"last_update_err,omitempty"`

	// Human readable timestamp of last successful update done in Avi. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LastUpdateTime *string `json:"last_update_time,omitempty"`

	// Hostname or IP of NSX-T manager as given in cloud config. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NsxtManagerURL *string `json:"nsxt_manager_url,omitempty"`

	// State of the connection to NSX-T manager streaming service gRPC client. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
