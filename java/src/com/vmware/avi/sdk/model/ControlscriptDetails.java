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
 * The ControlscriptDetails is a POJO class extends AviRestResource that used for creating
 * ControlscriptDetails.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ControlscriptDetails  {
    @JsonProperty("exitcode")
    private Integer exitcode;

    @JsonProperty("stderr")
    private String stderr;

    @JsonProperty("stdout")
    private String stdout;



    /**
     * This is the getter method this will return the attribute value.
     * Exitcode from control script execution.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return exitcode
     */
    public Integer getExitcode() {
        return exitcode;
    }

    /**
     * This is the setter method to the attribute.
     * Exitcode from control script execution.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param exitcode set the exitcode.
     */
    public void setExitcode(Integer  exitcode) {
        this.exitcode = exitcode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Stderr from control script execution.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stderr
     */
    public String getStderr() {
        return stderr;
    }

    /**
     * This is the setter method to the attribute.
     * Stderr from control script execution.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stderr set the stderr.
     */
    public void setStderr(String  stderr) {
        this.stderr = stderr;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Stdout from control script execution.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return stdout
     */
    public String getStdout() {
        return stdout;
    }

    /**
     * This is the setter method to the attribute.
     * Stdout from control script execution.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param stdout set the stdout.
     */
    public void setStdout(String  stdout) {
        this.stdout = stdout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ControlscriptDetails objControlscriptDetails = (ControlscriptDetails) o;
      return   Objects.equals(this.stdout, objControlscriptDetails.stdout)&&
  Objects.equals(this.stderr, objControlscriptDetails.stderr)&&
  Objects.equals(this.exitcode, objControlscriptDetails.exitcode);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ControlscriptDetails {\n");
                  sb.append("    exitcode: ").append(toIndentedString(exitcode)).append("\n");
                        sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
                        sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
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
