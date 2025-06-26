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
 * The ReplicationPolicy is a POJO class extends AviRestResource that used for creating
 * ReplicationPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReplicationPolicy  {
    @JsonProperty("checkpoint_uuid")
    private String checkpointUuid;

    @JsonProperty("replication_mode")
    private String replicationMode = "REPLICATION_MODE_CONTINUOUS";



    /**
     * This is the getter method this will return the attribute value.
     * Leader's checkpoint.
     * Follower attempt to replicate configuration till this checkpoint.
     * Field deprecated in 31.2.1.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return checkpointUuid
     */
    public String getCheckpointUuid() {
        return checkpointUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Leader's checkpoint.
     * Follower attempt to replicate configuration till this checkpoint.
     * Field deprecated in 31.2.1.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param checkpointUuid set the checkpointUuid.
     */
    public void setCheckpointUuid(String  checkpointUuid) {
        this.checkpointUuid = checkpointUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Replication mode.
     * Enum options - REPLICATION_MODE_CONTINUOUS, REPLICATION_MODE_MANUAL, REPLICATION_MODE_ADAPTIVE.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "REPLICATION_MODE_CONTINUOUS".
     * @return replicationMode
     */
    public String getReplicationMode() {
        return replicationMode;
    }

    /**
     * This is the setter method to the attribute.
     * Replication mode.
     * Enum options - REPLICATION_MODE_CONTINUOUS, REPLICATION_MODE_MANUAL, REPLICATION_MODE_ADAPTIVE.
     * Field introduced in 20.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "REPLICATION_MODE_CONTINUOUS".
     * @param replicationMode set the replicationMode.
     */
    public void setReplicationMode(String  replicationMode) {
        this.replicationMode = replicationMode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ReplicationPolicy objReplicationPolicy = (ReplicationPolicy) o;
      return   Objects.equals(this.replicationMode, objReplicationPolicy.replicationMode)&&
  Objects.equals(this.checkpointUuid, objReplicationPolicy.checkpointUuid);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ReplicationPolicy {\n");
                  sb.append("    checkpointUuid: ").append(toIndentedString(checkpointUuid)).append("\n");
                        sb.append("    replicationMode: ").append(toIndentedString(replicationMode)).append("\n");
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
