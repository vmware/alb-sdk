// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Ip6StatRuntime ip6 stat runtime
// swagger:model Ip6StatRuntime
type Ip6StatRuntime struct {

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SBadlen *uint64 `json:"ip6s_badlen"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SBadoptions *uint64 `json:"ip6s_badoptions"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SBadscope *uint64 `json:"ip6s_badscope"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SBadtcpsum *uint64 `json:"ip6s_badtcpsum"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SBadudpsum *uint64 `json:"ip6s_badudpsum"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SBadvers *uint64 `json:"ip6s_badvers"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SCantforward *uint64 `json:"ip6s_cantforward"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SCantfrag *uint64 `json:"ip6s_cantfrag"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SDelivered *uint64 `json:"ip6s_delivered"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SExthdrtoolong *uint64 `json:"ip6s_exthdrtoolong"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SFastforward *uint64 `json:"ip6s_fastforward"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SForward *uint64 `json:"ip6s_forward"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SFragdropped *uint64 `json:"ip6s_fragdropped"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SFragmented *uint64 `json:"ip6s_fragmented"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SFragments *uint64 `json:"ip6s_fragments"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SFragoverflow *uint64 `json:"ip6s_fragoverflow"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SFragtimeout *uint64 `json:"ip6s_fragtimeout"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SLocalout *uint64 `json:"ip6s_localout"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SNoroute *uint64 `json:"ip6s_noroute"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SNotmember *uint64 `json:"ip6s_notmember"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SOdropped *uint64 `json:"ip6s_odropped"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SOfragments *uint64 `json:"ip6s_ofragments"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SRawout *uint64 `json:"ip6s_rawout"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SReassembled *uint64 `json:"ip6s_reassembled"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SRedirectsent *uint64 `json:"ip6s_redirectsent"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6STcpsumLarge *uint64 `json:"ip6s_tcpsum_large"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SToomanyhdr *uint64 `json:"ip6s_toomanyhdr"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6STooshort *uint64 `json:"ip6s_tooshort"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SToosmall *uint64 `json:"ip6s_toosmall"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6STotal *uint64 `json:"ip6s_total"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	IP6SUdpsumLarge *uint64 `json:"ip6s_udpsum_large"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProcID *string `json:"proc_id,omitempty"`

	//  Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`
}
