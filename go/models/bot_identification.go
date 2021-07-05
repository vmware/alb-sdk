// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// BotIdentification bot identification
// swagger:model BotIdentification
type BotIdentification struct {

	// The Bot Client Class of this identification. Enum options - UNDETERMINED_CLIENT, HUMAN_CLIENT, BOT_CLIENT. Field introduced in 21.1.1.
	Class *string `json:"class,omitempty"`

	// A free-form *string to identify the client. Field introduced in 21.1.1.
	Identifier *string `json:"identifier,omitempty"`

	// The Bot Client Type of this identification. Enum options - UNDETERMINED_CLIENT_TYPE, WEB_BROWSER, IN_APP_BROWSER, SEARCH_ENGINE, IMPERSONATOR, SPAM_SOURCE, WEB_ATTACKS, BOTNET, SCANNER, DENIAL_OF_SERVICE, CLOUD_SOURCE, SECURITY_SCANNER, SITE_MONITOR, GENERIC_APPLICATION. Field introduced in 21.1.1.
	Type *string `json:"type,omitempty"`
}
