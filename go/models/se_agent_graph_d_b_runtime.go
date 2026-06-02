// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentGraphDBRuntime se agent graph d b runtime
// swagger:model SeAgentGraphDBRuntime
type SeAgentGraphDBRuntime struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Analyticsprofile *SeAgentGraphDBNodeInfo `json:"analyticsprofile,omitempty"`

	//  Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Apipath *SeAgentGraphDBNodeInfo `json:"apipath,omitempty"`

	//  Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Apipolicy *SeAgentGraphDBNodeInfo `json:"apipolicy,omitempty"`

	//  Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Apischema *SeAgentGraphDBNodeInfo `json:"apischema,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Applicationinsightspolicy *SeAgentGraphDBNodeInfo `json:"applicationinsightspolicy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Applicationpersistenceprofile *SeAgentGraphDBNodeInfo `json:"applicationpersistenceprofile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Applicationprofile *SeAgentGraphDBNodeInfo `json:"applicationprofile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Cloud *SeAgentGraphDBNodeInfo `json:"cloud,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Dnspolicy *SeAgentGraphDBNodeInfo `json:"dnspolicy,omitempty"`

	// DynamicDnsRecord managed by Dns Mgr. Field introduced in 20.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Dynamicdnsrecord *SeAgentGraphDBNodeInfo `json:"dynamicdnsrecord,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Errorpagebody *SeAgentGraphDBNodeInfo `json:"errorpagebody,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Errorpageprofile *SeAgentGraphDBNodeInfo `json:"errorpageprofile,omitempty"`

	//  Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Examplechild *SeAgentGraphDBNodeInfo `json:"examplechild,omitempty"`

	// Virtualservices in fault state. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FaultyVs []*VsFault `json:"faulty_vs,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GraphVersion *int32 `json:"graph_version,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Gslb *SeAgentGraphDBNodeInfo `json:"gslb,omitempty"`

	//  Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Gslbgeodbprofile *SeAgentGraphDBNodeInfo `json:"gslbgeodbprofile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Gslbservice *SeAgentGraphDBNodeInfo `json:"gslbservice,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Healthmonitor *SeAgentGraphDBNodeInfo `json:"healthmonitor,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Httprequestpolicy *SeAgentGraphDBNodeInfo `json:"httprequestpolicy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Httpresponsepolicy *SeAgentGraphDBNodeInfo `json:"httpresponsepolicy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Httpsecuritypolicy *SeAgentGraphDBNodeInfo `json:"httpsecuritypolicy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ipaddrgroup *SeAgentGraphDBNodeInfo `json:"ipaddrgroup,omitempty"`

	//  Field introduced in 17.2.7. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	L4connectionpolicy *SeAgentGraphDBNodeInfo `json:"l4connectionpolicy,omitempty"`

	//  Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Labelprofile *SeAgentGraphDBNodeInfo `json:"labelprofile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Microservice *SeAgentGraphDBNodeInfo `json:"microservice,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Networkprofile *SeAgentGraphDBNodeInfo `json:"networkprofile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Networksecuritypolicy *SeAgentGraphDBNodeInfo `json:"networksecuritypolicy,omitempty"`

	//  Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Networkservice *SeAgentGraphDBNodeInfo `json:"networkservice,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pkiprofile *SeAgentGraphDBNodeInfo `json:"pkiprofile,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Pool *SeAgentGraphDBNodeInfo `json:"pool,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Positivesecuritypolicy *SeAgentGraphDBNodeInfo `json:"positivesecuritypolicy,omitempty"`

	// If the SE is actively processing an SE Datastore notification. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeDatastoreProcessingNotification *bool `json:"se_datastore_processing_notification,omitempty"`

	// If the SE Datastore Sync/Sub thread is running. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeDatastoreSyncSubscribeThreadRunning *bool `json:"se_datastore_sync_subscribe_thread_running,omitempty"`

	// If the SE has fully sync'd a config tree from SE Datastore. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeDatastoreSynced *bool `json:"se_datastore_synced,omitempty"`

	// Current SE Datastore Version to which the se is synchronized. Field introduced in 18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeDatastoreVersion *int64 `json:"se_datastore_version,omitempty"`

	//  It is a reference to an object of type ServiceEngine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeRef *string `json:"se_ref,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Serviceenginegroup *SeAgentGraphDBNodeInfo `json:"serviceenginegroup,omitempty"`

	//  Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sessionkeyforwarder *SeAgentGraphDBNodeInfo `json:"sessionkeyforwarder,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sslkeyandcertificate *SeAgentGraphDBNodeInfo `json:"sslkeyandcertificate,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Sslprofile *SeAgentGraphDBNodeInfo `json:"sslprofile,omitempty"`

	//  Field introduced in 18.2.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Ssopolicy *SeAgentGraphDBNodeInfo `json:"ssopolicy,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Stringgroup *SeAgentGraphDBNodeInfo `json:"stringgroup,omitempty"`

	// Count of sub nodes of graphdb node. Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SubNode []*NodeCount `json:"sub_node,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tenant *SeAgentGraphDBNodeInfo `json:"tenant,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Testsedatastorelevel1 *SeAgentGraphDBNodeInfo `json:"testsedatastorelevel1,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Testsedatastorelevel2 *SeAgentGraphDBNodeInfo `json:"testsedatastorelevel2,omitempty"`

	//  Field introduced in 18.2.6. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Testsedatastorelevel3 *SeAgentGraphDBNodeInfo `json:"testsedatastorelevel3,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	TotalObj *int32 `json:"total_obj"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalObjActive *int32 `json:"total_obj_active,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalObjAwaitingDp *int32 `json:"total_obj_awaiting_dp,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalObjError *int32 `json:"total_obj_error,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalObjEwSubnetError *int32 `json:"total_obj_ew_subnet_error,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Virtualservice *SeAgentGraphDBNodeInfo `json:"virtualservice,omitempty"`

	//  Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vrfcontext *SeAgentGraphDBNodeInfo `json:"vrfcontext,omitempty"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vsdatascriptset *SeAgentGraphDBNodeInfo `json:"vsdatascriptset,omitempty"`

	//  Field introduced in 21.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Vsgs *SeAgentGraphDBNodeInfo `json:"vsgs,omitempty"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Wafcrs *SeAgentGraphDBNodeInfo `json:"wafcrs,omitempty"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Wafpolicy *SeAgentGraphDBNodeInfo `json:"wafpolicy,omitempty"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Wafpolicypsmgroup *SeAgentGraphDBNodeInfo `json:"wafpolicypsmgroup,omitempty"`

	//  Field introduced in 30.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Wafprofile *SeAgentGraphDBNodeInfo `json:"wafprofile,omitempty"`
}
