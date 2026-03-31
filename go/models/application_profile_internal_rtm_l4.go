// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ApplicationProfileInternalRtmL4 application profile internal rtm l4
// swagger:model ApplicationProfileInternalRtmL4
type ApplicationProfileInternalRtmL4 struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AppRtmNameL4 *string `json:"app_rtm_name_l4"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AppRtmRefL4 *int32 `json:"app_rtm_ref_l4"`

	//  Enum options - APPLICATION_PROFILE_TYPE_L4, APPLICATION_PROFILE_TYPE_HTTP, APPLICATION_PROFILE_TYPE_SYSLOG, APPLICATION_PROFILE_TYPE_DNS, APPLICATION_PROFILE_TYPE_SSL, APPLICATION_PROFILE_TYPE_SIP, APPLICATION_PROFILE_TYPE_DIAMETER. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AppRtmTypeL4 *string `json:"app_rtm_type_l4"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AppRtmUUIDL4 *string `json:"app_rtm_uuid_l4"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AppRtmVserverNameL4 *string `json:"app_rtm_vserver_name_l4"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	AppRtmVserverUUIDL4 *string `json:"app_rtm_vserver_uuid_l4"`
}
