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
 * The SamlIdentityProviderSettings is a POJO class extends AviRestResource that used for creating
 * SamlIdentityProviderSettings.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SamlIdentityProviderSettings  {
    @JsonProperty("meta_data_download_interval")
    private Integer metaDataDownloadInterval = 60;

    @JsonProperty("metadata")
    private String metadata = null;

    @JsonProperty("metadata_url")
    private String metadataUrl = null;

    @JsonProperty("periodic_download")
    private Boolean periodicDownload = false;



    /**
     * This is the getter method this will return the attribute value.
     * The interval to query and download saml idp metadata using the metadata url.
     * Allowed values are 0-10080.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @return metaDataDownloadInterval
     */
    public Integer getMetaDataDownloadInterval() {
        return metaDataDownloadInterval;
    }

    /**
     * This is the setter method to the attribute.
     * The interval to query and download saml idp metadata using the metadata url.
     * Allowed values are 0-10080.
     * Field introduced in 30.2.1.
     * Unit is min.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 60.
     * @param metaDataDownloadInterval set the metaDataDownloadInterval.
     */
    public void setMetaDataDownloadInterval(Integer  metaDataDownloadInterval) {
        this.metaDataDownloadInterval = metaDataDownloadInterval;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml idp metadata.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadata
     */
    public String getMetadata() {
        return metadata;
    }

    /**
     * This is the setter method to the attribute.
     * Saml idp metadata.
     * Field introduced in 17.2.3.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metadata set the metadata.
     */
    public void setMetadata(String  metadata) {
        this.metadata = metadata;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Saml idp federation metadata url.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return metadataUrl
     */
    public String getMetadataUrl() {
        return metadataUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Saml idp federation metadata url.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param metadataUrl set the metadataUrl.
     */
    public void setMetadataUrl(String  metadataUrl) {
        this.metadataUrl = metadataUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Enable periodic metadata download.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @return periodicDownload
     */
    public Boolean getPeriodicDownload() {
        return periodicDownload;
    }

    /**
     * This is the setter method to the attribute.
     * Enable periodic metadata download.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as false.
     * @param periodicDownload set the periodicDownload.
     */
    public void setPeriodicDownload(Boolean  periodicDownload) {
        this.periodicDownload = periodicDownload;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      SamlIdentityProviderSettings objSamlIdentityProviderSettings = (SamlIdentityProviderSettings) o;
      return   Objects.equals(this.metadata, objSamlIdentityProviderSettings.metadata)&&
  Objects.equals(this.metadataUrl, objSamlIdentityProviderSettings.metadataUrl)&&
  Objects.equals(this.metaDataDownloadInterval, objSamlIdentityProviderSettings.metaDataDownloadInterval)&&
  Objects.equals(this.periodicDownload, objSamlIdentityProviderSettings.periodicDownload);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class SamlIdentityProviderSettings {\n");
                  sb.append("    metaDataDownloadInterval: ").append(toIndentedString(metaDataDownloadInterval)).append("\n");
                        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
                        sb.append("    metadataUrl: ").append(toIndentedString(metadataUrl)).append("\n");
                        sb.append("    periodicDownload: ").append(toIndentedString(periodicDownload)).append("\n");
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
