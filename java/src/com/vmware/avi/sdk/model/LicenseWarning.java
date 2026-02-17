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
 * The LicenseWarning is a POJO class extends AviRestResource that used for creating
 * LicenseWarning.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LicenseWarning  {
    @JsonProperty("date")
    private String date;

    @JsonProperty("pre_warn")
    private String preWarn;

    @JsonProperty("reason")
    private String reason;



    /**
     * This is the getter method this will return the attribute value.
     * License warning date.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return date
     */
    public String getDate() {
        return date;
    }

    /**
     * This is the setter method to the attribute.
     * License warning date.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param date set the date.
     */
    public void setDate(String  date) {
        this.date = date;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License pre warning period.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return preWarn
     */
    public String getPreWarn() {
        return preWarn;
    }

    /**
     * This is the setter method to the attribute.
     * License pre warning period.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param preWarn set the preWarn.
     */
    public void setPreWarn(String  preWarn) {
        this.preWarn = preWarn;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License warning reason.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * This is the setter method to the attribute.
     * License warning reason.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reason set the reason.
     */
    public void setReason(String  reason) {
        this.reason = reason;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      LicenseWarning objLicenseWarning = (LicenseWarning) o;
      return   Objects.equals(this.date, objLicenseWarning.date)&&
  Objects.equals(this.reason, objLicenseWarning.reason)&&
  Objects.equals(this.preWarn, objLicenseWarning.preWarn);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class LicenseWarning {\n");
                  sb.append("    date: ").append(toIndentedString(date)).append("\n");
                        sb.append("    preWarn: ").append(toIndentedString(preWarn)).append("\n");
                        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
