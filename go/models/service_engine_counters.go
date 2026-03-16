// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngineCounters service engine counters
// swagger:model ServiceEngineCounters
type ServiceEngineCounters struct {

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DpHbMissCnt *int32 `json:"dp_hb_miss_cnt,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbMissCnt *int32 `json:"hb_miss_cnt,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbRecvCnt *int32 `json:"hb_recv_cnt,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HbSentCnt *int32 `json:"hb_sent_cnt,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastDown *string `json:"last_down,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastDpHbMiss *string `json:"last_dp_hb_miss,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastHbMiss *string `json:"last_hb_miss,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastPartitioned *string `json:"last_partitioned,omitempty"`

	//  Field introduced in 17.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LastUp *string `json:"last_up,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RegCnt *int32 `json:"reg_cnt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RegFailCnt *int32 `json:"reg_fail_cnt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeDownCnt *int32 `json:"se_down_cnt,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUpCnt *int32 `json:"se_up_cnt,omitempty"`
}
