// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// DNSRuleAction Dns rule action
// swagger:model DnsRuleAction
type DNSRuleAction struct {

	// Allow or drop the DNS query. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Allow *DNSRuleActionAllowDrop `json:"allow,omitempty"`

	// Rate limits the DNS requests. Field deprecated in 20.1.1. Field introduced in 18.2.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DNSRateLimit *DNSRateProfile `json:"dns_rate_limit,omitempty"`

	// Rate limits the DNS requests. Field introduced in 20.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	DNSRateLimiter *DNSRateLimiter `json:"dns_rate_limiter,omitempty"`

	// Select a specific GSLB site for the DNS query. This action should be used only when GSLB services have been configured for the DNS virtual service. Field introduced in 17.1.5. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	GslbSiteSelection *DNSRuleActionGslbSiteSelection `json:"gslb_site_selection,omitempty"`

	// Select a pool or pool group for the passthrough DNS query which cannot be served locally but could be served by upstream servers. Field introduced in 18.1.3, 17.2.12. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	PoolSwitching *DNSRuleActionPoolSwitching `json:"pool_switching,omitempty"`

	// Generate a response for the DNS query. Field introduced in 17.1.1. Allowed in Enterprise with any value edition, Essentials edition, Basic edition, Enterprise with Cloud Services edition.
	Response *DNSRuleActionResponse `json:"response,omitempty"`
}
