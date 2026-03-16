// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// CloudPlacementSummary cloud placement summary
// swagger:model CloudPlacementSummary
type CloudPlacementSummary struct {

	// Availability zones. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Azs []string `json:"azs,omitempty"`

	// VS counts. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConsumerStats *ConsumerStats `json:"consumer_stats,omitempty"`

	// IP address management scheme. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DhcpEnabled *bool `json:"dhcp_enabled,omitempty"`

	// DNS profile type. Enum options - IPAMDNS_TYPE_INFOBLOX, IPAMDNS_TYPE_AWS, IPAMDNS_TYPE_OPENSTACK, IPAMDNS_TYPE_GCP, IPAMDNS_TYPE_INFOBLOX_DNS, IPAMDNS_TYPE_CUSTOM, IPAMDNS_TYPE_CUSTOM_DNS, IPAMDNS_TYPE_AZURE, IPAMDNS_TYPE_OCI, IPAMDNS_TYPE_TENCENT, IPAMDNS_TYPE_INTERNAL, IPAMDNS_TYPE_INTERNAL_DNS, IPAMDNS_TYPE_AWS_DNS, IPAMDNS_TYPE_AZURE_DNS. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSProfileType *string `json:"dns_profile_type,omitempty"`

	// DNS profile UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSProfileUUID *string `json:"dns_profile_uuid,omitempty"`

	// IPAM profile type. Enum options - IPAMDNS_TYPE_INFOBLOX, IPAMDNS_TYPE_AWS, IPAMDNS_TYPE_OPENSTACK, IPAMDNS_TYPE_GCP, IPAMDNS_TYPE_INFOBLOX_DNS, IPAMDNS_TYPE_CUSTOM, IPAMDNS_TYPE_CUSTOM_DNS, IPAMDNS_TYPE_AZURE, IPAMDNS_TYPE_OCI, IPAMDNS_TYPE_TENCENT, IPAMDNS_TYPE_INTERNAL, IPAMDNS_TYPE_INTERNAL_DNS, IPAMDNS_TYPE_AWS_DNS, IPAMDNS_TYPE_AZURE_DNS. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAMProfileType *string `json:"ipam_profile_type,omitempty"`

	// IPAM profile UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAMProfileUUID *string `json:"ipam_profile_uuid,omitempty"`

	// Number of SE groups. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NumSeGroups *uint32 `json:"num_se_groups,omitempty"`

	// Cloud is ready for placement. Flag is set to false if cloud connector state is not CC_STATE_PLACEMENT_READY, system upgrade is in progress, or warm start is in progress. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementReady *bool `json:"placement_ready,omitempty"`

	// Access privilege. Enum options - NO_ACCESS, READ_ACCESS, WRITE_ACCESS. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Privilege *string `json:"privilege,omitempty"`

	// SE counts. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResourceStats *ResourceStats `json:"resource_stats,omitempty"`

	// Cloud connector state. Enum options - CC_STATE_UNKNOWN, CC_STATE_DECONFIG_IN_PROGRESS, CC_STATE_CONFIG_IN_PROGRESS, CC_STATE_INIT_IN_PROGRESS, CC_STATE_IMAGE_IN_PROGRESS, CC_STATE_INIT_COMPLETE, CC_STATE_IMAGE_COMPLETE, CC_STATE_IMAGE_FAILED, CC_STATE_HEALTH_OK, CC_STATE_MAINTENANCE_MODE_IN_PROGRESS, CC_STATE_CONFIG_FAILED, CC_STATE_INIT_FAILED, CC_STATE_HEALTH_FAILED, CC_STATE_IN_MAINTENANCE_MODE, CC_STATE_PLACEMENT_READY. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	State *string `json:"state,omitempty"`

	// DNS records for VIPs are added/deleted based on the operational state of the VIPs. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StateBasedDNSRegistration *bool `json:"state_based_dns_registration,omitempty"`

	// Tenant UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantUUID *string `json:"tenant_uuid,omitempty"`

	// Cloud type. Enum options - CLOUD_NONE, CLOUD_VCENTER, CLOUD_OPENSTACK, CLOUD_AWS, CLOUD_VCA, CLOUD_APIC, CLOUD_MESOS, CLOUD_LINUXSERVER, CLOUD_DOCKER_UCP, CLOUD_RANCHER, CLOUD_OSHIFT_K8S, CLOUD_AZURE, CLOUD_GCP, CLOUD_NSXT. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	// Cloud UUID. Field introduced in 21.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
