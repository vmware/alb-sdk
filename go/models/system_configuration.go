// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SystemConfiguration system configuration
// swagger:model SystemConfiguration
type SystemConfiguration struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AdminAuthConfiguration *AdminAuthConfiguration `json:"admin_auth_configuration,omitempty"`

	// Password for avi_email_login user. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AviEmailLoginPassword *string `json:"avi_email_login_password,omitempty"`

	// Common criteria mode's current state. Field introduced in 20.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	CommonCriteriaMode *bool `json:"common_criteria_mode,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Controller metrics event dynamic thresholds can be set here. CONTROLLER_CPU_HIGH and CONTROLLER_MEM_HIGH evets can take configured dynamic thresholds. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ControllerAnalyticsPolicy *ControllerAnalyticsPolicy `json:"controller_analytics_policy,omitempty"`

	// Specifies the default license tier which would be used by new Clouds. Enum options - ENTERPRISE_16, ENTERPRISE, ENTERPRISE_18, BASIC, ESSENTIALS, ENTERPRISE_WITH_CLOUD_SERVICES. Field introduced in 17.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition. Special default for Essentials edition is ESSENTIALS, Basic edition is BASIC, Enterprise edition is ENTERPRISE_WITH_CLOUD_SERVICES.
	DefaultLicenseTier *string `json:"default_license_tier,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DNSConfiguration *DNSConfiguration `json:"dns_configuration,omitempty"`

	// DNS virtualservices hosting FQDN records for applications across Avi Vantage. If no virtualservices are provided, Avi Vantage will provide DNS services for configured applications. Switching back to Avi Vantage from DNS virtualservices is not allowed. It is a reference to an object of type VirtualService. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	DNSVirtualserviceRefs []string `json:"dns_virtualservice_refs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DockerMode *bool `json:"docker_mode,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EmailConfiguration *EmailConfiguration `json:"email_configuration,omitempty"`

	// Enable CORS Header. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EnableCors *bool `json:"enable_cors,omitempty"`

	// Validates the host header against a list of trusted domains. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnableHostHeaderCheck *bool `json:"enable_host_header_check,omitempty"`

	// Enable license quota for the system. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	EnableLicenseQuota *bool `json:"enable_license_quota,omitempty"`

	// FIPS mode current state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FipsMode *bool `json:"fips_mode,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GlobalTenantConfig *TenantConfiguration `json:"global_tenant_config,omitempty"`

	// Users can specify comma separated list of deprecated host key algorithm.If nothing is specified, all known algorithms provided by OpenSSH will be supported.This change could only apply on the controller node. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostKeyAlgorithmExclude *string `json:"host_key_algorithm_exclude,omitempty"`

	// Users can specify comma separated list of deprecated key exchange algorithm.If nothing is specified, all known algorithms provided by OpenSSH will be supported.This change could only apply on the controller node. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	KexAlgorithmExclude *string `json:"kex_algorithm_exclude,omitempty"`

	// Allow Outgoing Connections from Controller to Servers Using TLS 1.0/1.1. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LegacySslSupport *bool `json:"legacy_ssl_support,omitempty"`

	// License quota for the system. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LicenseQuota *QuotaConfig `json:"license_quota,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LinuxConfiguration *LinuxConfiguration `json:"linux_configuration,omitempty"`

	// Configure Ip Access control for controller to restrict open access. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MgmtIPAccessControl *MgmtIPAccessControl `json:"mgmt_ip_access_control,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NtpConfiguration *NTPConfiguration `json:"ntp_configuration,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PortalConfiguration *PortalConfiguration `json:"portal_configuration,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ProxyConfiguration *ProxyConfiguration `json:"proxy_configuration,omitempty"`

	// Users can specify and update the time limit of RekeyLimit in sshd_config.If nothing is specified, the default setting will be none. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RekeyTimeLimit *string `json:"rekey_time_limit,omitempty"`

	// Users can specify and update the size/volume limit of RekeyLimit in sshd_config.If nothing is specified, the default setting will be default. Field introduced in 30.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	RekeyVolumeLimit *string `json:"rekey_volume_limit,omitempty"`

	// FQDN of SDDC Manager in VCF responsible for management of this ALB Controller Cluster. Field introduced in 22.1.6,31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SddcmanagerFqdn *string `json:"sddcmanager_fqdn,omitempty"`

	// Configure Secure Channel properties. Field introduced in 18.1.4, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SecureChannelConfiguration *SecureChannelConfiguration `json:"secure_channel_configuration,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SnmpConfiguration *SnmpConfiguration `json:"snmp_configuration,omitempty"`

	// Allowed Ciphers list for SSH to the management interface on the Controller and Service Engines. If this is not specified, all the default ciphers are allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SSHCiphers []string `json:"ssh_ciphers,omitempty"`

	// Allowed HMAC list for SSH to the management interface on the Controller and Service Engines. If this is not specified, all the default HMACs are allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SSHHmacs []string `json:"ssh_hmacs,omitempty"`

	// Ability to sync the KexAlgorithms & HostKeyAlgorithms to SEs. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SyncKexHostToSe *bool `json:"sync_kex_host_to_se,omitempty"`

	// Ability to sync the syslog server config to SEs. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SyncSyslogToSe *bool `json:"sync_syslog_to_se,omitempty"`

	// The destination Syslog server IP(v4/v6) address or FQDN. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	SyslogServers []*IPAddr `json:"syslog_servers,omitempty"`

	// Telemetry configuration. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TelemetryConfiguration *TelemetryConfiguration `json:"telemetry_configuration,omitempty"`

	// Trusted Host Profiles for host header validation. Only works when host_header_check is set to true. It is a reference to an object of type TrustedHostProfile. Field introduced in 31.1.1. Maximum of 20 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TrustedHostProfilesRefs []string `json:"trusted_host_profiles_refs,omitempty"`

	// Reference to PKIProfile used for validating the CA certificates for external comminications from Avi Load Balancer Controller  This acts as trust store for Avi Load Balancer Controller. It is a reference to an object of type PKIProfile. Field introduced in 31.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TruststorePkiprofileRef *string `json:"truststore_pkiprofile_ref,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// This flag is set once the Initial Controller Setup workflow is complete. Field introduced in 18.2.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	WelcomeWorkflowComplete *bool `json:"welcome_workflow_complete,omitempty"`
}
