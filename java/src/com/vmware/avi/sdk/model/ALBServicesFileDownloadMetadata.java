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
 * The ALBServicesFileDownloadMetadata is a POJO class extends AviRestResource that used for creating
 * ALBServicesFileDownloadMetadata.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ALBServicesFileDownloadMetadata  {
    @JsonProperty("checksum")
    private String checksum = null;

    @JsonProperty("checksum_type")
    private String checksumType = null;

    @JsonProperty("chunk_size")
    private Integer chunkSize = null;

    @JsonProperty("is_multi_part_download")
    private Boolean isMultiPartDownload = null;

    @JsonProperty("signed_url")
    private String signedUrl = null;

    @JsonProperty("total_size")
    private Integer totalSize = null;



    /**
     * This is the getter method this will return the attribute value.
     * Checksum of the file.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * This is the setter method to the attribute.
     * Checksum of the file.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param checksum set the checksum.
     */
    public void setChecksum(String  checksum) {
        this.checksum = checksum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Currently only md5 checksum type is supported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return checksumType
     */
    public String getChecksumType() {
        return checksumType;
    }

    /**
     * This is the setter method to the attribute.
     * Currently only md5 checksum type is supported.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param checksumType set the checksumType.
     */
    public void setChecksumType(String  checksumType) {
        this.checksumType = checksumType;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Checksum size in bytes.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return chunkSize
     */
    public Integer getChunkSize() {
        return chunkSize;
    }

    /**
     * This is the setter method to the attribute.
     * Checksum size in bytes.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param chunkSize set the chunkSize.
     */
    public void setChunkSize(Integer  chunkSize) {
        this.chunkSize = chunkSize;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Whether the file can be downloaded in parts or not.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return isMultiPartDownload
     */
    public Boolean getIsMultiPartDownload() {
        return isMultiPartDownload;
    }

    /**
     * This is the setter method to the attribute.
     * Whether the file can be downloaded in parts or not.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param isMultiPartDownload set the isMultiPartDownload.
     */
    public void setIsMultiPartDownload(Boolean  isMultiPartDownload) {
        this.isMultiPartDownload = isMultiPartDownload;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Sigend url of the file from pulse.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return signedUrl
     */
    public String getSignedUrl() {
        return signedUrl;
    }

    /**
     * This is the setter method to the attribute.
     * Sigend url of the file from pulse.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param signedUrl set the signedUrl.
     */
    public void setSignedUrl(String  signedUrl) {
        this.signedUrl = signedUrl;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Total size of the file in bytes.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    /**
     * This is the setter method to the attribute.
     * Total size of the file in bytes.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param totalSize set the totalSize.
     */
    public void setTotalSize(Integer  totalSize) {
        this.totalSize = totalSize;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ALBServicesFileDownloadMetadata objALBServicesFileDownloadMetadata = (ALBServicesFileDownloadMetadata) o;
      return   Objects.equals(this.signedUrl, objALBServicesFileDownloadMetadata.signedUrl)&&
  Objects.equals(this.checksum, objALBServicesFileDownloadMetadata.checksum)&&
  Objects.equals(this.checksumType, objALBServicesFileDownloadMetadata.checksumType)&&
  Objects.equals(this.totalSize, objALBServicesFileDownloadMetadata.totalSize)&&
  Objects.equals(this.chunkSize, objALBServicesFileDownloadMetadata.chunkSize)&&
  Objects.equals(this.isMultiPartDownload, objALBServicesFileDownloadMetadata.isMultiPartDownload);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ALBServicesFileDownloadMetadata {\n");
                  sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
                        sb.append("    checksumType: ").append(toIndentedString(checksumType)).append("\n");
                        sb.append("    chunkSize: ").append(toIndentedString(chunkSize)).append("\n");
                        sb.append("    isMultiPartDownload: ").append(toIndentedString(isMultiPartDownload)).append("\n");
                        sb.append("    signedUrl: ").append(toIndentedString(signedUrl)).append("\n");
                        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
