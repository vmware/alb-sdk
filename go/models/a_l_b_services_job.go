// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ALBServicesJob a l b services job
// swagger:model ALBServicesJob
type ALBServicesJob struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// The command to be triggered by the albservicesjob. Field introduced in 21.1.3.
	// Required: true
	Command *string `json:"command"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.3.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// The time at which the albservicesjob is ended. Field introduced in 21.1.3.
	EndTime *TimeStamp `json:"end_time,omitempty"`

	// The name of the albservicesjob. Field introduced in 21.1.3.
	// Required: true
	Name *string `json:"name"`

	// A unique identifier for this job entry on the Pulse portal. Field introduced in 21.1.3.
	PulseJobID *string `json:"pulse_job_id,omitempty"`

	// The time at which the albservicesjob is started. Field introduced in 21.1.3.
	StartTime *TimeStamp `json:"start_time,omitempty"`

	// The status of the albservicesjob. Enum options - UNDETERMINED, PENDING, IN_PROGRESS, COMPLETED, FAILED. Field introduced in 21.1.3.
	Status *string `json:"status,omitempty"`

	// The unique identifier of the tenant to which this albservicesjob belongs. It is a reference to an object of type Tenant. Field introduced in 21.1.3.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// A unique identifier for this albservicesjob entry. Field introduced in 21.1.3.
	UUID *string `json:"uuid,omitempty"`
}
