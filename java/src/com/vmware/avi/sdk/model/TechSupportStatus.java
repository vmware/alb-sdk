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
 * The TechSupportStatus is a POJO class extends AviRestResource that used for creating
 * TechSupportStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TechSupportStatus  {
    @JsonProperty("case_number")
    private String caseNumber;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("errors")
    private List<String> errors;

    @JsonProperty("key")
    private String key;

    @JsonProperty("level")
    private String level;

    @JsonProperty("name")
    private String name;

    @JsonProperty("node")
    private String node;

    @JsonProperty("output")
    private String output;

    @JsonProperty("size")
    private String size;

    @JsonProperty("start_time")
    private String startTime;

    @JsonProperty("status")
    private String status;

    @JsonProperty("status_code")
    private String statusCode;

    @JsonProperty("warnings")
    private List<String> warnings;



    /**
     * This is the getter method this will return the attribute value.
     * 'customer case number for which this tech-support is generated.
     * ''useful for connected portal and other use-cases.'.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseNumber
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * This is the setter method to the attribute.
     * 'customer case number for which this tech-support is generated.
     * ''useful for connected portal and other use-cases.'.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caseNumber set the caseNumber.
     */
    public void setCaseNumber(String  caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total time taken for tech-support collection.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * This is the setter method to the attribute.
     * Total time taken for tech-support collection.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param duration set the duration.
     */
    public void setDuration(String  duration) {
        this.duration = duration;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Error logged during tech-support collection.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errors
     */
    public List<String> getErrors() {
        return errors;
    }

    /**
     * This is the setter method. this will set the errors
     * Error logged during tech-support collection.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errors
     */
    public void setErrors(List<String>  errors) {
        this.errors = errors;
    }

    /**
     * This is the setter method this will set the errors
     * Error logged during tech-support collection.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errors
     */
    public TechSupportStatus addErrorsItem(String errorsItem) {
      if (this.errors == null) {
        this.errors = new ArrayList<String>();
      }
      this.errors.add(errorsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tech-support collection keys.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * This is the setter method to the attribute.
     * Tech-support collection keys.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param key set the key.
     */
    public void setKey(String  key) {
        this.key = key;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tech-support collection level.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return level
     */
    public String getLevel() {
        return level;
    }

    /**
     * This is the setter method to the attribute.
     * Tech-support collection level.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param level set the level.
     */
    public void setLevel(String  level) {
        this.level = level;
    }

    /**
     * This is the getter method this will return the attribute value.
     * 'obj name if one exists.'.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * 'obj name if one exists.'.
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cluster member node on which the techsupport tarball bundle is saved.
     * Field introduced in 20.1.2.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return node
     */
    public String getNode() {
        return node;
    }

    /**
     * This is the setter method to the attribute.
     * Cluster member node on which the techsupport tarball bundle is saved.
     * Field introduced in 20.1.2.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param node set the node.
     */
    public void setNode(String  node) {
        this.node = node;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tech-support collection output.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return output
     */
    public String getOutput() {
        return output;
    }

    /**
     * This is the setter method to the attribute.
     * Tech-support collection output.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param output set the output.
     */
    public void setOutput(String  output) {
        this.output = output;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Size of techsupport tarball.
     * Field introduced in 20.1.2.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return size
     */
    public String getSize() {
        return size;
    }

    /**
     * This is the setter method to the attribute.
     * Size of techsupport tarball.
     * Field introduced in 20.1.2.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param size set the size.
     */
    public void setSize(String  size) {
        this.size = size;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Start timestamp of tech-support collection.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This is the setter method to the attribute.
     * Start timestamp of tech-support collection.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param startTime set the startTime.
     */
    public void setStartTime(String  startTime) {
        this.startTime = startTime;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status of tech-support invocation.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Status of tech-support invocation.
     * Field introduced in 17.2.12, 18.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status code for the tech-support invocation.
     * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
     * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
     * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED...
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * This is the setter method to the attribute.
     * Status code for the tech-support invocation.
     * Enum options - SYSERR_SUCCESS, SYSERR_FAILURE, SYSERR_OUT_OF_MEMORY, SYSERR_NO_ENT, SYSERR_INVAL, SYSERR_ACCESS, SYSERR_FAULT, SYSERR_IO,
     * SYSERR_TIMEOUT, SYSERR_NOT_SUPPORTED, SYSERR_NOT_READY, SYSERR_UPGRADE_IN_PROGRESS, SYSERR_WARM_START_IN_PROGRESS, SYSERR_TRY_AGAIN,
     * SYSERR_NOT_UPGRADING, SYSERR_PENDING, SYSERR_EVENT_GEN_FAILURE, SYSERR_CONFIG_PARAM_MISSING, SYSERR_RANGE, SYSERR_FAILED...
     * Field introduced in 18.2.3.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param statusCode set the statusCode.
     */
    public void setStatusCode(String  statusCode) {
        this.statusCode = statusCode;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Warning logged during tech-support collection.
     * Field introduced in 18.2.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return warnings
     */
    public List<String> getWarnings() {
        return warnings;
    }

    /**
     * This is the setter method. this will set the warnings
     * Warning logged during tech-support collection.
     * Field introduced in 18.2.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return warnings
     */
    public void setWarnings(List<String>  warnings) {
        this.warnings = warnings;
    }

    /**
     * This is the setter method this will set the warnings
     * Warning logged during tech-support collection.
     * Field introduced in 18.2.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return warnings
     */
    public TechSupportStatus addWarningsItem(String warningsItem) {
      if (this.warnings == null) {
        this.warnings = new ArrayList<String>();
      }
      this.warnings.add(warningsItem);
      return this;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      TechSupportStatus objTechSupportStatus = (TechSupportStatus) o;
      return   Objects.equals(this.startTime, objTechSupportStatus.startTime)&&
  Objects.equals(this.level, objTechSupportStatus.level)&&
  Objects.equals(this.key, objTechSupportStatus.key)&&
  Objects.equals(this.status, objTechSupportStatus.status)&&
  Objects.equals(this.output, objTechSupportStatus.output)&&
  Objects.equals(this.duration, objTechSupportStatus.duration)&&
  Objects.equals(this.errors, objTechSupportStatus.errors)&&
  Objects.equals(this.warnings, objTechSupportStatus.warnings)&&
  Objects.equals(this.statusCode, objTechSupportStatus.statusCode)&&
  Objects.equals(this.name, objTechSupportStatus.name)&&
  Objects.equals(this.caseNumber, objTechSupportStatus.caseNumber)&&
  Objects.equals(this.node, objTechSupportStatus.node)&&
  Objects.equals(this.size, objTechSupportStatus.size);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class TechSupportStatus {\n");
                  sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
                        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
                        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
                        sb.append("    key: ").append(toIndentedString(key)).append("\n");
                        sb.append("    level: ").append(toIndentedString(level)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    node: ").append(toIndentedString(node)).append("\n");
                        sb.append("    output: ").append(toIndentedString(output)).append("\n");
                        sb.append("    size: ").append(toIndentedString(size)).append("\n");
                        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
                        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
                        sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
