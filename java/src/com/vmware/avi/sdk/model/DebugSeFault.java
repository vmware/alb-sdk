/*
 * Avi avi_global_spec Object API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 20.1.1
 * Contact: support@avinetworks.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.avi.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.vmware.avi.sdk.model.SeFault;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * DebugSeFault
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class DebugSeFault {
  @JsonProperty("faults")
  private List<SeFault> faults = null;

  @JsonProperty("se_malloc_fail_frequency")
  private Integer seMallocFailFrequency = null;

  @JsonProperty("se_malloc_fail_type")
  private Integer seMallocFailType = null;

  @JsonProperty("se_mbuf_cl_sanity")
  private Boolean seMbufClSanity = null;

  @JsonProperty("se_shm_malloc_fail_frequency")
  private Integer seShmMallocFailFrequency = null;

  @JsonProperty("se_shm_malloc_fail_type")
  private Integer seShmMallocFailType = null;

  @JsonProperty("se_waf_alloc_fail_frequency")
  private Integer seWafAllocFailFrequency = null;

  @JsonProperty("se_waf_learning_alloc_fail_frequency")
  private Integer seWafLearningAllocFailFrequency = null;

  public DebugSeFault faults(List<SeFault> faults) {
    this.faults = faults;
    return this;
  }

  public DebugSeFault addFaultsItem(SeFault faultsItem) {
    if (this.faults == null) {
      this.faults = new ArrayList<SeFault>();
    }
    this.faults.add(faultsItem);
    return this;
  }

   /**
   * Set of faults to enable/disable. Field introduced in 20.1.1.
   * @return faults
  **/
  @Schema(description = "Set of faults to enable/disable. Field introduced in 20.1.1.")
  public List<SeFault> getFaults() {
    return faults;
  }

  public void setFaults(List<SeFault> faults) {
    this.faults = faults;
  }

  public DebugSeFault seMallocFailFrequency(Integer seMallocFailFrequency) {
    this.seMallocFailFrequency = seMallocFailFrequency;
    return this;
  }

   /**
   * Fail SE malloc type at this frequency. Field introduced in 18.1.2.
   * @return seMallocFailFrequency
  **/
  @Schema(description = "Fail SE malloc type at this frequency. Field introduced in 18.1.2.")
  public Integer getSeMallocFailFrequency() {
    return seMallocFailFrequency;
  }

  public void setSeMallocFailFrequency(Integer seMallocFailFrequency) {
    this.seMallocFailFrequency = seMallocFailFrequency;
  }

  public DebugSeFault seMallocFailType(Integer seMallocFailType) {
    this.seMallocFailType = seMallocFailType;
    return this;
  }

   /**
   * Fail this SE malloc type. Field introduced in 18.1.2.
   * @return seMallocFailType
  **/
  @Schema(description = "Fail this SE malloc type. Field introduced in 18.1.2.")
  public Integer getSeMallocFailType() {
    return seMallocFailType;
  }

  public void setSeMallocFailType(Integer seMallocFailType) {
    this.seMallocFailType = seMallocFailType;
  }

  public DebugSeFault seMbufClSanity(Boolean seMbufClSanity) {
    this.seMbufClSanity = seMbufClSanity;
    return this;
  }

   /**
   * Toggle assert on mbuf cluster sanity check fail. Field introduced in 17.2.13,18.1.3,18.2.1.
   * @return seMbufClSanity
  **/
  @Schema(description = "Toggle assert on mbuf cluster sanity check fail. Field introduced in 17.2.13,18.1.3,18.2.1.")
  public Boolean isSeMbufClSanity() {
    return seMbufClSanity;
  }

  public void setSeMbufClSanity(Boolean seMbufClSanity) {
    this.seMbufClSanity = seMbufClSanity;
  }

  public DebugSeFault seShmMallocFailFrequency(Integer seShmMallocFailFrequency) {
    this.seShmMallocFailFrequency = seShmMallocFailFrequency;
    return this;
  }

   /**
   * Fail SE SHM malloc type at this frequency. Field introduced in 18.1.2.
   * @return seShmMallocFailFrequency
  **/
  @Schema(description = "Fail SE SHM malloc type at this frequency. Field introduced in 18.1.2.")
  public Integer getSeShmMallocFailFrequency() {
    return seShmMallocFailFrequency;
  }

  public void setSeShmMallocFailFrequency(Integer seShmMallocFailFrequency) {
    this.seShmMallocFailFrequency = seShmMallocFailFrequency;
  }

  public DebugSeFault seShmMallocFailType(Integer seShmMallocFailType) {
    this.seShmMallocFailType = seShmMallocFailType;
    return this;
  }

   /**
   * Fail this SE SHM malloc type. Field introduced in 18.1.2.
   * @return seShmMallocFailType
  **/
  @Schema(description = "Fail this SE SHM malloc type. Field introduced in 18.1.2.")
  public Integer getSeShmMallocFailType() {
    return seShmMallocFailType;
  }

  public void setSeShmMallocFailType(Integer seShmMallocFailType) {
    this.seShmMallocFailType = seShmMallocFailType;
  }

  public DebugSeFault seWafAllocFailFrequency(Integer seWafAllocFailFrequency) {
    this.seWafAllocFailFrequency = seWafAllocFailFrequency;
    return this;
  }

   /**
   * Fail SE WAF allocation at this frequency. Field introduced in 18.1.2.
   * @return seWafAllocFailFrequency
  **/
  @Schema(description = "Fail SE WAF allocation at this frequency. Field introduced in 18.1.2.")
  public Integer getSeWafAllocFailFrequency() {
    return seWafAllocFailFrequency;
  }

  public void setSeWafAllocFailFrequency(Integer seWafAllocFailFrequency) {
    this.seWafAllocFailFrequency = seWafAllocFailFrequency;
  }

  public DebugSeFault seWafLearningAllocFailFrequency(Integer seWafLearningAllocFailFrequency) {
    this.seWafLearningAllocFailFrequency = seWafLearningAllocFailFrequency;
    return this;
  }

   /**
   * Fail SE WAF learning allocation at this frequency. Field introduced in 18.1.2.
   * @return seWafLearningAllocFailFrequency
  **/
  @Schema(description = "Fail SE WAF learning allocation at this frequency. Field introduced in 18.1.2.")
  public Integer getSeWafLearningAllocFailFrequency() {
    return seWafLearningAllocFailFrequency;
  }

  public void setSeWafLearningAllocFailFrequency(Integer seWafLearningAllocFailFrequency) {
    this.seWafLearningAllocFailFrequency = seWafLearningAllocFailFrequency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebugSeFault debugSeFault = (DebugSeFault) o;
    return Objects.equals(this.faults, debugSeFault.faults) &&
        Objects.equals(this.seMallocFailFrequency, debugSeFault.seMallocFailFrequency) &&
        Objects.equals(this.seMallocFailType, debugSeFault.seMallocFailType) &&
        Objects.equals(this.seMbufClSanity, debugSeFault.seMbufClSanity) &&
        Objects.equals(this.seShmMallocFailFrequency, debugSeFault.seShmMallocFailFrequency) &&
        Objects.equals(this.seShmMallocFailType, debugSeFault.seShmMallocFailType) &&
        Objects.equals(this.seWafAllocFailFrequency, debugSeFault.seWafAllocFailFrequency) &&
        Objects.equals(this.seWafLearningAllocFailFrequency, debugSeFault.seWafLearningAllocFailFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faults, seMallocFailFrequency, seMallocFailType, seMbufClSanity, seShmMallocFailFrequency, seShmMallocFailType, seWafAllocFailFrequency, seWafLearningAllocFailFrequency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebugSeFault {\n");
    
    sb.append("    faults: ").append(toIndentedString(faults)).append("\n");
    sb.append("    seMallocFailFrequency: ").append(toIndentedString(seMallocFailFrequency)).append("\n");
    sb.append("    seMallocFailType: ").append(toIndentedString(seMallocFailType)).append("\n");
    sb.append("    seMbufClSanity: ").append(toIndentedString(seMbufClSanity)).append("\n");
    sb.append("    seShmMallocFailFrequency: ").append(toIndentedString(seShmMallocFailFrequency)).append("\n");
    sb.append("    seShmMallocFailType: ").append(toIndentedString(seShmMallocFailType)).append("\n");
    sb.append("    seWafAllocFailFrequency: ").append(toIndentedString(seWafAllocFailFrequency)).append("\n");
    sb.append("    seWafLearningAllocFailFrequency: ").append(toIndentedString(seWafLearningAllocFailFrequency)).append("\n");
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
