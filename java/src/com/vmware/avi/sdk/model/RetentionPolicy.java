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
 * The RetentionPolicy is a POJO class extends AviRestResource that used for creating
 * RetentionPolicy.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetentionPolicy extends AviRestResource  {
    @JsonProperty("enabled")
    private Boolean enabled = true;

    @JsonProperty("history")
    private List<RetentionSummary> history;

    @JsonProperty("name")
    private String name;

    @JsonProperty("policy")
    private PolicySpec policy;

    @JsonProperty("summary")
    private RetentionSummary summary;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Enables the policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Enables the policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }
    /**
     * This is the getter method this will return the attribute value.
     * History of previous runs.
     * Field introduced in 31.1.1.
     * Maximum of 10 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return history
     */
    public List<RetentionSummary> getHistory() {
        return history;
    }

    /**
     * This is the setter method. this will set the history
     * History of previous runs.
     * Field introduced in 31.1.1.
     * Maximum of 10 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return history
     */
    public void setHistory(List<RetentionSummary>  history) {
        this.history = history;
    }

    /**
     * This is the setter method this will set the history
     * History of previous runs.
     * Field introduced in 31.1.1.
     * Maximum of 10 items allowed.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return history
     */
    public RetentionPolicy addHistoryItem(RetentionSummary historyItem) {
      if (this.history == null) {
        this.history = new ArrayList<RetentionSummary>();
      }
      this.history.add(historyItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of the policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of the policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Policy specification.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return policy
     */
    public PolicySpec getPolicy() {
        return policy;
    }

    /**
     * This is the setter method to the attribute.
     * Policy specification.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param policy set the policy.
     */
    public void setPolicy(PolicySpec policy) {
        this.policy = policy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Details of most recent run.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @return summary
     */
    public RetentionSummary getSummary() {
        return summary;
    }

    /**
     * This is the setter method to the attribute.
     * Details of most recent run.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * @param summary set the summary.
     */
    public void setSummary(RetentionSummary summary) {
        this.summary = summary;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant uuid associated with the object.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant uuid associated with the object.
     * It is a reference to an object of type tenant.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Avi controller URL of the object.
     * @return url
     */
    public String getUrl() {
        return url;
    }

   /**
    * This is the setter method. this will set the url
    * Avi controller URL of the object.
    * @return url
    */
   public void setUrl(String  url) {
     this.url = url;
   }

    /**
     * This is the getter method this will return the attribute value.
     * Uuid identifier for the policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Uuid identifier for the policy.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uuid set the uuid.
     */
    public void setUuid(String  uuid) {
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
      RetentionPolicy objRetentionPolicy = (RetentionPolicy) o;
      return   Objects.equals(this.uuid, objRetentionPolicy.uuid)&&
  Objects.equals(this.name, objRetentionPolicy.name)&&
  Objects.equals(this.summary, objRetentionPolicy.summary)&&
  Objects.equals(this.history, objRetentionPolicy.history)&&
  Objects.equals(this.enabled, objRetentionPolicy.enabled)&&
  Objects.equals(this.policy, objRetentionPolicy.policy)&&
  Objects.equals(this.tenantRef, objRetentionPolicy.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class RetentionPolicy {\n");
                  sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    history: ").append(toIndentedString(history)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
                        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
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
