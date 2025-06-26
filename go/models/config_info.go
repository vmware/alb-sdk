// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ConfigInfo config info
// swagger:model ConfigInfo
type ConfigInfo struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Queue []*VersionInfo `json:"queue,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReaderCount *uint32 `json:"reader_count,omitempty"`

	//  Enum options - REPL_NONE, REPL_ENABLED, REPL_DISABLED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WriterCount *uint32 `json:"writer_count,omitempty"`
}
