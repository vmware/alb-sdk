// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BackupConfiguration backup configuration
// swagger:model BackupConfiguration
type BackupConfiguration struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// AWS Access Key ID. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AwsAccessKey *string `json:"aws_access_key,omitempty"`

	// AWS bucket. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AwsBucketID *string `json:"aws_bucket_id,omitempty"`

	// The name of the AWS region associated with the bucket. Field introduced in 21.1.5, 22.1.1, 22.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AwsBucketRegion *string `json:"aws_bucket_region,omitempty"`

	// AWS Secret Access Key. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AwsSecretAccess *string `json:"aws_secret_access,omitempty"`

	// Prefix of the exported configuration file. Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BackupFilePrefix *string `json:"backup_file_prefix,omitempty"`

	// Default passphrase to encrypt sensitive fields for configuration export and periodic backup. The same passphrase must be provided to import the configuration. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BackupPassphrase *string `json:"backup_passphrase,omitempty"`

	// By default, JSON Backups are generated. When this flag is enabled, bundle backups will be generated. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	BundleMode *bool `json:"bundle_mode,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Rotate the backup files based on this count. Allowed values are 1-20. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaximumBackupsStored *uint32 `json:"maximum_backups_stored,omitempty"`

	// Name of backup configuration. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Directory at remote destination with write permission for ssh user. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RemoteDirectory *string `json:"remote_directory,omitempty"`

	// Remote file transfer protocol type. Enum options - SCP, SFTP. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Basic (Allowed values- SCP,SFTP) edition.
	RemoteFileTransferProtocol *string `json:"remote_file_transfer_protocol,omitempty"`

	// Remote Destination. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RemoteHostname *string `json:"remote_hostname,omitempty"`

	// The folder name in s3 bucket where backup will be stored. Field introduced in 30.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	S3BucketFolder *string `json:"s3_bucket_folder,omitempty"`

	// Local Backup. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SaveLocal *bool `json:"save_local,omitempty"`

	// Access Credentials for remote destination. It is a reference to an object of type CloudConnectorUser. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SSHUserRef *string `json:"ssh_user_ref,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Remote Backup. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UploadToRemoteHost *bool `json:"upload_to_remote_host,omitempty"`

	// Cloud Backup. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UploadToS3 *bool `json:"upload_to_s3,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
