// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SCFaultOptions s c fault options
// swagger:model SCFaultOptions
type SCFaultOptions struct {

	// Delay CREATE in config path (seconds). Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DelayCreate *uint32 `json:"delay_create,omitempty"`

	// Delay DELETES in Config, SE paths (seconds). Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DelayDelete *uint32 `json:"delay_delete,omitempty"`

	// Delay UPDATES in ResMgr, Config, SE paths (seconds). Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DelayUpdate *uint32 `json:"delay_update,omitempty"`

	// Type of fault to injection. Enum options - DELAY_NOTIF, DELAY_SE, DELAY_RM. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	FaultType *string `json:"fault_type,omitempty"`

	// Introduce faults for specific object UUID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Obj *string `json:"obj,omitempty"`

	// Introduce faults for objects of specified type. Enum options - VIRTUALSERVICE, POOL, HEALTHMONITOR, NETWORKPROFILE, APPLICATIONPROFILE, HTTPPOLICYSET, DNSPOLICY, SECURITYPOLICY, IPADDRGROUP, STRINGGROUP, SSLPROFILE, SSLKEYANDCERTIFICATE, NETWORKSECURITYPOLICY, APPLICATIONPERSISTENCEPROFILE, ANALYTICSPROFILE, VSDATASCRIPTSET, TENANT, PKIPROFILE, AUTHPROFILE, CLOUD.... Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ObjectType *string `json:"object_type,omitempty"`

	// Introduce faults in SE path of specific SE UUID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Se *string `json:"se,omitempty"`
}
