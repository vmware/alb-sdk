// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UpgradeProfile upgrade profile
// swagger:model UpgradeProfile
type UpgradeProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// List of controller upgrade related configurable parameters. Field deprecated in 31.2.1. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Controller *ControllerParams `json:"controller,omitempty"`

	// List of controller upgrade related configurable parameters. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ControllerParams *ControllerParams `json:"controller_params,omitempty"`

	// List of dryrun related configurable parameters. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DryRun *DryRunParams `json:"dry_run,omitempty"`

	// List of image related configurable parameters. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Image *ImageParams `json:"image,omitempty"`

	// List of upgrade pre-checks related configurable parameters. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PreChecks *PreChecksParams `json:"pre_checks,omitempty"`

	// List of service engine upgrade related configurable parameters. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ServiceEngine *ServiceEngineParams `json:"service_engine,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID Identifier for the UpgradeProfile object. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
