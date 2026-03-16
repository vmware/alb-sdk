// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UpdateDNSEntryReq update DNS entry req
// swagger:model UpdateDNSEntryReq
type UpdateDNSEntryReq struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSInfo []*DNSInfo `json:"dns_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldDNSInfo []*DNSInfo `json:"old_dns_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldFip *IPAddr `json:"old_fip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldFip6 *IPAddr `json:"old_fip6,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldVip *IPAddr `json:"old_vip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OldVip6 *IPAddr `json:"old_vip6,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OperStatus *OperationalStatus `json:"oper_status,omitempty"`

	//  Enum options - DNS_TRIGGER_CHANGE_FQDN, DNS_TRIGGER_CHANGE_OPER_STATE, DNS_TRIGGER_DELETE_CONSUMER, DNS_TRIGGER_UPGRADE, DNS_TRIGGER_ADD_CONSUMER, DNS_TRIGGER_COLD_START_DONE, DNS_TRIGGER_CHANGE_IP. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Trigger *string `json:"trigger,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VipID *string `json:"vip_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsUUID *string `json:"vs_uuid,omitempty"`
}
