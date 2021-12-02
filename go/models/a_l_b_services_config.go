// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ALBServicesConfig a l b services config
// swagger:model ALBServicesConfig
type ALBServicesConfig struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Default values to be used for Application Signature sync. Field introduced in 20.1.4. Allowed in Basic edition, Essentials edition, Enterprise edition.
	// Required: true
	AppSignatureConfig *AppSignatureConfig `json:"app_signature_config"`

	// Information about the default contact for this controller cluster. Field introduced in 20.1.1.
	AssetContact *ALBServicesUser `json:"asset_contact,omitempty"`

	// Default values to be used for pulse case management. Field introduced in 21.1.1. Allowed in Basic edition, Essentials edition, Enterprise edition.
	// Required: true
	CaseConfig *CaseConfig `json:"case_config"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Information about the portal features opted in for controller. Field introduced in 20.1.1. Allowed in Enterprise edition, Enterprise edition.
	// Required: true
	FeatureOptInStatus *PortalFeatureOptIn `json:"feature_opt_in_status"`

	// Default values to be used for IP Reputation sync. Field introduced in 20.1.1.
	// Required: true
	IPReputationConfig *IPReputationConfig `json:"ip_reputation_config"`

	// Mode helps log collection and upload. Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE. Field introduced in 20.1.2. Allowed in Basic(Allowed values- SALESFORCE,MYVMWARE,SYSTEST) edition, Essentials(Allowed values- SALESFORCE,MYVMWARE,SYSTEST) edition, Enterprise edition.
	Mode *string `json:"mode,omitempty"`

	// Time interval in minutes. Allowed values are 5-60. Field introduced in 18.2.6.
	PollingInterval *int32 `json:"polling_interval,omitempty"`

	// The FQDN or IP address of the customer portal. Field introduced in 18.2.6.
	// Required: true
	PortalURL *string `json:"portal_url"`

	// Saas licensing configuration. Field introduced in 21.1.3. Allowed in Basic edition, Essentials edition, Enterprise edition.
	// Required: true
	SaasLicensingConfig *SaasLicensingInfo `json:"saas_licensing_config"`

	// Split proxy configuration to connect external pulse services. Field introduced in 20.1.1.
	// Required: true
	SplitProxyConfiguration *ProxyConfiguration `json:"split_proxy_configuration"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// By default, pulse uses proxy added in system configuration. If pulse needs to use a seperate proxy, set this flag to true and configure split proxy configuration. Field introduced in 20.1.1.
	UseSplitProxy *bool `json:"use_split_proxy,omitempty"`

	// Secure the controller to PULSE communication over TLS. Field introduced in 20.1.3. Allowed in Basic edition, Enterprise edition.
	UseTLS *bool `json:"use_tls,omitempty"`

	// Default values to be used for user agent DB Service. Field introduced in 21.1.1. Allowed in Basic edition, Essentials edition, Enterprise edition.
	// Required: true
	UserAgentDbConfig *UserAgentDBConfig `json:"user_agent_db_config"`

	//  Field introduced in 18.2.6.
	UUID *string `json:"uuid,omitempty"`

	// Default values to be used for pulse waf management. Field introduced in 21.1.1. Allowed in Basic edition, Essentials edition, Enterprise edition.
	// Required: true
	WafConfig *WafCrsConfig `json:"waf_config"`
}
