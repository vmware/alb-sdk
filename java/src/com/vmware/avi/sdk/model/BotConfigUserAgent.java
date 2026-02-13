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
 * The BotConfigUserAgent is a POJO class extends AviRestResource that used for creating
 * BotConfigUserAgent.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BotConfigUserAgent  {
    @JsonProperty("enabled")
    private Boolean enabled = true;

    @JsonProperty("use_tls_fingerprint")
    private Boolean useTlsFingerprint = true;



    /**
     * This is the getter method this will return the attribute value.
     * Whether user agent-based bot detection is enabled.
     * Field introduced in 21.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This is the setter method to the attribute.
     * Whether user agent-based bot detection is enabled.
     * Field introduced in 21.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param enabled set the enabled.
     */
    public void setEnabled(Boolean  enabled) {
        this.enabled = enabled;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether to match the tls fingerprint observed on the request against tls fingerprints expected for the user agent.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @return useTlsFingerprint
     */
    public Boolean getUseTlsFingerprint() {
        return useTlsFingerprint;
    }

    /**
     * This is the setter method to the attribute.
     * Whether to match the tls fingerprint observed on the request against tls fingerprints expected for the user agent.
     * Field introduced in 22.1.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as true.
     * @param useTlsFingerprint set the useTlsFingerprint.
     */
    public void setUseTlsFingerprint(Boolean  useTlsFingerprint) {
        this.useTlsFingerprint = useTlsFingerprint;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      BotConfigUserAgent objBotConfigUserAgent = (BotConfigUserAgent) o;
      return   Objects.equals(this.enabled, objBotConfigUserAgent.enabled)&&
  Objects.equals(this.useTlsFingerprint, objBotConfigUserAgent.useTlsFingerprint);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BotConfigUserAgent {\n");
                  sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
                        sb.append("    useTlsFingerprint: ").append(toIndentedString(useTlsFingerprint)).append("\n");
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
