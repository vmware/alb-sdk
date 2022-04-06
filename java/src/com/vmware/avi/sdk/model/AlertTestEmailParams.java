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
 * The AlertTestEmailParams is a POJO class extends AviRestResource that used for creating
 * AlertTestEmailParams.
 *
 * @version 1.0
 * @since 
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlertTestEmailParams extends AviRestResource  {
    @JsonProperty("subject")
    private String subject = null;

    @JsonProperty("text")
    private String text = null;

    @JsonProperty("uuid")
    private String uuid = null;



    /**
     * This is the getter method this will return the attribute value.
     * The subject line of the originating email from  avi controller.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This is the setter method to the attribute.
     * The subject line of the originating email from  avi controller.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param subject set the subject.
     */
    public void setSubject(String  subject) {
        this.subject = subject;
    }

    /**
     * This is the getter method this will return the attribute value.
     * The email context.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * This is the setter method to the attribute.
     * The email context.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @param text set the text.
     */
    public void setText(String  text) {
        this.text = text;
    }

    /**
     * This is the getter method this will return the attribute value.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
     * Default value when not specified in API or module is interpreted by Avi Controller as null.
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This is the setter method to the attribute.
     * Allowed in enterprise with any value edition, essentials edition, basic edition, enterprise with cloud services edition.
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
      AlertTestEmailParams objAlertTestEmailParams = (AlertTestEmailParams) o;
      return   Objects.equals(this.uuid, objAlertTestEmailParams.uuid)&&
  Objects.equals(this.subject, objAlertTestEmailParams.subject)&&
  Objects.equals(this.text, objAlertTestEmailParams.text);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class AlertTestEmailParams {\n");
                  sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
                        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
