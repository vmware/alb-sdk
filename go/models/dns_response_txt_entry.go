// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSResponseTxtEntry Dns response txt entry
// swagger:model DnsResponseTxtEntry
type DNSResponseTxtEntry struct {

	// Text data associated with a FQDN. Field introduced in 18.2.9, 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TextStr *string `json:"text_str,omitempty"`
}
