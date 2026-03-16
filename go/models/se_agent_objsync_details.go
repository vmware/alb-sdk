// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentObjsyncDetails se agent objsync details
// swagger:model SeAgentObjsyncDetails
type SeAgentObjsyncDetails struct {

	// The cumulative count of heap objects freed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Frees *uint64 `json:"Frees,omitempty"`

	// The fraction of this program's available CPU time used by the GC since the program started. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GCCPUFraction *float64 `json:"GCCPUFraction,omitempty"`

	// Bytes of allocated heap objects which include all reachable objects,as well as unreachable objects that the garbage collector has not yet freed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapAlloc *string `json:"HeapAlloc,omitempty"`

	// HeapInuse minus HeapAlloc estimates the amount of memory that has been dedicated to particular size classes,but is not currently being used. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapInuse *string `json:"HeapInuse,omitempty"`

	// Number of allocated heap objects. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HeapObjects *uint64 `json:"HeapObjects,omitempty"`

	// LastGC is the time the last garbage collection finished. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastGC *string `json:"LastGC,omitempty"`

	// The cumulative count of heap objects allocated. The number of live objects is Mallocs - Frees. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Mallocs *uint64 `json:"Mallocs,omitempty"`

	// NextGC is the target heap size of the next GC cycle. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NextGC *string `json:"NextGC,omitempty"`

	// The number of GC cycles that were forced by the application calling the GC function. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumForcedGC *uint32 `json:"NumForcedGC,omitempty"`

	// The cumulative nanoseconds in GC stop-the-world pauses since the program started.During a stop-the-world pause, all goroutines are paused and only the garbage collector can run. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PauseTotalNs *uint64 `json:"PauseTotalNs,omitempty"`

	// Bytes of stack memory obtained from the OS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StackSys *string `json:"StackSys,omitempty"`

	// TotalAlloc is cumulative bytes allocated for heap objects.It increases as heap objects are allocated, but unlikeAlloc and HeapAlloc, it does not decrease when objects are freed. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalAlloc *string `json:"TotalAlloc,omitempty"`

	// config version. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigVersion *uint32 `json:"config_version,omitempty"`

	// All peer SE UUIDs failed to connect. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DisconnectedSes []string `json:"disconnected_ses,omitempty"`

	// memory consumed by object sync. Field introduced in 20.1.3. Unit is BYTES. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Memory *uint32 `json:"memory,omitempty"`

	// garbage collector counter. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGc *uint32 `json:"num_gc,omitempty"`

	// number of go routines. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumGoroutines *uint32 `json:"num_goroutines,omitempty"`

	// Peer Connections Failed. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeerConnectionsFailed *uint32 `json:"peer_connections_failed,omitempty"`

	// Peer Connections Successful. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PeerConnectionsSuccessful *uint32 `json:"peer_connections_successful,omitempty"`

	// SE uuid. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
