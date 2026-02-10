/*
 * Copyright 2021 VMware, Inc.
 * SPDX-License-Identifier: Apache License 2.0
 */

package com.vmware.avi.sdk.model;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * The SaasLicensingStatus is a POJO class extends AviRestResource that used for creating
 * SaasLicensingStatus.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaasLicensingStatus  {
    @JsonIgnore
    private Boolean connected;

    @JsonProperty("enabled")
    private Boolean enabled;

    @JsonProperty("expired")
    private Boolean expired;

    @JsonProperty("last_refreshed_at")
    private String lastRefreshedAt;

    @JsonProperty("message")
    private String message;

    @JsonProperty("name")
    private String name;

    @JsonProperty("pool")
    private LicensePool pool;

    @JsonIgnore
    private String publicKey;

    @JsonProperty("refresh_status")
    private Boolean refreshStatus;

    @JsonProperty("refreshed_at")
    private String refreshedAt;

    @JsonProperty("reserve_service_units")
    private Float reserveServiceUnits;

    @JsonProperty("state")
    private String state;



    /**
     * This is the getter method this will return the attribute value.
     * Portal connectivity status.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return connected
     */
    public Boolean getConnected() {
        return connected;
    }

    /**
     * This is the setter method to the attribute.
     * Portal connectivity status.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param connected set the connected.
     */
    public void setConnected(Boolean  connected) {
        this.connected = connected;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Status of saas licensing subscription.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Status of saas licensing subscription.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saas license expiry status.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return expired
     */
    public Boolean getExpired() {
        return expired;
    }

    /**
     * This is the setter method to the attribute.
     * Saas license expiry status.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param expired set the expired.
     */
    public void setExpired(Boolean  expired) {
        this.expired = expired;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp of last successful refresh.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastRefreshedAt
     */
    public String getLastRefreshedAt() {
        return lastRefreshedAt;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp of last successful refresh.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastRefreshedAt set the lastRefreshedAt.
     */
    public void setLastRefreshedAt(String  lastRefreshedAt) {
        this.lastRefreshedAt = lastRefreshedAt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Message.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * This is the setter method to the attribute.
     * Message.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param message set the message.
     */
    public void setMessage(String  message) {
        this.message = message;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License pool information.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return pool
     */
    public LicensePool getPool() {
        return pool;
    }

    /**
     * This is the setter method to the attribute.
     * License pool information.
     * Field introduced in 32.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param pool set the pool.
     */
    public void setPool(LicensePool pool) {
        this.pool = pool;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Public key.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return publicKey
     */
    public String getPublicKey() {
        return publicKey;
    }

    /**
     * This is the setter method to the attribute.
     * Public key.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param publicKey set the publicKey.
     */
    public void setPublicKey(String  publicKey) {
        this.publicKey = publicKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * License refresh status.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return refreshStatus
     */
    public Boolean getRefreshStatus() {
        return refreshStatus;
    }

    /**
     * This is the setter method to the attribute.
     * License refresh status.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param refreshStatus set the refreshStatus.
     */
    public void setRefreshStatus(Boolean  refreshStatus) {
        this.refreshStatus = refreshStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Timestamp of last attempted refresh.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return refreshedAt
     */
    public String getRefreshedAt() {
        return refreshedAt;
    }

    /**
     * This is the setter method to the attribute.
     * Timestamp of last attempted refresh.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param refreshedAt set the refreshedAt.
     */
    public void setRefreshedAt(String  refreshedAt) {
        this.refreshedAt = refreshedAt;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Service units reserved on controller.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return reserveServiceUnits
     */
    public Float getReserveServiceUnits() {
        return reserveServiceUnits;
    }

    /**
     * This is the setter method to the attribute.
     * Service units reserved on controller.
     * Field introduced in 21.1.3.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param reserveServiceUnits set the reserveServiceUnits.
     */
    public void setReserveServiceUnits(Float  reserveServiceUnits) {
        this.reserveServiceUnits = reserveServiceUnits;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saas license request status.
     * Enum options - SUBSCRIPTION_NONE, SUBSCRIPTION_SUCCESS, SUBSCRIPTION_FAILED, SUBSCRIPTION_IN_PROGRESS.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * This is the setter method to the attribute.
     * Saas license request status.
     * Enum options - SUBSCRIPTION_NONE, SUBSCRIPTION_SUCCESS, SUBSCRIPTION_FAILED, SUBSCRIPTION_IN_PROGRESS.
     * Field introduced in 31.1.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param state set the state.
     */
    public void setState(String  state) {
        this.state = state;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SaasLicensingStatus objSaasLicensingStatus = (SaasLicensingStatus) o;
      return   Objects.equals(this.name, objSaasLicensingStatus.name)&&
  Objects.equals(this.enabled, objSaasLicensingStatus.enabled)&&
  Objects.equals(this.reserveServiceUnits, objSaasLicensingStatus.reserveServiceUnits)&&
  Objects.equals(this.connected, objSaasLicensingStatus.connected)&&
  Objects.equals(this.message, objSaasLicensingStatus.message)&&
  Objects.equals(this.publicKey, objSaasLicensingStatus.publicKey)&&
  Objects.equals(this.expired, objSaasLicensingStatus.expired)&&
  Objects.equals(this.state, objSaasLicensingStatus.state)&&
  Objects.equals(this.refreshStatus, objSaasLicensingStatus.refreshStatus)&&
  Objects.equals(this.lastRefreshedAt, objSaasLicensingStatus.lastRefreshedAt)&&
  Objects.equals(this.refreshedAt, objSaasLicensingStatus.refreshedAt)&&
  Objects.equals(this.pool, objSaasLicensingStatus.pool);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SaasLicensingStatus {\n");
                  sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
                        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
                        sb.append("    lastRefreshedAt: ").append(toIndentedString(lastRefreshedAt)).append("\n");
                        sb.append("    message: ").append(toIndentedString(message)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    pool: ").append(toIndentedString(pool)).append("\n");
                        sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
                        sb.append("    refreshStatus: ").append(toIndentedString(refreshStatus)).append("\n");
                        sb.append("    refreshedAt: ").append(toIndentedString(refreshedAt)).append("\n");
                        sb.append("    reserveServiceUnits: ").append(toIndentedString(reserveServiceUnits)).append("\n");
                        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
