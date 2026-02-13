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
 * The ServiceEngineParams is a POJO class extends AviRestResource that used for creating
 * ServiceEngineParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceEngineParams  {
    @JsonProperty("concurrent_segroup_upgrades")
    private Integer concurrentSegroupUpgrades = 8;

    @JsonProperty("image_data_transfer_size")
    private Integer imageDataTransferSize = 512;

    @JsonProperty("large_se_connect_timeout")
    private Integer largeSeConnectTimeout = 1200;

    @JsonProperty("se_connect_timeout")
    private Integer seConnectTimeout = 600;

    @JsonProperty("simultaneous_image_downloads")
    private Integer simultaneousImageDownloads = 5;

    @JsonProperty("task_base_timeout")
    private Integer taskBaseTimeout = 300;



    /**
     * This is the getter method this will return the attribute value.
     * This parameter is used to control the number of concurrent segroup upgrades.
     * This field value takes affect upon controller warm reboot.
     * The value is modified based on flavor size of controller.
     * Allowed values are 1-24.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @return concurrentSegroupUpgrades
     */
    public Integer getConcurrentSegroupUpgrades() {
        return concurrentSegroupUpgrades;
    }

    /**
     * This is the setter method to the attribute.
     * This parameter is used to control the number of concurrent segroup upgrades.
     * This field value takes affect upon controller warm reboot.
     * The value is modified based on flavor size of controller.
     * Allowed values are 1-24.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 8.
     * @param concurrentSegroupUpgrades set the concurrentSegroupUpgrades.
     */
    public void setConcurrentSegroupUpgrades(Integer  concurrentSegroupUpgrades) {
        this.concurrentSegroupUpgrades = concurrentSegroupUpgrades;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This parameter defines the buffer size during serviceengine image downloads in a serviceenginegroup.it is used to pace the serviceengine upgrade
     * package downloads so that controller network/cpu/memory bandwidth is a bounded operation.
     * It generally specifies the buffer size used for data transfer.
     * Allowed values are 64-2048.
     * Field introduced in 31.1.1.
     * Unit is kb.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 512.
     * @return imageDataTransferSize
     */
    public Integer getImageDataTransferSize() {
        return imageDataTransferSize;
    }

    /**
     * This is the setter method to the attribute.
     * This parameter defines the buffer size during serviceengine image downloads in a serviceenginegroup.it is used to pace the serviceengine upgrade
     * package downloads so that controller network/cpu/memory bandwidth is a bounded operation.
     * It generally specifies the buffer size used for data transfer.
     * Allowed values are 64-2048.
     * Field introduced in 31.1.1.
     * Unit is kb.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 512.
     * @param imageDataTransferSize set the imageDataTransferSize.
     */
    public void setImageDataTransferSize(Integer  imageDataTransferSize) {
        this.imageDataTransferSize = imageDataTransferSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Amount of time controller waits for a large-sized se (>=128gb memory)to reconnect after it is rebooted during upgrade.
     * Allowed values are 1200-2400.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1200.
     * @return largeSeConnectTimeout
     */
    public Integer getLargeSeConnectTimeout() {
        return largeSeConnectTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Amount of time controller waits for a large-sized se (>=128gb memory)to reconnect after it is rebooted during upgrade.
     * Allowed values are 1200-2400.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 1200.
     * @param largeSeConnectTimeout set the largeSeConnectTimeout.
     */
    public void setLargeSeConnectTimeout(Integer  largeSeConnectTimeout) {
        this.largeSeConnectTimeout = largeSeConnectTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Amount of time controller waits for a regular-sized se (<128gb memory)to reconnect after it is rebooted during upgrade.
     * Allowed values are 600-1200.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 600.
     * @return seConnectTimeout
     */
    public Integer getSeConnectTimeout() {
        return seConnectTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Amount of time controller waits for a regular-sized se (<128gb memory)to reconnect after it is rebooted during upgrade.
     * Allowed values are 600-1200.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 600.
     * @param seConnectTimeout set the seConnectTimeout.
     */
    public void setSeConnectTimeout(Integer  seConnectTimeout) {
        this.seConnectTimeout = seConnectTimeout;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Number of simultaneous serviceengine image downloads in a serviceenginegroup.
     * It is used to pace serviceengine upgrade package downloads so that controller network/cpu bandwidth is a bounded operation.
     * Allowed values are 1-20.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @return simultaneousImageDownloads
     */
    public Integer getSimultaneousImageDownloads() {
        return simultaneousImageDownloads;
    }

    /**
     * This is the setter method to the attribute.
     * Number of simultaneous serviceengine image downloads in a serviceenginegroup.
     * It is used to pace serviceengine upgrade package downloads so that controller network/cpu bandwidth is a bounded operation.
     * Allowed values are 1-20.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 5.
     * @param simultaneousImageDownloads set the simultaneousImageDownloads.
     */
    public void setSimultaneousImageDownloads(Integer  simultaneousImageDownloads) {
        this.simultaneousImageDownloads = simultaneousImageDownloads;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Base timeout value for all service engine upgrade operation tasks.
     * The timeout for certain tasks is a multiple of this field.
     * For example, in the copyandinstallimage task, the serviceengine has a maximum wait time to install an image or package, i.e., timeout = [scaling
     * factor] * task_base_timeout.
     * Allowed values are 300-3600.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @return taskBaseTimeout
     */
    public Integer getTaskBaseTimeout() {
        return taskBaseTimeout;
    }

    /**
     * This is the setter method to the attribute.
     * Base timeout value for all service engine upgrade operation tasks.
     * The timeout for certain tasks is a multiple of this field.
     * For example, in the copyandinstallimage task, the serviceengine has a maximum wait time to install an image or package, i.e., timeout = [scaling
     * factor] * task_base_timeout.
     * Allowed values are 300-3600.
     * Field introduced in 31.1.1.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 300.
     * @param taskBaseTimeout set the taskBaseTimeout.
     */
    public void setTaskBaseTimeout(Integer  taskBaseTimeout) {
        this.taskBaseTimeout = taskBaseTimeout;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ServiceEngineParams objServiceEngineParams = (ServiceEngineParams) o;
      return   Objects.equals(this.taskBaseTimeout, objServiceEngineParams.taskBaseTimeout)&&
  Objects.equals(this.simultaneousImageDownloads, objServiceEngineParams.simultaneousImageDownloads)&&
  Objects.equals(this.imageDataTransferSize, objServiceEngineParams.imageDataTransferSize)&&
  Objects.equals(this.concurrentSegroupUpgrades, objServiceEngineParams.concurrentSegroupUpgrades)&&
  Objects.equals(this.seConnectTimeout, objServiceEngineParams.seConnectTimeout)&&
  Objects.equals(this.largeSeConnectTimeout, objServiceEngineParams.largeSeConnectTimeout);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ServiceEngineParams {\n");
                  sb.append("    concurrentSegroupUpgrades: ").append(toIndentedString(concurrentSegroupUpgrades)).append("\n");
                        sb.append("    imageDataTransferSize: ").append(toIndentedString(imageDataTransferSize)).append("\n");
                        sb.append("    largeSeConnectTimeout: ").append(toIndentedString(largeSeConnectTimeout)).append("\n");
                        sb.append("    seConnectTimeout: ").append(toIndentedString(seConnectTimeout)).append("\n");
                        sb.append("    simultaneousImageDownloads: ").append(toIndentedString(simultaneousImageDownloads)).append("\n");
                        sb.append("    taskBaseTimeout: ").append(toIndentedString(taskBaseTimeout)).append("\n");
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
