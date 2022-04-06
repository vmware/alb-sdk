// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SSLClientCertificateAction s s l client certificate action
// swagger:model SSLClientCertificateAction
type SSLClientCertificateAction struct {

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CloseConnection *bool `json:"close_connection,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Headers []*SSLClientRequestHeader `json:"headers,omitempty"`
}
