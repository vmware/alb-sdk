// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// LdapAuthSettings ldap auth settings
// swagger:model LdapAuthSettings
type LdapAuthSettings struct {

	// The LDAP base DN.  For example, avinetworks.com would be DC=avinetworks,DC=com. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BaseDn *string `json:"base_dn,omitempty"`

	// LDAP administrator credentials are used to search for users and group memberships. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BindAsAdministrator *bool `json:"bind_as_administrator,omitempty"`

	// Client certificate for mutual TLS connection. Effective only when security_mode is AUTH_LDAP_SECURE_USE_LDAPS. Not supported on the Service Engine data path; has no effect when this Auth Profile is used for Virtual Service client authentication. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClientCertRef *string `json:"client_cert_ref,omitempty"`

	// LDAP attribute that refers to user email. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EmailAttribute *string `json:"email_attribute,omitempty"`

	// LDAP attribute that refers to user's full name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FullNameAttribute *string `json:"full_name_attribute,omitempty"`

	// PKI Profile used to validate the LDAP server certificate. Effective only when security_mode is AUTH_LDAP_SECURE_USE_LDAPS. It is a reference to an object of type PKIProfile. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PkiProfileRef *string `json:"pki_profile_ref,omitempty"`

	// Query the LDAP servers on this port. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Port *uint32 `json:"port,omitempty"`

	// LDAP connection security mode. Enum options - AUTH_LDAP_SECURE_NONE, AUTH_LDAP_SECURE_USE_LDAPS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	SecurityMode *string `json:"security_mode"`

	// LDAP server IP(v4/v6) address or FQDN. Use IP address if an auth profile is used to configure Virtual Service. Minimum of 1 items required. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Server []string `json:"server,omitempty"`

	// LDAP full directory configuration with administrator credentials. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Settings *LdapDirectorySettings `json:"settings,omitempty"`

	// Skip hostname verification against the LDAP server certificate. The certificate chain is still validated using pki_profile_uuid. Effective only when security_mode is AUTH_LDAP_SECURE_USE_LDAPS. Not honored on the Service Engine data path; has no effect when this Auth Profile is used for Virtual Service client authentication. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SkipHostnameVerification *bool `json:"skip_hostname_verification,omitempty"`

	// LDAP anonymous bind configuration. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UserBind *LdapUserBindSettings `json:"user_bind,omitempty"`
}
