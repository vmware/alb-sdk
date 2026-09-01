// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CertificateSecurityPolicy certificate security policy
// swagger:model CertificateSecurityPolicy
type CertificateSecurityPolicy struct {

	// Signature algorithm families whose certificates are blocked on new imports. Enum options - SIGNATURE_ALGORITHM_MD5, SIGNATURE_ALGORITHM_SHA1, SIGNATURE_ALGORITHM_SHA256, SIGNATURE_ALGORITHM_SHA384, SIGNATURE_ALGORITHM_SHA512, SIGNATURE_ALGORITHM_ED25519. Field introduced in 32.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BlockedCertificateSignatureAlgorithms []string `json:"blocked_certificate_signature_algorithms,omitempty"`

	// Hash algorithms not allowed for OCSP requests. Enum options - OCSP_HASH_SHA1, OCSP_HASH_SHA256, OCSP_HASH_SHA384, OCSP_HASH_SHA512. Field introduced in 32.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	BlockedOcspRequestHashAlgorithms []string `json:"blocked_ocsp_request_hash_algorithms,omitempty"`
}
