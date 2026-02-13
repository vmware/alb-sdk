// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClientCertAuthSettings client cert auth settings
// swagger:model ClientCertAuthSettings
type ClientCertAuthSettings struct {

	// Client Certs to be used for authentication. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientCertRefs []string `json:"client_cert_refs,omitempty"`
}
