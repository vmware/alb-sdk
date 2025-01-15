// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// FailAction fail action
// swagger:model FailAction
type FailAction struct {

	// Local response to HTTP requests when pool experiences a failure. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LocalRsp *FailActionHTTPLocalResponse `json:"local_rsp,omitempty"`

	// URL to redirect HTTP requests to when pool experiences a failure. Allowed with any value in Enterprise, Basic, Enterprise with Cloud Services edition.
	Redirect *FailActionHTTPRedirect `json:"redirect,omitempty"`

	// Enables a response to client when pool experiences a failure. By default TCP connection is closed. Enum options - FAIL_ACTION_HTTP_REDIRECT, FAIL_ACTION_HTTP_LOCAL_RSP, FAIL_ACTION_CLOSE_CONN, FAIL_ACTION_BACKUP_POOL. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- FAIL_ACTION_CLOSE_CONN), Basic (Allowed values- FAIL_ACTION_CLOSE_CONN,FAIL_ACTION_HTTP_REDIRECT) edition.
	// Required: true
	Type *string `json:"type"`
}
