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
 * The DebugServiceEngineSustainedCpuSpike is a POJO class extends AviRestResource that used for creating
 * DebugServiceEngineSustainedCpuSpike.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DebugServiceEngineSustainedCpuSpike  {
    @JsonProperty("cpu_filter")
    private String cpuFilter;

    @JsonProperty("cpu_spike_percent")
    private Integer cpuSpikePercent;

    @JsonProperty("dis_enable")
    private Boolean disEnable = false;

    @JsonProperty("manual_start")
    private Boolean manualStart;

    @JsonProperty("pids")
    private List<Integer> pids;

    @JsonProperty("process_names")
    private List<String> processNames;

    @JsonProperty("sample_cooldown")
    private Integer sampleCooldown;

    @JsonProperty("sample_duration")
    private Integer sampleDuration;

    @JsonProperty("spike_duration")
    private Integer spikeDuration;



    /**
     * This is the getter method this will return the attribute value.
     * Cpu(s) filter for which high load will trigger debug data collection.
     * Should be comma seperated with no space ( eg  0,1,4 ).
     * Ranges can be given ( eg  2,4-6 ).
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cpuFilter
     */
    public String getCpuFilter() {
        return cpuFilter;
    }

    /**
     * This is the setter method to the attribute.
     * Cpu(s) filter for which high load will trigger debug data collection.
     * Should be comma seperated with no space ( eg  0,1,4 ).
     * Ranges can be given ( eg  2,4-6 ).
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cpuFilter set the cpuFilter.
     */
    public void setCpuFilter(String  cpuFilter) {
        this.cpuFilter = cpuFilter;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Average percent usage of cpu ( either total and/or percpu ) to be considered for cpu to be under high load.
     * Allowed values are 0-100.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return cpuSpikePercent
     */
    public Integer getCpuSpikePercent() {
        return cpuSpikePercent;
    }

    /**
     * This is the setter method to the attribute.
     * Average percent usage of cpu ( either total and/or percpu ) to be considered for cpu to be under high load.
     * Allowed values are 0-100.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param cpuSpikePercent set the cpuSpikePercent.
     */
    public void setCpuSpikePercent(Integer  cpuSpikePercent) {
        this.cpuSpikePercent = cpuSpikePercent;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Toggle high cpu trigger action.
     * Set to true, to dis-enable high cpu data collection script invocation.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disEnable
     */
    public Boolean getDisEnable() {
        return disEnable;
    }

    /**
     * This is the setter method to the attribute.
     * Toggle high cpu trigger action.
     * Set to true, to dis-enable high cpu data collection script invocation.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disEnable set the disEnable.
     */
    public void setDisEnable(Boolean  disEnable) {
        this.disEnable = disEnable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Invokes high cpu data collection on se for duration of an hour.
     * Alert  operator will have to manually dis-enable this and manage se disk-space!.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return manualStart
     */
    public Boolean getManualStart() {
        return manualStart;
    }

    /**
     * This is the setter method to the attribute.
     * Invokes high cpu data collection on se for duration of an hour.
     * Alert  operator will have to manually dis-enable this and manage se disk-space!.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param manualStart set the manualStart.
     */
    public void setManualStart(Boolean  manualStart) {
        this.manualStart = manualStart;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of process' pid(s) for which debug data should be recorded.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pids
     */
    public List<Integer> getPids() {
        return pids;
    }

    /**
     * This is the setter method. this will set the pids
     * List of process' pid(s) for which debug data should be recorded.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pids
     */
    public void setPids(List<Integer>  pids) {
        this.pids = pids;
    }

    /**
     * This is the setter method this will set the pids
     * List of process' pid(s) for which debug data should be recorded.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pids
     */
    public DebugServiceEngineSustainedCpuSpike addPidsItem(Integer pidsItem) {
      if (this.pids == null) {
        this.pids = new ArrayList<Integer>();
      }
      this.pids.add(pidsItem);
      return this;
    }
    /**
     * This is the getter method this will return the attribute value.
     * List of process' name(s) for which debug data should be recorded.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return processNames
     */
    public List<String> getProcessNames() {
        return processNames;
    }

    /**
     * This is the setter method. this will set the processNames
     * List of process' name(s) for which debug data should be recorded.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return processNames
     */
    public void setProcessNames(List<String>  processNames) {
        this.processNames = processNames;
    }

    /**
     * This is the setter method this will set the processNames
     * List of process' name(s) for which debug data should be recorded.
     * Field introduced in 31.1.2.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return processNames
     */
    public DebugServiceEngineSustainedCpuSpike addProcessNamesItem(String processNamesItem) {
      if (this.processNames == null) {
        this.processNames = new ArrayList<String>();
      }
      this.processNames.add(processNamesItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Interval between each such script invocation.
     * Should be >= 60.
     * Allowed values are 60-864000.
     * Field introduced in 31.1.2.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sampleCooldown
     */
    public Integer getSampleCooldown() {
        return sampleCooldown;
    }

    /**
     * This is the setter method to the attribute.
     * Interval between each such script invocation.
     * Should be >= 60.
     * Allowed values are 60-864000.
     * Field introduced in 31.1.2.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sampleCooldown set the sampleCooldown.
     */
    public void setSampleCooldown(Integer  sampleCooldown) {
        this.sampleCooldown = sampleCooldown;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Duration of debug data to be collected.
     * Should be >= 11.
     * Allowed values are 11-864000.
     * Field introduced in 31.1.2.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sampleDuration
     */
    public Integer getSampleDuration() {
        return sampleDuration;
    }

    /**
     * This is the setter method to the attribute.
     * Duration of debug data to be collected.
     * Should be >= 11.
     * Allowed values are 11-864000.
     * Field introduced in 31.1.2.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sampleDuration set the sampleDuration.
     */
    public void setSampleDuration(Integer  sampleDuration) {
        this.sampleDuration = sampleDuration;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Time duration ( in seconds ) to be considered for cpu to be consistently under high load.
     * Should be >= 60s.
     * Cpu usage data is collected every 5s.
     * Allowed values are 60-864000.
     * Field introduced in 31.1.2.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return spikeDuration
     */
    public Integer getSpikeDuration() {
        return spikeDuration;
    }

    /**
     * This is the setter method to the attribute.
     * Time duration ( in seconds ) to be considered for cpu to be consistently under high load.
     * Should be >= 60s.
     * Cpu usage data is collected every 5s.
     * Allowed values are 60-864000.
     * Field introduced in 31.1.2.
     * Unit is sec.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param spikeDuration set the spikeDuration.
     */
    public void setSpikeDuration(Integer  spikeDuration) {
        this.spikeDuration = spikeDuration;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      DebugServiceEngineSustainedCpuSpike objDebugServiceEngineSustainedCpuSpike = (DebugServiceEngineSustainedCpuSpike) o;
      return   Objects.equals(this.spikeDuration, objDebugServiceEngineSustainedCpuSpike.spikeDuration)&&
  Objects.equals(this.cpuSpikePercent, objDebugServiceEngineSustainedCpuSpike.cpuSpikePercent)&&
  Objects.equals(this.sampleDuration, objDebugServiceEngineSustainedCpuSpike.sampleDuration)&&
  Objects.equals(this.sampleCooldown, objDebugServiceEngineSustainedCpuSpike.sampleCooldown)&&
  Objects.equals(this.processNames, objDebugServiceEngineSustainedCpuSpike.processNames)&&
  Objects.equals(this.pids, objDebugServiceEngineSustainedCpuSpike.pids)&&
  Objects.equals(this.cpuFilter, objDebugServiceEngineSustainedCpuSpike.cpuFilter)&&
  Objects.equals(this.disEnable, objDebugServiceEngineSustainedCpuSpike.disEnable)&&
  Objects.equals(this.manualStart, objDebugServiceEngineSustainedCpuSpike.manualStart);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class DebugServiceEngineSustainedCpuSpike {\n");
                  sb.append("    cpuFilter: ").append(toIndentedString(cpuFilter)).append("\n");
                        sb.append("    cpuSpikePercent: ").append(toIndentedString(cpuSpikePercent)).append("\n");
                        sb.append("    disEnable: ").append(toIndentedString(disEnable)).append("\n");
                        sb.append("    manualStart: ").append(toIndentedString(manualStart)).append("\n");
                        sb.append("    pids: ").append(toIndentedString(pids)).append("\n");
                        sb.append("    processNames: ").append(toIndentedString(processNames)).append("\n");
                        sb.append("    sampleCooldown: ").append(toIndentedString(sampleCooldown)).append("\n");
                        sb.append("    sampleDuration: ").append(toIndentedString(sampleDuration)).append("\n");
                        sb.append("    spikeDuration: ").append(toIndentedString(spikeDuration)).append("\n");
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
