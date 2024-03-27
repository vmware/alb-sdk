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
 * The BackupConfiguration is a POJO class extends AviRestResource that used for creating
 * BackupConfiguration.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BackupConfiguration extends AviRestResource  {
    @JsonProperty("aws_access_key")
    private String awsAccessKey;

    @JsonProperty("aws_bucket_id")
    private String awsBucketId;

    @JsonProperty("aws_bucket_region")
    private String awsBucketRegion;

    @JsonProperty("aws_secret_access")
    private String awsSecretAccess;

    @JsonProperty("backup_file_prefix")
    private String backupFilePrefix;

    @JsonProperty("backup_passphrase")
    private String backupPassphrase;

    @JsonProperty("maximum_backups_stored")
    private Integer maximumBackupsStored = 4;

    @JsonProperty("name")
    private String name;

    @JsonProperty("remote_directory")
    private String remoteDirectory;

    @JsonProperty("remote_file_transfer_protocol")
    private String remoteFileTransferProtocol = "SCP";

    @JsonProperty("remote_hostname")
    private String remoteHostname;

    @JsonProperty("s3_bucket_folder")
    private String s3BucketFolder;

    @JsonProperty("save_local")
    private Boolean saveLocal;

    @JsonProperty("ssh_user_ref")
    private String sshUserRef;

    @JsonProperty("tenant_ref")
    private String tenantRef;

    @JsonProperty("upload_to_remote_host")
    private Boolean uploadToRemoteHost;

    @JsonProperty("upload_to_s3")
    private Boolean uploadToS3;

    @JsonProperty("url")
    private String url = "url";

    @JsonProperty("uuid")
    private String uuid;



    /**
     * This is the getter method this will return the attribute value.
     * Aws access key id.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awsAccessKey
     */
    public String getAwsAccessKey() {
        return awsAccessKey;
    }

    /**
     * This is the setter method to the attribute.
     * Aws access key id.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awsAccessKey set the awsAccessKey.
     */
    public void setAwsAccessKey(String  awsAccessKey) {
        this.awsAccessKey = awsAccessKey;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Aws bucket.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awsBucketId
     */
    public String getAwsBucketId() {
        return awsBucketId;
    }

    /**
     * This is the setter method to the attribute.
     * Aws bucket.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awsBucketId set the awsBucketId.
     */
    public void setAwsBucketId(String  awsBucketId) {
        this.awsBucketId = awsBucketId;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The name of the aws region associated with the bucket.
     * Field introduced in 21.1.5, 22.1.1, 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awsBucketRegion
     */
    public String getAwsBucketRegion() {
        return awsBucketRegion;
    }

    /**
     * This is the setter method to the attribute.
     * The name of the aws region associated with the bucket.
     * Field introduced in 21.1.5, 22.1.1, 22.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awsBucketRegion set the awsBucketRegion.
     */
    public void setAwsBucketRegion(String  awsBucketRegion) {
        this.awsBucketRegion = awsBucketRegion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Aws secret access key.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return awsSecretAccess
     */
    public String getAwsSecretAccess() {
        return awsSecretAccess;
    }

    /**
     * This is the setter method to the attribute.
     * Aws secret access key.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param awsSecretAccess set the awsSecretAccess.
     */
    public void setAwsSecretAccess(String  awsSecretAccess) {
        this.awsSecretAccess = awsSecretAccess;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Prefix of the exported configuration file.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return backupFilePrefix
     */
    public String getBackupFilePrefix() {
        return backupFilePrefix;
    }

    /**
     * This is the setter method to the attribute.
     * Prefix of the exported configuration file.
     * Field introduced in 17.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param backupFilePrefix set the backupFilePrefix.
     */
    public void setBackupFilePrefix(String  backupFilePrefix) {
        this.backupFilePrefix = backupFilePrefix;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Default passphrase to encrypt sensitive fields for configuration export and periodic backup.
     * The same passphrase must be provided to import the configuration.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return backupPassphrase
     */
    public String getBackupPassphrase() {
        return backupPassphrase;
    }

    /**
     * This is the setter method to the attribute.
     * Default passphrase to encrypt sensitive fields for configuration export and periodic backup.
     * The same passphrase must be provided to import the configuration.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param backupPassphrase set the backupPassphrase.
     */
    public void setBackupPassphrase(String  backupPassphrase) {
        this.backupPassphrase = backupPassphrase;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Rotate the backup files based on this count.
     * Allowed values are 1-20.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @return maximumBackupsStored
     */
    public Integer getMaximumBackupsStored() {
        return maximumBackupsStored;
    }

    /**
     * This is the setter method to the attribute.
     * Rotate the backup files based on this count.
     * Allowed values are 1-20.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as 4.
     * @param maximumBackupsStored set the maximumBackupsStored.
     */
    public void setMaximumBackupsStored(Integer  maximumBackupsStored) {
        this.maximumBackupsStored = maximumBackupsStored;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Name of backup configuration.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This is the setter method to the attribute.
     * Name of backup configuration.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param name set the name.
     */
    public void setName(String  name) {
        this.name = name;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Directory at remote destination with write permission for ssh user.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteDirectory
     */
    public String getRemoteDirectory() {
        return remoteDirectory;
    }

    /**
     * This is the setter method to the attribute.
     * Directory at remote destination with write permission for ssh user.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param remoteDirectory set the remoteDirectory.
     */
    public void setRemoteDirectory(String  remoteDirectory) {
        this.remoteDirectory = remoteDirectory;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Remote file transfer protocol type.
     * Enum options - SCP, SFTP.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, basic edition(allowed values- scp,sftp), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SCP".
     * @return remoteFileTransferProtocol
     */
    public String getRemoteFileTransferProtocol() {
        return remoteFileTransferProtocol;
    }

    /**
     * This is the setter method to the attribute.
     * Remote file transfer protocol type.
     * Enum options - SCP, SFTP.
     * Field introduced in 22.1.1.
     * Allowed in enterprise edition with any value, basic edition(allowed values- scp,sftp), enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as "SCP".
     * @param remoteFileTransferProtocol set the remoteFileTransferProtocol.
     */
    public void setRemoteFileTransferProtocol(String  remoteFileTransferProtocol) {
        this.remoteFileTransferProtocol = remoteFileTransferProtocol;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Remote destination.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return remoteHostname
     */
    public String getRemoteHostname() {
        return remoteHostname;
    }

    /**
     * This is the setter method to the attribute.
     * Remote destination.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param remoteHostname set the remoteHostname.
     */
    public void setRemoteHostname(String  remoteHostname) {
        this.remoteHostname = remoteHostname;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The folder name in s3 bucket where backup will be stored.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return s3BucketFolder
     */
    public String getS3BucketFolder() {
        return s3BucketFolder;
    }

    /**
     * This is the setter method to the attribute.
     * The folder name in s3 bucket where backup will be stored.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param s3BucketFolder set the s3BucketFolder.
     */
    public void setS3BucketFolder(String  s3BucketFolder) {
        this.s3BucketFolder = s3BucketFolder;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Local backup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return saveLocal
     */
    public Boolean getSaveLocal() {
        return saveLocal;
    }

    /**
     * This is the setter method to the attribute.
     * Local backup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param saveLocal set the saveLocal.
     */
    public void setSaveLocal(Boolean  saveLocal) {
        this.saveLocal = saveLocal;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Access credentials for remote destination.
     * It is a reference to an object of type cloudconnectoruser.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return sshUserRef
     */
    public String getSshUserRef() {
        return sshUserRef;
    }

    /**
     * This is the setter method to the attribute.
     * Access credentials for remote destination.
     * It is a reference to an object of type cloudconnectoruser.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param sshUserRef set the sshUserRef.
     */
    public void setSshUserRef(String  sshUserRef) {
        this.sshUserRef = sshUserRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantRef
     */
    public String getTenantRef() {
        return tenantRef;
    }

    /**
     * This is the setter method to the attribute.
     * It is a reference to an object of type tenant.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantRef set the tenantRef.
     */
    public void setTenantRef(String  tenantRef) {
        this.tenantRef = tenantRef;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Remote backup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uploadToRemoteHost
     */
    public Boolean getUploadToRemoteHost() {
        return uploadToRemoteHost;
    }

    /**
     * This is the setter method to the attribute.
     * Remote backup.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uploadToRemoteHost set the uploadToRemoteHost.
     */
    public void setUploadToRemoteHost(Boolean  uploadToRemoteHost) {
        this.uploadToRemoteHost = uploadToRemoteHost;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Cloud backup.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uploadToS3
     */
    public Boolean getUploadToS3() {
        return uploadToS3;
    }

    /**
     * This is the setter method to the attribute.
     * Cloud backup.
     * Field introduced in 18.2.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param uploadToS3 set the uploadToS3.
     */
    public void setUploadToS3(Boolean  uploadToS3) {
        this.uploadToS3 = uploadToS3;
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
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
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
      BackupConfiguration objBackupConfiguration = (BackupConfiguration) o;
      return   Objects.equals(this.uuid, objBackupConfiguration.uuid)&&
  Objects.equals(this.name, objBackupConfiguration.name)&&
  Objects.equals(this.saveLocal, objBackupConfiguration.saveLocal)&&
  Objects.equals(this.maximumBackupsStored, objBackupConfiguration.maximumBackupsStored)&&
  Objects.equals(this.uploadToRemoteHost, objBackupConfiguration.uploadToRemoteHost)&&
  Objects.equals(this.sshUserRef, objBackupConfiguration.sshUserRef)&&
  Objects.equals(this.remoteDirectory, objBackupConfiguration.remoteDirectory)&&
  Objects.equals(this.remoteHostname, objBackupConfiguration.remoteHostname)&&
  Objects.equals(this.backupPassphrase, objBackupConfiguration.backupPassphrase)&&
  Objects.equals(this.backupFilePrefix, objBackupConfiguration.backupFilePrefix)&&
  Objects.equals(this.uploadToS3, objBackupConfiguration.uploadToS3)&&
  Objects.equals(this.awsAccessKey, objBackupConfiguration.awsAccessKey)&&
  Objects.equals(this.awsSecretAccess, objBackupConfiguration.awsSecretAccess)&&
  Objects.equals(this.awsBucketId, objBackupConfiguration.awsBucketId)&&
  Objects.equals(this.remoteFileTransferProtocol, objBackupConfiguration.remoteFileTransferProtocol)&&
  Objects.equals(this.awsBucketRegion, objBackupConfiguration.awsBucketRegion)&&
  Objects.equals(this.s3BucketFolder, objBackupConfiguration.s3BucketFolder)&&
  Objects.equals(this.tenantRef, objBackupConfiguration.tenantRef);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class BackupConfiguration {\n");
                  sb.append("    awsAccessKey: ").append(toIndentedString(awsAccessKey)).append("\n");
                        sb.append("    awsBucketId: ").append(toIndentedString(awsBucketId)).append("\n");
                        sb.append("    awsBucketRegion: ").append(toIndentedString(awsBucketRegion)).append("\n");
                        sb.append("    awsSecretAccess: ").append(toIndentedString(awsSecretAccess)).append("\n");
                        sb.append("    backupFilePrefix: ").append(toIndentedString(backupFilePrefix)).append("\n");
                        sb.append("    backupPassphrase: ").append(toIndentedString(backupPassphrase)).append("\n");
                        sb.append("    maximumBackupsStored: ").append(toIndentedString(maximumBackupsStored)).append("\n");
                        sb.append("    name: ").append(toIndentedString(name)).append("\n");
                        sb.append("    remoteDirectory: ").append(toIndentedString(remoteDirectory)).append("\n");
                        sb.append("    remoteFileTransferProtocol: ").append(toIndentedString(remoteFileTransferProtocol)).append("\n");
                        sb.append("    remoteHostname: ").append(toIndentedString(remoteHostname)).append("\n");
                        sb.append("    s3BucketFolder: ").append(toIndentedString(s3BucketFolder)).append("\n");
                        sb.append("    saveLocal: ").append(toIndentedString(saveLocal)).append("\n");
                        sb.append("    sshUserRef: ").append(toIndentedString(sshUserRef)).append("\n");
                        sb.append("    tenantRef: ").append(toIndentedString(tenantRef)).append("\n");
                        sb.append("    uploadToRemoteHost: ").append(toIndentedString(uploadToRemoteHost)).append("\n");
                        sb.append("    uploadToS3: ").append(toIndentedString(uploadToS3)).append("\n");
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
