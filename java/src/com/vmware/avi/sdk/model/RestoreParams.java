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
 * The RestoreParams is a POJO class extends AviRestResource that used for creating
 * RestoreParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestoreParams  {
    @JsonProperty("file")
    private String file;

    @JsonProperty("passphrase")
    private String passphrase;

    @JsonProperty("prechecks_only")
    private Boolean prechecksOnly = false;

    @JsonProperty("skip_warnings")
    private Boolean skipWarnings = false;

    @JsonProperty("type")
    private String type = "JSON";



    /**
     * This is the getter method this will return the attribute value.
     * Requested config file path.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return file
     */
    public String getFile() {
        return file;
    }

    /**
     * This is the setter method to the attribute.
     * Requested config file path.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param file set the file.
     */
    public void setFile(String  file) {
        this.file = file;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The passphrase with which the configuration was exported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return passphrase
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * This is the setter method to the attribute.
     * The passphrase with which the configuration was exported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param passphrase set the passphrase.
     */
    public void setPassphrase(String  passphrase) {
        this.passphrase = passphrase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This flag is set to run the pre-checks without the subsequent upgrade operations.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return prechecksOnly
     */
    public Boolean getPrechecksOnly() {
        return prechecksOnly;
    }

    /**
     * This is the setter method to the attribute.
     * This flag is set to run the pre-checks without the subsequent upgrade operations.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param prechecksOnly set the prechecksOnly.
     */
    public void setPrechecksOnly(Boolean  prechecksOnly) {
        this.prechecksOnly = prechecksOnly;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This flag allows you to bypass the warning prechecks.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return skipWarnings
     */
    public Boolean getSkipWarnings() {
        return skipWarnings;
    }

    /**
     * This is the setter method to the attribute.
     * This flag allows you to bypass the warning prechecks.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param skipWarnings set the skipWarnings.
     */
    public void setSkipWarnings(Boolean  skipWarnings) {
        this.skipWarnings = skipWarnings;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Type of the file.
     * Enum options - JSON, BUNDLE.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "JSON".
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Type of the file.
     * Enum options - JSON, BUNDLE.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "JSON".
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      RestoreParams objRestoreParams = (RestoreParams) o;
      return   Objects.equals(this.file, objRestoreParams.file)&&
  Objects.equals(this.type, objRestoreParams.type)&&
  Objects.equals(this.skipWarnings, objRestoreParams.skipWarnings)&&
  Objects.equals(this.passphrase, objRestoreParams.passphrase)&&
  Objects.equals(this.prechecksOnly, objRestoreParams.prechecksOnly);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RestoreParams {\n");
                  sb.append("    file: ").append(toIndentedString(file)).append("\n");
                        sb.append("    passphrase: ").append(toIndentedString(passphrase)).append("\n");
                        sb.append("    prechecksOnly: ").append(toIndentedString(prechecksOnly)).append("\n");
                        sb.append("    skipWarnings: ").append(toIndentedString(skipWarnings)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
