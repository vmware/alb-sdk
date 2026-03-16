// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentGraphDBNodeConfig se agent graph d b node config
// swagger:model SeAgentGraphDBNodeConfig
type SeAgentGraphDBNodeConfig struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AnalyticsProfile *AnalyticsProfile `json:"analytics_profile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationPersistenceProfile *ApplicationPersistenceProfile `json:"application_persistence_profile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationProfile *ApplicationProfile `json:"application_profile,omitempty"`

	// Configuration for Application Insights. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Applicationinsightspolicy *ApplicationInsightsPolicy `json:"applicationinsightspolicy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cloud *Cloud `json:"cloud,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Dnspolicy *DNSPolicy `json:"dnspolicy,omitempty"`

	// DynamicDnsRecord managed by Dns Mgr. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Dynamicdnsrecord *DynamicDNSRecord `json:"dynamicdnsrecord,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Errorpagebody *ErrorPageBody `json:"errorpagebody,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Errorpageprofile *ErrorPageProfile `json:"errorpageprofile,omitempty"`

	//  Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExampleChild *ExampleChild `json:"example_child,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Gslb *Gslb `json:"gslb,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Gslbgeodbprofile *GslbGeoDbProfile `json:"gslbgeodbprofile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Gslbservice *GslbService `json:"gslbservice,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthMonitor *HealthMonitor `json:"health_monitor,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPRequestPolicy *HTTPRequestPolicy `json:"http_request_policy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPResponsePolicy *HTTPResponsePolicy `json:"http_response_policy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HTTPSecurityPolicy *HttpsecurityPolicy `json:"http_security_policy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IPAddrGroup *IPAddrGroup `json:"ip_addr_group,omitempty"`

	//  Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4ConnectionPolicy *L4ConnectionPolicy `json:"l4_connection_policy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Microservice *MicroService `json:"microservice,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkProfile *NetworkProfile `json:"network_profile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NetworkSecurityPolicy *NetworkSecurityPolicy `json:"network_security_policy,omitempty"`

	//  Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Networkservice *NetworkService `json:"networkservice,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pkiprofile *PKIprofile `json:"pkiprofile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pool *Pool `json:"pool,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PoolGroup *PoolGroup `json:"pool_group,omitempty"`

	// Configuration for Positive Security. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Positivesecuritypolicy *PositiveSecurityPolicy `json:"positivesecuritypolicy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PriorityLabels *PriorityLabels `json:"priority_labels,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Serviceenginegroup *ServiceEngineGroup `json:"serviceenginegroup,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKeyAndCertificate *SSLKeyAndCertificate `json:"ssl_key_and_certificate,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslProfile *SSLProfile `json:"ssl_profile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StringGroup *StringGroup `json:"string_group,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tenant *Tenant `json:"tenant,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TestSeDatastoreLevel1 *TestSeDatastoreLevel1 `json:"test_se_datastore_level_1,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TestSeDatastoreLevel2 *TestSeDatastoreLevel2 `json:"test_se_datastore_level_2,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TestSeDatastoreLevel3 *TestSeDatastoreLevel3 `json:"test_se_datastore_level_3,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VirtualServiceSe *VirtualServiceSe `json:"virtual_service_se,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrfcontext *VrfContext `json:"vrfcontext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsDataScript *VSDataScriptSet `json:"vs_data_script,omitempty"`

	//  Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VsGs *VsGs `json:"vs_gs,omitempty"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Wafcrs *WafCRS `json:"wafcrs,omitempty"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Wafpolicy *WafPolicy `json:"wafpolicy,omitempty"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Wafpolicypsmgroup *WafPolicyPSMGroup `json:"wafpolicypsmgroup,omitempty"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Wafprofile *WafProfile `json:"wafprofile,omitempty"`
}
