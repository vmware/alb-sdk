// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeClfEventDetails se clf event details
// swagger:model SeClfEventDetails
type SeClfEventDetails struct {

	// Name of the CLF pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfPool *string `json:"clf_pool,omitempty"`

	// Name of the ClfProfile that owns the CLF pool. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ClfProfile *string `json:"clf_profile,omitempty"`

	// CLF server (collector) details. For pool events, the last server that changed state, if any. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Server *SeHmEventServerDetails `json:"server,omitempty"`
}
