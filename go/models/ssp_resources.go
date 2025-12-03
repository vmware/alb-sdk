// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SspResources ssp resources
// swagger:model SspResources
type SspResources struct {

	// Client certificate used by Avi to authenticate with the SSP instance. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AviClientCertRef *string `json:"avi_client_cert_ref,omitempty"`

	// AuthMappingProfile used to setup client cert auth for the SSP instance. It is a reference to an object of type AuthMappingProfile. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientCertAuthMappingProfileRef *string `json:"client_cert_auth_mapping_profile_ref,omitempty"`

	// AuthProfile used to setup client cert auth for the SSP instance. It is a reference to an object of type AuthProfile. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientCertAuthProfileRef *string `json:"client_cert_auth_profile_ref,omitempty"`

	// Client certificate that the SSP instance uses to authenticate with Avi. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientCertRef *string `json:"client_cert_ref,omitempty"`
}
