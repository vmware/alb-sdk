package models

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

// GslbService gslb service
// swagger:model GslbService
type GslbService struct {

	// GS member's overall health status is derived based on a combination of controller and datapath health-status inputs. Note that the datapath status is determined by the association of health monitor profiles. Only the controller provided status is determined through this configuration. .
	ControllerHealthStatusEnabled bool `json:"controller_health_status_enabled,omitempty"`

	// Creator name. Field introduced in 17.1.2.
	CreatedBy string `json:"created_by,omitempty"`

	// User defined description for the object.
	Description string `json:"description,omitempty"`

	// Fully qualified domain name of the GSLB service.
	DomainNames []string `json:"domain_names,omitempty"`

	// Response to the client query when the GSLB service is DOWN.
	DownResponse *GslbServiceDownResponse `json:"down_response,omitempty"`

	// Enable or disable the GSLB service. If the GSLB service is enabled, then the VIPs are sent in the DNS responses based on reachability and configured algorithm. If the GSLB service is disabled, then the VIPs are no longer available in the DNS response.
	Enabled bool `json:"enabled,omitempty"`

	// Select list of pools belonging to this GSLB service.
	Groups []*GslbPool `json:"groups,omitempty"`

	// Verify VS health by applying one or more health monitors.  Active monitors generate synthetic traffic from DNS Service Engine and to mark a VS up or down based on the response. . It is a reference to an object of type GslbHealthMonitor.
	HealthMonitorRefs []string `json:"health_monitor_refs,omitempty"`

	// Health monitor probe can be executed for all the members or it can be executed only for third-party members. This operational mode is useful to reduce the number of health monitor probes in case of a hybrid scenario. In such a case, Avi members can have controller derived status while Non-Avi members can be probed by via health monitor probes in dataplane. Enum options - GSLB_SERVICE_HEALTH_MONITOR_ALL_MEMBERS, GSLB_SERVICE_HEALTH_MONITOR_ONLY_NON_AVI_MEMBERS.
	HealthMonitorScope string `json:"health_monitor_scope,omitempty"`

	// Name for the GSLB service.
	// Required: true
	Name string `json:"name"`

	// Number of IP addresses of this GSLB service to be returned by the DNS Service. Enter 0 to return all IP addresses. Allowed values are 1-20. Special values are 0- 'Return all IP addresses'.
	NumDNSIP int32 `json:"num_dns_ip,omitempty"`

	//  It is a reference to an object of type Tenant.
	TenantRef string `json:"tenant_ref,omitempty"`

	// TTL value (in seconds) for records served for this GSLB service by the DNS Service. Allowed values are 1-86400.
	TTL int32 `json:"ttl,omitempty"`

	// url
	// Read Only: true
	URL string `json:"url,omitempty"`

	// Use the client ip subnet from the EDNS option as source IPaddress for client geo-location and consistent hash algorithm. Default is true. Field introduced in 17.1.1.
	UseEdnsClientSubnet bool `json:"use_edns_client_subnet,omitempty"`

	// UUID of the GSLB service.
	UUID string `json:"uuid,omitempty"`

	// Enable wild-card match of fqdn  if an exact match is not found in the DNS table, the longest match is chosen by wild-carding the fqdn in the DNS request. Default is false. Field introduced in 17.1.1.
	WildcardMatch bool `json:"wildcard_match,omitempty"`
}
