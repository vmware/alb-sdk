// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSDomain Dns domain
// swagger:model DnsDomain
type DNSDomain struct {

	// Service domain *string used for FQDN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	DomainName *string `json:"domain_name"`

	// Domain name is available in private zone and/or public zone. Enum options - DOMAIN_DEFAULT, DOMAIN_PRIVATE, DOMAIN_PUBLIC, DOMAIN_PRIVATE_PUBLIC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DomainType *string `json:"domain_type,omitempty"`
}
