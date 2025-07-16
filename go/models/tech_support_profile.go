// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// TechSupportProfile tech support profile
// swagger:model TechSupportProfile
type TechSupportProfile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Defined policy for tech-support archive rules.These are predefined files which are exception for default file size thresholdUser can add file path with custom threshold in allowed limits to be collected in bundlee.g. A file /var/sample.log is with size 450MB needs to be collected for each invocationUser should configure and add path in TechSupportProfile. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ArchiveRules *ArchiveRules `json:"archive_rules,omitempty"`

	// A list of user-specified file paths for collectionthat are not part of the predefined YAML configuration. This is useful forcollecting logs from third-party applications or other custom files.e.g. A file located at /var/sample.log which is not a part of pre-define yamlUser should configure this path as source in collect_customer_files so that subsequent collectioncollect this file, once user no longer needed this file they can remove from TechSupportProfile. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CollectCustomerFiles *CollectCustomerFiles `json:"collect_customer_files,omitempty"`

	// Specify this params to set threshold for event files.User provided parameters will take precedence over the profile parameters. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EventParams *TechSupportEventParams `json:"event_params,omitempty"`

	// Max file size threshold to archive in tech-support collectionfiles above this threshold will not be collected and an warning will be flagged. Allowed values are 128-512. Field introduced in 31.2.1. Unit is MB. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FileSizeThreshold *uint32 `json:"file_size_threshold,omitempty"`

	// Max disk size in percent of total disk size reserved for the tech-support.The value is in Percentage to make it agnostic of controller flavors.e.g. small [disk=5 GB, TS space available = 500MB]Large [ disk= 100Gb, TS Space available= 10GB]XL [disk=1TB, TS space available=100GB]. Allowed values are 10-25. Field introduced in 31.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxDiskSizePercent *uint32 `json:"max_disk_size_percent,omitempty"`

	// Min free disk required for the tech-support invocation.The value is in Percentage to make it agnostic of controller flavors.e.g. small [disk=5 GB, TS space available = 250MB]Large [ disk= 100Gb, TS Space available= 5GB]XL [disk=1TB, TS space available=50GB]. Allowed values are 5-10. Field introduced in 31.2.1. Unit is PERCENT. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinFreeDiskRequired *uint32 `json:"min_free_disk_required,omitempty"`

	// Number of techsupport to retain from techsupport cleanup policy. Allowed values are 1-5. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	NoOfTechsupportRetentions *uint32 `json:"no_of_techsupport_retentions,omitempty"`

	// Number of simultaneous tech-support invocation allowed. Allowed values are 1-2. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SimultaneousInvocations *uint32 `json:"simultaneous_invocations,omitempty"`

	// Generic timeout for tech-support task collection.This can be used for task, script executions etc.Tweak the timeout value in cases of timeout observation in the logs. Field introduced in 31.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TaskTimeout *uint32 `json:"task_timeout,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID Identifier for the tech-support profile. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
