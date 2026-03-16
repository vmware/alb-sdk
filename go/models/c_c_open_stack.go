// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CCOpenStack c c open stack
// swagger:model CC_OpenStack
type CCOpenStack struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AapairExt *bool `json:"aapair_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AapairMax *int32 `json:"aapair_max,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AccessErr *string `json:"access_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdminAccess *bool `json:"admin_access,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AuthURL *string `json:"auth_url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cfg *OpenStackConfiguration `json:"cfg,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CfgdrvExt *bool `json:"cfgdrv_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Contrail *bool `json:"contrail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreateVipPort *bool `json:"create_vip_port,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiscAasg *bool `json:"disc_aasg,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiscCfgdrv *bool `json:"disc_cfgdrv,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiscMetasvc *bool `json:"disc_metasvc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DiskSz *int32 `json:"disk_sz,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GcAvi *CCCron `json:"gc_avi,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GcCc *CCCron `json:"gc_cc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GlanceURL *string `json:"glance_url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KsmgmturlState *uint32 `json:"ksmgmturl_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MetasvcExt *bool `json:"metasvc_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNw *CCMgmtNw `json:"mgmt_nw,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtNwErr *string `json:"mgmt_nw_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Nuage *bool `json:"nuage,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Nvp *bool `json:"nvp,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Opflex *bool `json:"opflex,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OsRole *string `json:"os_role,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OsRoleID *string `json:"os_role_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OsTenantID *string `json:"os_tenant_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	OsUserID *string `json:"os_user_id,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ovs *bool `json:"ovs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ParkIntfs []*CCParkIntf `json:"park_intfs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PatchState *int32 `json:"patch_state,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PortsecExt *bool `json:"portsec_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RbacNwExt *bool `json:"rbac_nw_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SchintExt *bool `json:"schint_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecgrpExt *bool `json:"secgrp_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SvrgrpExt *bool `json:"svrgrp_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantAccessErr *string `json:"tenant_access_err,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseAapairExt *bool `json:"use_aapair_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseAntiAffinity *bool `json:"use_anti_affinity,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseCfgdrv *bool `json:"use_cfgdrv,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseContrail *bool `json:"use_contrail,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseExtnet *bool `json:"use_extnet,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseIntfSecips *bool `json:"use_intf_secips,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseMetasvc *bool `json:"use_metasvc,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseNameowner *bool `json:"use_nameowner,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseNuage *bool `json:"use_nuage,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseNuagevip *bool `json:"use_nuagevip,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseNvp *bool `json:"use_nvp,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UsePortsecExt *bool `json:"use_portsec_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseRbacNw *bool `json:"use_rbac_nw,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseSchintExt *bool `json:"use_schint_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseSecgrpExt *bool `json:"use_secgrp_ext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UseSvrgrpExt *bool `json:"use_svrgrp_ext,omitempty"`

	// Map of vsvip id to thread id. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsvipidToThreadid []*VsvipMap `json:"vsvipid_to_threadid,omitempty"`
}
