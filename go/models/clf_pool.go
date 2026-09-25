// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// ClfPool clf pool
// swagger:model ClfPool
type ClfPool struct {

	// Reference to at most one health monitor for collectors in this pool. It is a reference to an object of type HealthMonitor. Field introduced in 32.1.5. Maximum of 1 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthMonitorRefs []string `json:"health_monitor_refs,omitempty"`

	// Load balancing algorithm for distributing logs across servers. Only LB_ALGORITHM_ROUND_ROBIN and LB_ALGORITHM_CONSISTENT_HASH are supported; consistent-hash always hashes on the UUID of the VirtualService invoking avi.vs.log_forward(), not a per-request client IP/URI/header, so all of one VS's log records land on the same collector. Enum options - LB_ALGORITHM_LEAST_CONNECTIONS, LB_ALGORITHM_ROUND_ROBIN, LB_ALGORITHM_FASTEST_RESPONSE, LB_ALGORITHM_CONSISTENT_HASH, LB_ALGORITHM_LEAST_LOAD, LB_ALGORITHM_FEWEST_SERVERS, LB_ALGORITHM_RANDOM, LB_ALGORITHM_FEWEST_TASKS, LB_ALGORITHM_NEAREST_SERVER, LB_ALGORITHM_CORE_AFFINITY, LB_ALGORITHM_TOPOLOGY. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbAlgorithm *string `json:"lb_algorithm,omitempty"`

	// Wire format for log records delivered to this pool's collectors. Each pool independently configures its format. Enum options - CLF_LOG_FORMAT_SYSLOG_LEGACY, CLF_LOG_FORMAT_SYSLOG_OCTET, CLF_LOG_FORMAT_CUSTOM. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LogFormat *string `json:"log_format,omitempty"`

	// Unique name for this pool within the ClfProfile. Used as part of the composite key for the backing se_pool_t on the SE. The controller rejects profiles where two pools share the same name. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// PKI profile whose CA certificates validate the collector's server certificate. Required when transport is CLF_TRANSPORT_TCP_TLS. It is a reference to an object of type PKIProfile. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PkiProfileRef *string `json:"pki_profile_ref,omitempty"`

	// Pool priority within the ClfProfile. Higher value = higher priority. Must be unique across all pools in the same profile. When replicate=false, the highest-priority pool with an UP member receives all log records; lower-priority pools act as fallback. Allowed values are 1-255. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Priority *uint32 `json:"priority"`

	// List of log collector endpoints for this pool. Field introduced in 32.1.5. Maximum of 32 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Servers []*ClfServer `json:"servers,omitempty"`

	// Client certificate and key the SE presents to the collector for mutual TLS. Optional even when transport is CLF_TRANSPORT_TCP_TLS; server-authentication-only TLS is used when this is not set. It is a reference to an object of type SSLKeyAndCertificate. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKeyAndCertificateRef *string `json:"ssl_key_and_certificate_ref,omitempty"`

	// SSL profile controlling the TLS version and cipher policy used for this pool's collector connections. Required when transport is CLF_TRANSPORT_TCP_TLS. It is a reference to an object of type SSLProfile. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslProfileRef *string `json:"ssl_profile_ref,omitempty"`

	// Transport protocol for log delivery. Enum options - CLF_TRANSPORT_TCP, CLF_TRANSPORT_UDP, CLF_TRANSPORT_TCP_TLS. Field introduced in 32.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Transport *string `json:"transport,omitempty"`
}
