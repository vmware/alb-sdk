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
 * The ALBServicesCase is a POJO class extends AviRestResource that used for creating
 * ALBServicesCase.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ALBServicesCase  {
    @JsonProperty("additional_emails")
    private List<String> additionalEmails;

    @JsonProperty("asset_id")
    private String assetId;

    @JsonProperty("case_attachments")
    private List<ALBServicesCaseAttachment> caseAttachments;

    @JsonProperty("case_created_by")
    private String caseCreatedBy;

    @JsonProperty("case_number")
    private String caseNumber;

    @JsonProperty("case_status")
    private String caseStatus;

    @JsonProperty("contact_info")
    private ALBServicesUser contactInfo;

    @JsonProperty("created_date")
    private String createdDate;

    @JsonProperty("custom_tag")
    private String customTag;

    @JsonProperty("deployment_environment")
    private String deploymentEnvironment;

    @JsonProperty("description")
    private String description;

    @JsonProperty("email")
    private String email;

    @JsonProperty("environment")
    private String environment;

    @JsonProperty("fr_business_justification")
    private String frBusinessJustification;

    @JsonProperty("fr_current_solution")
    private String frCurrentSolution;

    @JsonProperty("fr_timing")
    private String frTiming;

    @JsonProperty("fr_use_cases")
    private String frUseCases;

    @JsonProperty("id")
    private String id;

    @JsonProperty("last_modified_date")
    private String lastModifiedDate;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("patch_version")
    private String patchVersion;

    @JsonProperty("severity")
    private String severity;

    @JsonProperty("status")
    private String status;

    @JsonProperty("subject")
    private String subject;

    @JsonProperty("tenant_uuid")
    private String tenantUuid;

    @JsonProperty("time")
    private String time;

    @JsonProperty("type")
    private String type;

    @JsonProperty("version")
    private String version;


    /**
     * This is the getter method this will return the attribute value.
     * Additional emails to get notified when the case gets created.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return additionalEmails
     */
    public List<String> getAdditionalEmails() {
        return additionalEmails;
    }

    /**
     * This is the setter method. this will set the additionalEmails
     * Additional emails to get notified when the case gets created.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return additionalEmails
     */
    public void setAdditionalEmails(List<String>  additionalEmails) {
        this.additionalEmails = additionalEmails;
    }

    /**
     * This is the setter method this will set the additionalEmails
     * Additional emails to get notified when the case gets created.
     * Field introduced in 30.2.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return additionalEmails
     */
    public ALBServicesCase addAdditionalEmailsItem(String additionalEmailsItem) {
      if (this.additionalEmails == null) {
        this.additionalEmails = new ArrayList<String>();
      }
      this.additionalEmails.add(additionalEmailsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param assetId set the assetId.
     */
    public void setAssetId(String  assetId) {
        this.assetId = assetId;
    }
    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseAttachments
     */
    public List<ALBServicesCaseAttachment> getCaseAttachments() {
        return caseAttachments;
    }

    /**
     * This is the setter method. this will set the caseAttachments
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseAttachments
     */
    public void setCaseAttachments(List<ALBServicesCaseAttachment>  caseAttachments) {
        this.caseAttachments = caseAttachments;
    }

    /**
     * This is the setter method this will set the caseAttachments
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseAttachments
     */
    public ALBServicesCase addCaseAttachmentsItem(ALBServicesCaseAttachment caseAttachmentsItem) {
      if (this.caseAttachments == null) {
        this.caseAttachments = new ArrayList<ALBServicesCaseAttachment>();
      }
      this.caseAttachments.add(caseAttachmentsItem);
      return this;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseCreatedBy
     */
    public String getCaseCreatedBy() {
        return caseCreatedBy;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caseCreatedBy set the caseCreatedBy.
     */
    public void setCaseCreatedBy(String  caseCreatedBy) {
        this.caseCreatedBy = caseCreatedBy;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseNumber
     */
    public String getCaseNumber() {
        return caseNumber;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caseNumber set the caseNumber.
     */
    public void setCaseNumber(String  caseNumber) {
        this.caseNumber = caseNumber;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return caseStatus
     */
    public String getCaseStatus() {
        return caseStatus;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param caseStatus set the caseStatus.
     */
    public void setCaseStatus(String  caseStatus) {
        this.caseStatus = caseStatus;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Contact information associated to particular case.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return contactInfo
     */
    public ALBServicesUser getContactInfo() {
        return contactInfo;
    }

    /**
     * This is the setter method to the attribute.
     * Contact information associated to particular case.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param contactInfo set the contactInfo.
     */
    public void setContactInfo(ALBServicesUser contactInfo) {
        this.contactInfo = contactInfo;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return createdDate
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param createdDate set the createdDate.
     */
    public void setCreatedDate(String  createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return customTag
     */
    public String getCustomTag() {
        return customTag;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param customTag set the customTag.
     */
    public void setCustomTag(String  customTag) {
        this.customTag = customTag;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return deploymentEnvironment
     */
    public String getDeploymentEnvironment() {
        return deploymentEnvironment;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param deploymentEnvironment set the deploymentEnvironment.
     */
    public void setDeploymentEnvironment(String  deploymentEnvironment) {
        this.deploymentEnvironment = deploymentEnvironment;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param description set the description.
     */
    public void setDescription(String  description) {
        this.description = description;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Email of the point of contact for a particular support case.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This is the setter method to the attribute.
     * Email of the point of contact for a particular support case.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param email set the email.
     */
    public void setEmail(String  email) {
        this.email = email;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param environment set the environment.
     */
    public void setEnvironment(String  environment) {
        this.environment = environment;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Business justification for a feature request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return frBusinessJustification
     */
    public String getFrBusinessJustification() {
        return frBusinessJustification;
    }

    /**
     * This is the setter method to the attribute.
     * Business justification for a feature request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param frBusinessJustification set the frBusinessJustification.
     */
    public void setFrBusinessJustification(String  frBusinessJustification) {
        this.frBusinessJustification = frBusinessJustification;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Current solution/workaround for a feature request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return frCurrentSolution
     */
    public String getFrCurrentSolution() {
        return frCurrentSolution;
    }

    /**
     * This is the setter method to the attribute.
     * Current solution/workaround for a feature request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param frCurrentSolution set the frCurrentSolution.
     */
    public void setFrCurrentSolution(String  frCurrentSolution) {
        this.frCurrentSolution = frCurrentSolution;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Expected date of delivery for a feature request in yyyy-mm-dd format.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return frTiming
     */
    public String getFrTiming() {
        return frTiming;
    }

    /**
     * This is the setter method to the attribute.
     * Expected date of delivery for a feature request in yyyy-mm-dd format.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param frTiming set the frTiming.
     */
    public void setFrTiming(String  frTiming) {
        this.frTiming = frTiming;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Possible use cases for a feature request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return frUseCases
     */
    public String getFrUseCases() {
        return frUseCases;
    }

    /**
     * This is the setter method to the attribute.
     * Possible use cases for a feature request.
     * Field introduced in 20.1.1.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param frUseCases set the frUseCases.
     */
    public void setFrUseCases(String  frUseCases) {
        this.frUseCases = frUseCases;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param id set the id.
     */
    public void setId(String  id) {
        this.id = id;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return lastModifiedDate
     */
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param lastModifiedDate set the lastModifiedDate.
     */
    public void setLastModifiedDate(String  lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Stores the alb services configuration mode.
     * Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE, BROADCOM.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * This is the setter method to the attribute.
     * Stores the alb services configuration mode.
     * Enum options - MODE_UNKNOWN, SALESFORCE, SYSTEST, MYVMWARE, BROADCOM.
     * Field introduced in 21.1.3.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param mode set the mode.
     */
    public void setMode(String  mode) {
        this.mode = mode;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return patchVersion
     */
    public String getPatchVersion() {
        return patchVersion;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param patchVersion set the patchVersion.
     */
    public void setPatchVersion(String  patchVersion) {
        this.patchVersion = patchVersion;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return severity
     */
    public String getSeverity() {
        return severity;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param severity set the severity.
     */
    public void setSeverity(String  severity) {
        this.severity = severity;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param status set the status.
     */
    public void setStatus(String  status) {
        this.status = status;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subject set the subject.
     */
    public void setSubject(String  subject) {
        this.subject = subject;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Tenant information.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return tenantUuid
     */
    public String getTenantUuid() {
        return tenantUuid;
    }

    /**
     * This is the setter method to the attribute.
     * Tenant information.
     * Field introduced in 30.1.1.
     * Allowed in enterprise edition with any value, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param tenantUuid set the tenantUuid.
     */
    public void setTenantUuid(String  tenantUuid) {
        this.tenantUuid = tenantUuid;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return time
     */
    public String getTime() {
        return time;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param time set the time.
     */
    public void setTime(String  time) {
        this.time = time;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param type set the type.
     */
    public void setType(String  type) {
        this.type = type;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * This is the setter method to the attribute.
     * Field introduced in 18.2.6.
     * Allowed in enterprise edition with any value, essentials, basic, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param version set the version.
     */
    public void setVersion(String  version) {
        this.version = version;
    }


    @Override
    public boolean equals(java.lang.Object o) {
      if (this == o) {
          return true;
      }
      if (o == null || getClass() != o.getClass()) {
          return false;
      }
      ALBServicesCase objALBServicesCase = (ALBServicesCase) o;
      return   Objects.equals(this.assetId, objALBServicesCase.assetId)&&
  Objects.equals(this.id, objALBServicesCase.id)&&
  Objects.equals(this.caseNumber, objALBServicesCase.caseNumber)&&
  Objects.equals(this.caseStatus, objALBServicesCase.caseStatus)&&
  Objects.equals(this.subject, objALBServicesCase.subject)&&
  Objects.equals(this.caseCreatedBy, objALBServicesCase.caseCreatedBy)&&
  Objects.equals(this.createdDate, objALBServicesCase.createdDate)&&
  Objects.equals(this.lastModifiedDate, objALBServicesCase.lastModifiedDate)&&
  Objects.equals(this.status, objALBServicesCase.status)&&
  Objects.equals(this.version, objALBServicesCase.version)&&
  Objects.equals(this.patchVersion, objALBServicesCase.patchVersion)&&
  Objects.equals(this.description, objALBServicesCase.description)&&
  Objects.equals(this.type, objALBServicesCase.type)&&
  Objects.equals(this.environment, objALBServicesCase.environment)&&
  Objects.equals(this.deploymentEnvironment, objALBServicesCase.deploymentEnvironment)&&
  Objects.equals(this.severity, objALBServicesCase.severity)&&
  Objects.equals(this.time, objALBServicesCase.time)&&
  Objects.equals(this.customTag, objALBServicesCase.customTag)&&
  Objects.equals(this.caseAttachments, objALBServicesCase.caseAttachments)&&
  Objects.equals(this.email, objALBServicesCase.email)&&
  Objects.equals(this.contactInfo, objALBServicesCase.contactInfo)&&
  Objects.equals(this.frUseCases, objALBServicesCase.frUseCases)&&
  Objects.equals(this.frCurrentSolution, objALBServicesCase.frCurrentSolution)&&
  Objects.equals(this.frBusinessJustification, objALBServicesCase.frBusinessJustification)&&
  Objects.equals(this.frTiming, objALBServicesCase.frTiming)&&
  Objects.equals(this.mode, objALBServicesCase.mode)&&
  Objects.equals(this.tenantUuid, objALBServicesCase.tenantUuid)&&
  Objects.equals(this.additionalEmails, objALBServicesCase.additionalEmails);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class ALBServicesCase {\n");
                  sb.append("    additionalEmails: ").append(toIndentedString(additionalEmails)).append("\n");
                        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
                        sb.append("    caseAttachments: ").append(toIndentedString(caseAttachments)).append("\n");
                        sb.append("    caseCreatedBy: ").append(toIndentedString(caseCreatedBy)).append("\n");
                        sb.append("    caseNumber: ").append(toIndentedString(caseNumber)).append("\n");
                        sb.append("    caseStatus: ").append(toIndentedString(caseStatus)).append("\n");
                        sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
                        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
                        sb.append("    customTag: ").append(toIndentedString(customTag)).append("\n");
                        sb.append("    deploymentEnvironment: ").append(toIndentedString(deploymentEnvironment)).append("\n");
                        sb.append("    description: ").append(toIndentedString(description)).append("\n");
                        sb.append("    email: ").append(toIndentedString(email)).append("\n");
                        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
                        sb.append("    frBusinessJustification: ").append(toIndentedString(frBusinessJustification)).append("\n");
                        sb.append("    frCurrentSolution: ").append(toIndentedString(frCurrentSolution)).append("\n");
                        sb.append("    frTiming: ").append(toIndentedString(frTiming)).append("\n");
                        sb.append("    frUseCases: ").append(toIndentedString(frUseCases)).append("\n");
                        sb.append("    id: ").append(toIndentedString(id)).append("\n");
                        sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
                        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
                        sb.append("    patchVersion: ").append(toIndentedString(patchVersion)).append("\n");
                        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
                        sb.append("    status: ").append(toIndentedString(status)).append("\n");
                        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
                        sb.append("    tenantUuid: ").append(toIndentedString(tenantUuid)).append("\n");
                        sb.append("    time: ").append(toIndentedString(time)).append("\n");
                        sb.append("    type: ").append(toIndentedString(type)).append("\n");
                        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
