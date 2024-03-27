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
 * The JournalObject is a POJO class extends AviRestResource that used for creating
 * JournalObject.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JournalObject  {
    @JsonProperty("failed")
    private Integer failed;

    @JsonProperty("model")
    private String model;

    @JsonProperty("skipped")
    private Integer skipped;

    @JsonProperty("success")
    private Integer success;



    /**
     * This is the getter method this will return the attribute value.
     * Number of object caused a failure.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return failed
     */
    public Integer getFailed() {
        return failed;
    }

    /**
     * This is the setter method to the attribute.
     * Number of object caused a failure.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param failed set the failed.
     */
    public void setFailed(Integer  failed) {
        this.failed = failed;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the model.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the model.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param model set the model.
     */
    public void setModel(String  model) {
        this.model = model;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of object skipped.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return skipped
     */
    public Integer getSkipped() {
        return skipped;
    }

    /**
     * This is the setter method to the attribute.
     * Number of object skipped.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param skipped set the skipped.
     */
    public void setSkipped(Integer  skipped) {
        this.skipped = skipped;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of object for which processing is successful.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return success
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     * This is the setter method to the attribute.
     * Number of object for which processing is successful.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param success set the success.
     */
    public void setSuccess(Integer  success) {
        this.success = success;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      JournalObject objJournalObject = (JournalObject) o;
      return   Objects.equals(this.model, objJournalObject.model)&&
  Objects.equals(this.success, objJournalObject.success)&&
  Objects.equals(this.failed, objJournalObject.failed)&&
  Objects.equals(this.skipped, objJournalObject.skipped);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class JournalObject {\n");
                  sb.append("    failed: ").append(toIndentedString(failed)).append("\n");
                        sb.append("    model: ").append(toIndentedString(model)).append("\n");
                        sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
                        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
