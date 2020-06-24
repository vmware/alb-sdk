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
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * ServerAutoScalePolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-03-12T12:27:26.755+05:30[Asia/Kolkata]")
public class ServerAutoScalePolicy {
  @JsonProperty("_last_modified")
  private String _lastModified = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("intelligent_autoscale")
  private Boolean intelligentAutoscale = null;

  @JsonProperty("intelligent_scalein_margin")
  private Integer intelligentScaleinMargin = 40;

  @JsonProperty("intelligent_scaleout_margin")
  private Integer intelligentScaleoutMargin = 20;

  @JsonProperty("max_scalein_adjustment_step")
  private Integer maxScaleinAdjustmentStep = 1;

  @JsonProperty("max_scaleout_adjustment_step")
  private Integer maxScaleoutAdjustmentStep = 1;

  @JsonProperty("max_size")
  private Integer maxSize = null;

  @JsonProperty("min_size")
  private Integer minSize = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("scalein_alertconfig_refs")
  private List<String> scaleinAlertconfigRefs = null;

  @JsonProperty("scalein_cooldown")
  private Integer scaleinCooldown = 300;

  @JsonProperty("scaleout_alertconfig_refs")
  private List<String> scaleoutAlertconfigRefs = null;

  @JsonProperty("scaleout_cooldown")
  private Integer scaleoutCooldown = 300;

  @JsonProperty("tenant_ref")
  private String tenantRef = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("use_predicted_load")
  private Boolean usePredictedLoad = null;

  @JsonProperty("uuid")
  private String uuid = null;

   /**
   * UNIX time since epoch in microseconds. Units(MICROSECONDS).
   * @return _lastModified
  **/
  @Schema(description = "UNIX time since epoch in microseconds. Units(MICROSECONDS).")
  public String getLastModified() {
    return _lastModified;
  }

  public ServerAutoScalePolicy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * User defined description for the object.
   * @return description
  **/
  @Schema(description = "User defined description for the object.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServerAutoScalePolicy intelligentAutoscale(Boolean intelligentAutoscale) {
    this.intelligentAutoscale = intelligentAutoscale;
    return this;
  }

   /**
   * Use Avi intelligent autoscale algorithm where autoscale is performed by comparing load on the pool against estimated capacity of all the servers.
   * @return intelligentAutoscale
  **/
  @Schema(description = "Use Avi intelligent autoscale algorithm where autoscale is performed by comparing load on the pool against estimated capacity of all the servers.")
  public Boolean isIntelligentAutoscale() {
    return intelligentAutoscale;
  }

  public void setIntelligentAutoscale(Boolean intelligentAutoscale) {
    this.intelligentAutoscale = intelligentAutoscale;
  }

  public ServerAutoScalePolicy intelligentScaleinMargin(Integer intelligentScaleinMargin) {
    this.intelligentScaleinMargin = intelligentScaleinMargin;
    return this;
  }

   /**
   * Maximum extra capacity as percentage of load used by the intelligent scheme. Scalein is triggered when available capacity is more than this margin. Allowed values are 1-99.
   * @return intelligentScaleinMargin
  **/
  @Schema(description = "Maximum extra capacity as percentage of load used by the intelligent scheme. Scalein is triggered when available capacity is more than this margin. Allowed values are 1-99.")
  public Integer getIntelligentScaleinMargin() {
    return intelligentScaleinMargin;
  }

  public void setIntelligentScaleinMargin(Integer intelligentScaleinMargin) {
    this.intelligentScaleinMargin = intelligentScaleinMargin;
  }

  public ServerAutoScalePolicy intelligentScaleoutMargin(Integer intelligentScaleoutMargin) {
    this.intelligentScaleoutMargin = intelligentScaleoutMargin;
    return this;
  }

   /**
   * Minimum extra capacity as percentage of load used by the intelligent scheme. Scaleout is triggered when available capacity is less than this margin. Allowed values are 1-99.
   * @return intelligentScaleoutMargin
  **/
  @Schema(description = "Minimum extra capacity as percentage of load used by the intelligent scheme. Scaleout is triggered when available capacity is less than this margin. Allowed values are 1-99.")
  public Integer getIntelligentScaleoutMargin() {
    return intelligentScaleoutMargin;
  }

  public void setIntelligentScaleoutMargin(Integer intelligentScaleoutMargin) {
    this.intelligentScaleoutMargin = intelligentScaleoutMargin;
  }

  public ServerAutoScalePolicy maxScaleinAdjustmentStep(Integer maxScaleinAdjustmentStep) {
    this.maxScaleinAdjustmentStep = maxScaleinAdjustmentStep;
    return this;
  }

   /**
   * Maximum number of servers to scalein simultaneously. The actual number of servers to scalein is chosen such that target number of servers is always more than or equal to the min_size.
   * @return maxScaleinAdjustmentStep
  **/
  @Schema(description = "Maximum number of servers to scalein simultaneously. The actual number of servers to scalein is chosen such that target number of servers is always more than or equal to the min_size.")
  public Integer getMaxScaleinAdjustmentStep() {
    return maxScaleinAdjustmentStep;
  }

  public void setMaxScaleinAdjustmentStep(Integer maxScaleinAdjustmentStep) {
    this.maxScaleinAdjustmentStep = maxScaleinAdjustmentStep;
  }

  public ServerAutoScalePolicy maxScaleoutAdjustmentStep(Integer maxScaleoutAdjustmentStep) {
    this.maxScaleoutAdjustmentStep = maxScaleoutAdjustmentStep;
    return this;
  }

   /**
   * Maximum number of servers to scaleout simultaneously. The actual number of servers to scaleout is chosen such that target number of servers is always less than or equal to the max_size.
   * @return maxScaleoutAdjustmentStep
  **/
  @Schema(description = "Maximum number of servers to scaleout simultaneously. The actual number of servers to scaleout is chosen such that target number of servers is always less than or equal to the max_size.")
  public Integer getMaxScaleoutAdjustmentStep() {
    return maxScaleoutAdjustmentStep;
  }

  public void setMaxScaleoutAdjustmentStep(Integer maxScaleoutAdjustmentStep) {
    this.maxScaleoutAdjustmentStep = maxScaleoutAdjustmentStep;
  }

  public ServerAutoScalePolicy maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * Maximum number of servers after scaleout. Allowed values are 0-400.
   * @return maxSize
  **/
  @Schema(description = "Maximum number of servers after scaleout. Allowed values are 0-400.")
  public Integer getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  public ServerAutoScalePolicy minSize(Integer minSize) {
    this.minSize = minSize;
    return this;
  }

   /**
   * No scale-in happens once number of operationally up servers reach min_servers. Allowed values are 0-400.
   * @return minSize
  **/
  @Schema(description = "No scale-in happens once number of operationally up servers reach min_servers. Allowed values are 0-400.")
  public Integer getMinSize() {
    return minSize;
  }

  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }

  public ServerAutoScalePolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the object.
   * @return name
  **/
  @Schema(required = true, description = "Name of the object.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServerAutoScalePolicy scaleinAlertconfigRefs(List<String> scaleinAlertconfigRefs) {
    this.scaleinAlertconfigRefs = scaleinAlertconfigRefs;
    return this;
  }

  public ServerAutoScalePolicy addScaleinAlertconfigRefsItem(String scaleinAlertconfigRefsItem) {
    if (this.scaleinAlertconfigRefs == null) {
      this.scaleinAlertconfigRefs = new ArrayList<String>();
    }
    this.scaleinAlertconfigRefs.add(scaleinAlertconfigRefsItem);
    return this;
  }

   /**
   * Trigger scalein when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.
   * @return scaleinAlertconfigRefs
  **/
  @Schema(description = "Trigger scalein when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.")
  public List<String> getScaleinAlertconfigRefs() {
    return scaleinAlertconfigRefs;
  }

  public void setScaleinAlertconfigRefs(List<String> scaleinAlertconfigRefs) {
    this.scaleinAlertconfigRefs = scaleinAlertconfigRefs;
  }

  public ServerAutoScalePolicy scaleinCooldown(Integer scaleinCooldown) {
    this.scaleinCooldown = scaleinCooldown;
    return this;
  }

   /**
   * Cooldown period during which no new scalein is triggered to allow previous scalein to successfully complete.
   * @return scaleinCooldown
  **/
  @Schema(description = "Cooldown period during which no new scalein is triggered to allow previous scalein to successfully complete.")
  public Integer getScaleinCooldown() {
    return scaleinCooldown;
  }

  public void setScaleinCooldown(Integer scaleinCooldown) {
    this.scaleinCooldown = scaleinCooldown;
  }

  public ServerAutoScalePolicy scaleoutAlertconfigRefs(List<String> scaleoutAlertconfigRefs) {
    this.scaleoutAlertconfigRefs = scaleoutAlertconfigRefs;
    return this;
  }

  public ServerAutoScalePolicy addScaleoutAlertconfigRefsItem(String scaleoutAlertconfigRefsItem) {
    if (this.scaleoutAlertconfigRefs == null) {
      this.scaleoutAlertconfigRefs = new ArrayList<String>();
    }
    this.scaleoutAlertconfigRefs.add(scaleoutAlertconfigRefsItem);
    return this;
  }

   /**
   * Trigger scaleout when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.
   * @return scaleoutAlertconfigRefs
  **/
  @Schema(description = "Trigger scaleout when alerts due to any of these Alert configurations are raised. It is a reference to an object of type AlertConfig.")
  public List<String> getScaleoutAlertconfigRefs() {
    return scaleoutAlertconfigRefs;
  }

  public void setScaleoutAlertconfigRefs(List<String> scaleoutAlertconfigRefs) {
    this.scaleoutAlertconfigRefs = scaleoutAlertconfigRefs;
  }

  public ServerAutoScalePolicy scaleoutCooldown(Integer scaleoutCooldown) {
    this.scaleoutCooldown = scaleoutCooldown;
    return this;
  }

   /**
   * Cooldown period during which no new scaleout is triggered to allow previous scaleout to successfully complete.
   * @return scaleoutCooldown
  **/
  @Schema(description = "Cooldown period during which no new scaleout is triggered to allow previous scaleout to successfully complete.")
  public Integer getScaleoutCooldown() {
    return scaleoutCooldown;
  }

  public void setScaleoutCooldown(Integer scaleoutCooldown) {
    this.scaleoutCooldown = scaleoutCooldown;
  }

  public ServerAutoScalePolicy tenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
    return this;
  }

   /**
   *  It is a reference to an object of type Tenant.
   * @return tenantRef
  **/
  @Schema(description = " It is a reference to an object of type Tenant.")
  public String getTenantRef() {
    return tenantRef;
  }

  public void setTenantRef(String tenantRef) {
    this.tenantRef = tenantRef;
  }

   /**
   * url
   * @return url
  **/
  @Schema(description = "url")
  public String getUrl() {
    return url;
  }

  public ServerAutoScalePolicy usePredictedLoad(Boolean usePredictedLoad) {
    this.usePredictedLoad = usePredictedLoad;
    return this;
  }

   /**
   * Use predicted load rather than current load.
   * @return usePredictedLoad
  **/
  @Schema(description = "Use predicted load rather than current load.")
  public Boolean isUsePredictedLoad() {
    return usePredictedLoad;
  }

  public void setUsePredictedLoad(Boolean usePredictedLoad) {
    this.usePredictedLoad = usePredictedLoad;
  }

  public ServerAutoScalePolicy uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Unique object identifier of the object.
   * @return uuid
  **/
  @Schema(description = "Unique object identifier of the object.")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerAutoScalePolicy serverAutoScalePolicy = (ServerAutoScalePolicy) o;
    return Objects.equals(this._lastModified, serverAutoScalePolicy._lastModified) &&
        Objects.equals(this.description, serverAutoScalePolicy.description) &&
        Objects.equals(this.intelligentAutoscale, serverAutoScalePolicy.intelligentAutoscale) &&
        Objects.equals(this.intelligentScaleinMargin, serverAutoScalePolicy.intelligentScaleinMargin) &&
        Objects.equals(this.intelligentScaleoutMargin, serverAutoScalePolicy.intelligentScaleoutMargin) &&
        Objects.equals(this.maxScaleinAdjustmentStep, serverAutoScalePolicy.maxScaleinAdjustmentStep) &&
        Objects.equals(this.maxScaleoutAdjustmentStep, serverAutoScalePolicy.maxScaleoutAdjustmentStep) &&
        Objects.equals(this.maxSize, serverAutoScalePolicy.maxSize) &&
        Objects.equals(this.minSize, serverAutoScalePolicy.minSize) &&
        Objects.equals(this.name, serverAutoScalePolicy.name) &&
        Objects.equals(this.scaleinAlertconfigRefs, serverAutoScalePolicy.scaleinAlertconfigRefs) &&
        Objects.equals(this.scaleinCooldown, serverAutoScalePolicy.scaleinCooldown) &&
        Objects.equals(this.scaleoutAlertconfigRefs, serverAutoScalePolicy.scaleoutAlertconfigRefs) &&
        Objects.equals(this.scaleoutCooldown, serverAutoScalePolicy.scaleoutCooldown) &&
        Objects.equals(this.tenantRef, serverAutoScalePolicy.tenantRef) &&
        Objects.equals(this.url, serverAutoScalePolicy.url) &&
        Objects.equals(this.usePredictedLoad, serverAutoScalePolicy.usePredictedLoad) &&
        Objects.equals(this.uuid, serverAutoScalePolicy.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_lastModified, description, intelligentAutoscale, intelligentScaleinMargin, intelligentScaleoutMargin, maxScaleinAdjustmentStep, maxScaleoutAdjustmentStep, maxSize, minSize, name, scaleinAlertconfigRefs, scaleinCooldown, scaleoutAlertconfigRefs, scaleoutCooldown, tenantRef, url, usePredictedLoad, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerAutoScalePolicy {\n");
    
    sb.append("    _lastModified: ").append(toIndentedString(_lastModified)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    intelligentAutoscale: ").append(toIndentedString(intelligentAutoscale)).append("\n");
    sb.append("    intelligentScaleinMargin: ").append(toIndentedString(intelligentScaleinMargin)).append("\n");
    sb.append("    intelligentScaleoutMargin: ").append(toIndentedString(intelligentScaleoutMargin)).append("\n");
    sb.append("    maxScaleinAdjustmentStep: ").append(toIndentedString(maxScaleinAdjustmentStep)).append("\n");
    sb.append("    maxScaleoutAdjustmentStep: ").append(toIndentedString(maxScaleoutAdjustmentStep)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scaleinAlertconfigRefs: ").append(toIndentedString(scaleinAlertconfigRefs)).append("\n");
    sb.append("    scaleinCooldown: ").append(toIndentedString(scaleinCooldown)).append("\n");
    sb.append("    scaleoutAlertconfigRefs: ").append(toIndentedString(scaleoutAlertconfigRefs)).append("\n");
    sb.append("    scaleoutCooldown: ").append(toIndentedString(scaleoutCooldown)).append("\n");
    sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    usePredictedLoad: ").append(toIndentedString(usePredictedLoad)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
