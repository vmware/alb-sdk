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
 * The AkoAmkoClusterVersionInfo is a POJO class extends AviRestResource that used for creating
 * AkoAmkoClusterVersionInfo.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AkoAmkoClusterVersionInfo  {
    @JsonProperty("ako_amko_version")
    private String akoAmkoVersion;

    @JsonProperty("kubernetes_version")
    private String kubernetesVersion;



    /**
     * This is the getter method this will return the attribute value.
     * Ako/amko operator version (e.g., '1.12.0').
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return akoAmkoVersion
     */
    public String getAkoAmkoVersion() {
        return akoAmkoVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Ako/amko operator version (e.g., '1.12.0').
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param akoAmkoVersion set the akoAmkoVersion.
     */
    public void setAkoAmkoVersion(String  akoAmkoVersion) {
        this.akoAmkoVersion = akoAmkoVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Kubernetes cluster version (e.g., '1.28.3').
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return kubernetesVersion
     */
    public String getKubernetesVersion() {
        return kubernetesVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Kubernetes cluster version (e.g., '1.28.3').
     * Field introduced in 32.2.1.
     * Allowed with any value in enterprise, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param kubernetesVersion set the kubernetesVersion.
     */
    public void setKubernetesVersion(String  kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      AkoAmkoClusterVersionInfo objAkoAmkoClusterVersionInfo = (AkoAmkoClusterVersionInfo) o;
      return   Objects.equals(this.kubernetesVersion, objAkoAmkoClusterVersionInfo.kubernetesVersion)&&
  Objects.equals(this.akoAmkoVersion, objAkoAmkoClusterVersionInfo.akoAmkoVersion);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AkoAmkoClusterVersionInfo {\n");
                  sb.append("    akoAmkoVersion: ").append(toIndentedString(akoAmkoVersion)).append("\n");
                        sb.append("    kubernetesVersion: ").append(toIndentedString(kubernetesVersion)).append("\n");
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
