package models

// This file is auto-generated.
// Please contact avi-sdk@avinetworks.com for any change requests.

// Vip vip
// swagger:model Vip
type Vip struct {

	// Auto-allocate floating/elastic IP from the Cloud infrastructure. Field introduced in 17.1.1.
	AutoAllocateFloatingIP bool `json:"auto_allocate_floating_ip,omitempty"`

	// Auto-allocate VIP from the provided subnet. Field introduced in 17.1.1.
	AutoAllocateIP bool `json:"auto_allocate_ip,omitempty"`

	// Availability-zone to place the Virtual Service. Field introduced in 17.1.1.
	AvailabilityZone string `json:"availability_zone,omitempty"`

	// (internal-use) FIP allocated by Avi in the Cloud infrastructure. Field introduced in 17.1.1.
	AviAllocatedFip bool `json:"avi_allocated_fip,omitempty"`

	// (internal-use) VIP allocated by Avi in the Cloud infrastructure. Field introduced in 17.1.1.
	AviAllocatedVip bool `json:"avi_allocated_vip,omitempty"`

	// Discovered networks providing reachability for client facing Vip IP. Field introduced in 17.1.1.
	DiscoveredNetworks []*DiscoveredNetwork `json:"discovered_networks,omitempty"`

	// Enable or disable the Vip. Field introduced in 17.1.1.
	Enabled bool `json:"enabled,omitempty"`

	// Floating IP to associate with this Vip. Field introduced in 17.1.1.
	FloatingIP *IPAddr `json:"floating_ip,omitempty"`

	// If auto_allocate_floating_ip is True and more than one floating-ip subnets exist, then the subnet for the floating IP address allocation. Field introduced in 17.1.1.
	FloatingSubnetUUID string `json:"floating_subnet_uuid,omitempty"`

	// IP Address of the Vip. Field introduced in 17.1.1.
	IPAddress *IPAddr `json:"ip_address,omitempty"`

	// Subnet and/or Network for allocating VirtualService IP by IPAM Provider module. Field introduced in 17.1.1.
	IPAMNetworkSubnet *IPNetworkSubnet `json:"ipam_network_subnet,omitempty"`

	// Manually override the network on which the Vip is placed. It is a reference to an object of type Network. Field introduced in 17.1.1.
	NetworkRef string `json:"network_ref,omitempty"`

	// (internal-use) Network port assigned to the Vip IP address. Field introduced in 17.1.1.
	PortUUID string `json:"port_uuid,omitempty"`

	// Subnet providing reachability for client facing Vip IP. Field introduced in 17.1.1.
	Subnet *IPAddrPrefix `json:"subnet,omitempty"`

	// If auto_allocate_ip is True, then the subnet for the Vip IP address allocation. This field is applicable only if the VirtualService belongs to an Openstack or AWS cloud, in which case it is mandatory, if auto_allocate is selected. Field introduced in 17.1.1.
	SubnetUUID string `json:"subnet_uuid,omitempty"`

	// Unique ID associated with the vip. Field introduced in 17.1.1.
	// Required: true
	VipID string `json:"vip_id"`
}
