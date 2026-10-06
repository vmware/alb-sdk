// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ObjSyncConfig obj sync config
// swagger:model ObjSyncConfig
type ObjSyncConfig struct {

	// TLS certificate validation mode for inter-SE objsync, validated against the system secure channel certificate. STRICT (default) is the most secure mode. COMPAT also accepts legacy SE certificates for backward compatibility. Enum options - OBJSYNC_CERT_VALIDATION_COMPAT, OBJSYNC_CERT_VALIDATION_STRICT, OBJSYNC_CERT_VALIDATION_AUTO. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CertValidationMode *string `json:"cert_validation_mode,omitempty"`

	// SE CPU limit for InterSE Object Distribution. Allowed values are 0-100. Special values are 0- No Restriction.. Field introduced in 20.1.3. Unit is PERCENT. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjsyncCPULimit *uint32 `json:"objsync_cpu_limit,omitempty"`

	// Hub election interval for InterSE Object Distribution. Allowed values are 30-300. Field introduced in 20.1.3. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjsyncHubElectInterval *uint32 `json:"objsync_hub_elect_interval,omitempty"`

	// Reconcile interval for InterSE Object Distribution. Allowed values are 1-120. Field introduced in 20.1.3. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ObjsyncReconcileInterval *uint32 `json:"objsync_reconcile_interval,omitempty"`
}
