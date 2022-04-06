// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConfigInfo config info
// swagger:model ConfigInfo
type ConfigInfo struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Queue []*VersionInfo `json:"queue,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	ReaderCount *int32 `json:"reader_count,omitempty"`

	//  Enum options - REPL_NONE, REPL_ENABLED, REPL_DISABLED. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	WriterCount *int32 `json:"writer_count,omitempty"`
}
