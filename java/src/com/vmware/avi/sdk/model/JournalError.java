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
 * The JournalError is a POJO class extends AviRestResource that used for creating
 * JournalError.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JournalError extends AviRestResource  {
    @JsonProperty("details")
    private List<String> details;

    @JsonProperty("name")
    private String name;

    @JsonProperty("object")
    private String object;

    @JsonProperty("tenant")
    private String tenant;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("version")
    private String version;


    /**
     * This is the getter method this will return the attribute value.
     * List of error messages for this object.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return details
     */
    public List<String> getDetails() {
        return details;
    }

    /**
     * This is the setter method. this will set the details
     * List of error messages for this object.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return details
     */
    public void setDetails(List<String>  details) {
        this.details = details;
    }

    /**
     * This is the setter method this will set the details
     * List of error messages for this object.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return details
     */
    public JournalError addDetailsItem(String detailsItem) {
      if (this.details == null) {
        this.details = new ArrayList<String>();
      }
      this.details.add(detailsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the object for which error was reported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the object for which error was reported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Object type on which the error was reported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return object
     */
    public String getObject() {
        return object;
    }

    /**
     * This is the setter method to the attribute.
     * Object type on which the error was reported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param object set the object.
     */
    public void setObject(String  object) {
        this.object = object;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant for which error was reported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenant
     */
    public String getTenant() {
        return tenant;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant for which error was reported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenant set the tenant.
     */
    public void setTenant(String  tenant) {
        this.tenant = tenant;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid of the object for which error was reported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid of the object for which error was reported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
        this.uuid = uuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Version to which the migration failed.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Version to which the migration failed.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      JournalError objJournalError = (JournalError) o;
      return   Objects.equals(this.object, objJournalError.object)&&
  Objects.equals(this.uuid, objJournalError.uuid)&&
  Objects.equals(this.name, objJournalError.name)&&
  Objects.equals(this.version, objJournalError.version)&&
  Objects.equals(this.tenant, objJournalError.tenant)&&
  Objects.equals(this.details, objJournalError.details);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class JournalError {\n");
                  sb.append("    details: ").append(toIndentedString(details)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    object: ").append(toIndentedString(object)).append("\n");
                        sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
                        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
