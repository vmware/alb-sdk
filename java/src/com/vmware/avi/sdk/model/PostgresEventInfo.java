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
 * The PostgresEventInfo is a POJO class extends AviRestResource that used for creating
 * PostgresEventInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostgresEventInfo  {
    @JsonProperty("db_name")
    private String dbName;

    @JsonProperty("event_desc")
    private String eventDesc;

    @JsonProperty("timestamp")
    private String timestamp;



    /**
     * This is the getter method this will return the attribute value.
     * Name of the db.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the db.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param dbName set the dbName.
     */
    public void setDbName(String  dbName) {
        this.dbName = dbName;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Description of the event.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return eventDesc
     */
    public String getEventDesc() {
        return eventDesc;
    }

    /**
     * This is the setter method to the attribute.
     * Description of the event.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param eventDesc set the eventDesc.
     */
    public void setEventDesc(String  eventDesc) {
        this.eventDesc = eventDesc;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp at which this event occurred.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp at which this event occurred.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param timestamp set the timestamp.
     */
    public void setTimestamp(String  timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      PostgresEventInfo objPostgresEventInfo = (PostgresEventInfo) o;
      return   Objects.equals(this.dbName, objPostgresEventInfo.dbName)&&
  Objects.equals(this.eventDesc, objPostgresEventInfo.eventDesc)&&
  Objects.equals(this.timestamp, objPostgresEventInfo.timestamp);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class PostgresEventInfo {\n");
                  sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
                        sb.append("    eventDesc: ").append(toIndentedString(eventDesc)).append("\n");
                        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
