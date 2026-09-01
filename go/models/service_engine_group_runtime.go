// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ServiceEngineGroupRuntime service engine group runtime
// swagger:model ServiceEngineGroupRuntime
type ServiceEngineGroupRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AddVnicStats *SeVnicStats `json:"add_vnic_stats,omitempty"`

	//  It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AtCurrVerSe []string `json:"at_curr_ver_se,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreateStats *SeCreateStats `json:"create_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DelVnicStats *SeVnicStats `json:"del_vnic_stats,omitempty"`

	//  It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DisconnectedSe []string `json:"disconnected_se,omitempty"`

	//  It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DownSe []string `json:"down_se,omitempty"`

	// Set to true while an asynchronous ReserveLicense RPC is in flight for an SE create (VS-driven or buffer) in this SE group. Blocks further placement/spawn in the group until HandleLicenseReservationNotification clears it on the reservation response. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseReservationPending *bool `json:"license_reservation_pending,omitempty"`

	// Licensed service cores stats. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LicenseStats *SeLicenseStats `json:"license_stats,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ModifyVnicStats *SeVnicStats `json:"modify_vnic_stats,omitempty"`

	// Next tick at which placement may be retried for this SE group after a license reservation failure. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NextLicenseReserveTicks *uint64 `json:"next_license_reserve_ticks,omitempty"`

	// Next tick for SE spawn retry. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NextSeSpawnTicks *uint64 `json:"next_se_spawn_ticks,omitempty"`

	// Number of consecutive times a license reservation for this SE group has failed with insufficient license or quota limit exceeded. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumLicenseReserveFail *int32 `json:"num_license_reserve_fail,omitempty"`

	// Number of SE spawn fails. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeSpawnFail *int32 `json:"num_se_spawn_fail,omitempty"`

	// In-flight license reservation information for this SE group. Field introduced in 32.1.4. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PendingLicResInfo *PendingLicResInfo `json:"pending_lic_res_info,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryHostCookie *string `json:"query_host_cookie,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryHostInProgress *bool `json:"query_host_in_progress,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	QueryHostTicks *int32 `json:"query_host_ticks,omitempty"`

	//  It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpSe []string `json:"up_se,omitempty"`

	// Flap to indicate if SE group is going through an upgrade. Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UpgradeInProgress *bool `json:"upgrade_in_progress,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
