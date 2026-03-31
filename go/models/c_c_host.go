// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CCHost c c host
// swagger:model CC_Host
type CCHost struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Host *string `json:"host"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostIP *string `json:"host_ip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SSHLastTs *string `json:"ssh_last_ts,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SSHReason *string `json:"ssh_reason,omitempty"`

	//  Enum options - CC_HOST_STATE_UNKNOWN, CC_HOST_IMAGE_IN_PROGRESS, CC_HOST_IMAGE_COMPLETE, CC_HOST_IMAGE_FAILED, CC_HOST_START_IN_PROGRESS, CC_HOST_START_FAILED, CC_HOST_SSH_FAILED, CC_HOST_SSH_OK, CC_HOST_STARTED, CC_HOST_STOP_IN_PROGRESS, CC_HOST_STOP_FAILED, CC_HOST_STOPPED, CC_HOST_ENABLED, CC_HOST_DISABLED, CC_HOST_UNUSED, CC_HOST_READY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SSHState *string `json:"ssh_state"`

	//  Enum options - CC_HOST_STATE_UNKNOWN, CC_HOST_IMAGE_IN_PROGRESS, CC_HOST_IMAGE_COMPLETE, CC_HOST_IMAGE_FAILED, CC_HOST_START_IN_PROGRESS, CC_HOST_START_FAILED, CC_HOST_SSH_FAILED, CC_HOST_SSH_OK, CC_HOST_STARTED, CC_HOST_STOP_IN_PROGRESS, CC_HOST_STOP_FAILED, CC_HOST_STOPPED, CC_HOST_ENABLED, CC_HOST_DISABLED, CC_HOST_UNUSED, CC_HOST_READY. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	State *string `json:"state"`
}
