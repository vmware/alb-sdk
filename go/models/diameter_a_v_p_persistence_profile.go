// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiameterAVPPersistenceProfile diameter a v p persistence profile
// swagger:model DiameterAVPPersistenceProfile
type DiameterAVPPersistenceProfile struct {

	// AvpKey type. Enum options - SESSION_ID, ORIGIN_HOST, ORIGIN_REALM, DESTINATION_HOST, DESTINATION_REALM, APPLICATION_ID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AvpKeyType *string `json:"avp_key_type,omitempty"`

	// The maximum lifetime of diameter cookie. No value or 'zero' indicates no timeout. Field introduced in 31.1.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Timeout *uint32 `json:"timeout,omitempty"`
}
