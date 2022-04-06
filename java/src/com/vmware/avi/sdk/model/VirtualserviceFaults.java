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
 * The VirtualserviceFaults is a POJO class extends AviRestResource that used for creating
 * VirtualserviceFaults.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VirtualserviceFaults  {
    @JsonProperty("debug_faults")
    private Boolean debugFaults = true;

    @JsonProperty("pool_server_faults")
    private Boolean poolServerFaults = true;

    @JsonProperty("scaleout_faults")
    private Boolean scaleoutFaults = true;

    @JsonProperty("shared_vip_faults")
    private Boolean sharedVipFaults = true;

    @JsonProperty("ssl_cert_expiry_faults")
    private Boolean sslCertExpiryFaults = true;

    @JsonProperty("ssl_cert_status_faults")
    private Boolean sslCertStatusFaults = true;



    /**
     * This is the getter method this will return the attribute value.
     * Enable debug faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return debugFaults
     */
    public Boolean getDebugFaults() {
        return debugFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable debug faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param debugFaults set the debugFaults.
     */
    public void setDebugFaults(Boolean  debugFaults) {
        this.debugFaults = debugFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable pool server faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return poolServerFaults
     */
    public Boolean getPoolServerFaults() {
        return poolServerFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable pool server faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param poolServerFaults set the poolServerFaults.
     */
    public void setPoolServerFaults(Boolean  poolServerFaults) {
        this.poolServerFaults = poolServerFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable vs scaleout and scalein faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return scaleoutFaults
     */
    public Boolean getScaleoutFaults() {
        return scaleoutFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable vs scaleout and scalein faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param scaleoutFaults set the scaleoutFaults.
     */
    public void setScaleoutFaults(Boolean  scaleoutFaults) {
        this.scaleoutFaults = scaleoutFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable shared vip faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return sharedVipFaults
     */
    public Boolean getSharedVipFaults() {
        return sharedVipFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable shared vip faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param sharedVipFaults set the sharedVipFaults.
     */
    public void setSharedVipFaults(Boolean  sharedVipFaults) {
        this.sharedVipFaults = sharedVipFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable ssl certificate expiry faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return sslCertExpiryFaults
     */
    public Boolean getSslCertExpiryFaults() {
        return sslCertExpiryFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable ssl certificate expiry faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param sslCertExpiryFaults set the sslCertExpiryFaults.
     */
    public void setSslCertExpiryFaults(Boolean  sslCertExpiryFaults) {
        this.sslCertExpiryFaults = sslCertExpiryFaults;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable ssl certificate status faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return sslCertStatusFaults
     */
    public Boolean getSslCertStatusFaults() {
        return sslCertStatusFaults;
    }

    /**
     * This is the setter method to the attribute.
     * Enable ssl certificate status faults.
     * Field introduced in 20.1.6.
     * Allowed in enterprise with any value edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param sslCertStatusFaults set the sslCertStatusFaults.
     */
    public void setSslCertStatusFaults(Boolean  sslCertStatusFaults) {
        this.sslCertStatusFaults = sslCertStatusFaults;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      VirtualserviceFaults objVirtualserviceFaults = (VirtualserviceFaults) o;
      return   Objects.equals(this.poolServerFaults, objVirtualserviceFaults.poolServerFaults)&&
  Objects.equals(this.scaleoutFaults, objVirtualserviceFaults.scaleoutFaults)&&
  Objects.equals(this.sharedVipFaults, objVirtualserviceFaults.sharedVipFaults)&&
  Objects.equals(this.sslCertExpiryFaults, objVirtualserviceFaults.sslCertExpiryFaults)&&
  Objects.equals(this.sslCertStatusFaults, objVirtualserviceFaults.sslCertStatusFaults)&&
  Objects.equals(this.debugFaults, objVirtualserviceFaults.debugFaults);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class VirtualserviceFaults {\n");
                  sb.append("    debugFaults: ").append(toIndentedString(debugFaults)).append("\n");
                        sb.append("    poolServerFaults: ").append(toIndentedString(poolServerFaults)).append("\n");
                        sb.append("    scaleoutFaults: ").append(toIndentedString(scaleoutFaults)).append("\n");
                        sb.append("    sharedVipFaults: ").append(toIndentedString(sharedVipFaults)).append("\n");
                        sb.append("    sslCertExpiryFaults: ").append(toIndentedString(sslCertExpiryFaults)).append("\n");
                        sb.append("    sslCertStatusFaults: ").append(toIndentedString(sslCertStatusFaults)).append("\n");
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
