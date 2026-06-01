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
 * The PromotedLogFields is a POJO class extends AviRestResource that used for creating
 * PromotedLogFields.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PromotedLogFields  {
    @JsonProperty("app_log_fields")
    private List<String> appLogFields;

    @JsonProperty("conn_log_fields")
    private List<String> connLogFields;

    @JsonProperty("event_log_fields")
    private List<String> eventLogFields;


    /**
     * This is the getter method this will return the attribute value.
     * Dot-notation field paths to promote for applicationlog.
     * Example  'waf_log' promotes the entire submessage; 'waf_log.status' promotes only the status sub-field.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appLogFields
     */
    public List<String> getAppLogFields() {
        return appLogFields;
    }

    /**
     * This is the setter method. this will set the appLogFields
     * Dot-notation field paths to promote for applicationlog.
     * Example  'waf_log' promotes the entire submessage; 'waf_log.status' promotes only the status sub-field.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appLogFields
     */
    public void setAppLogFields(List<String>  appLogFields) {
        this.appLogFields = appLogFields;
    }

    /**
     * This is the setter method this will set the appLogFields
     * Dot-notation field paths to promote for applicationlog.
     * Example  'waf_log' promotes the entire submessage; 'waf_log.status' promotes only the status sub-field.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return appLogFields
     */
    public PromotedLogFields addAppLogFieldsItem(String appLogFieldsItem) {
      if (this.appLogFields == null) {
        this.appLogFields = new ArrayList<String>();
      }
      this.appLogFields.add(appLogFieldsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Dot-notation field paths to promote for connectionlog.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connLogFields
     */
    public List<String> getConnLogFields() {
        return connLogFields;
    }

    /**
     * This is the setter method. this will set the connLogFields
     * Dot-notation field paths to promote for connectionlog.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connLogFields
     */
    public void setConnLogFields(List<String>  connLogFields) {
        this.connLogFields = connLogFields;
    }

    /**
     * This is the setter method this will set the connLogFields
     * Dot-notation field paths to promote for connectionlog.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connLogFields
     */
    public PromotedLogFields addConnLogFieldsItem(String connLogFieldsItem) {
      if (this.connLogFields == null) {
        this.connLogFields = new ArrayList<String>();
      }
      this.connLogFields.add(connLogFieldsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Dot-notation field paths to promote for eventlog.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventLogFields
     */
    public List<String> getEventLogFields() {
        return eventLogFields;
    }

    /**
     * This is the setter method. this will set the eventLogFields
     * Dot-notation field paths to promote for eventlog.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventLogFields
     */
    public void setEventLogFields(List<String>  eventLogFields) {
        this.eventLogFields = eventLogFields;
    }

    /**
     * This is the setter method this will set the eventLogFields
     * Dot-notation field paths to promote for eventlog.
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventLogFields
     */
    public PromotedLogFields addEventLogFieldsItem(String eventLogFieldsItem) {
      if (this.eventLogFields == null) {
        this.eventLogFields = new ArrayList<String>();
      }
      this.eventLogFields.add(eventLogFieldsItem);
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
      PromotedLogFields objPromotedLogFields = (PromotedLogFields) o;
      return   Objects.equals(this.appLogFields, objPromotedLogFields.appLogFields)&&
  Objects.equals(this.connLogFields, objPromotedLogFields.connLogFields)&&
  Objects.equals(this.eventLogFields, objPromotedLogFields.eventLogFields);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PromotedLogFields {\n");
                  sb.append("    appLogFields: ").append(toIndentedString(appLogFields)).append("\n");
                        sb.append("    connLogFields: ").append(toIndentedString(connLogFields)).append("\n");
                        sb.append("    eventLogFields: ").append(toIndentedString(eventLogFields)).append("\n");
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
