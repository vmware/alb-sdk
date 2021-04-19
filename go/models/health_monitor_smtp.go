// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// HealthMonitorSMTP health monitor Smtp
// swagger:model HealthMonitorSmtp
type HealthMonitorSMTP struct {

	// Sender domain name. Field introduced in 21.1.1.
	Domainname *string `json:"domainname,omitempty"`

	// Mail data. Field introduced in 21.1.1.
	MailData *string `json:"mail_data,omitempty"`

	// Mail recipients. Field introduced in 21.1.1.
	RecipientsIds []string `json:"recipients_ids,omitempty"`

	// Mail sender. Field introduced in 21.1.1.
	SenderID *string `json:"sender_id,omitempty"`

	// SSL attributes for SMTPS monitor. Field introduced in 21.1.1.
	SslAttributes *HealthMonitorSSlattributes `json:"ssl_attributes,omitempty"`
}
