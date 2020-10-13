package models

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

// SSLKeyAndCertificate s s l key and certificate
// swagger:model SSLKeyAndCertificate
type SSLKeyAndCertificate struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// CA certificates in certificate chain.
	CaCerts []*CertificateAuthority `json:"ca_certs,omitempty"`

	// Placeholder for description of property certificate of obj type SSLKeyAndCertificate field type str  type object
	// Required: true
	Certificate *SSLCertificate `json:"certificate"`

	// States if the certificate is base64 encoded.
	CertificateBase64 *bool `json:"certificate_base64,omitempty"`

	//  It is a reference to an object of type CertificateManagementProfile.
	CertificateManagementProfileRef *string `json:"certificate_management_profile_ref,omitempty"`

	// Creator name.
	CreatedBy *string `json:"created_by,omitempty"`

	// Dynamic parameters needed for certificate management profile.
	DynamicParams []*CustomParams `json:"dynamic_params,omitempty"`

	// Enables OCSP Stapling. Field introduced in 20.1.1.
	EnableOcspStapling *bool `json:"enable_ocsp_stapling,omitempty"`

	// Encrypted private key corresponding to the private key (e.g. those generated by an HSM such as Thales nShield).
	EnckeyBase64 *string `json:"enckey_base64,omitempty"`

	// Name of the encrypted private key (e.g. those generated by an HSM such as Thales nShield).
	EnckeyName *string `json:"enckey_name,omitempty"`

	// Format of the Key/Certificate file. Enum options - SSL_PEM, SSL_PKCS12.
	Format *string `json:"format,omitempty"`

	//  It is a reference to an object of type HardwareSecurityModuleGroup.
	HardwaresecuritymodulegroupRef *string `json:"hardwaresecuritymodulegroup_ref,omitempty"`

	// Private key.
	Key *string `json:"key,omitempty"`

	// States if the private key is base64 encoded.
	KeyBase64 *bool `json:"key_base64,omitempty"`

	// Placeholder for description of property key_params of obj type SSLKeyAndCertificate field type str  type object
	KeyParams *SSLKeyParams `json:"key_params,omitempty"`

	// Passphrase used to encrypt the private key.
	KeyPassphrase *string `json:"key_passphrase,omitempty"`

	// Key value pairs for granular object access control. Also allows for classification and tagging of similar objects. Field introduced in 20.1.2.
	Labels []*KeyValue `json:"labels,omitempty"`

	// Name of the object.
	// Required: true
	Name *string `json:"name"`

	// Configuration related to OCSP. Field introduced in 20.1.1.
	OcspConfig *OCSPConfig `json:"ocsp_config,omitempty"`

	// Error reported during OCSP status query. Enum options - OCSP_ERR_CERTSTATUS_GOOD, OCSP_ERR_CERTSTATUS_REVOKED, OCSP_ERR_CERTSTATUS_UNKNOWN, OCSP_ERR_CERTSTATUS_SERVERFAIL_ERR, OCSP_ERR_CERTSTATUS_JOBDB, OCSP_ERR_CERTSTATUS_DISABLED, OCSP_ERR_CERTSTATUS_GETCERT, OCSP_ERR_CERTSTATUS_NONVSCERT, OCSP_ERR_CERTSTATUS_SELFSIGNED, OCSP_ERR_CERTSTATUS_CERTFINISH, OCSP_ERR_CERTSTATUS_CACERT, OCSP_ERR_CERTSTATUS_REQUEST, OCSP_ERR_CERTSTATUS_ISSUER_REVOKED, OCSP_ERR_CERTSTATUS_PARSE_CERT, OCSP_ERR_CERTSTATUS_HTTP_REQ, OCSP_ERR_CERTSTATUS_URL_LIST, OCSP_ERR_CERTSTATUS_HTTP_SEND, OCSP_ERR_CERTSTATUS_HTTP_RECV, OCSP_ERR_CERTSTATUS_HTTP_RESP. Field introduced in 20.1.1.
	OcspErrorStatus *string `json:"ocsp_error_status,omitempty"`

	// This is an Internal field to store the OCSP Responder URLs contained in the certificate. Field introduced in 20.1.1.
	// Read Only: true
	OcspResponderURLListFromCerts []string `json:"ocsp_responder_url_list_from_certs,omitempty"`

	// Information related to OCSP response. Field introduced in 20.1.1.
	OcspResponseInfo *OCSPResponseInfo `json:"ocsp_response_info,omitempty"`

	//  Enum options - SSL_CERTIFICATE_FINISHED, SSL_CERTIFICATE_PENDING.
	Status *string `json:"status,omitempty"`

	//  It is a reference to an object of type Tenant.
	TenantRef *string `json:"tenant_ref,omitempty"`

	//  Enum options - SSL_CERTIFICATE_TYPE_VIRTUALSERVICE, SSL_CERTIFICATE_TYPE_SYSTEM, SSL_CERTIFICATE_TYPE_CA.
	Type *string `json:"type,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Unique object identifier of the object.
	UUID *string `json:"uuid,omitempty"`
}
