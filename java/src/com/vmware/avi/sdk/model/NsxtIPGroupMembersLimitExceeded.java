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
 * The NsxtIPGroupMembersLimitExceeded is a POJO class extends AviRestResource that used for creating
 * NsxtIPGroupMembersLimitExceeded.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NsxtIPGroupMembersLimitExceeded  {
    @JsonProperty("error_string")
    private String errorString;

    @JsonProperty("ip_address_members")
    private Integer ipAddressMembers;

    @JsonProperty("ip_group_uuid")
    private String ipGroupUuid;

    @JsonProperty("limit")
    private Integer limit;

    @JsonProperty("nsx_group_path")
    private String nsxGroupPath;



    /**
     * This is the getter method this will return the attribute value.
     * Error message.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return errorString
     */
    public String getErrorString() {
        return errorString;
    }

    /**
     * This is the setter method to the attribute.
     * Error message.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param errorString set the errorString.
     */
    public void setErrorString(String  errorString) {
        this.errorString = errorString;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of ip address members from the nsx group.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipAddressMembers
     */
    public Integer getIpAddressMembers() {
        return ipAddressMembers;
    }

    /**
     * This is the setter method to the attribute.
     * Number of ip address members from the nsx group.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipAddressMembers set the ipAddressMembers.
     */
    public void setIpAddressMembers(Integer  ipAddressMembers) {
        this.ipAddressMembers = ipAddressMembers;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Ipaddrgroup uuid that would have been updated.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return ipGroupUuid
     */
    public String getIpGroupUuid() {
        return ipGroupUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Ipaddrgroup uuid that would have been updated.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param ipGroupUuid set the ipGroupUuid.
     */
    public void setIpGroupUuid(String  ipGroupUuid) {
        this.ipGroupUuid = ipGroupUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Maximum allowed ip address members count.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This is the setter method to the attribute.
     * Maximum allowed ip address members count.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param limit set the limit.
     */
    public void setLimit(Integer  limit) {
        this.limit = limit;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Nsx group policy path.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return nsxGroupPath
     */
    public String getNsxGroupPath() {
        return nsxGroupPath;
    }

    /**
     * This is the setter method to the attribute.
     * Nsx group policy path.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param nsxGroupPath set the nsxGroupPath.
     */
    public void setNsxGroupPath(String  nsxGroupPath) {
        this.nsxGroupPath = nsxGroupPath;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      NsxtIPGroupMembersLimitExceeded objNsxtIPGroupMembersLimitExceeded = (NsxtIPGroupMembersLimitExceeded) o;
      return   Objects.equals(this.nsxGroupPath, objNsxtIPGroupMembersLimitExceeded.nsxGroupPath)&&
  Objects.equals(this.ipGroupUuid, objNsxtIPGroupMembersLimitExceeded.ipGroupUuid)&&
  Objects.equals(this.ipAddressMembers, objNsxtIPGroupMembersLimitExceeded.ipAddressMembers)&&
  Objects.equals(this.limit, objNsxtIPGroupMembersLimitExceeded.limit)&&
  Objects.equals(this.errorString, objNsxtIPGroupMembersLimitExceeded.errorString);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class NsxtIPGroupMembersLimitExceeded {\n");
                  sb.append("    errorString: ").append(toIndentedString(errorString)).append("\n");
                        sb.append("    ipAddressMembers: ").append(toIndentedString(ipAddressMembers)).append("\n");
                        sb.append("    ipGroupUuid: ").append(toIndentedString(ipGroupUuid)).append("\n");
                        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
                        sb.append("    nsxGroupPath: ").append(toIndentedString(nsxGroupPath)).append("\n");
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
