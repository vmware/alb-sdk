// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SspInstance ssp instance
// swagger:model SspInstance
type SspInstance struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Client certificate that Avi uses to authenticate with the SSP instance. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AviClientCert *string `json:"avi_client_cert,omitempty"`

	// Client certificate that the SSP instance uses to authenticate with Avi. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ClientCert *string `json:"client_cert,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 32.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Description of the onboarded SSP feature instance. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Type of the SSP feature instance. Enum options - SSP_INTELLIGENT_ASSIST, SSP_VDLS. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Feature *string `json:"feature"`

	// Hostname of the SSP feature instance. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Hostname *string `json:"hostname"`

	// Ingress (server) certificate chain that the SSP endpoint uses. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	IngressCert *string `json:"ingress_cert,omitempty"`

	// Name of the onboarded SSP feature instance. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// Resources associated with the SSP feature instance. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Resources *SspResources `json:"resources,omitempty"`

	// Status of the SSP feature instance. Enum options - SSP_STATUS_IN_PROGRESS, SSP_STATUS_ACTIVE, SSP_STATUS_CERT_UPDATE_FAILED. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Status *string `json:"status"`

	// Tenant reference for the SSP object. It is a reference to an object of type Tenant. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID for the onboarded SSP feature instance. Field introduced in 32.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
