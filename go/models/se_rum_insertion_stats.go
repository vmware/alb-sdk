// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// SeRumInsertionStats se rum insertion stats
// swagger:model SeRumInsertionStats
type SeRumInsertionStats struct {

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumBadBeaconsReceived *uint64 `json:"rum_bad_beacons_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumBeaconsReceived *uint64 `json:"rum_beacons_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumCachedBeaconsReceived *uint64 `json:"rum_cached_beacons_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumFailedInternalError *uint64 `json:"rum_failed_internal_error"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumFailedUsingJs *uint64 `json:"rum_failed_using_js"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumIgnoredClientIP *uint64 `json:"rum_ignored_client_ip"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumIgnoredContentType *uint64 `json:"rum_ignored_content_type"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumIgnoredHTTPStatus *uint64 `json:"rum_ignored_http_status"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumIgnoredSample *uint64 `json:"rum_ignored_sample"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumIgnoredSkipURI *uint64 `json:"rum_ignored_skip_uri"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumIgnoredSubRequest *uint64 `json:"rum_ignored_sub_request"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumIgnoredURINotInList *uint64 `json:"rum_ignored_uri_not_in_list"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumNavAndResUsingJs *uint64 `json:"rum_nav_and_res_using_js"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumNavOnlyUsingJs *uint64 `json:"rum_nav_only_using_js"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumNonPageBeaconsReceived *uint64 `json:"rum_non_page_beacons_received"`

	//  Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	// Required: true
	RumPassiveOnly *uint64 `json:"rum_passive_only"`
}
