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
 * The PolicySpec is a POJO class extends AviRestResource that used for creating
 * PolicySpec.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PolicySpec  {
    @JsonProperty("disk")
    private DiskThreshold disk;

    @JsonProperty("object")
    private ObjectRule object;

    @JsonProperty("periodic")
    private Periodicity periodic;



    /**
     * This is the getter method this will return the attribute value.
     * Disk usage policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return disk
     */
    public DiskThreshold getDisk() {
        return disk;
    }

    /**
     * This is the setter method to the attribute.
     * Disk usage policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param disk set the disk.
     */
    public void setDisk(DiskThreshold disk) {
        this.disk = disk;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Objects policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return object
     */
    public ObjectRule getObject() {
        return object;
    }

    /**
     * This is the setter method to the attribute.
     * Objects policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param object set the object.
     */
    public void setObject(ObjectRule object) {
        this.object = object;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Periodic policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return periodic
     */
    public Periodicity getPeriodic() {
        return periodic;
    }

    /**
     * This is the setter method to the attribute.
     * Periodic policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param periodic set the periodic.
     */
    public void setPeriodic(Periodicity periodic) {
        this.periodic = periodic;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PolicySpec objPolicySpec = (PolicySpec) o;
      return   Objects.equals(this.disk, objPolicySpec.disk)&&
  Objects.equals(this.object, objPolicySpec.object)&&
  Objects.equals(this.periodic, objPolicySpec.periodic);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PolicySpec {\n");
                  sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
                        sb.append("    object: ").append(toIndentedString(object)).append("\n");
                        sb.append("    periodic: ").append(toIndentedString(periodic)).append("\n");
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
