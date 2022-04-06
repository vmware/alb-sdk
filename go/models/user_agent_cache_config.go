// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// UserAgentCacheConfig user agent cache config
// swagger:model UserAgentCacheConfig
type UserAgentCacheConfig struct {

	// How many unknown User-Agents to batch up before querying Controller - unless max_wait_time is reached first. Allowed values are 1-500. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	BatchSize *int32 `json:"batch_size,omitempty"`

	// The number of User-Agent entries to cache on the Controller. Allowed values are 500-10000000. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	ControllerCacheSize *int32 `json:"controller_cache_size,omitempty"`

	// How often at most to query controller for a given User-Agent. Allowed values are 2-100. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	MaxUpstreamQueries *int32 `json:"max_upstream_queries,omitempty"`

	// The time interval in seconds after which to make a request to the Controller, even if the 'batch_size' hasn't been reached yet. Allowed values are 20-100000. Field introduced in 21.1.1. Unit is SEC. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	MaxWaitTime *int32 `json:"max_wait_time,omitempty"`

	// How many BotUACacheResult elements to include in an upstream update message. Allowed values are 1-10000. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	NumEntriesUpstreamUpdate *int32 `json:"num_entries_upstream_update,omitempty"`

	// How much space to reserve in percent for known bad bots. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	PercentReservedForBadBots *int32 `json:"percent_reserved_for_bad_bots,omitempty"`

	// How much space to reserve in percent for browsers. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	PercentReservedForBrowsers *int32 `json:"percent_reserved_for_browsers,omitempty"`

	// How much space to reserve in percent for known good bots. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	PercentReservedForGoodBots *int32 `json:"percent_reserved_for_good_bots,omitempty"`

	// How much space to reserve in percent for outstanding upstream requests. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	PercentReservedForOutstanding *int32 `json:"percent_reserved_for_outstanding,omitempty"`

	// The number of User-Agent entries to cache on each Service Engine. Allowed values are 500-10000000. Field introduced in 21.1.1. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	SeCacheSize *int32 `json:"se_cache_size,omitempty"`

	// How often in seconds to send updates about User-Agent cache entries to the next upstream cache. Field introduced in 21.1.1. Unit is SEC. Allowed in Enterprise with any value edition, Enterprise with Cloud Services edition.
	UpstreamUpdateInterval *int32 `json:"upstream_update_interval,omitempty"`
}
