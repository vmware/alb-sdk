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
 * The LockoutConstraint is a POJO class extends AviRestResource that used for creating
 * LockoutConstraint.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LockoutConstraint  {
    @JsonProperty("lockout_evaluation_period")
    private Integer lockoutEvaluationPeriod = 900;

    @JsonProperty("lockout_max_auth_failures")
    private Integer lockoutMaxAuthFailures = 3;

    @JsonProperty("lockout_period")
    private Integer lockoutPeriod = 900;



    /**
     * This is the getter method this will return the attribute value.
     * Time window for evaluating failed attempts in seconds.
     * Defaults to 900 seconds.
     * Allowed values are 300-1800.
     * Special values are 0 - do not reset login failure counts on the basis of any evaluation window.
     * Field introduced in 31.3.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 900.
     * @return lockoutEvaluationPeriod
     */
    public Integer getLockoutEvaluationPeriod() {
        return lockoutEvaluationPeriod;
    }

    /**
     * This is the setter method to the attribute.
     * Time window for evaluating failed attempts in seconds.
     * Defaults to 900 seconds.
     * Allowed values are 300-1800.
     * Special values are 0 - do not reset login failure counts on the basis of any evaluation window.
     * Field introduced in 31.3.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 900.
     * @param lockoutEvaluationPeriod set the lockoutEvaluationPeriod.
     */
    public void setLockoutEvaluationPeriod(Integer  lockoutEvaluationPeriod) {
        this.lockoutEvaluationPeriod = lockoutEvaluationPeriod;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of failed attempts before account lockout.
     * Defaults to 3.
     * Setting it to 0 allows unlimited login failure attempts without any lockout.
     * Allowed values are 0-5.
     * Field introduced in 31.3.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @return lockoutMaxAuthFailures
     */
    public Integer getLockoutMaxAuthFailures() {
        return lockoutMaxAuthFailures;
    }

    /**
     * This is the setter method to the attribute.
     * Number of failed attempts before account lockout.
     * Defaults to 3.
     * Setting it to 0 allows unlimited login failure attempts without any lockout.
     * Allowed values are 0-5.
     * Field introduced in 31.3.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 3.
     * @param lockoutMaxAuthFailures set the lockoutMaxAuthFailures.
     */
    public void setLockoutMaxAuthFailures(Integer  lockoutMaxAuthFailures) {
        this.lockoutMaxAuthFailures = lockoutMaxAuthFailures;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Account lockout duration in seconds.
     * Defaults to 900 seconds.
     * Allowed values are 600-1800.
     * Field introduced in 31.3.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 900.
     * @return lockoutPeriod
     */
    public Integer getLockoutPeriod() {
        return lockoutPeriod;
    }

    /**
     * This is the setter method to the attribute.
     * Account lockout duration in seconds.
     * Defaults to 900 seconds.
     * Allowed values are 600-1800.
     * Field introduced in 31.3.1.
     * Unit is sec.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 900.
     * @param lockoutPeriod set the lockoutPeriod.
     */
    public void setLockoutPeriod(Integer  lockoutPeriod) {
        this.lockoutPeriod = lockoutPeriod;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LockoutConstraint objLockoutConstraint = (LockoutConstraint) o;
      return   Objects.equals(this.lockoutMaxAuthFailures, objLockoutConstraint.lockoutMaxAuthFailures)&&
  Objects.equals(this.lockoutEvaluationPeriod, objLockoutConstraint.lockoutEvaluationPeriod)&&
  Objects.equals(this.lockoutPeriod, objLockoutConstraint.lockoutPeriod);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LockoutConstraint {\n");
                  sb.append("    lockoutEvaluationPeriod: ").append(toIndentedString(lockoutEvaluationPeriod)).append("\n");
                        sb.append("    lockoutMaxAuthFailures: ").append(toIndentedString(lockoutMaxAuthFailures)).append("\n");
                        sb.append("    lockoutPeriod: ").append(toIndentedString(lockoutPeriod)).append("\n");
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
