// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// AuditComplianceEventInfo audit compliance event info
// swagger:model AuditComplianceEventInfo
type AuditComplianceEventInfo struct {

	// Cluster uuid used for controller event. Field introduced in 20.1.6. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	ClusterUUID *string `json:"cluster_uuid,omitempty"`

	// Name of core archive. Field introduced in 20.1.6. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	CoreArchive *string `json:"core_archive,omitempty"`

	// Detailed report of the audit event. Field introduced in 20.1.3. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	DetailedReason *string `json:"detailed_reason,omitempty"`

	// Set the flag if event is generated by SE. Field introduced in 20.1.6. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	EventGeneratedBySe *bool `json:"event_generated_by_se,omitempty"`

	// Fingerprint extracted from the stacktrace. Field introduced in 20.1.6. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	Fingerprint *string `json:"fingerprint,omitempty"`

	// Information identifying physical location for audit event (e.g. Santa Clara (USA), Bengaluru (India)). Field introduced in 20.1.3. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	Location *string `json:"location,omitempty"`

	// Node on which crash is generated. Field introduced in 20.1.4. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	Node *string `json:"node,omitempty"`

	// Patch version of node. Field introduced in 20.1.6. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	PatchVersion *string `json:"patch_version,omitempty"`

	// Crashed core process name. Field introduced in 20.1.4. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	ProcessName *string `json:"process_name,omitempty"`

	// Protocol used for communication to the external entity. Enum options - SSH1_0, TLS1_2, HTTPS1_0, HTTP_PLAIN_TEXT, HTTPS_INSECURE, SSH2_0. Field introduced in 20.1.3. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	// Required: true
	Protocol *string `json:"protocol"`

	// Summarized failure of the transaction (e.g. Invalid request, expired certificate). Field introduced in 20.1.3. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	// Required: true
	Result *string `json:"result"`

	// Service Engine uuid used for service engine event. Field introduced in 20.1.6. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Subjects of audit event. Field introduced in 20.1.3. Minimum of 1 items required. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	Subjects []*ACSubjectInfo `json:"subjects,omitempty"`

	// Type of audit event. Enum options - AUDIT_INVALID_CREDENTIALS, AUDIT_NAME_RESOLUTION_ERROR, AUDIT_DIAL_X509_ERROR, AUDIT_CORE_GENERATED, AUDIT_SECURE_KEY_EXCHANGE_BAD_REQUEST_FORMAT, AUDIT_SECURE_KEY_EXCHANGE_BAD_CLIENT_TYPE, AUDIT_SECURE_KEY_EXCHANGE_FIELD_NOT_FOUND, AUDIT_SECURE_KEY_EXCHANGE_BAD_FIELD_VALUE, AUDIT_SECURE_KEY_EXCHANGE_INVALID_AUTHORIZATION, AUDIT_SECURE_KEY_EXCHANGE_INTERNAL_ERROR, AUDIT_SECURE_KEY_EXCHANGE_CERTIFICATE_VERIFY_ERROR, AUDIT_SECURE_KEY_EXCHANGE_RESPONSE_ERROR. Field introduced in 20.1.3. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	// Required: true
	Type *string `json:"type"`

	// List of users (username etc) related to the audit event. Field introduced in 20.1.3. Minimum of 1 items required. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	UserIdentities []*ACUserIdentity `json:"user_identities,omitempty"`

	// Version tag of node. Field introduced in 20.1.6. Allowed in Enterprise edition with any value, Enterprise with Cloud Services edition.
	Version *string `json:"version,omitempty"`
}
