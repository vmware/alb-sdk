// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSQueryError DNS query error
// swagger:model DNSQueryError
type DNSQueryError struct {

	// error of DNSQueryError.
	Error *string `json:"error,omitempty"`

	// error_message of DNSQueryError.
	ErrorMessage *string `json:"error_message,omitempty"`

	// fqdn of DNSQueryError.
	Fqdn *string `json:"fqdn,omitempty"`
}
