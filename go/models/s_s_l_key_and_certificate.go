package models

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

// SSLKeyAndCertificate s s l key and certificate
// swagger:model SSLKeyAndCertificate
type SSLKeyAndCertificate struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified int64 `json:"_last_modified,omitempty"`

	// CA certificates in certificate chain.
	CaCerts []*CertificateAuthority `json:"ca_certs,omitempty"`

	// Placeholder for description of property certificate of obj type SSLKeyAndCertificate field type str  type object
	// Required: true
	Certificate *SSLCertificate `json:"certificate"`

	//  It is a reference to an object of type CertificateManagementProfile.
	CertificateManagementProfileRef string `json:"certificate_management_profile_ref,omitempty"`

	// Creator name.
	CreatedBy string `json:"created_by,omitempty"`

	// Dynamic parameters needed for certificate management profile.
	DynamicParams []*CustomParams `json:"dynamic_params,omitempty"`

	// Encrypted private key corresponding to the private key (e.g. those generated by an HSM such as Thales nShield).
	EnckeyBase64 string `json:"enckey_base64,omitempty"`

	// Name of the encrypted private key (e.g. those generated by an HSM such as Thales nShield).
	EnckeyName string `json:"enckey_name,omitempty"`

	//  It is a reference to an object of type HardwareSecurityModuleGroup.
	HardwaresecuritymodulegroupRef string `json:"hardwaresecuritymodulegroup_ref,omitempty"`

	// Private key.
	Key string `json:"key,omitempty"`

	// Placeholder for description of property key_params of obj type SSLKeyAndCertificate field type str  type object
	KeyParams *SSLKeyParams `json:"key_params,omitempty"`

	// Name of the object.
	// Required: true
	Name string `json:"name"`

	//  Enum options - SSL_CERTIFICATE_FINISHED, SSL_CERTIFICATE_PENDING.
	Status string `json:"status,omitempty"`

	//  It is a reference to an object of type Tenant.
	TenantRef string `json:"tenant_ref,omitempty"`

	//  Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA.
	Type string `json:"type,omitempty"`

	// url
	// Read Only: true
	URL string `json:"url,omitempty"`

	// Unique object identifier of the object.
	UUID string `json:"uuid,omitempty"`
}
