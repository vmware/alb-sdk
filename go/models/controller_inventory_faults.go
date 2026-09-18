// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ControllerInventoryFaults controller inventory faults
// swagger:model ControllerInventoryFaults
type ControllerInventoryFaults struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BackupSchedulerFaults []*ControllerBackupSchedulerFault `json:"backup_scheduler_faults,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClusterFaults []*ControllerClusterFault `json:"cluster_faults,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DeprecatedAPIVersionFaults []*ControllerDeprecatedAPIFault `json:"deprecated_api_version_faults,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseFaults []*ControllerLicenseFault `json:"license_faults,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MigrationFaults []*ControllerMigrationFault `json:"migration_faults,omitempty"`

	// Each real JSON entry also carries one dynamic key per flagged SSLProfile name mapping to a list of blacklisted cipher-suite strings, those dynamic keys cannot be represented as static fields and are omitted here. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslprofileFaults []*ControllerSslProfileFault `json:"sslprofile_faults,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SystemLimitsFaults []*ControllerSystemLimitsFault `json:"system_limits_faults,omitempty"`
}
