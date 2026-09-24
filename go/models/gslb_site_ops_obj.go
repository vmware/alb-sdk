// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GslbSiteOpsObj gslb site ops obj
// swagger:model GslbSiteOpsObj
type GslbSiteOpsObj struct {

	// Placeholder for GslbGeoDbProfile object. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	App *ApplicationPersistenceProfile `json:"app,omitempty"`

	// Describes the object type. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DsName *string `json:"ds_name,omitempty"`

	// Placeholder for FileObject object. Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Fileobject *FileObject `json:"fileobject,omitempty"`

	// Placeholder for GslbGeoDbProfile object. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Geo *GslbGeoDbProfile `json:"geo,omitempty"`

	// Placeholder for Gslb object. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Glb *Gslb `json:"glb,omitempty"`

	// Placeholder for GslbService object. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Gs *GslbService `json:"gs,omitempty"`

	// Placeholder for HealthMonitor object. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Hm *HealthMonitor `json:"hm,omitempty"`

	// Placeholder for JWTServerProfile object. Field introduced in 20.1.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Jwtserverprofile *JWTServerProfile `json:"jwtserverprofile,omitempty"`

	// Describes the operation on the object. Enum options - GSLB_NONE, GSLB_CREATE, GSLB_UPDATE, GSLB_DELETE, GSLB_PURGE, GSLB_DECL. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ops *string `json:"ops,omitempty"`

	// Placeholder for PKIProfile object. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pki *PKIProfile `json:"pki,omitempty"`

	// Describes additional reason of object. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Reason *string `json:"reason,omitempty"`

	// Placeholder for SSLProfile object. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ssl *SSLProfile `json:"ssl,omitempty"`

	// Placeholder for SSLKeyAndCertificate object. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslCert *SSLKeyAndCertificate `json:"ssl_cert,omitempty"`

	// Describes the operation status of the object. Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO, SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN, SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED.... Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Status *string `json:"status,omitempty"`

	// obj's uuid in case of delete or declarative operations. Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
