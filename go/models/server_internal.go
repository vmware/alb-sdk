// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServerInternal server internal
// swagger:model ServerInternal
type ServerInternal struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ChashArcsSum *uint32 `json:"chash_arcs_sum,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CkPrstID *uint32 `json:"ck_prst_id,omitempty"`

	// Server id for persistence. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CkPrstID64 *uint64 `json:"ck_prst_id_64,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CurrentOpenConns *int64 `json:"current_open_conns,omitempty"`

	//  Enum options - ARP_UNRESOLVED, CONNECTION_REFUSED, CONNECTION_TIMEOUT, RESPONSE_CODE_MISMATCH, PAYLOAD_CONTENT_MISMATCH, SERVER_UNREACHABLE, CONNECTION_RESET, CONNECTION_ERROR, HOST_ERROR, ADDRESS_ERROR, NO_PORT, PAYLOAD_TIMEOUT, NO_RESPONSE, NO_RESOURCES, SSL_ERROR, SSL_CERT_ERROR, PORT_UNREACHABLE, SCRIPT_ERROR, OTHER_ERROR, SERVER_DISABLED, REMOTE_STATE, MAINTENANCE_RESPONSE_CODE_MATCH, MAINTENANCE_PAYLOAD_CONTENT_MATCH, CHUNKED_RESPONSE_PAYLOAD_NOT_FOUND, GSLB_POOL_MEMBER_DOWN, GSLB_POOL_MEMBER_DISABLED, GSLB_POOL_MEMBER_STATE_UNKNOWN, INSUFFICIENT_HEALTH_MONITORS_UP, GSLB_POOL_MEMBER_REMOTE_STATE_UNKNOWN, RESPONSE_BUFFER_OVERFLOW, REQUEST_BUFFER_OVERFLOW, SERVER_AUTHENTICATION_ERR, INITIALIZATION_ERR, EXT_HM_ERROR, HTTP2_NOT_SUPPORTED. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbFailureCode *string `json:"gslb_failure_code,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbNoHm *bool `json:"gslb_no_hm,omitempty"`

	// Internal field to depict the remote HM failure of asharded GSLB member. Enum options - ARP_UNRESOLVED, CONNECTION_REFUSED, CONNECTION_TIMEOUT, RESPONSE_CODE_MISMATCH, PAYLOAD_CONTENT_MISMATCH, SERVER_UNREACHABLE, CONNECTION_RESET, CONNECTION_ERROR, HOST_ERROR, ADDRESS_ERROR, NO_PORT, PAYLOAD_TIMEOUT, NO_RESPONSE, NO_RESOURCES, SSL_ERROR, SSL_CERT_ERROR, PORT_UNREACHABLE, SCRIPT_ERROR, OTHER_ERROR, SERVER_DISABLED.... Field introduced in 18.2.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbShardHmFailure *string `json:"gslb_shard_hm_failure,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbSiteName *string `json:"gslb_site_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbSiteUnreachable *bool `json:"gslb_site_unreachable,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbVsName *string `json:"gslb_vs_name,omitempty"`

	// Horizon port mapping information. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HorizonInternalPortInfo *HorizonInternalPortInfo `json:"horizon_internal_port_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IPAddr *IPAddr `json:"ip_addr"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPv4PrstID *uint32 `json:"ipv4_prst_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L7cpStats *ConnpoolStats `json:"l7cp_stats,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Latitude *uint32 `json:"latitude,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LocInvalid *bool `json:"loc_invalid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Local *uint32 `json:"local,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Location *string `json:"location,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Longitude *uint32 `json:"longitude,omitempty"`

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxConnPc *uint32 `json:"max_conn_pc,omitempty"`

	//  Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxConnSe *int32 `json:"max_conn_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NatHostname *string `json:"nat_hostname,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NatIPAddr *IPAddr `json:"nat_ip_addr,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NatPort *int32 `json:"nat_port,omitempty"`

	//  Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NegativeOpenConns *uint64 `json:"negative_open_conns,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumChashUniqueKeys *uint32 `json:"num_chash_unique_keys,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Port *int32 `json:"port"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PrstHdrVal *string `json:"prst_hdr_val,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RealLatitude *int32 `json:"real_latitude,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RealLongitude *int32 `json:"real_longitude,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RefCount *int32 `json:"ref_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerConfig *Server `json:"server_config,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerL4stats *ServerL4Stats `json:"server_l4stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerL7stats *ServerL7Stats `json:"server_l7stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerNodeName *string `json:"server_node_name,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerStats *ServerStats `json:"server_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SlowStart *ServerSlowStart `json:"slow_start,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tag *string `json:"tag,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VMPoweredOffCount *uint32 `json:"vm_powered_off_count,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VMPoweredOn *bool `json:"vm_powered_on,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VMPoweredOnCount *uint32 `json:"vm_powered_on_count,omitempty"`
}
