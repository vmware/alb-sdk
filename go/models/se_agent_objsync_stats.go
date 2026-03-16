// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeAgentObjsyncStats se agent objsync stats
// swagger:model SeAgentObjsyncStats
type SeAgentObjsyncStats struct {

	// Number of configuration adds received from agent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigAddReceived *uint64 `json:"config_add_received,omitempty"`

	// Number of configuration deletes received from agent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigDelReceived *uint64 `json:"config_del_received,omitempty"`

	// Number of Grat Publish messages received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GratPublishReceived *uint64 `json:"grat_publish_received,omitempty"`

	// Number of Grat Publish messages errors during send. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GratPublishSendErr *uint64 `json:"grat_publish_send_err,omitempty"`

	// Number of Grat Publish messages sent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GratPublishSent *uint64 `json:"grat_publish_sent,omitempty"`

	// Highest time spent on a failed reconcile. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HighestReconcileErrTime *uint64 `json:"highest_reconcile_err_time,omitempty"`

	// Highest time spent on a successful reconcile. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HighestReconcileTime *uint64 `json:"highest_reconcile_time,omitempty"`

	// Number of transitions from hub to spoke for this VS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HubToSpokeChange *uint64 `json:"hub_to_spoke_change,omitempty"`

	// Number of initial sync done messages received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitSyncDoneReceived *uint64 `json:"init_sync_done_received,omitempty"`

	// Number of initial sync probe requests received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitSyncProbeReceived *uint64 `json:"init_sync_probe_received,omitempty"`

	// Number of initial sync probe responses sent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitSyncProbeResponse *uint64 `json:"init_sync_probe_response,omitempty"`

	// Number of response errors while sending initial sync probe response. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitSyncProbeResponseErr *uint64 `json:"init_sync_probe_response_err,omitempty"`

	// Number of initial sync probes sent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitSyncProbeSend *uint64 `json:"init_sync_probe_send,omitempty"`

	// Number of initial sync probe send errors. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitSyncProbeSendErr *uint64 `json:"init_sync_probe_send_err,omitempty"`

	// Number of initial sync probes received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitSyncReceived *uint64 `json:"init_sync_received,omitempty"`

	// Number of initial syncs sent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InitSyncSend *uint64 `json:"init_sync_send,omitempty"`

	// Lowest time spent on a failed reconcile. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LowestReconcileErrTime *uint64 `json:"lowest_reconcile_err_time,omitempty"`

	// Lowest time spent on a successful reconcile. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LowestReconcileTime *uint64 `json:"lowest_reconcile_time,omitempty"`

	// Number of Publish messages errors during receive. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PublishReceiveErr *uint64 `json:"publish_receive_err,omitempty"`

	// Number of publish messages received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PublishReceived *uint64 `json:"publish_received,omitempty"`

	// Number of Publish messages received with 0 payload(Grat Publish). Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PublishReceivedNoPayload *uint64 `json:"publish_received_no_payload,omitempty"`

	// Number of Publish messages errors during send. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PublishSendErr *uint64 `json:"publish_send_err,omitempty"`

	// Number of publish messages sent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PublishSent *uint64 `json:"publish_sent,omitempty"`

	// Number of errors during reconcile receive. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReconcileReceiveErr *uint64 `json:"reconcile_receive_err,omitempty"`

	// Number of reconcile requests received. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReconcileReceived *uint64 `json:"reconcile_received,omitempty"`

	// Number of reconcile responses received but not forwarded to peer. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReconcileResponseNoForward *uint64 `json:"reconcile_response_no_forward,omitempty"`

	// Number of errors after receive of reconcile messages. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReconcileResponseReceiveErr *uint64 `json:"reconcile_response_receive_err,omitempty"`

	// Number of response received for reconcile requests sent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReconcileResponseReceived *uint64 `json:"reconcile_response_received,omitempty"`

	// Number of errors during send of reconcile messages. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReconcileSendErr *uint64 `json:"reconcile_send_err,omitempty"`

	// Number of reconcile requests sent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReconcileSent *uint64 `json:"reconcile_sent,omitempty"`

	// Total number of reconciles exceeded towards agent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ReconcilesExceeded *uint64 `json:"reconciles_exceeded,omitempty"`

	// Number of times role assign was called for this VS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RoleAssignCount *uint64 `json:"role_assign_count,omitempty"`

	// UUID of the SE. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SeUUID *string `json:"se_uuid,omitempty"`

	// Number of transitions from spoke to hub for this VS. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SpokeToHubChange *uint64 `json:"spoke_to_hub_change,omitempty"`

	// Number of stats get requests received from agent. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	StatsGetReceived *uint64 `json:"stats_get_received,omitempty"`

	// Number of total reconciles which are being triggered. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalReconciles *uint64 `json:"total_reconciles,omitempty"`

	// Number of total reconciles failed after triggering. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalReconcilesErr *uint64 `json:"total_reconciles_err,omitempty"`

	// Total time taken by failed reconciles. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalReconcilesErrTime *uint64 `json:"total_reconciles_err_time,omitempty"`

	// Number of reconciles which succeeded. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalReconcilesPass *uint64 `json:"total_reconciles_pass,omitempty"`

	// Total time taken by passed reconciles. Field introduced in 31.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TotalReconcilesPassTime *uint64 `json:"total_reconciles_pass_time,omitempty"`
}
