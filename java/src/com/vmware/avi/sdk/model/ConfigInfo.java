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
 * The ConfigInfo is a POJO class extends AviRestResource that used for creating
 * ConfigInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConfigInfo  {
    @JsonProperty("queue")
    private List<VersionInfo> queue = null;

    @JsonProperty("reader_count")
    private Integer readerCount = null;

    @JsonProperty("state")
    private String state = null;

    @JsonProperty("writer_count")
    private Integer writerCount = null;


    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return queue
     */
    public List<VersionInfo> getQueue() {
        return queue;
    }

    /**
     * This is the setter method. this will set the queue
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return queue
     */
    public void setQueue(List<VersionInfo>  queue) {
        this.queue = queue;
    }

    /**
     * This is the setter method this will set the queue
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return queue
     */
    public ConfigInfo addQueueItem(VersionInfo queueItem) {
      if (this.queue == null) {
        this.queue = new ArrayList<VersionInfo>();
      }
      this.queue.add(queueItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return readerCount
     */
    public Integer getReaderCount() {
        return readerCount;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param readerCount set the readerCount.
     */
    public void setReaderCount(Integer  readerCount) {
        this.readerCount = readerCount;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enum options - REPL_NONE, REPL_ENABLED, REPL_DISABLED.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Enum options - REPL_NONE, REPL_ENABLED, REPL_DISABLED.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(String  state) {
        this.state = state;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return writerCount
     */
    public Integer getWriterCount() {
        return writerCount;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param writerCount set the writerCount.
     */
    public void setWriterCount(Integer  writerCount) {
        this.writerCount = writerCount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ConfigInfo objConfigInfo = (ConfigInfo) o;
      return   Objects.equals(this.state, objConfigInfo.state)&&
  Objects.equals(this.writerCount, objConfigInfo.writerCount)&&
  Objects.equals(this.readerCount, objConfigInfo.readerCount)&&
  Objects.equals(this.queue, objConfigInfo.queue);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ConfigInfo {\n");
                  sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
                        sb.append("    readerCount: ").append(toIndentedString(readerCount)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
                        sb.append("    writerCount: ").append(toIndentedString(writerCount)).append("\n");
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
