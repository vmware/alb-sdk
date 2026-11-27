// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// GatewayMonitor gateway monitor
// swagger:model GatewayMonitor
type GatewayMonitor struct {

	// IP address of next hop gateway to be monitored. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	GatewayIP *IPAddr `json:"gateway_ip"`

	// The number of consecutive failed gateway health checks before a gateway is marked down. Allowed values are 3-50. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GatewayMonitorFailThreshold *uint32 `json:"gateway_monitor_fail_threshold,omitempty"`

	// The interval between two ping requests sent by the gateway monitor in milliseconds. If a value is not specified, requests are sent every second. Allowed values are 100-60000. Unit is MILLISECONDS. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GatewayMonitorInterval *uint32 `json:"gateway_monitor_interval,omitempty"`

	// The number of consecutive successful gateway health checks before a gateway that was marked down by the gateway monitor is marked up. Allowed values are 3-50. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	GatewayMonitorSuccessThreshold *uint32 `json:"gateway_monitor_success_threshold,omitempty"`

	// Protocol used by the gateway monitor to check gateway reachability. Enum options - GATEWAY_MONITOR_ICMP, GATEWAY_MONITOR_ARP. Field introduced in 32.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	MonitorProtocol *string `json:"monitor_protocol,omitempty"`

	// Subnet providing reachability for Multi-hop Gateway. Field introduced in 18.1.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	Subnet *IPAddrPrefix `json:"subnet,omitempty"`
}
