// Copyright 2021 VMware, Inc.
// SPDX-License-Identifier: Apache License 2.0
package models

// This file is auto-generated.

// RateLimitConfiguration rate limit configuration
// swagger:model RateLimitConfiguration
type RateLimitConfiguration struct {

	// UNIX time since epoch in microseconds. Units(MICROSECONDS).
	// Read Only: true
	LastModified *string `json:"_last_modified,omitempty"`

	// The maximum request per second(RPS) user intends to support for this category.This is not guaranteed as this will be the minimum of the RPS supported by the resources in the category and this value.If user doesn't provide then it will be minimum value of the resources in this category. Allowed values are 1-1000. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Burst *uint32 `json:"burst,omitempty"`

	// Protobuf versioning for config pbs. Field introduced in 31.2.1. Allowed with any value in Enterprise, Essentials, Basic, Enterprise with Cloud Services edition.
	ConfigpbAttributes *ConfigPbAttributes `json:"configpb_attributes,omitempty"`

	// Description for the Rate Limit Configuration. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Description *string `json:"description,omitempty"`

	// List of HTTP method(s) of the resources that need to be rate limited. Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE, HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE, HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK. Field introduced in 31.2.1. Minimum of 1 items required. Maximum of 5 items allowed. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	HTTPMethods []string `json:"http_methods,omitempty"`

	// Name of the Rate Limit Configuration(unique). Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Name *string `json:"name"`

	// RateLimitResource which needs to be rate limited. Enum options - RATE_LIMIT_VIRTUALSERVICE, RATE_LIMIT_POOL, RATE_LIMIT_LOGIN, RATE_LIMIT_AUTHTOKEN, RATE_LIMIT_HEALTHMONITOR. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	Resource *string `json:"resource"`

	// Tenant ref for the auth Rate Limit Configuration. It is a reference to an object of type Tenant. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	TenantRef *string `json:"tenant_ref,omitempty"`

	// Token Refill Rate. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	// Required: true
	TokenRefillRate *TokenRefillRate `json:"token_refill_rate"`

	// Type of the Rate Limiter, for now we only support api categorization based. Enum options - RATE_LIMITER_API_CATEGORY. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	Type *string `json:"type,omitempty"`

	// url
	// Read Only: true
	URL *string `json:"url,omitempty"`

	// UUID of the Rate Limit Configuration. Field introduced in 31.2.1. Allowed with any value in Enterprise, Enterprise with Cloud Services edition.
	UUID *string `json:"uuid,omitempty"`
}
