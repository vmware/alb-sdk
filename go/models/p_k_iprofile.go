// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// PKIprofile p k iprofile
// swagger:model PKIProfile
type PKIprofile struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// List of Certificate Authorities (Root and Intermediate) trusted that is used for certificate validation. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CaCerts []*SSLCertificate `json:"ca_certs,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Creator name. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CreatedBy *string `json:"created_by,omitempty"`

	// When enabled, Avi will verify via CRL checks that certificates in the trust chain have not been revoked. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	CrlCheck *bool `json:"crl_check,omitempty"`

	// Certificate Revocation Lists. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Crls []*CRL `json:"crls,omitempty"`

	// When enabled, Avi will not trust Intermediate and Root certs presented by a client.  Instead, only the chain certs configured in the Certificate Authority section will be used to verify trust of the client's cert. Allowed in Enterprise with any value edition, Essentials(Allowed values- true) edition, Basic(Allowed values- true) edition, Enterprise with Cloud Services edition. Special default for Essentials edition is true, Basic edition is true, Enterprise is False.
	IgnorePeerChain *bool `json:"ignore_peer_chain,omitempty"`

	// This field describes the object's replication scope. If the field is set to false, then the object is visible within the controller-cluster and its associated service-engines.  If the field is set to true, then the object is replicated across the federation.  . Field introduced in 17.1.3. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	IsFederated *bool `json:"is_federated,omitempty"`

	// Key value pairs for granular object access control. Also allows for classification and tagging of similar objects. Field deprecated in 20.1.5. Field introduced in 20.1.2. Maximum of 4 items allowed. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	Labels []*KeyValue `json:"labels,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 20.1.5. Allowed in Enterprise with any value edition, Essentials with any value edition, Basic with any value edition, Enterprise with Cloud Services edition.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	// Name of the PKI Profile. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	//  It is a reference to an object of type Tenant. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// When enabled, Avi will only validate the revocation status of the leaf certificate using CRL. To enable validation for the entire chain, disable this option and provide all the relevant CRLs. Allowed in Enterprise with any value edition, Essentials(Allowed values- true) edition, Basic(Allowed values- true) edition, Enterprise with Cloud Services edition.
	ValidateOnlyLeafCrl *bool `json:"validate_only_leaf_crl,omitempty"`
}
