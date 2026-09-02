// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SecMgrDebugFocusEntry sec mgr debug focus entry
// swagger:model SecMgrDebugFocusEntry
type SecMgrDebugFocusEntry struct {

	// How long this focus entry stays active before automatic expiry, in minutes (max 3h — starting conservative, may be raised later). Unlike DebugVirtualServiceCapture.duration, 0/infinite is not allowed — every focus entry must self-expire eventually. Allowed values are 1-180. Field introduced in 32.1.4. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Duration *uint32 `json:"duration,omitempty"`

	// Max events retained in this entry's ring buffer. Mirrors DebugVirtualServiceCapture.num_pkts. Changing this on an existing entry reallocates its buffer, discarding the trace captured so far. Allowed values are 1-500. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxEvents *uint32 `json:"max_events,omitempty"`

	// Unique name for this focus entry, chosen by the operator. Used to create/edit, remove, and dump this entry (see 'show securitymgr stats filter stage stage_debug_focus filter focus_name <name>'). Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Service Engine to focus on. Empty = any SE. It is a reference to an object of type ServiceEngine. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`

	// Pipeline stage to focus on. Defaults to all stages. Enum options - STAGE_ALL, STAGE_INGRESS, STAGE_ENDPOINT_CLASSIFICATION, STAGE_ENDPOINT_CONSOLIDATION, STAGE_CONFIG_SYNC, STAGE_LEARNING_DB_SWEEP, STAGE_WAAP_HITS_POPULATOR, STAGE_DEBUG_FOCUS. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Stage *string `json:"stage,omitempty"`

	// URI path to focus on. Empty = any URI. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	URI *string `json:"uri,omitempty"`

	// Virtual Service to focus on. Empty = any VS. It is a reference to an object of type Virtualservice. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsRef *string `json:"vs_ref,omitempty"`
}
