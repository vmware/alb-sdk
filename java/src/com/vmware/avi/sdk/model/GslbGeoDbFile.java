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
 * The GslbGeoDbFile is a POJO class extends AviRestResource that used for creating
 * GslbGeoDbFile.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GslbGeoDbFile  {
    @JsonProperty("checksum")
    private String checksum;

    @JsonProperty("file_id")
    private String fileId;

    @JsonProperty("file_id_checksum")
    private String fileIdChecksum;

    @JsonProperty("filename")
    private String filename;

    @JsonProperty("format")
    private String format = "GSLB_GEODB_FILE_FORMAT_AVI";

    @JsonProperty("timestamp")
    private Integer timestamp;



    /**
     * This is the getter method this will return the attribute value.
     * This field indicates the checksum of the original file.
     * The checksum is internally computed.
     * It's value changes every time the file is uploaded/modified.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return checksum
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * This is the setter method to the attribute.
     * This field indicates the checksum of the original file.
     * The checksum is internally computed.
     * It's value changes every time the file is uploaded/modified.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @param checksum set the checksum.
     */
    public void setChecksum(String  checksum) {
        this.checksum = checksum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field indicates the internal file used in the system.
     * The user uploaded file will be retained while a corresponding internal file is generated to be consumed by various upstream (other sites) and
     * downstream (ses) entities.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * This is the setter method to the attribute.
     * This field indicates the internal file used in the system.
     * The user uploaded file will be retained while a corresponding internal file is generated to be consumed by various upstream (other sites) and
     * downstream (ses) entities.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @param fileId set the fileId.
     */
    public void setFileId(String  fileId) {
        this.fileId = fileId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field indicates the checksum of the internal file.
     * The checksum is internally computed.
     * It's value changes every time the internal file is regenerated.
     * The internal file is regenerated whenever the original file is uploaded to the controller.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return fileIdChecksum
     */
    public String getFileIdChecksum() {
        return fileIdChecksum;
    }

    /**
     * This is the setter method to the attribute.
     * This field indicates the checksum of the internal file.
     * The checksum is internally computed.
     * It's value changes every time the internal file is regenerated.
     * The internal file is regenerated whenever the original file is uploaded to the controller.
     * Field introduced in 22.1.6, 30.2.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @param fileIdChecksum set the fileIdChecksum.
     */
    public void setFileIdChecksum(String  fileIdChecksum) {
        this.fileIdChecksum = fileIdChecksum;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Geodb filename in the avi supported formats.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * This is the setter method to the attribute.
     * Geodb filename in the avi supported formats.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param filename set the filename.
     */
    public void setFilename(String  filename) {
        this.filename = filename;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field indicates the file format.
     * Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V6,
     * GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V4_AND_V6, GSLB_GEODB_FILE_FORMAT_AVI_V6, GSLB_GEODB_FILE_FORMAT_AVI_V4_AND_V6.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_GEODB_FILE_FORMAT_AVI".
     * @return format
     */
    public String getFormat() {
        return format;
    }

    /**
     * This is the setter method to the attribute.
     * This field indicates the file format.
     * Enum options - GSLB_GEODB_FILE_FORMAT_AVI, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY, GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V6,
     * GSLB_GEODB_FILE_FORMAT_MAXMIND_CITY_V4_AND_V6, GSLB_GEODB_FILE_FORMAT_AVI_V6, GSLB_GEODB_FILE_FORMAT_AVI_V4_AND_V6.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "GSLB_GEODB_FILE_FORMAT_AVI".
     * @param format set the format.
     */
    public void setFormat(String  format) {
        this.format = format;
    }

    /**
     * This is the getter method this will return the attribute value.
     * This field indicates the timestamp of when the file is associated to the gslbgeodbprofile.
     * It is an internal generated timestamp.
     * This value is a constant for the lifetime of the file and does not change every time the file is uploaded.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @return timestamp
     */
    public Integer getTimestamp() {
        return timestamp;
    }

    /**
     * This is the setter method to the attribute.
     * This field indicates the timestamp of when the file is associated to the gslbgeodbprofile.
     * It is an internal generated timestamp.
     * This value is a constant for the lifetime of the file and does not change every time the file is uploaded.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials edition with any value, basic edition with any value, enterprise with cloud services
     * edition.
     * @param timestamp set the timestamp.
     */
    public void setTimestamp(Integer  timestamp) {
        this.timestamp = timestamp;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      GslbGeoDbFile objGslbGeoDbFile = (GslbGeoDbFile) o;
      return   Objects.equals(this.filename, objGslbGeoDbFile.filename)&&
  Objects.equals(this.format, objGslbGeoDbFile.format)&&
  Objects.equals(this.timestamp, objGslbGeoDbFile.timestamp)&&
  Objects.equals(this.checksum, objGslbGeoDbFile.checksum)&&
  Objects.equals(this.fileId, objGslbGeoDbFile.fileId)&&
  Objects.equals(this.fileIdChecksum, objGslbGeoDbFile.fileIdChecksum);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class GslbGeoDbFile {\n");
                  sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
                        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
                        sb.append("    fileIdChecksum: ").append(toIndentedString(fileIdChecksum)).append("\n");
                        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
                        sb.append("    format: ").append(toIndentedString(format)).append("\n");
                        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
