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
 * The QatConfig is a POJO class extends AviRestResource that used for creating
 * QatConfig.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QatConfig  {
    @JsonProperty("disable_qat_bulk_crypto")
    private Boolean disableQatBulkCrypto = false;

    @JsonProperty("qat_hw_enable")
    private Boolean qatHwEnable = false;

    @JsonProperty("qat_sw_enable")
    private Boolean qatSwEnable = false;



    /**
     * This is the getter method this will return the attribute value.
     * This knob enables the qat offloads for tls application data.
     * (if the host cpu is capable, and the qat device is exposed).
     * Requires se reboot.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return disableQatBulkCrypto
     */
    public Boolean getDisableQatBulkCrypto() {
        return disableQatBulkCrypto;
    }

    /**
     * This is the setter method to the attribute.
     * This knob enables the qat offloads for tls application data.
     * (if the host cpu is capable, and the qat device is exposed).
     * Requires se reboot.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param disableQatBulkCrypto set the disableQatBulkCrypto.
     */
    public void setDisableQatBulkCrypto(Boolean  disableQatBulkCrypto) {
        this.disableQatBulkCrypto = disableQatBulkCrypto;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enalbes hardware qat.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return qatHwEnable
     */
    public Boolean getQatHwEnable() {
        return qatHwEnable;
    }

    /**
     * This is the setter method to the attribute.
     * Enalbes hardware qat.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param qatHwEnable set the qatHwEnable.
     */
    public void setQatHwEnable(Boolean  qatHwEnable) {
        this.qatHwEnable = qatHwEnable;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable software qat.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return qatSwEnable
     */
    public Boolean getQatSwEnable() {
        return qatSwEnable;
    }

    /**
     * This is the setter method to the attribute.
     * Enable software qat.
     * Field introduced in 31.2.1.
     * Allowed with any value in enterprise, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param qatSwEnable set the qatSwEnable.
     */
    public void setQatSwEnable(Boolean  qatSwEnable) {
        this.qatSwEnable = qatSwEnable;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      QatConfig objQatConfig = (QatConfig) o;
      return   Objects.equals(this.qatHwEnable, objQatConfig.qatHwEnable)&&
  Objects.equals(this.qatSwEnable, objQatConfig.qatSwEnable)&&
  Objects.equals(this.disableQatBulkCrypto, objQatConfig.disableQatBulkCrypto);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class QatConfig {\n");
                  sb.append("    disableQatBulkCrypto: ").append(toIndentedString(disableQatBulkCrypto)).append("\n");
                        sb.append("    qatHwEnable: ").append(toIndentedString(qatHwEnable)).append("\n");
                        sb.append("    qatSwEnable: ").append(toIndentedString(qatSwEnable)).append("\n");
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
