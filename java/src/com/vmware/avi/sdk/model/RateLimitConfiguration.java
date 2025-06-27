/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The RateLimitConfiguration is a POJO class extends AviRestResource that used for creating
 * RateLimitConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateLimitConfiguration extends AviRestResource  {
    @JsonProperty("burst")
    private Integer burst = 1;

    @JsonProperty("description")
    private String description;

    @JsonProperty("http_methods")
    private List<String> httpMethods;

    @JsonProperty("name")
    private String name;

    @JsonProperty("resource")
    private String resource;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("token_refill_rate")
    private TokenRefillRate tokenRefillRate;

    @JsonProperty("type")
    private String type = "RATE_LIMITER_API_CATEGORY";

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * The maximum request per second(rps) user intends to support for this category.this is not guaranteed as this will be the minimum of the rps
     * supported by the resources in the category and this value.if user doesn't provide then it will be minimum value of the resources in this category.
     * Allowed values are 1-1000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @return burst
     */
    public Integer getBurst() {
        return burst;
    }

    /**
     * This is the setter method to the attribute.
     * The maximum request per second(rps) user intends to support for this category.this is not guaranteed as this will be the minimum of the rps
     * supported by the resources in the category and this value.if user doesn't provide then it will be minimum value of the resources in this category.
     * Allowed values are 1-1000.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1.
     * @param burst set the burst.
     */
    public void setBurst(Integer  burst) {
        this.burst = burst;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description for the rate limit configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Description for the rate limit configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of http method(s) of the resources that need to be rate limited.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 31.2.1.
     * Minimum of 1 items required.
     * Maximum of 5 items allowed.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpMethods
     */
    public List<String> getHttpMethods() {
        return httpMethods;
    }

    /**
     * This is the setter method. this will set the httpMethods
     * List of http method(s) of the resources that need to be rate limited.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 31.2.1.
     * Minimum of 1 items required.
     * Maximum of 5 items allowed.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpMethods
     */
    public void setHttpMethods(List<String>  httpMethods) {
        this.httpMethods = httpMethods;
    }

    /**
     * This is the setter method this will set the httpMethods
     * List of http method(s) of the resources that need to be rate limited.
     * Enum options - HTTP_METHOD_GET, HTTP_METHOD_HEAD, HTTP_METHOD_PUT, HTTP_METHOD_DELETE, HTTP_METHOD_POST, HTTP_METHOD_OPTIONS, HTTP_METHOD_TRACE,
     * HTTP_METHOD_CONNECT, HTTP_METHOD_PATCH, HTTP_METHOD_PROPFIND, HTTP_METHOD_PROPPATCH, HTTP_METHOD_MKCOL, HTTP_METHOD_COPY, HTTP_METHOD_MOVE,
     * HTTP_METHOD_LOCK, HTTP_METHOD_UNLOCK.
     * Field introduced in 31.2.1.
     * Minimum of 1 items required.
     * Maximum of 5 items allowed.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return httpMethods
     */
    public RateLimitConfiguration addHttpMethodsItem(String httpMethodsItem) {
      if (this.httpMethods == null) {
        this.httpMethods = new ArrayList<String>();
      }
      this.httpMethods.add(httpMethodsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the rate limit configuration(unique).
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the rate limit configuration(unique).
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ratelimitresource which needs to be rate limited.
     * Enum options - RATE_LIMIT_VIRTUALSERVICE, RATE_LIMIT_POOL, RATE_LIMIT_LOGIN, RATE_LIMIT_AUTHTOKEN, RATE_LIMIT_HEALTHMONITOR,
     * RATE_LIMIT_CLUSTER_RUNTIME, RATE_LIMIT_AUTHPROFILE, RATE_LIMIT_ALERT.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return resource
     */
    public String getResource() {
        return resource;
    }

    /**
     * This is the setter method to the attribute.
     * Ratelimitresource which needs to be rate limited.
     * Enum options - RATE_LIMIT_VIRTUALSERVICE, RATE_LIMIT_POOL, RATE_LIMIT_LOGIN, RATE_LIMIT_AUTHTOKEN, RATE_LIMIT_HEALTHMONITOR,
     * RATE_LIMIT_CLUSTER_RUNTIME, RATE_LIMIT_AUTHPROFILE, RATE_LIMIT_ALERT.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param resource set the resource.
     */
    public void setResource(String  resource) {
        this.resource = resource;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant ref for the auth rate limit configuration.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant ref for the auth rate limit configuration.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Token refill rate.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tokenRefillRate
     */
    public TokenRefillRate getTokenRefillRate() {
        return tokenRefillRate;
    }

    /**
     * This is the setter method to the attribute.
     * Token refill rate.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tokenRefillRate set the tokenRefillRate.
     */
    public void setTokenRefillRate(TokenRefillRate tokenRefillRate) {
        this.tokenRefillRate = tokenRefillRate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of the rate limiter, for now we only support api categorization based.
     * Enum options - RATE_LIMITER_API_CATEGORY.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "RATE_LIMITER_API_CATEGORY".
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Type of the rate limiter, for now we only support api categorization based.
     * Enum options - RATE_LIMITER_API_CATEGORY.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "RATE_LIMITER_API_CATEGORY".
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the rate limit configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the rate limit configuration.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RateLimitConfiguration objRateLimitConfiguration = (RateLimitConfiguration) o;
      return   Objects.equals(this.uuid, objRateLimitConfiguration.uuid)&&
  Objects.equals(this.name, objRateLimitConfiguration.name)&&
  Objects.equals(this.description, objRateLimitConfiguration.description)&&
  Objects.equals(this.type, objRateLimitConfiguration.type)&&
  Objects.equals(this.httpMethods, objRateLimitConfiguration.httpMethods)&&
  Objects.equals(this.resource, objRateLimitConfiguration.resource)&&
  Objects.equals(this.burst, objRateLimitConfiguration.burst)&&
  Objects.equals(this.tokenRefillRate, objRateLimitConfiguration.tokenRefillRate)&&
  Objects.equals(this.tenantRef, objRateLimitConfiguration.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RateLimitConfiguration {\n");
                  sb.append("    burst: ").append(toIndentedString(burst)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    httpMethods: ").append(toIndentedString(httpMethods)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    tokenRefillRate: ").append(toIndentedString(tokenRefillRate)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                                    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                  sb.append("}");
      return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
      if (o == null) {
          return "null";
      }
      return o.toString().replace("\n", "\n    ");
    }
}
