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
 * The UserAccountProfile is a POJO class extends AviRestResource that used for creating
 * UserAccountProfile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserAccountProfile extends AviRestResource  {
    @JsonProperty("complexity_constraint")
    private ComplexityConstraint complexityConstraint;

    @JsonProperty("expiration_constraint")
    private ExpirationConstraint expirationConstraint;

    @JsonProperty("lockout_constraint")
    private LockoutConstraint lockoutConstraint;

    @JsonProperty("max_concurrent_sessions")
    private Integer maxConcurrentSessions = 0;

    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Password complexity constraints for the user account profile.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return complexityConstraint
     */
    public ComplexityConstraint getComplexityConstraint() {
        return complexityConstraint;
    }

    /**
     * This is the setter method to the attribute.
     * Password complexity constraints for the user account profile.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param complexityConstraint set the complexityConstraint.
     */
    public void setComplexityConstraint(ComplexityConstraint complexityConstraint) {
        this.complexityConstraint = complexityConstraint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Password expiration settings for the user account profile.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return expirationConstraint
     */
    public ExpirationConstraint getExpirationConstraint() {
        return expirationConstraint;
    }

    /**
     * This is the setter method to the attribute.
     * Password expiration settings for the user account profile.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param expirationConstraint set the expirationConstraint.
     */
    public void setExpirationConstraint(ExpirationConstraint expirationConstraint) {
        this.expirationConstraint = expirationConstraint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Account lockout settings for the user account profile.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lockoutConstraint
     */
    public LockoutConstraint getLockoutConstraint() {
        return lockoutConstraint;
    }

    /**
     * This is the setter method to the attribute.
     * Account lockout settings for the user account profile.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lockoutConstraint set the lockoutConstraint.
     */
    public void setLockoutConstraint(LockoutConstraint lockoutConstraint) {
        this.lockoutConstraint = lockoutConstraint;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum number of concurrent sessions allowed.
     * There are unlimited sessions by default.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @return maxConcurrentSessions
     */
    public Integer getMaxConcurrentSessions() {
        return maxConcurrentSessions;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum number of concurrent sessions allowed.
     * There are unlimited sessions by default.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 0.
     * @param maxConcurrentSessions set the maxConcurrentSessions.
     */
    public void setMaxConcurrentSessions(Integer  maxConcurrentSessions) {
        this.maxConcurrentSessions = maxConcurrentSessions;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
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
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
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
      UserAccountProfile objUserAccountProfile = (UserAccountProfile) o;
      return   Objects.equals(this.uuid, objUserAccountProfile.uuid)&&
  Objects.equals(this.name, objUserAccountProfile.name)&&
  Objects.equals(this.maxConcurrentSessions, objUserAccountProfile.maxConcurrentSessions)&&
  Objects.equals(this.complexityConstraint, objUserAccountProfile.complexityConstraint)&&
  Objects.equals(this.expirationConstraint, objUserAccountProfile.expirationConstraint)&&
  Objects.equals(this.lockoutConstraint, objUserAccountProfile.lockoutConstraint);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class UserAccountProfile {\n");
                  sb.append("    complexityConstraint: ").append(toIndentedString(complexityConstraint)).append("\n");
                        sb.append("    expirationConstraint: ").append(toIndentedString(expirationConstraint)).append("\n");
                        sb.append("    lockoutConstraint: ").append(toIndentedString(lockoutConstraint)).append("\n");
                        sb.append("    maxConcurrentSessions: ").append(toIndentedString(maxConcurrentSessions)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
