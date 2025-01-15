// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DiameterLog diameter log
// swagger:model DiameterLog
type DiameterLog struct {

	// Field to identify which application the message is applicable for. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ApplicationID *uint32 `json:"application_id,omitempty"`

	// AvpKey type. Enum options - SESSION_ID, ORIGIN_HOST, ORIGIN_REALM, DESTINATION_HOST, DESTINATION_REALM, APPLICATION_ID. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AvpKeyType *string `json:"avp_key_type,omitempty"`

	// Field to indicate command associated with message. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CommandCode *uint32 `json:"command_code,omitempty"`

	// Field to identify the target server for the message. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DestinationHost *string `json:"destination_host,omitempty"`

	// Field to identify the realm where receiving server resides. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DestinationRealm *string `json:"destination_realm,omitempty"`

	// Field to detect duplicate messages. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EndToEndIdentifier *uint32 `json:"end_to_end_identifier,omitempty"`

	// Field to match requests and responses. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HopByHopIdentifier *uint32 `json:"hop_by_hop_identifier,omitempty"`

	// Field to identify endpoint that originated the message. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OriginHost *string `json:"origin_host,omitempty"`

	// Field to identify realm that originated the message. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	OriginRealm *string `json:"origin_realm,omitempty"`
}
