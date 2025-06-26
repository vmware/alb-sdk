// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// Pool pool
// swagger:model Pool
type Pool struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// Determines analytics settings for the pool. Field introduced in 18.1.5, 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AnalyticsPolicy *PoolAnalyticsPolicy `json:"analytics_policy,omitempty"`

	// Specifies settings related to analytics. It is a reference to an object of type AnalyticsProfile. Field introduced in 18.1.4,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	AnalyticsProfileRef *string `json:"analytics_profile_ref,omitempty"`

	// Allows the option to append port to hostname in the host header while sending a request to the server. By default, port is appended for non-default ports. This setting will apply for Pool's 'Rewrite Host Header to Server Name', 'Rewrite Host Header to SNI' features and Server's 'Rewrite Host Header' settings as well as HTTP healthmonitors attached to pools. Enum options - NON_DEFAULT_80_443, NEVER, ALWAYS. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- NEVER), Basic (Allowed values- NEVER) edition. Special default for Essentials edition is NEVER, Basic edition is NEVER, Enterprise edition is NON_DEFAULT_80_443.
	AppendPort *string `json:"append_port,omitempty"`

	// Persistence will ensure the same user sticks to the same server for a desired duration of time. It is a reference to an object of type ApplicationPersistenceProfile. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ApplicationPersistenceProfileRef *string `json:"application_persistence_profile_ref,omitempty"`

	// If configured then Avi will trigger orchestration of pool server creation and deletion. It is a reference to an object of type AutoScaleLaunchConfig. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AutoscaleLaunchConfigRef *string `json:"autoscale_launch_config_ref,omitempty"`

	// Network Ids for the launch configuration. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AutoscaleNetworks []string `json:"autoscale_networks,omitempty"`

	// Reference to Server Autoscale Policy. It is a reference to an object of type ServerAutoScalePolicy. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	AutoscalePolicyRef *string `json:"autoscale_policy_ref,omitempty"`

	// Inline estimation of capacity of servers. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	CapacityEstimation *bool `json:"capacity_estimation,omitempty"`

	// The maximum time-to-first-byte of a server. Allowed values are 1-5000. Special values are 0 - Automatic. Unit is MILLISECONDS. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- 0), Basic (Allowed values- 0) edition.
	CapacityEstimationTtfbThresh *uint32 `json:"capacity_estimation_ttfb_thresh,omitempty"`

	// Checksum of cloud configuration for Pool. Internally set by cloud connector. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudConfigCksum *string `json:"cloud_config_cksum,omitempty"`

	//  It is a reference to an object of type Cloud. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CloudRef *string `json:"cloud_ref,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Connnection pool properties. Field introduced in 18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConnPoolProperties *ConnPoolProperties `json:"conn_pool_properties,omitempty"`

	// Duration for which new connections will be gradually ramped up to a server recently brought online.  Useful for LB algorithms that are least connection based. Allowed values are 1-300. Special values are 0 - Immediate. Unit is MIN. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- 0), Basic (Allowed values- 0) edition. Special default for Essentials edition is 0, Basic edition is 0, Enterprise edition is 10.
	ConnectionRampDuration *int32 `json:"connection_ramp_duration,omitempty"`

	// Creator name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	CreatedBy *string `json:"created_by,omitempty"`

	// Traffic sent to servers will use this destination server port unless overridden by the server's specific port attribute. The SSL checkbox enables Avi to server encryption. Allowed values are 1-65535. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DefaultServerPort *int32 `json:"default_server_port,omitempty"`

	// Indicates whether existing IPs are disabled(false) or deleted(true) on dns hostname refreshDetail -- On a dns refresh, some IPs set on pool may no longer be returned by the resolver. These IPs are deleted from the pool when this knob is set to true. They are disabled, if the knob is set to false. Field introduced in 18.2.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- true), Basic (Allowed values- true) edition.
	DeleteServerOnDNSRefresh *bool `json:"delete_server_on_dns_refresh,omitempty"`

	// A description of the pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// Comma separated list of domain names which will be used to verify the common names or subject alternative names presented by server certificates. It is performed only when common name check host_check_enabled is enabled. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	DomainName []string `json:"domain_name,omitempty"`

	// Inherited config from VirtualService. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	EastWest *bool `json:"east_west,omitempty"`

	// Enable HTTP/2 for traffic from VirtualService to all backend servers in this pool. Field introduced in 20.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	EnableHttp2 *bool `json:"enable_http2,omitempty"`

	// Enable or disable the pool.  Disabling will terminate all open connections and pause health monitors. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Enabled *bool `json:"enabled,omitempty"`

	// Names of external auto-scale groups for pool servers. Currently available only for AWS and Azure. Field introduced in 17.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ExternalAutoscaleGroups []string `json:"external_autoscale_groups,omitempty"`

	// Enable an action - Close Connection, HTTP Redirect or Local HTTP Response - when a pool failure happens. By default, a connection will be closed, in case the pool experiences a failure. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FailAction *FailAction `json:"fail_action,omitempty"`

	// Periodicity of feedback for fewest tasks server selection algorithm. Allowed values are 1-300. Unit is SEC. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	FewestTasksFeedbackDelay *uint32 `json:"fewest_tasks_feedback_delay,omitempty"`

	// Used to gracefully disable a server. Deprecated from version 31.2.1. Please use graceful_disable_timeout_sec instead. Allowed values are 1-7200. Special values are 0 - Immediate, -1 - Infinite. Field deprecated in 31.2.1. Unit is MIN. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GracefulDisableTimeout *int32 `json:"graceful_disable_timeout,omitempty"`

	// Used to gracefully disable a server. Virtual service waits for the specified time before terminating the existing connections  to the servers that are disabled. Allowed values are 1-432000. Special values are 0 - Immediate, -1 - Infinite. Field introduced in 31.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GracefulDisableTimeoutSec *int32 `json:"graceful_disable_timeout_sec,omitempty"`

	// Time interval for gracefully closing the connections on server, When health monitoring marks the server down. Allowed values are 1-432000. Special values are 0 - Immediate, -1 - Infinite. Field introduced in 30.2.1. Unit is SEC. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	GracefulHmDownDisableTimeout *int32 `json:"graceful_hm_down_disable_timeout,omitempty"`

	// Specifies the pool type (GENERIC/PRIVATE/PUBLIC). The public IPs of the members can be specified in seperate pool of type PUBLIC.This would allow features like health monitoring to be enabled independantly for the public IPs.This is only applicable for GSLB pools. Enum options - GSLB_POOL_TYPE_GENERIC, GSLB_POOL_TYPE_PRIVATE, GSLB_POOL_TYPE_PUBLIC. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GslbPoolType *string `json:"gslb_pool_type,omitempty"`

	// Indicates if the pool is a site-persistence pool. . Field introduced in 17.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Read Only: true
	GslbSpEnabled *bool `json:"gslb_sp_enabled,omitempty"`

	// Verify server health by applying one or more health monitors.  Active monitors generate synthetic traffic from each Service Engine and mark a server up or down based on the response. The Passive monitor listens only to client to server communication. It raises or lowers the ratio of traffic destined to a server based on successful responses. It is a reference to an object of type HealthMonitor. Maximum of 50 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HealthMonitorRefs []string `json:"health_monitor_refs,omitempty"`

	// Horizon UAG configuration. Field introduced in 21.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HorizonProfile *HorizonProfile `json:"horizon_profile,omitempty"`

	// Enable common name check for server certificate. If enabled and no explicit domain name is specified, Avi will use the incoming host header to do the match. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	HostCheckEnabled *bool `json:"host_check_enabled,omitempty"`

	// HTTP2 pool properties. Field introduced in 21.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Http2Properties *Http2PoolProperties `json:"http2_properties,omitempty"`

	// Ignore the server port in building the load balancing state.Applicable only for consistent hash load balancing algorithm or Disable Port translation (use_service_port) use cases. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IgnoreServerPort *bool `json:"ignore_server_port,omitempty"`

	// The Passive monitor will monitor client to server connections and requests and adjust traffic load to servers based on successful responses.  This may alter the expected behavior of the LB method, such as Round Robin. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	InlineHealthMonitor *bool `json:"inline_health_monitor,omitempty"`

	// Use list of servers from Ip Address Group. It is a reference to an object of type IpAddrGroup. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	IpaddrgroupRef *string `json:"ipaddrgroup_ref,omitempty"`

	// Do load balancing at SE level instead of the default per core load balancing. Field introduced in 21.1.5, 22.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	LbAlgoRrPerSe *bool `json:"lb_algo_rr_per_se,omitempty"`

	// The load balancing algorithm will pick a server within the pool's list of available servers. Values LB_ALGORITHM_NEAREST_SERVER and LB_ALGORITHM_TOPOLOGY are only allowed for GSLB pool. Enum options - LB_ALGORITHM_LEAST_CONNECTIONS, LB_ALGORITHM_ROUND_ROBIN, LB_ALGORITHM_FASTEST_RESPONSE, LB_ALGORITHM_CONSISTENT_HASH, LB_ALGORITHM_LEAST_LOAD, LB_ALGORITHM_FEWEST_SERVERS, LB_ALGORITHM_RANDOM, LB_ALGORITHM_FEWEST_TASKS, LB_ALGORITHM_NEAREST_SERVER, LB_ALGORITHM_CORE_AFFINITY, LB_ALGORITHM_TOPOLOGY. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- LB_ALGORITHM_LEAST_CONNECTIONS,LB_ALGORITHM_ROUND_ROBIN,LB_ALGORITHM_CONSISTENT_HASH), Basic (Allowed values- LB_ALGORITHM_LEAST_CONNECTIONS,LB_ALGORITHM_ROUND_ROBIN,LB_ALGORITHM_CONSISTENT_HASH) edition.
	LbAlgorithm *string `json:"lb_algorithm,omitempty"`

	// HTTP header name to be used for the hash key. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	LbAlgorithmConsistentHashHdr *string `json:"lb_algorithm_consistent_hash_hdr,omitempty"`

	// Degree of non-affinity for core affinity based server selection. Allowed values are 1-65535. Field introduced in 17.1.3. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- 2), Basic (Allowed values- 2) edition.
	LbAlgorithmCoreNonaffinity *uint32 `json:"lb_algorithm_core_nonaffinity,omitempty"`

	// Criteria used as a key for determining the hash between the client and  server. Enum options - LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS, LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS_AND_PORT, LB_ALGORITHM_CONSISTENT_HASH_URI, LB_ALGORITHM_CONSISTENT_HASH_CUSTOM_HEADER, LB_ALGORITHM_CONSISTENT_HASH_CUSTOM_STRING, LB_ALGORITHM_CONSISTENT_HASH_CALLID. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS), Basic (Allowed values- LB_ALGORITHM_CONSISTENT_HASH_SOURCE_IP_ADDRESS) edition.
	LbAlgorithmHash *string `json:"lb_algorithm_hash,omitempty"`

	// Allow server lookup by name. Field introduced in 17.1.11,17.2.4. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	LookupServerByName *bool `json:"lookup_server_by_name,omitempty"`

	// List of labels to be used for granular RBAC. Field introduced in 20.1.5. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Markers []*RoleFilterMatchLabel `json:"markers,omitempty"`

	// The maximum number of concurrent connections allowed to each server within the pool. NOTE  applied value will be no less than the number of service engines that the pool is placed on. If set to 0, no limit is applied. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MaxConcurrentConnectionsPerServer *int32 `json:"max_concurrent_connections_per_server,omitempty"`

	// Rate Limit connections to each server. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MaxConnRatePerServer *RateProfile `json:"max_conn_rate_per_server,omitempty"`

	// Minimum number of health monitors in UP state to mark server UP. Field introduced in 18.2.1, 17.2.12. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	MinHealthMonitorsUp *uint32 `json:"min_health_monitors_up,omitempty"`

	// Minimum number of servers in UP state for marking the pool UP. Field introduced in 18.2.1, 17.2.12. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MinServersUp *uint32 `json:"min_servers_up,omitempty"`

	// The name of the pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// (internal-use) Networks designated as containing servers for this pool.  The servers may be further narrowed down by a filter. This field is used internally by Avi, not editable by the user. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Networks []*NetworkFilter `json:"networks,omitempty"`

	// A list of NSX Groups where the Servers for the Pool are created . Field introduced in 17.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	NsxSecuritygroup []string `json:"nsx_securitygroup,omitempty"`

	// Avi will validate the SSL certificate present by a server against the selected PKI Profile. It is a reference to an object of type PKIProfile. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PkiProfileRef *string `json:"pki_profile_ref,omitempty"`

	// Manually select the networks and subnets used to provide reachability to the pool's servers.  Specify the Subnet using the following syntax  10-1-1-0/24. Use static routes in VRF configuration when pool servers are not directly connected but routable from the service engine. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	PlacementNetworks []*PlacementNetwork `json:"placement_networks,omitempty"`

	// Type or Purpose, the Pool is to be used for. Enum options - POOL_TYPE_GENERIC_APP, POOL_TYPE_OAUTH. Field introduced in 22.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	PoolType *string `json:"pool_type,omitempty"`

	// Minimum number of requests to be queued when pool is full. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- 128), Basic (Allowed values- 128) edition.
	RequestQueueDepth *uint32 `json:"request_queue_depth,omitempty"`

	// Enable request queue when pool is full. Allowed with any value in Enterprise, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false), Basic (Allowed values- false) edition.
	RequestQueueEnabled *bool `json:"request_queue_enabled,omitempty"`

	// This field is used as a flag to create a job for JobManager. Field introduced in 18.2.10,20.1.2. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ResolvePoolByDNS *bool `json:"resolve_pool_by_dns,omitempty"`

	// Rewrite incoming Host Header to server name of the server to which the request is proxied.  Enabling this feature rewrites Host Header for requests to all servers in the pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RewriteHostHeaderToServerName *bool `json:"rewrite_host_header_to_server_name,omitempty"`

	// If SNI server name is specified, rewrite incoming host header to the SNI server name. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RewriteHostHeaderToSni *bool `json:"rewrite_host_header_to_sni,omitempty"`

	// Enable to do routing when this pool is selected to send traffic. No servers present in routing pool. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	RoutingPool *bool `json:"routing_pool,omitempty"`

	// Server graceful disable timeout behaviour. Enum options - DISALLOW_NEW_CONNECTION, ALLOW_NEW_CONNECTION_IF_PERSISTENCE_PRESENT. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	ServerDisableType *string `json:"server_disable_type,omitempty"`

	// Fully qualified DNS hostname which will be used in the TLS SNI extension in server connections if SNI is enabled. If no value is specified, Avi will use the incoming host header instead. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerName *string `json:"server_name,omitempty"`

	// Server reselect configuration for HTTP requests. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerReselect *HttpserverReselect `json:"server_reselect,omitempty"`

	// Server timeout value specifies the time within which a server connection needs to be established and a request-response exchange completes between AVI and the server. Value of 0 results in using default timeout of 60 minutes. Allowed values are 0-21600000. Field introduced in 18.1.5,18.2.1. Unit is MILLISECONDS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServerTimeout *uint32 `json:"server_timeout,omitempty"`

	// The pool directs load balanced traffic to this list of destination servers. The servers can be configured by IP address, name, network or via IP Address Group. Maximum of 5000 items allowed. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Servers []*Server `json:"servers,omitempty"`

	// Metadata pertaining to the service provided by this Pool. In Openshift/Kubernetes environments, app metadata info is stored. Any user input to this field will be overwritten by Avi Vantage. Field introduced in 17.2.14,18.1.5,18.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ServiceMetadata *string `json:"service_metadata,omitempty"`

	// Enable TLS SNI for server connections. If disabled, Avi will not send the SNI extension as part of the handshake. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SniEnabled *bool `json:"sni_enabled,omitempty"`

	// GSLB service associated with the site persistence pool. Field introduced in 22.1.3. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SpGsInfo *SpGslbServiceInfo `json:"sp_gs_info,omitempty"`

	// Service Engines will present a client SSL certificate to the server. It is a reference to an object of type SSLKeyAndCertificate. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslKeyAndCertificateRef *string `json:"ssl_key_and_certificate_ref,omitempty"`

	// When enabled, Avi re-encrypts traffic to the backend servers. The specific SSL profile defines which ciphers and SSL versions will be supported. It is a reference to an object of type SSLProfile. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	SslProfileRef *string `json:"ssl_profile_ref,omitempty"`

	//  It is a reference to an object of type Tenant. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// This tier1_lr field should be set same as VirtualService associated for NSX-T. Field introduced in 20.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Tier1Lr *string `json:"tier1_lr,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// Do not translate the client's destination port when sending the connection to the server. Monitor port needs to be specified for health monitors. Allowed with any value in Enterprise, Basic, Enterprise with Cloud Services edition. Allowed in Essentials (Allowed values- false) edition.
	UseServicePort *bool `json:"use_service_port,omitempty"`

	// This applies only when use_service_port is set to true. If enabled, SSL mode of the connection to the server is decided by the SSL mode on the Virtualservice service port, on which the request was received. Field introduced in 21.1.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UseServiceSslMode *bool `json:"use_service_ssl_mode,omitempty"`

	// UUID of the pool. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`

	// Virtual Routing Context that the pool is bound to. This is used to provide the isolation of the set of networks the pool is attached to. The pool inherits the Virtual Routing Context of the Virtual Service, and this field is used only internally, and is set by pb-transform. It is a reference to an object of type VrfContext. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	VrfRef *string `json:"vrf_ref,omitempty"`
}
